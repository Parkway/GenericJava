import java.util.Scanner;

public class ArrayOfTemperatures {
    public static void main(String[] args) throws InterruptedException {
        double[] temperature = new double[7];
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter seven temperatures.");
        double sum = 0;
        for (int index = 0; index < 7; index++) {
            temperature[index] = scn.nextDouble();
            sum = sum + temperature[index];
        }
        double average = sum / 7;

        System.out.println("The average temperature is " + average + " degrees.");
        if (average < 0) {
            System.out.println("Lol your life sucks.");
        }
        for (int index = 0; index < 7; index++) {
            if (temperature[index] < average) {
                System.out.println(temperature[index] + " is below the average temperature.");
                Thread.sleep(750);
            } else if (temperature[index] > average) {
                System.out.println(temperature[index] + " is above the average temperature.");
                Thread.sleep(750);
            } else {
                Thread.sleep(750);
                System.out.println(temperature[index] + " is the average temperature.");
            }
        }
    }
}
