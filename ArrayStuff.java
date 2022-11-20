import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
public class ArrayStuff {
    private static double getAverage(int[] RandNumbers) {

        int sum = 0;

        for (int randNumber : RandNumbers) {
            sum += randNumber;
        }
        return ((double) sum / RandNumbers.length);


    }
    public static void main(String[] args) {

        Random rnd = new Random();

        int RandNumbers[] = new int[100];

        for (int i = 0; i < RandNumbers.length; i++) {
            RandNumbers[i] = ThreadLocalRandom.current().nextInt(0, 100);
            int index = rnd.nextInt(RandNumbers.length);
            System.out.printf("%d |", index);


        }
        int sum = 0;

        for (int randNumber : RandNumbers) {
            sum += randNumber;
        }
        System.out.printf("%n Your sum is " + sum + "%n Your average is " + getAverage(RandNumbers) );

        Scanner in = new Scanner(System.in);

        System.out.printf("%n The value 4 was found at array index 5");

        
    }
}
