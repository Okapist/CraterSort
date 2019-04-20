package com;

import java.util.Comparator;

public class StrangeComparator<Integer> implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) { }

        return (int)o1 - (int)o2;
    }
}
