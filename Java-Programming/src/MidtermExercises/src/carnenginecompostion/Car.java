package carnenginecompostion;

public class Car {
    protected String model;
    protected final Engine engine;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public Engine getEngine() {
        return engine;
    }
    public void startCar() {
        engine.start(model);
    }
}
