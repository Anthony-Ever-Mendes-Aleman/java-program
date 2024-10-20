package booknauthor;

public class Book {
    protected String title;
    protected Author author;

    public Book(String title, String authorName, String authorNationality)
    {
        this.title = title;
        this.author = new Author(authorName, authorNationality);
    }
    public void getBookInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author.getName() + " (" + author.getNationality() + ")");
    }


}
