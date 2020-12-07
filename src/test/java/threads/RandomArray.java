package threads;

import java.util.ArrayList;

public class RandomArray extends Thread{
    ArrayList<int []> massives = new ArrayList<>();
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
        massives.add(i, generation());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Массив ");
            for (int j = 0; j < 5; j++) {
                System.out.println(massives.get(i)[j]);
            }
        }
    }

    public static void main(String[] args) {
        new RandomArray().start();
        new RandomArray().start();
        new RandomArray().start();
        new RandomArray().start();
        new RandomArray().start();
        new RandomArray().start();
        new RandomArray().start();
        new RandomArray().start();
        new RandomArray().start();
        new RandomArray().start();




    }

    public static int[] generation(){
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 11);
        }
        return array;
    }
}

