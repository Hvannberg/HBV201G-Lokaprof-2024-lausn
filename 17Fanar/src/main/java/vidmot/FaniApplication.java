package vidmot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import java.io.IOException;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Dæmi 17 í lokaprófi HBV201G 2024
 *
 *
 *****************************************************************************/
public class FaniApplication extends Application {

    /**
     * Ræsir forritið í glugga stage
     * @param stage glugginn
     * @throws IOException undantekning ef ekki tekst að lesa inn viðmótstréð
     */
    @Override // Override the start method in the Application class
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(FaniApplication.class.getResource("fani-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 475, 470);

        stage.setTitle("Fánar og þjóðsöngvar");
        stage.setScene(scene);
        stage.show();
    }


    /**
     * Ræsir forritið
     */
    public static void main(String[] args) {
        launch(args);
    }
}