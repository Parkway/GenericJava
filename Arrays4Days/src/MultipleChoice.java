public class MultipleChoice {
    public static void main(String[] args) {
        int counter = 5;
        while (counter > 0) {
            arrays();
            counter--;
        }
    }
    private static void arrays() {
        int[] arrayList = {45, 19, 5 , 65, 91, 34, 74};
        System.out.println(arrayList[(int) (Math.random() * arrayList.length)]);
    }
}
