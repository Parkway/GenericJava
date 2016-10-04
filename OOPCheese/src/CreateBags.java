import javax.swing.JOptionPane;

public class CreateBags {
    public static void main(String[] args) {
        BagOfCheese bag0 = new BagOfCheese("Muenster", 2.65, 30, true);
        BagOfCheese bag1 = new BagOfCheese("Cheddar", 2.43, 30, true);
        BagOfCheese bag2 = new BagOfCheese("Blue",5.987,90, false);
        displayBags(bag0);
        displayBags(bag1);
        displayBags(bag2);
        other();
    }
    public static void other() {
        BagOfCheese bag = new BagOfCheese("Pepperjack", 5.67, 90, true);
        displayBags(bag);
        bag = new BagOfCheese("Colby", 9.23, 1000, true);
        displayBags(bag);
    }
    private static void displayBags(BagOfCheese bag) {
        JOptionPane.showMessageDialog(null,
                bag.kind + ", " +
                        bag.weight + ", " +
                        bag.daysAged + ", " +
                        bag.isDomestic);
    }
}
