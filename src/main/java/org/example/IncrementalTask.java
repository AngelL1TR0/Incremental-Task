package org.example;

public class IncrementalTask implements Runnable{

    private Accumulator accumulator;
    private int times;

    public IncrementalTask(Accumulator accumulator, int times) {
        this.accumulator = accumulator;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++){
            accumulator.increments();

            try{
                Thread.sleep(10);
            }
            catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
