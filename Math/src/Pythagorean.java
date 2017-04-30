import java.util.Scanner;

/***************************************************
 * Created by Lance Douglas on 4/29/2017 - Math *
 ***************************************************/
public class Pythagorean {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("This program helps determine\n" +
                "the third side of a triangle. Remember:\n" +
                "a2 + b2 = c2.\n" +
                "Which side do you need to know? a, b, or c?\n" +
                "C is always the longest.");
        String side = scn.nextLine().toLowerCase();
        if (side.equals("a")) {
            System.out.print("b: ");
            double b = scn.nextDouble();
            System.out.print("c: ");
            double c = scn.nextDouble();

            double b2 = b*b;
            double c2 = c*c;
            double a2 = c2-b2;
            double a = Math.sqrt(a2);

            System.out.println("Side a is " + a);
        } else if (side.equals("b")) {
            System.out.print("a: ");
            double a = scn.nextDouble();
            System.out.print("c: ");
            double c = scn.nextDouble();

            double a2 = a*a;
            double c2 = c*c;
            double b2 = c2-a2;
            double b = Math.sqrt(b2);

            System.out.println("Side a is " + b);
        } else if (side.equals("c")) {
            System.out.print("a: ");
            double a = scn.nextDouble();
            System.out.print("b: ");
            double b = scn.nextDouble();

            double a2 = a*a;
            double b2 = b*b;
            double c2 = a2+b2;
            double c = Math.sqrt(c2);

            System.out.println("Side 'c' is " + c);
        }
    }
}
