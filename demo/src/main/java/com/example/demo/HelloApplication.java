package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root2 = FXMLLoader.load(getClass().getResource("/hello-view.fxml"));

        //Stage stage1 = new Stage();
        //setting the sandwich(stage-scene-properties of stage)
        Group root = new Group();
        Scene scene  = new Scene(root, 600, 600, Color.SKYBLUE);

        Text text = new Text();
        Rectangle rectangle = new Rectangle();
        text.setText("Cool Coding bro");
        text.setFont(Font.font("Times New Roman", 50));
        text.setFill(Color.RED);
        text.setX(50);
        text.setY(50);
        root.getChildren().add(text);

        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        root.getChildren().add(line);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setOpacity(0.5);
        line.setRotate(45);

        rectangle.setX(100);
        rectangle.setY(300);
        rectangle.setWidth(200);
        rectangle.setHeight(200);
        root.getChildren().add(rectangle);
        rectangle.setFill(Color.RED);
        rectangle.setStroke(Color.BLACK);
        rectangle.setOpacity(0.9);
        rectangle.setStrokeWidth(5);


        //does not work
        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(200.0,200.0,300.0,300.0,200.0,200.0);
        triangle.setFill(Color.RED);
        root.getChildren().add(triangle);
        triangle.setFill(Color.BLACK);

        Circle circle = new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(20);
        root.getChildren().add(circle);
        circle.setFill(Color.ORANGE);


        Image pizza = new Image(getClass().getResource("/pizza.png").toString());
        ImageView imageview = new ImageView(pizza);
        imageview.setX(150);
        imageview.setY(150);
        root.getChildren().add(imageview);

        stage.setScene(scene);
        stage.setTitle("Stage Demo Program");
        Image icon = new Image(getClass().getResource("/icon.png").toString());
        stage.getIcons().add(icon);
      //  stage.setWidth(420);
       // stage.setHeight(420);
        //stage.setResizable(false);
        //stage.setX(50);
        //stage.setY(50);
        stage.show();

    }
}


