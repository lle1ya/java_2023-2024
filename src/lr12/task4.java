package lr12;

public class task4 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            final int threadNum = i;
            Thread thread = new Thread(() -> {
                System.out.println("Thread " + threadNum + " is running");
            });
            thread.start();
        }
    }
}
