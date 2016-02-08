/**
 * Created by Lance on 1/29/2016.
 */
public class Dog {

    String name;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Spot"; // why does this exist?

        Dog[] myDogs = new Dog[3];

        for (int y=0; y<3; y++ ) myDogs[y] = new Dog(); //shorter

        myDogs[0].name = "Moshi";
        myDogs[1].name = "Levi";

        System.out.println("Last dog's name is " + myDogs[2].name);  // sup with the two print lines?

        for (Dog x: myDogs) x.bark(); // shorter
    }

    public void bark() {
        System.out.println(name + " says woof!");
    }

}
