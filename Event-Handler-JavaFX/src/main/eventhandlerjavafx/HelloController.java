package main.eventhandlerjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.awt.event.ActionEvent;

public class HelloController {
    public void up(ActionEvent e) {
        System.out.println("up");
    }
    public void down(ActionEvent e) {
        System.out.println("down");
    }
    public void left(ActionEvent e) {
        System.out.println("left");
    }
    public void right(ActionEvent e) {
        System.out.println("right");
    }
}