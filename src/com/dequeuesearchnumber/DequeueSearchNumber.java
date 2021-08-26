package com.dequeuesearchnumber;
import java.util.Scanner;
import java.util.Dequeue;

public class DequeueSearchNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max=0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);
            if(i>=m-1){
                if(set.size()>max)max=set.size();
                Integer removed=(Integer)deque.removeFirst();
                set.remove(removed);
                set.add((Integer)deque.peek());
            }

        }
        System.out.println(max);
    }
}
