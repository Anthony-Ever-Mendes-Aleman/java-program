package trafficlight;

import java.sql.SQLOutput;

public class Main
{

    public static void main(String[] args){
        TrafficLight light = TrafficLight.RED;

        for (TrafficLight l : TrafficLight.values()){
            switch (l){
                case RED:
                    System.out.println(l + ": Stop for " + light.getDuration() + " seconds");
                    break;
                    case YELLOW:
                        System.out.println(l + ": Slow for " + light.getDuration() + " seconds");
                        break;
                        case GREEN:
                            System.out.println(l + ": Go for " + light.getDuration() + " seconds");
                            break;
            }
        }
    }
}
