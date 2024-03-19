package ex06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            data.add(i);
        }

        ExecutorService executor = Executors.newFixedThreadPool(4);
        Future<Integer> minFuture = executor.submit(() -> Collections.min(data));
        Future<Integer> maxFuture = executor.submit(() -> Collections.max(data));
        Future<Double> avgFuture = executor.submit(() -> data.stream().mapToInt(Integer::intValue).average().orElse(0));

        Future<Integer> sumFuture = executor.submit(() -> data.stream().filter(x -> x > 50).mapToInt(Integer::intValue).sum());

        try {
            int min = minFuture.get();
            int max = maxFuture.get();
            double avg = avgFuture.get();
            int sum = sumFuture.get();

            System.out.println("Мінімум: " + min);
            System.out.println("Максимум: " + max);
            System.out.println("Середнє: " + avg);
            System.out.println("Сума елементів більших за 50: " + sum);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}
