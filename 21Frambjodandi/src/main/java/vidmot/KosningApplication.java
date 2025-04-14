package vidmot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *  Lýsing  : Dæmi 21 í lokaprófi HBV201G 2024
 *
 *****************************************************************************/

public class KosningApplication extends Application {
    /**
     * Ræsir forritið í glugga stage
     * @param stage glugginn
     * @throws IOException undantekning ef ekki tekst að lesa inn viðmótstréð
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(KosningApplication
                .class.getResource("kosning-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Frambjóðendur");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Aðalforritið
     * @param args ónotað
     */
    public static void main(String[] args) {
        launch();
    }
}
