/*****************************************
 * Created by Lance Douglas on 1/1/2019
 *****************************************/
public class Main {

    public static void main(String[] args) {
        Quest quest = new Quest();
        Intro introduction = new Intro();
        Fight fight = new Fight();
        introduction.start();
        introduction.chooseSideKick();




    }
    static void print(String s) {
        System.out.println(s);
    }
}
