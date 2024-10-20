import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        UserInteraction ui = new UserInteraction();
        do{
            System.out.println("\n ");
            System.out.println("==================");
            System.out.println("1: Enter a book");
            System.out.println("2: Display books");
            System.out.println("3: Exit");
            System.out.println("===================");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            System.out.println("\n ");
            if(choice != 1 && choice != 2 && choice != 3)
            {
                System.out.println("Invalid choice");
                continue;
            }else {

                switch (choice) {
                    case 1:
                        ui.ShowInputDialog();
                        break;
                    case 2:
                        ui.ShowInputmessage();
                        break;
                    case 3:
                        System.out.println("Exitted program");

                }
            }

        }while (choice != 3);
    }

}