package vinnsla;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *  Lýsing  : Dæmi 21 í lokaprófi HBV201G 2024
 *
 *****************************************************************************/

public class AllirFrambjodendur {

    /**
     * Skilar lista af Frambjodandi hlutum
     *
     * @return listi af Frambjodandi hlutum
     */
    public static ObservableList<Frambjodandi> lesaFrambod() {
        ObservableList<Frambjodandi> listi = FXCollections.observableArrayList();
        listi.add(new Frambjodandi("Jóna Jónsdóttir", 750));
        listi.add(new Frambjodandi("Bjarni Jónsson", 1500));
        listi.add(new Frambjodandi("Jón Bjarnason", 150));
        listi.add(new Frambjodandi("Blær Bjarnason", 375));
        return listi;
    }
}
