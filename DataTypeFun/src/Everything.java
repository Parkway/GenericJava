import java.util.Scanner;

public class Everything {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("This program does a lot, so I'm gonna break it down:\n" +
                "First, it takes a number, and lets you find the power of N.\n" +
                "Then, it takes that new number, and converts it into digits.\n" +
                "Finally, it organizes all of it lexicographically.\n" +
                "Here goes.\n");
        System.out.print("Enter a number: ");
        double num = scn.nextDouble();
        System.out.print("Enter the number to power it by: ");
        double pow = scn.nextDouble();
        power(num, pow);

    }
    private static void power(double num, double pow) {
        double toPow = Math.pow(num, pow);
        System.out.println(num + " to the power of " + pow + " is " + toPow + ".");
        displayAsWords(toPow);
    }
    private static void displayAsWords(double num) {
        if (num < 10) {
            System.out.print(getWordFromDigit(num) + " ");
        } else {
            displayAsWords(num / 10);
            System.out.print(getWordFromDigit(num % 10) + " ");
        }
    }
    private static String getWordFromDigit(double digit) {
        String result= null;
        int newDigit = (int)digit;

        switch (newDigit) {
            case 0: result = "zero"; break;
            case 1: result = "one"; break;
            case 2: result = "two"; break;
            case 3: result = "three"; break;
            case 4: result = "four"; break;
            case 5: result = "five"; break;
            case 6: result = "six"; break;
            case 7: result = "seven"; break;
            case 8: result = "eight"; break;
            case 9: result = "nine"; break;
            default: {
                System.out.println("Error, number greater than ten.");
                System.exit(0);
            }
        }
        return result;
    }
}
