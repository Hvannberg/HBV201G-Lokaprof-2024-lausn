package vidmot;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import javafx.scene.Scene;


import java.io.IOException;

public class FaniApplication extends Application {

    private final static int NUMBER_OF_NATIONS = 7;
    private final static String URLBase =
            "@";
    private int currentIndex = 0;

    @Override // Override the start method in the Application class
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(FaniApplication.class.getResource("fani-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 475, 470);

        stage.setTitle("Fánar og þjóðsöngvar");
        stage.setScene(scene);
        stage.show();
        /**
        Image[] images = new Image[NUMBER_OF_NATIONS];
        MediaPlayer[] mp = new MediaPlayer[NUMBER_OF_NATIONS];

        // Load images and audio
        for (int i = 0; i < NUMBER_OF_NATIONS; i++) {
            images[i] = new Image(URLBase + "/image/flag" + i + ".gif");
            mp[i] = new MediaPlayer(new Media(
                    URLBase + "/audio/anthem/anthem" + i + ".mp3"));
        }

        Button btPlayPause = new Button("||");
        btPlayPause.setOnAction(e -> {
            if (btPlayPause.getText().equals(">")) {
                btPlayPause.setText("||");
                mp[currentIndex].play();
            }
            else {
                btPlayPause.setText(">");
                mp[currentIndex].pause();
            }
        });

        ImageView imageView = new ImageView(images[currentIndex]);
        ComboBox<String> cboNation = new ComboBox<>();
        ObservableList<String> items = FXCollections.observableArrayList
                ("Denmark", "Germany", "China", "India", "Norway", "UK", "US");
        cboNation.getItems().addAll(items);
        cboNation.setValue(items.get(0));
        cboNation.setOnAction(e -> {
            mp[currentIndex].stop();
            currentIndex = items.indexOf(cboNation.getValue());
            imageView.setImage(images[currentIndex]);
            mp[currentIndex].play();
            btPlayPause.setText("||");
        });

        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(btPlayPause,
                new Label("Select a nation: "), cboNation);
        hBox.setAlignment(Pos.CENTER);

        // Create a pane to hold nodes
        BorderPane pane = new BorderPane();
        pane.setCenter(imageView);
        pane.setBottom(hBox);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 350, 270);
        primaryStage.setTitle("Fánar og þjóðsöngvar"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
        mp[currentIndex].play(); // Play the current selected anthem
         */
    }


    /**
     * The main method is only needed for IDEs with limited
     * JavaFX support. It is not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}