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


    }
}
