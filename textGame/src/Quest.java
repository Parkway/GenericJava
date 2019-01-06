/*****************************************
 * Created by Lance Douglas on 1/1/2019
 *****************************************/
import java.util.*;

class Quest {

    Scanner scn = new Scanner(System.in);
    String disguise;


    void beginning(String sidekick) {
        try {
            Main.print(
                    "The first stage of your quest is to craft a disguise,\n" +
                    "to hide from the denizens of the Titty Tower of Doom (TTD)\n");
            Main.print(
                    "Would you like to sneak into enemy territory, overpower\n" +
                    "a foe, and steal their uniform? Or would you rather go to\n" +
                    "Victoria's Secret and purchase a new set of disguised armor?\n" +
                    "\"Steal\" or \"Purchase\"");

            disguise = scn.nextLine();
            if (disguise.equalsIgnoreCase("steal")) {
                Main.print(
                        "At the break of dawn, you and " + sidekick + "\n" +
                                "embark on a stealthy journey."
                );
            } else if (disguise.equalsIgnoreCase("purchase")) {
                Main.print(
                        "You and " + sidekick + " go to Victoria's Secret and\n" +
                        "spend $465.43 on a shirt, pair of pants, and black baseball cap.\n" +
                        ""
                );
            }
        } catch (NullPointerException NPE) {
            //Fack off
        }

    }
}
