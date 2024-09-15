public class Main {
    public static void main(String[] args) {
        Singers singer1 = new Singers();
        System.out.println("Default singer values:");
        System.out.println("Singer Id:" + " " + singer1.GetId());
        System.out.println("Singer Name:" + " " + singer1.GetName());
        System.out.println("Singer address" + " " + singer1.GetAddress());
        System.out.println("Singer Date of Birth:" + " " + singer1.GetDateOfBirth());
        System.out.println("Singers Albums Published" + " " + singer1.GetNumberOfAlbumsPublished());

        System.out.println("====================================");
        Singers singer2 = new Singers();
        singer2.SetId(2);
        singer2.SetName("Anthony");
        singer2.SetAddress("123 Singer Street");
        singer2.SetDateOfBirth("08/10/2002");
        singer2.SetNumberOfAlbumsPublished(5);

        System.out.println("Singer 2 set values:");
        System.out.println("Singer Id:" + " " + singer2.GetId());
        System.out.println("Singer Name:" + " " + singer2.GetName());
        System.out.println("Singer address" + " " + singer2.GetAddress());
        System.out.println("Singer Date of Birth:" + " " + singer2.GetDateOfBirth());
        System.out.println("Singers Albums Published: " + singer2.GetNumberOfAlbumsPublished());
    }
}