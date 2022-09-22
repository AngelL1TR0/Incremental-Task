package org.example;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Accumulator accumulator = new Accumulator(0);
        //CREAR LA LISTA DE HILOS
        List<Thread> list = new LinkedList<>();
        for (int i = 0; i < 100; i++) {

            Thread incrementsThread = new Thread(new IncrementalTask(accumulator, 100));
            incrementsThread.start();
            //AÑADIR LOS HILOS DE LA LISTA
            list.add(incrementsThread);
        }

        for (Thread list1 : list) {

            try {
                //HACER JOIN DE TODOS LOS HILOS DE LA LISTA
                list1.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

            System.out.println(accumulator.getValue());
        }

}