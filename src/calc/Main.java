package calc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * Created by srabb on 2017-06-28.
 */

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Simple Calculator");
        primaryStage.setScene(new Scene(root, 275, 387));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
