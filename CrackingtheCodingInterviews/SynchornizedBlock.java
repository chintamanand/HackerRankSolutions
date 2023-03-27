package DataStructures;

class Table {
    void printTable(int value) {
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(value * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println("Thread was interrupted");
                }
            }
        }
    }
}

class MyThread1 implements Runnable {

    Table t;

    MyThread1(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(5);
    }
}

class MyThread2 implements Runnable {

    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(100);
    }
}

public class Main89 {
    public static void main(String[] args) {
        Table t = new Table();

        MyThread1 thread1 = new MyThread1(t);
        MyThread2 thread2 = new MyThread2(t);

        Thread thread11 = new Thread(thread1);
        thread11.start();

        Thread thread22 = new Thread(thread2);
        thread22.start();
    }
}
