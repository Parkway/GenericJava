public class Phrases {

    public static void main(String[] args) {

        String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B to B", "winning", "front end", "web based",
                "pervasive", "smart", "sixsigma", "critical", "dynamic"};

        String[] wordListTwo = {"This", "that", "the other", "frequent", " rng", "things", "crack"};

        String[] wordListThree = {"my", "final", "wordlist", "is", "shorter"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("What we need is a " + phrase);
    }
}
