/*****************************************
 * Created by Lance Douglas on 1/4/2019
 *****************************************/
class Switcher {
    String choice(String animalChoice) {
        Sound sound = new Sound();

        switch (animalChoice) {
            case "cow" : return sound.getCowSound();
            case "chicken" : return sound.getChickenSound();
            case "duck" : return sound.getDuckSound();
            case "dog" : return sound.getDogSound();
            case "cat" : return sound.getCatSound();
            default : return sound.none();
        }
    }
}
