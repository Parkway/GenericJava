/**
 * Created by Lance on 1/29/2016.
 */
public class BooksTestDrive {
    public static void main(String[] args) {

        Books[] myBooks = new Books[3];
        int x = 0;
        myBooks[0].title = "Living with Java";
        myBooks[1].title = "What to expect when Java sucks.";
        myBooks[2].title = "Depression.";
        myBooks[0].author = "Me.";
        myBooks[1].author = "Me.";
        myBooks[2].author = "Me.";

        while (x < 3) {
            System.out.println(myBooks[x].title);
            System.out.println(" by ");
        }

    }
}
