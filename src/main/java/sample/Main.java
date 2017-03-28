package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.apache.log4j.Logger;

public class Main extends Application {
    //Created 3 loggers
    static Logger logger = Logger.getLogger(String.valueOf(Main.class));

    @Override
    public void start(Stage primaryStage) throws Exception{
        Image icon = new Image("icon.png");
        primaryStage.getIcons().add(icon);
        logger.info("My personal logo");
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));
        primaryStage.setTitle("Boolean Calculator");
        logger.info("Window Title >>> Boolean Calculator");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        logger.info("Start Boolean Calculator");
    }


    public static void main(String[] args) {
        launch(args);
    }
}
