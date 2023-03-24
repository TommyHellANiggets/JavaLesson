import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        TextField button = new TextField();

        Group root = new Group();
        root.getChildren().addAll(button);
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }
}