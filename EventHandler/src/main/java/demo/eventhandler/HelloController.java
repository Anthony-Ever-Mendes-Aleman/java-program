package demo.eventhandler;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class HelloController {
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    private Circle myCircle;
    private double x;
    private double y;
   public void up(javafx.event.ActionEvent event) {
       myCircle.setCenterY(y -= 5);
   }
   public void down(javafx.event.ActionEvent event) {
       myCircle.setCenterY(y += 5);
   }
   public void left(javafx.event.ActionEvent event) {
       myCircle.setCenterX(x -= 5);
   }
   public void right(javafx.event.ActionEvent event) {
       myCircle.setCenterX(x += 5);
   }

   public void switchToScene1(javafx.event.ActionEvent event) throws IOException {
       FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main.fxml"));
       Parent root = fxmlLoader.load();
       stage = (Stage)((Node)event.getSource()).getScene().getWindow();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
   }

   public void switchToScene2(javafx.event.ActionEvent event) throws IOException {
       FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("scene2.fxml"));
       Parent root = fxmlLoader.load();
       stage = (Stage)((Node)event.getSource()).getScene().getWindow();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
   }


}