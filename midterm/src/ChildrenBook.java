public class ChildrenBook extends Book {
    protected String Genre;
    public ChildrenBook(String title, String ISBN, String publisher, double price, int year) {
        super(title, ISBN, publisher, price, year);
        Genre = "Children";

    }
    @Override
    public String getGenre() {
        return Genre;
    }
    @Override
    public void setPrice(double price) {
        this.price = 13;
    }
}
