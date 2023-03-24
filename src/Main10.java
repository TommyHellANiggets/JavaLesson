import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Image image = new Image(new FileInputStream("C:/Users/tommy/IdeaProjects/JavaLesson/PutinBogXoxlov.png/"));
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(150);
        imageView.setFitWidth(200);

        PixelReader pixelReader= image.getPixelReader();
        for ( int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                Color color = pixelReader.getColor(i,j);
            }
        }
        WritableImage wImage = new WritableImage((int)image.getWidth(), (int)image.getHeight());
        PixelWriter pixelWriter = wImage.getPixelWriter();
        for(int i = 0; i< image.getHeight(); i++) {
            for(int j = 0; j < image.getWidth(); j++) {
                pixelWriter.setColor(j, i, Color.ALICEBLUE);
            }
        }
    ImageIO.write(SwingFXUtils.fromFXImage(wImage,null), "png", new FileOutputStream("PutinBogXoxlov.png"));

        Group root = new Group();
        root.getChildren().add(new ImageView(wImage));
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }
}