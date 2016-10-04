import javax.swing.JOptionPane;

public class CreateBags {
    public static void main(String[] args) {
        BagOfCheese bag1 = new BagOfCheese();
        bag1.kind = "Cheddar";
        bag1.weight = 2.43;
        bag1.daysAged = 30;
        bag1.isDomestic = true;

        BagOfCheese bag2 = new BagOfCheese();
        bag2.kind = "Blue";
        bag2.weight = 5.987;
        bag2.daysAged = 90;
        bag2.isDomestic = false;

        displayBags(bag1);
        displayBags(bag2);

        other();
    }

    private static void displayBags(BagOfCheese bag) {
        JOptionPane.showMessageDialog(null,
                bag.kind + ", " +
                bag.weight + ", " +
                bag.daysAged + ", " +
                bag.isDomestic);
    }
    public static void other() {
        BagOfCheese bag = new BagOfCheese();
        bag.kind = "Pepperjack";
        bag.weight = 5.00;
        bag.daysAged = 15;
        bag.isDomestic = true;
        displayBags(bag);

        bag = new BagOfCheese();

        bag.kind = "Colby";
        bag.weight = 1.5;
        bag.daysAged = 45;
        bag.isDomestic = false;
        displayBags(bag);
    }
}
