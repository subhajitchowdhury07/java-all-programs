class numbers extends Thread {
    public void run() {
        try {
            for (int i = 1; i < 11; i = i + 2) {

                System.out.println("Odd numbers are = " + i);

                Thread.sleep(1000);

            }
        }

        catch (InterruptedException e) {

            System.out.println(e);
        }
    }
}

public class Thread_newprogram {
    public static void main(String[] args) throws InterruptedException {
        numbers obj = new numbers();
        obj.start();
        for (int i = 2; i < 11; i = i + 2) {

            System.out.println("Even numbers are = " + i);

            Thread.sleep(1500);
        }

    }
}
