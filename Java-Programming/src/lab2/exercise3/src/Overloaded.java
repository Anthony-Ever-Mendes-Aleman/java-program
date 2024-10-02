import javax.swing.JOptionPane;
public class Overloaded {
    public static void DogFeatures(String name){
        JOptionPane.showMessageDialog(null,"My dog name is " + name);
    }
    public static void DogFeatures(String name,int age ){
        JOptionPane.showMessageDialog(null,"My dog name is " + name + " and is " + age + " years old");
    }
    public static void DogFeatures(String name,int age,int weight){
        JOptionPane.showMessageDialog(null,"My dog name is, " + name + " is " + age + " years old " + "and weighs " + weight + "lbs");
    }
}
