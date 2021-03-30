package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

       Pane pane = new Pane();
       pane.setPadding(new Insets(100, 100, 100, 100));

       Text text1 = new Text(15, 70, "Heyyy!");
       text1.setFont(Font.font("Century Gothic", FontWeight.BOLD, 25));
       text1.setFill(Color.DEEPPINK);
       text1.setOpacity(400);
       text1.setRotate(60);
       pane.getChildren().add(text1);

       Text text2 = new Text(55,83, "Goodbye!");
       text2.setFont(Font.font("Century Gothic", FontWeight.BOLD, 30));
       text2.setFill(Color.AQUAMARINE);
       text2.setOpacity(200);
       text2.setRotate(60);
       pane.getChildren().add(text2);

        Text text3 = new Text(30,175, "Until Next Time!");
        text3.setFont(Font.font("Century Gothic", FontWeight.BOLD, 30));
        text3.setFill(Color.CORNFLOWERBLUE);
        text3.setOpacity(400);
        text3.setRotate(180);
        pane.getChildren().add(text3);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Colors and Font");
        primaryStage.setScene(scene);
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
