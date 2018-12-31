/***********************************************************************
 * Created by Lance Douglas on 12/30/2018
 ***********************************************************************/
public class Main {
    public static void main(String[] args) {
        MathMachine MM = new MathMachine();

        int num1 = 25;
        int num2 = 75;

        int add = MM.add(num1, num2);
        System.out.println(add);

        int sub = MM.sub(num1, num2);
        System.out.println(sub);

        int mult = MM.mult(num1, num2);
        System.out.println(mult);

        double div = MM.div(num1, num2);
        System.out.println(div);
    }
}
