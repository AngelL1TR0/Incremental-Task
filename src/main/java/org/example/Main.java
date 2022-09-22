package org.example;

public class Main {
    public static void main(String[] args) {

        Accumulator accumulator = new Accumulator(0);

        for (int i = 0; i < 100 ; i++){

            Thread incementsThread = new Thread(new IncrementalTask(accumulator, 1000));
            incementsThread.start();
        }


        try{
            Thread.sleep(15000);
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.println(accumulator.getValue());
    }
}