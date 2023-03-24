import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Line line = new Line(0,0,100,100);
        line.setStroke(Color.BLACK);

        Group root = new Group();
        Scene scene = new Scene(root, 400, 300);
        root.getChildren().add(line);


        primaryStage.setScene(scene);
        primaryStage.show();
    }
}