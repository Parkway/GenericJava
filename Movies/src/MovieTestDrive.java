/**
 * Created by Lance on 1/28/2016.
 */
public class MovieTestDrive {
        public static void main(String[] args){
            Movie one = new Movie();

            one.title = "Gone With The Stock";
                one.genre = "Tragedy";
                one.rating = -2;

            Movie two = new Movie();

            two.title = "Lost In Space";
                two.genre = "Sp00ky";
                two.rating = 5;

            Movie three = new Movie();

            three.title = "Bee Movie";
                three.genre = "Childrens";
                three.rating = 3;

            System.out.println("Play a movie.");
        }
    }
