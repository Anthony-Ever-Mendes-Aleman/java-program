package booknauthor;

public class Author {
    protected String name;
    protected String nationality;

    public Author(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }
    public String getName() {
        return name;
    }
    public String getNationality() {
        return nationality;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
