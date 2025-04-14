package vidmot;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import vinnsla.Lan;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *  Lýsing  : Dæmi 19 í lokaprófi HBV201G 2024
 *
 *****************************************************************************/

public class LanController {

    @FXML
    private TextField fxVextir; // vextir
    @FXML
    private TextField fxFjoldiAra; // fjöldi ára sem lánað er
    @FXML
    private TextField fxLanaupphaed; // lánsupphæð
    @FXML
    private TextField fxGreidslaManudi; // greiðsla á mánuði

    /**
     * Handler fyrir að reikna út greiðslur á mánuði fyrir lánið
     *
     * @param actionEvent ónotað
     */
    public void onReiknaLan(ActionEvent actionEvent) {
        Lan lan = new Lan(Double.parseDouble(fxVextir.getText()),
                Integer.parseInt(fxFjoldiAra.getText()),
                Double.parseDouble(fxLanaupphaed.getText()));
        fxGreidslaManudi.setText(String.format("%10.2f ISK", lan.manadarlegGreidsla()));
    }
}
