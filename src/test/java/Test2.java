import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        MyThread1 myThread = new MyThread1();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread.shutdown();

    }
}

class MyThread1 extends Thread {
    private boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

        public void shutdown () {
            this.running = false;
        }
    }
