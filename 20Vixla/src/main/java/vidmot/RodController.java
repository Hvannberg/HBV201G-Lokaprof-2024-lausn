package vidmot;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class RodController {

    // Skilgreinið tilviksbreytur fyrir viðmótshluti
    // Define instance variables for user interface objects

    @FXML
    protected GridPane fxRod; // neðri röð með þremur ImageView hlutum

    /**
     * handler fyrir alla TextField-ana. Víxlar á myndum
     * @param actionEvent
     */
    @FXML
    public void onTala(ActionEvent actionEvent) {
        TextField textField = (TextField)actionEvent.getSource();
        // forritið héðan - program from here
        int til = GridPane.getColumnIndex(textField);
        int fra = Integer.parseInt(textField.getText()) - 1;

        // kallið á vixla - call vixla
        vixla (fra, til);
    }

    /**
     * Víxlar á myndum í reitum fra og til
     * @param fra heiltala sem er númer dálks í GridPane með mynd
     * @param til heiltala sem er númer dálks í GridPane með mynd
     */
    private void vixla(int fra, int til) {

        Image tmp = ((ImageView)fxRod.getChildren().get(fra)).getImage();
        ((ImageView)fxRod.getChildren().get(fra)).setImage(
                ((ImageView)fxRod.getChildren().get(til)).getImage());
        ((ImageView)fxRod.getChildren().get(til)).setImage(tmp);

    }
}
