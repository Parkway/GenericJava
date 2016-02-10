package thebottle.song;

public class Main {
    
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";
        String constant;
        while (beerNum > 0) {
            if (beerNum == 1) word = "bottle";
            constant = beerNum + " " + word + " of beer";
            System.out.println(constant + " on the wall.\n" + constant + ".");
            System.out.println("Take one down.\nPass it around.");
            beerNum = beerNum - 1;
            if (beerNum == 0) System.out.println("I'm drunk as fuck.");
        }
    }
}
