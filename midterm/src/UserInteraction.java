import java.util.Scanner;
import java.util.stream.IntStream;

public class UserInteraction {
   public ScienceBook[] ScienceBooks = new ScienceBook[20];
    public ChildrenBook[] ChildrenBooks = new ChildrenBook[20];
    public int scienceBookcount = 0;
    public int childrenBookcount = 0;

    public void ShowInputDialog()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter Book Genre (Science/Children): ");
        String bookGenre = scanner.nextLine();
        if(bookGenre.toLowerCase().equals("science")){
            System.out.print("\nPlease enter Book Title: ");
            String bookTitle = scanner.nextLine();
            System.out.print("\nPlease enter Book Publisher: ");
            String bookPublisher = scanner.nextLine();
            System.out.print("\nPlease enter Book ISBN: ");
            String bookISBN = scanner.nextLine();
            System.out.print("\nPlease enter Book Year: ");
            int bookYear = scanner.nextInt();
            System.out.print("\nPlease enter Book Price: ");
            double bookPrice = scanner.nextDouble();
                if(scienceBookcount < ScienceBooks.length) {
                    ScienceBooks[scienceBookcount] = new ScienceBook(bookTitle, bookISBN, bookPublisher, bookPrice, bookYear);
                    ScienceBooks[scienceBookcount].setPrice(bookPrice);
                    scienceBookcount++;
                }
        }else if(bookGenre.toLowerCase().equals("children")){
            System.out.print("Please enter Book Title: ");
            String bookTitle = scanner.nextLine();
            System.out.print("\nPlease enter Book Publisher: ");
            String bookPublisher = scanner.nextLine();
            System.out.print("\nPlease enter Book ISBN: ");
            String bookISBN = scanner.nextLine();
            System.out.print("\nPlease enter Book Year: ");
            int bookYear = scanner.nextInt();
                if(childrenBookcount < ChildrenBooks.length) {
                    ChildrenBooks[childrenBookcount] = new ChildrenBook(bookTitle, bookISBN, bookPublisher, 0, bookYear);
                    ChildrenBooks[childrenBookcount].setPrice(0);
                }
                }else {
            System.out.println("Invalid Book Genre.");
        }
    }

    public void ShowInputmessage() {
        for(int i = 0; i < ScienceBooks.length; i++) {
            if(ScienceBooks[i] != null) {
                System.out.println("\n ");
                System.out.println("Genre: " + ScienceBooks[i].getGenre());
                System.out.println(ScienceBooks[i].toString());

            }
        }
        for(int i = 0; i < ChildrenBooks.length; i++) {
            if(ChildrenBooks[i] != null) {
                System.out.println("\n ");
                System.out.println("Genre: " + ChildrenBooks[i].getGenre());
                System.out.println(ChildrenBooks[i].toString());

            }
        }
    }
    }