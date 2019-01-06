/*****************************************
 * Created by Lance Douglas on 1/4/2019
 *****************************************/
class Sound { 


    String cowSound = "moo";
    String chickenSound = "cluck";
    String duckSound = "quack";
    String dogSound = "bark";
    String catSound = "meow";

    String getCowSound() {
        print(cowSound);
        return null;
    }
    
    String getChickenSound() {
        print(chickenSound);
        return null;
    }

    String getDuckSound() {
        print(duckSound);
        return null;
    }

    String getDogSound() {
        print(dogSound);
        return null;
    }

    String getCatSound() {
        print(catSound);
        return null;
    }

    String none() {
        print("That's not a real animal.");
        return null;
    }

    static void print(String s) {
        System.out.println(s);
    }

}
