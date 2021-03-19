package threading;

public class Main {

    static int x = 0;

    public static void main(String[] args) {
        System.out.println("start");

        Thread thread1 = new Thread(() -> {

//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("th 1 is run");
//            System.out.println(Thread.currentThread().getName());
//            System.out.println(Thread.currentThread().getId());
//            System.out.println(Thread.currentThread().getPriority());
//
            increment();

        });

        thread1.start();
//        try {
//            thread1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        Thread thread2 = new Thread(() -> {

//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("th 2 is run");
//            System.out.println(Thread.currentThread().getName());
//            System.out.println(Thread.currentThread().getId());
//            System.out.println(Thread.currentThread().getPriority());
        increment();

        });

        thread2.start();
//        try {
//            thread2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }



        System.out.println("end");
    }


    public synchronized static void increment(){
        for (int i = 0; i < 10000000; i++) {
            x++;
        }

        System.out.println(x);
        
    }

}
