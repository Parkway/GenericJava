import java.util.Scanner;

public class ArrayOfMoreTemperatures {
    public static void main(String[] args) throws InterruptedException {
        Scanner scn = new Scanner(System.in);
        print("How many temperatures do you have?");
        int size = scn.nextInt();
        double[] temp = new double[size];

        print("Enter " + temp.length + " temperatures.");
        double sum = 0;
        for (int index = 0; index < temp.length; index++) {
            temp[index] = scn.nextDouble();
            sum += temp[index];
        }
        double average = sum / temp.length;
        print("The average temperature is " + average + " degrees");
        if (average < 0) {
            System.out.println("Lol your life sucks.");
        }
        for (int index = 0; index < 7; index++) {
            if (temp[index] < average) {
                System.out.println(temp[index] + " is below the average temperature.");
                Thread.sleep(500);
            } else if (temp[index] > average) {
                System.out.println(temp[index] + " is above the average temperature.");
                Thread.sleep(500);
            } else {
                Thread.sleep(500);
                System.out.println(temp[index] + " is the average temperature.");
            }
        }
    }

    private static void print(String s) {
        System.out.println(s);
    }
}
