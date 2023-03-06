package strategy;

import java.util.Random;

public class Context {

    private Strategy strategy;

    Context(){}

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void sort(){

        Random rand = new Random();

        int[] list = new int[100000];

        for(int i=0;i<list.length;i++)
        {
            list[i] = rand.nextInt();
        }

        long startTime = System.nanoTime();
        strategy.sort(list);
        long endTime = System.nanoTime();

        endTime = ((endTime - startTime)/1000000);

        System.out.println(strategy + " took: " + endTime + "ms with 100k items");

    }


}
