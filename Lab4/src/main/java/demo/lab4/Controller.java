package demo.lab4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private RadioButton comp, buis;
    @FXML
    private ComboBox<String> courses;
    @FXML
    private ListView<String> list;
    @FXML
    private TextField name, address, province, city, postal, phone, email;
    @FXML
    private CheckBox council, volunteer;
    @FXML
    private TextArea display;

    String[] coursesComp = {"java", "python", "web dev", "database"};
    String[] coursesBuis = {"Math", "business1", "entrepreneurship", "business communications"};

    String userName, userAddress, userProvince, userCity, userPostal, userPhone, userEmail;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        courses.getItems().addAll(coursesComp);
        comp.setOnAction(this::updateCourses);
        buis.setOnAction(this::updateCourses);
        courses.setOnAction(this::updateList);
    }

    private void updateCourses(ActionEvent event) {
        if (comp.isSelected()) {
            list.getItems().clear();
            courses.getItems().clear();
            courses.getItems().addAll(coursesComp);
        } else if (buis.isSelected()) {
            list.getItems().clear();
            courses.getItems().clear();
            courses.getItems().addAll(coursesBuis);
        }
    }

    @FXML
    private void updateList(ActionEvent event) {
        String course = courses.getValue();
        if (course != null && !list.getItems().contains(course)) {
            list.getItems().add(course);
        }
    }
    @FXML
    protected void onDisplayClick() {
        userName = name.getText();
        userAddress = address.getText();
        userProvince = province.getText();
        userCity = city.getText();
        userPostal = postal.getText();
        userPhone = phone.getText();
        userEmail = email.getText();

        display.clear();
        display.appendText(userName + " " + userAddress + " " + userProvince + " " + userCity + " " + userPostal);
        display.appendText("\n");
        display.appendText(userPhone);
        display.appendText("\n");
        display.appendText(userEmail);
        display.appendText("\n");
        display.appendText("Courses:");
        display.appendText(list.getItems().toString());

    }
}