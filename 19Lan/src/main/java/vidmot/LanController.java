package vidmot;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.util.converter.DoubleStringConverter;
import vinnsla.Lan;

public class LanController {

    @FXML
    private TextField fxVextir;
    @FXML
    private TextField fxFjoldiAra;
    @FXML
    private TextField fxLanaupphaed;
    @FXML
    private TextField fxGreidslaManudi;


    public void onReiknaLan(ActionEvent actionEvent) {
        Lan lan = new Lan(Double.parseDouble(fxVextir.getText()),
        Integer.parseInt(fxFjoldiAra.getText()),
        Double.parseDouble(fxLanaupphaed.getText()));
        fxGreidslaManudi.setText(String.format("%10.2f ISK", lan.manadarlegGreidsla()));
    }
}