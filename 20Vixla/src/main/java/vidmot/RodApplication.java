package vidmot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RodApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(RodApplication.class.getResource("rodun-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Víxla");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Ræsir forritið
     * @param args
     */
    public static void main(String[] args) {
        launch();
    }
}
