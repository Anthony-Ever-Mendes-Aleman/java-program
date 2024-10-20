package carnenginecompostion;

public class Engine {
    protected String type;
    public Engine(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public void start(String model){
        System.out.println("Starting the " + type + " Engine of " + model);
    }

}
