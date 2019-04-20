package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SortTester {

    StrangeSort strangeSort = new StrangeSort();
    Random random = new Random();

    public Pair<Long, Long> test(int size, int maxVal, int runCrater, int passiveCrater) {

        long strangeTime = 0;
        long sdkTime = 0;
        for (int i=0; i< 1; ++i) {

            List<Integer> arr = new ArrayList<>();
            for(int j=0; j<size; ++j) {
                arr.add(random.nextInt(maxVal));
            }

            long start = System.nanoTime();
            for(int k = 0; k<10; ++k) {
                List<Integer> arrClone = new ArrayList<>(arr);
                strangeSort.sort(arrClone, runCrater, passiveCrater, new StrangeComparator());
            }
            strangeTime += System.nanoTime() - start;

            long start1 = System.nanoTime();
            for(int k = 0; k<10; ++k) {
                List<Integer> arrClone = new ArrayList<>(arr);
                Collections.sort(arrClone, new StrangeComparator());
            }
            sdkTime += System.nanoTime() - start1;

            //FOR UNIT TESTING
            /*
            int[] arraySorted = sorted.stream().mapToInt(k->k).toArray();

            boolean result = Arrays.equals(arraySorted, arrClone.stream().mapToInt(k->k).toArray());
            if(!result)
                System.out.println("ERROR");

            */
        }
        return new Pair<>(sdkTime, strangeTime);
    }

}
