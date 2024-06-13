package lr12;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class task6 {
    public static void main(String[] args) {
            int[] numbers = new int[10];
            Random random = new Random();
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(100);
            }
            System.out.println(Arrays.toString(numbers));
            System.out.println(sumElements(numbers));
        }
    public static int sumElements(int[] arr){
        int numThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        int chunkSize = arr.length / numThreads;
        int[] sumChunk = new int[numThreads];

        for (int i = 0; i < numThreads; i++) {
            final int start = i * chunkSize;
            final int end = (i == numThreads - 1) ? arr.length:(i + 1) * chunkSize;
            final int threadIndex = i;
            executor.submit(() -> {
                int sum = 0;
                for (int j = start; j < end; j++) {
                    sum += arr[j];
                }
                sumChunk[threadIndex] = sum;
            });
        }
        executor.shutdown();

        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        int globalSum = 0;
        for (int value : sumChunk) {
            globalSum += value;
        }

        return globalSum;
    }
}
