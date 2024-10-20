public abstract class Book {
    protected String title;
    protected String ISBN;
    protected String publisher;
    protected double price;
    protected int year;

    public Book(String title, String ISBN, String publisher, double price, int year) {
        this.title = title;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.year = year;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public String getISBN() {
        return ISBN;
    }
    public String getPublisher() {
        return publisher;
    }
    public int getYear() {
        return year;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public abstract void setPrice(double price);
    public abstract String getGenre();

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        return "Title: " + title + "\nISBN: " + ISBN + "\nPublisher: " + publisher + "\nPrice: " + price + "\nYear: " + year;
    }

}
