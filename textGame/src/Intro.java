/*****************************************
 * Created by Lance Douglas on 1/1/2019
 *****************************************/

import java.util.*;

class Intro {

    Quest quest = new Quest();
    SideKick sideKick = new SideKick();

    Scanner scn = new Scanner(System.in);
    String acceptQuest, sideKicker;

    String harvey = "Harvey the Asshole";
    String theodore = "Theodore the Starving";
    String koda = "Koda the Delightfully Chubby";
    String eve = "Eve the Disabled";

    String lore = "There is no lore.";

    void start() {
        Main.print(
            "Welcome to Bunlandia!\n" +
            "The choose your own adventure game\n" +
            "that lets you choose your own adventure!\n");

        Main.print(
            "Your mission, should you choose to accept it,\n" +
            "is to infiltrate the Titty Tower of Doom, steal\n" +
            "the Krabby Patty Formula, and return it to the\n" +
            "good citizens of Bunlandia. Do you accept?");
        acceptQuest = scn.nextLine();

        if (acceptQuest.contains("y") || acceptQuest.contains("Y")) {
            Main.print("Excellent! Your first task is to choose a sidekick.\n");
        } else if (acceptQuest.equalsIgnoreCase("lore")) {
            Main.print(lore);
        } else {
            Main.print("I understand. After all, not everyone is worthy\n" +
                    "of saving an entire kingdom.");
            System.exit(69420);
        }

    }

        void chooseSideKick() {
            try {
                Main.print(
                    "You have four choices:\n" +
                    harvey + "\n" + theodore + "\n" + koda + "\n" + eve + "\n");
                Main.print(
                    "Each comes with their own unique ability.\n" +
                    "Enter their names, or enter \"powers\"\n" +
                    "Choose wisely.");

                sideKicker = scn.nextLine();

                if (sideKicker.equalsIgnoreCase("harvey")) {
                    begin(harvey);
                } else if (
                        sideKicker.equalsIgnoreCase("theo") ||
                        sideKicker.equalsIgnoreCase("theodore)")) {
                    begin(theodore);
                } else if (sideKicker.equalsIgnoreCase("koda")) {
                    begin(koda);
                } else if (sideKicker.equalsIgnoreCase("eve")) {
                    begin(eve);
                } else if (sideKicker.equalsIgnoreCase("powers")) {
                    sideKick.powers();
                    chooseSideKick();
                } else {
                    Main.print(
                            "You did not select a valid option.\n" +
                                    "Your choices are \"Harvey\", \"Theodore\"\n" +
                                    "\"Koda\", \"Eve\", and \"Powers\" to\n" +
                                    "to compare the abilities of each sidekick.");
                    chooseSideKick();
                }
            } catch (NullPointerException NPE) {
            //Do nothing.
            }
        }

    void begin(String sideKick) {

        Main.print("You have selected " + sideKick);
        quest.beginning(sideKick);

    }


}
