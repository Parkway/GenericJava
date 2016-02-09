public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1;
        int guessp2;
        int guessp3;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("A number between 0-9");

        while(true) {
            System.out.println("Number to guess is " + targetNumber);
            // I love that I can type Sys then just . . . to ready a println.

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Player One guessed " + guessp1);
            guessp2 = p2.number;
            System.out.println("Player Two guessed " + guessp2);
            guessp3 = p3.number;
            System.out.println("Player Three guessed " + guessp3);

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner!");
                System.out.println("Player One got it right? " + p1isRight);
                System.out.println("Player Two got it right? " + p2isRight);
                System.out.println("Player Three got it right? " + p3isRight);
                System.out.println("Game is over.");
                break;

            }
            else {
                System.out.println("Players will have to try again...");
            }

        }
    }
}
