public class RocketShip {
    public static void main(String[] args) throws InterruptedException {
        for (int blastoff = 3; blastoff > 0; blastoff--) {
            System.out.println(blastoff);
            Thread.sleep(1000);
        }
        System.out.println("Blast off!");
    }

}
