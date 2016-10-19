import java.util.Scanner;

public class RecursionDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scn.nextInt();
        System.out.println("In word format, the number is: ");
        displayAsWords(number);
    }
    private static void displayAsWords(int number) {
        if (number < 10) {
            System.out.print(getWordFromDigit(number) + " ");
        } else {
            displayAsWords(number / 10);
            System.out.print(getWordFromDigit(number%10) + " ");
        }
    }
    private static String getWordFromDigit(int digit) {
        String result = null;

        switch (digit) {
            case 0: result = "zero"; break;
            case 1: result = "one"; break;
            case 2: result = "two"; break;
            case 3: result = "four"; break;
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