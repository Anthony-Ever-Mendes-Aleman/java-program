import java.util.Random;
public class Lotto {

    static Random random = new Random();
    static int[] randomNumbers = new int[3];
    public static int[] ReturnArray()
    {
    for (int i = 0; i < randomNumbers.length; i++) {
        randomNumbers[i] = random.nextInt(9);

    }
        return randomNumbers;
}

}
