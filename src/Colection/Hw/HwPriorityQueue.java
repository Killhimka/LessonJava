package Colection.Hw;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Random;

public class HwPriorityQueue {
    public static void main(String[] args) {
        Random random = new Random();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue();
        int sum = 0;
        int max = 0;
        for (int i = 0; i < 100; i++) {
            priorityQueue.add(random.nextInt(1, 100));
            if (priorityQueue.peek() > max)
                max = priorityQueue.peek();
            sum = sum + priorityQueue.poll();
        }
            System.out.println(sum);
            System.out.println(sum / 100);
            System.out.println(max);


        }
    }
