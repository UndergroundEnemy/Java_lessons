package test;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String str = "2";

        Thread thread1 = new Thread(new MyThread1());
        Thread thread2 = new Thread(new MyThread2());

//        thread1.start();
//        thread2.start();

    }
    public static int sum(int var1, int var2){
        return var1 + var2;
    }
}

class MyThread1 implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<1000;i++) {
            System.out.println(i);
        }
    }
}

class MyThread2 implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<1000;i++) {
            System.out.println(i);
        }
    }
}