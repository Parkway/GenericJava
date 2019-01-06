import java.util.Scanner;

/*****************************************
 * Created by Lance Douglas on 1/4/2019
 *****************************************/
public class SoundDriver {

    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        Scanner scn = new Scanner(System.in);
        String animalChoice;

        System.out.println("What animal would you like to hear?");
        animalChoice = scn.nextLine();
        switcher.choice(animalChoice);

    }

}
