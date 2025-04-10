package vinnsla;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class AllirFrambjodendur {

    /**
     * Skilar lista af Frambjodandi hlutum
     * @return listi af Frambjodandi hlutum
     */
    public static ObservableList<Frambjodandi> lesaFrambod() {
        ObservableList<Frambjodandi> listi = FXCollections.observableArrayList();
        listi.add(new Frambjodandi("Jóna Jónsdóttir", 750));
        listi.add (new Frambjodandi ("Bjarni Jónsson", 1500));
        listi.add (new Frambjodandi ("Jón Bjarnason", 150));
        listi.add (new Frambjodandi ("Blær Bjarnason", 375));
        return listi;
    }
}
