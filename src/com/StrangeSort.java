package com;

import java.util.*;

public class StrangeSort {

    public List<Integer> sort(List<Integer> arr, int runCrater, int passiveCrater) {

        List<Deque<Integer>> curLists = new ArrayList();
        PriorityQueue<Deque<Integer>> finalLists = new PriorityQueue<>(Comparator.comparingInt(Deque::size));

        for (int i1 = 0; i1 < arr.size(); i1++) {
            int num = arr.get(i1);

            boolean added = false;

            for (int i = 0; i < curLists.size(); ++i) {
                if (num <= curLists.get(i).getFirst()) {

                    curLists.get(i).addFirst(num);

                    added = true;
                    break;
                } else {
                    if (curLists.get(i).size() == 1 || num >= curLists.get(i).getLast()) {

                        curLists.get(i).addLast(num);

                        added = true;
                        break;
                    }
                }
            }
            if (!added) {
                if (curLists.size() > runCrater) {
                    Deque<Integer> tmp = curLists.remove(curLists.size() - 1);
                    finalLists.add(tmp);
                }

                if (finalLists.size() > passiveCrater) {
                    merge(finalLists, false);
                }

                Deque<Integer> newList = new ArrayDeque<>();
                newList.add(num);
                curLists.add(newList);
            }
        }

        finalLists.addAll(curLists);
        merge(finalLists, true);
        return new ArrayList<>(finalLists.poll());
    }

    private void merge(PriorityQueue<Deque<Integer>> finalLists, boolean all) {

        int startSize = finalLists.size();
        while((all && finalLists.size() >1) || (finalLists.size() > startSize/4 && finalLists.size()>1)) {
            Deque<Integer> newList = merge2Lists(finalLists.poll(), finalLists.poll());
            finalLists.add(newList);
        }
    }

    private Deque<Integer> merge2Lists(Deque<Integer> a, Deque<Integer> b) {
        Deque<Integer> c = new ArrayDeque<>();

        while (a.size() > 0 || b.size() > 0) {

            if (a.size() == 0 || b.size() == 0) {
                c.addAll(b);
                c.addAll(a);
                break;
            }

            if (a.getFirst() < b.getFirst()) {
                c.add(a.getFirst());
                a.removeFirst();
            } else {
                c.add(b.getFirst());
                b.removeFirst();
            }

        }
        return c;
    }
}
