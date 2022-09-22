package org.example;

public class Main {
    public static void main(String[] args) {

        Accumulator accumulator = new Accumulator(0);

        for (int i = 0; i < 100 ; i++){

            Thread incementsThread = new Thread(new IncrementalTask(accumulator, 1000));
            incementsThread.start();
            System.out.println(accumulator.getValue());
        }
    }
}