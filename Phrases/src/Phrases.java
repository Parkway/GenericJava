public class Phrases {

    public static void main(String[] args) {

        String[] wordListOne = {"That ","This ","She is such a "};
        String[] wordListTwo = {"skank","slut","whore"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);

        String phrase = wordListOne[rand1] + wordListTwo[rand2];
        System.out.println("Did you hear about Jenny?\nNo I didn't!\n" + phrase);
    }
}
