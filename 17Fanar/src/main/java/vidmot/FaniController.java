package vidmot;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Dæmi 17 í lokaprófi HBV201G 2024
 *
 *
 *****************************************************************************/
public class FaniController {

    // fastar
    private static final String AUDIO_ANTHEM = "audio/anthem";
    private static final int NUMBER_OF_NATIONS = 5; // fjöldi landa í boði
    private static final String IMAGE_FANI = "image/fani";
    private static final String GIF = ".gif";
    private static final String MP_3 = ".mp3";
    private static final String PAUSE = "||";
    private static final String PLAY = ">";

    // tilviksbreytur sem hýsa viðmótshluti
    @FXML
    private ImageView fxMynd;
    @FXML
    private ComboBox<String> fxLand; // löndin til að velja úr

    // tilviksbreytur
    private final Image[] images = new Image[NUMBER_OF_NATIONS];
    private final MediaPlayer[] mp = new MediaPlayer[NUMBER_OF_NATIONS];
    private static final ObservableList<String> items = FXCollections.observableArrayList
            ("Ísland", "Þýskaland", "Kína", "Indland", "Noregur");
    private int currentIndex = 0;

    /**
     * Frumstilla fánann og valmyndirnar
     */
    public void initialize() {
        fxLand.setItems(items);
        fxLand.setValue(items.getFirst());

        // Load images and audio
        frumstillaFanaOgSongva();
        /*
         * Velja land fyrir fána og þjóðsöng til að spila
         * byrjar að spila valinn þjóðsöng
         */
        fxLand.getSelectionModel().selectedItemProperty().addListener((observable,
                                                                       oldValue, newValue) -> {
            mp[items.indexOf(oldValue)].stop();
            fxMynd.setImage(images[items.indexOf(newValue)]);
            mp[items.indexOf(newValue)].play();
            ((Button) ((HBox) fxLand.getParent()).getChildren().getLast()).setText(PAUSE);
            currentIndex = items.indexOf(newValue);
        });
    }

    private void frumstillaFanaOgSongva() {
        for (int i = 0; i < NUMBER_OF_NATIONS; i++) {
            images[i] = new Image(FaniApplication.class.getResource(IMAGE_FANI + i + GIF) + "");
            mp[i] = new MediaPlayer(new Media(
                    FaniApplication.class.getResource(AUDIO_ANTHEM + i + MP_3) + ""));
            mp[currentIndex].play();
        }
    }

    /**
     * Spila þjóðsöng
     *
     * @param actionEvent atburðurinn er á spila hnappinn
     */
    @FXML
    private void onSpila(ActionEvent actionEvent) {
        Button spila = (Button) actionEvent.getSource();
        if (spila.getText().equals(PLAY)) {
            spila.setText(PAUSE);
            mp[currentIndex].play();
        }
        else {
            spila.setText(PLAY);
            mp[currentIndex].pause();
        }
    }
}
