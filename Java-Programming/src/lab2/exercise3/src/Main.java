import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter Your dogs name, his age(optional) and weight(optional");
        String[] dog = input.split(" ");

        if (dog.length == 1){
            Overloaded.DogFeatures(dog[0]);
        }else if (dog.length == 2){
            Overloaded.DogFeatures(dog[0], Integer.parseInt(dog[1]));
        } else if (dog.length == 3){
            Overloaded.DogFeatures(dog[0], Integer.parseInt(dog[1]), Integer.parseInt(dog[2]));
        }else {
            JOptionPane.showMessageDialog(null, "Invalid input, Please only enter what information we asked nothing more.");
        }
    }
}