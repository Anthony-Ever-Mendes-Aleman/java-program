public class Singers {

    private int singerId;
    private String singerName;
    private String address;
    private String dateOfBirth;
    private int numberOfAlbumsPublished;


    public Singers() {
        this.singerId = 0;
        this.singerName = "N/A";
        this.address = "N/A";
        this.dateOfBirth = "N/A";
        this.numberOfAlbumsPublished = 0;
    }


    public Singers(int singerId) {
        this.singerId = singerId;
    }


    public Singers(int singerId, String singerName) {
        this.singerId = singerId;
        this.singerName = singerName;
    }


    public Singers(int singerId, String singerName, String address) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.address = address;
    }


    public Singers(int singerId, String singerName, String address, String dateOfBirth) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }


    public Singers(int singerId, String singerName, String address, String dateOfBirth, int numberOfAlbumsPublished) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.numberOfAlbumsPublished = numberOfAlbumsPublished;
    }

    public void SetId(int singerId){
        this.singerId = singerId;
    }
    public int GetId(){
        return singerId;
    }
    public void SetName(String singerName){
        this.singerName = singerName;
    }
    public String GetName(){
        return singerName;
    }
    public void SetAddress(String address){
        this.address = address;
    }
    public String GetAddress(){
        return address;
    }
    public void SetDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public String GetDateOfBirth(){
        return dateOfBirth;
    }
    public void SetNumberOfAlbumsPublished(int numberOfAlbumsPublished){
        this.numberOfAlbumsPublished = numberOfAlbumsPublished;
    }
    public int GetNumberOfAlbumsPublished(){
        return numberOfAlbumsPublished;
    }

}