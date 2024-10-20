package exercise2;

public abstract class GameTester {

    protected String name;
    protected boolean status;

    public GameTester(String name, boolean b) {
        this.name = name;
        this.status = b;
    }

    public void setName(String setName){this.name = setName;}

    public String getName(){return name;}

    public void setStatus(boolean setStatus){ this.status = setStatus;}

    public boolean getStatus(){return status;}

    public abstract double salary();


}
