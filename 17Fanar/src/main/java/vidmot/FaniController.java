package vidmot;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class FaniController {

    private static final int NUMBER_OF_NATIONS = 5;

    public ImageView fxMynd;
    @FXML
    private Button fxSpila;
    @FXML
    private ComboBox fxLand;

    private final Image[] images = new Image[NUMBER_OF_NATIONS];
    private final MediaPlayer[] mp = new MediaPlayer[NUMBER_OF_NATIONS];

    private static final ObservableList<String> items = FXCollections.observableArrayList
            ("Ísland",  "Þýskaland", "Kína", "Indland", "Noregur");

    private int currentIndex = 0;


    public void initialize() {
        fxLand.setItems(items);
        fxLand.setValue(items.getFirst());

        // Load images and audio
        for (int i = 0; i < NUMBER_OF_NATIONS; i++) {
            images[i] = new Image(FaniApplication.class.getResource("image/fani" + i + ".gif") + "");
            mp[i] = new MediaPlayer(new Media(
                    FaniApplication.class.getResource("audio/anthem" + i + ".mp3") + ""));
            mp[currentIndex].play();
        }
    }

    public void onSpila(ActionEvent actionEvent) {
        Button spila = (Button) actionEvent.getSource(); // gæti komið í staðinn fyrir fxSpila
        if (fxSpila.getText().equals(">")) {
            fxSpila.setText("||");
            mp[currentIndex].play();
        } else {
            fxSpila.setText(">");
            mp[currentIndex].pause();
        }
    }

    public void veljaLand(ActionEvent actionEvent) {
        mp[currentIndex].stop();
        currentIndex = items.indexOf(fxLand.getValue());
        fxMynd.setImage(images[currentIndex]);
        mp[currentIndex].play();
        fxSpila.setText("||");
    }
}