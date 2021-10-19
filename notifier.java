package notifier;

public class notifier {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        Thread.sleep(100);
                        System.out.println("hello");
                    } catch (InterruptedException e) {
                        break;
                    }
                }
            }
        });
        thread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}
