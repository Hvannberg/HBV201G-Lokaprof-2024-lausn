package vidmot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Dæmi 19 í lokaprófi HBV201G 2024
 *
 *
 *****************************************************************************/

public class LanApplication extends Application {
    /**
     * Ræsir forritið og opnar það í stage glugga
     *
     * @param stage aðalgluggi
     * @throws IOException ef ekki tekst að lesa inn .fxml skrá
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LanApplication.class.getResource("lan-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 240);
        stage.setTitle("Lán");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Aðalforrit
     *
     * @param args ónotað
     */
    public static void main(String[] args) {
        launch();
    }
}
