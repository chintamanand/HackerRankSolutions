package DataStructures;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Main90 implements Callable {

    public static void main(String[] args) {
        Main90 main90 = new Main90();

        FutureTask futureTask[] = new FutureTask[15];
        for (int i = 0; i < 5; i++) {
            futureTask[i] = new FutureTask(main90);
            Thread t = new Thread(futureTask[i]);
            t.start();
        }

        try {
            for (int i = 0; i < 5; i++) {
                Object obj = futureTask[i].get();
                System.out.println("Result -- " + obj);
            }
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }
    }

    @Override
    public Object call() throws Exception {
        Random randObj = new Random();
        Integer randNo = randObj.nextInt(100);
        Thread.sleep( 1000);
        return randNo;
    }
}
