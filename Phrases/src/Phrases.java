public class Phrases {

    public static void main(String[] args) {

        String[] wordListOne = {"That","This","She is such a"};

        int oneLength = wordListOne.length;

        int rand1 = (int) (Math.random() * oneLength);

        String phrase = wordListOne[rand1];
        System.out.println("Did you hear about Jenny?\nNo I didn't!\n" + phrase);
    }
}
