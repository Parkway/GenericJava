import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String Addition;
        String Subtraction;
        String Division;
        String Multiplication;
    }

    Calculator Add = new Calculator();
    Calculator Subtract = new Calculator();
    Calculator Multiply = new Calculator();
    Calculator Divide = new Calculator();

    public class Operation {
        Scanner userinput = new Scanner(System.in);
        void op() {
            if (userinput.equals(Add)) {
                System.out.println("Lets do some addition!");
                System.out.println(" ");
                System.out.println("First number? ");
                Double num1 = userinput.nextDouble();
                System.out.println("Second number? ");
                Double num2 = userinput.nextDouble();
                Double num3 = num1 + num2;
                System.out.println(" ");
                System.out.println("The answer is " + num3);
        }
    }
}
}

