/***********************************************************************
 * Created by Lance Douglas on 12/30/2018
 ***********************************************************************/
public class DogRunner {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setSize(15);
        dog2.setSize(40);
        dog3.setSize(76);

        System.out.println(
                dog1.getSize()
                + "\n" + dog2.getSize()
                + "\n" + dog3.getSize());

        dog1.bark(3);
        dog2.bark(1);
        dog3.bark(5);

    }
}
