package com.lance;

public class Main {

    public static void main(String[] args) {
        CoffeeCup coffeeCup = new CoffeeCup();
        WorkTask workTask = new WorkTask();
        CoffeePot coffeePot = new CoffeePot();

        do {
            coffeeCup.Drink();
            workTask.Execute();
            if (coffeeCup.Empty()) {
                if (coffeePot.Empty())
                    coffeePot.Make();
                coffeeCup.Refill();
            }
        } while (!workTask.Done());
    }
}
