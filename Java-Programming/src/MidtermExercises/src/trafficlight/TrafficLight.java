package trafficlight;

public enum TrafficLight {
    RED(30),
    YELLOW(5),
    GREEN(45);
    private final int duration;
    TrafficLight(int duration)
    {
        this.duration = duration;
    }
    public int getDuration(){
        return duration;
    }
}
