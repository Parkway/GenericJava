public class Main {
    public static void main(String[] args) throws InterruptedException {

        for (int beerNum = 99; beerNum >= 0; beerNum--) {
            String bottle = " bottles ";
            if (beerNum == 1) {
                bottle = " bottle ";
            }
            int beerDown = beerNum - 1;
            System.out.println(beerNum + bottle + "of beer on the wall, " + beerNum + bottle + "of beer.");
            System.out.println("Take one down, pass it around, " + beerDown + " bottles of beer on the wall.\n");
            Thread.sleep(1500);
        }
    }
}
