package vidmot;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.input.MouseEvent;
import vinnsla.AllirFrambjodendur;
import vinnsla.Frambjodandi;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *  Lýsing  : Dæmi 21 í lokaprófi HBV201G 2024
 *
 *****************************************************************************/

public class KosningController {

    // tilviksbreytur fyrir viðmótshluti
    // bætið við skýringu fyrir aftan hverja breytu
    // instance variables for user interface variables
    // add a comment after each variable
    @FXML
    private Label fxFjoldi;
    @FXML
    private ProgressBar fxProgress;
    @FXML
    private ListView<Frambjodandi> fxFrambod;


    // frumstilling á controller
    // initialization of a controller
    public void initialize() {
        fxFrambod.setItems(AllirFrambjodendur.lesaFrambod());
        fxFrambod.getSelectionModel().selectFirst();
        veljaFrambjodanda();
    }

    // atburðahandler fyrir að velja atriði á lista
    // event handler for selecting an item on the list
    @FXML
    private void onValinFrambjodandi(MouseEvent mouseEvent) {
        veljaFrambjodanda();
    }

    // bætið við private hjálparaðferðum sem kallað er á úr öðrum aðferðum
    // add private utility methods that are used in other methods
    private void veljaFrambjodanda() {
        Frambjodandi f = fxFrambod.getSelectionModel().getSelectedItem();
        int fjoldi = f.getFjoldiMedmaela();
        fxFjoldi.setText(fjoldi + "");
        fxProgress.setProgress(fjoldi / 1500.0);
    }
}
