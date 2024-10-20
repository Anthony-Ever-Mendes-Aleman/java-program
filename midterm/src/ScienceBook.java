public class ScienceBook extends Book {
    protected String Genre;
    public ScienceBook(String title, String ISBN, String publisher, double price, int year) {
        super(title, ISBN, publisher, price, year);
        Genre = "Science";

    }

    @Override
    public void setPrice(double price) {
        double discount = 0.1;
        this.price = price - (price * discount);

    }
    @Override
    public String getGenre(){
        return Genre;
    }




}
