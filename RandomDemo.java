package IQ.random;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDemo {
    public static void main(String[] args) {
        System.out.println(Math.random());

        int min=200;
        int max=400;
        double num=Math.random()*(max-min + 1) + min;
        System.out.println("Random number between 200 and 400: " + num);

        //Generate random int value from 200 to 400
        System.out.println("Random value of type int between "+min+" to "+max+ ":");
        int b = (int)(Math.random()*(max-min+1)+min);
        System.out.println( b);

        //using Random class
        System.out.println("using the Random class");
        Random random= new Random();
        int bb=random.nextInt(50);
        int bb1=random.nextInt(); //could be positive and negative
        int bb2= random.nextInt(1000,3000);
        System.out.println(bb + "\n" + bb1 + "\n" + bb2);

        double xx=random.nextDouble(2000);
        long ll=random.nextLong(12345,789999999);
        // Prints random boolean values
        System.out.println("================");
        boolean b1= random.nextBoolean();
        boolean b2= random.isDeprecated();
        System.out.println(xx + "\n"  + ll + "\n" + "Randomly Generated Boolean Values : "+ b1 + "\n"  + b2);

//3 using ThreadLocalRandom class
        // Generate random integers
        int tlr = ThreadLocalRandom.current().nextInt();
        double tlr1 = ThreadLocalRandom.current().nextDouble();
// Print random integer values
        System.out.println("Randomly Generated Values using the ThreadLocalRandom class:");
        System.out.println(tlr);
        System.out.println(tlr1);
        boolean e = ThreadLocalRandom.current().nextBoolean();
        System.out.println(e);

        System.out.println("=============");

        //using java-8 ints()
        randomInts(5);
        System.out.println("==============");
        randomInts(9, 50, 90);
//getStreamOfRandomInts(30, 50);

    }
    //method that generates a stream of integers having size 5
    public static void randomInts(int num)
    {
        Random random = new Random();
        random.ints(num).forEach(System.out::println);
    }
    //method that generates a stream of 9 integers between 50 to 90
    public static void randomInts(int num, int origin, int bound)
    {
        Random random1 = new Random();
        random1.ints(num, origin, bound).forEach(System.out::println);
    }
}
