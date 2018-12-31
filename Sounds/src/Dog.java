/***********************************************************************
 * Created by Lance Douglas on 12/30/2018
 ***********************************************************************/
public class Dog {
    int size;

    void setSize(int size) {
        this.size = size;
    }
    int getSize() {
        return this.size;
    }

    void bark(int num) {
        while (num > 0) {
            if (size <= 20) {
                System.out.println("Yip yip!");
            } else if (size > 20 && size <= 50) {
                System.out.println("Woof, woof.");
            } else if (size > 50) {
                System.out.println("WOOF MOTHERFUCKER");
            } else {
                System.out.println("What");
            }
            num--;
        }
    }
}
