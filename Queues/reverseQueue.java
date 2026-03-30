package Queues;

package Queues;

import java.util.*;

public class reverseQueue {
    public static void reverse(Queue<Integer> q){
        if(q.isEmpty()) return;
        int top = q.poll();
        reverse(q);
        q.offer(top);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        reverse(q);
        System.out.println(q);
    }
}

