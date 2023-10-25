package org.stack;

import java.util.LinkedList;
import java.util.Queue;

/*
Design stack using queue
 */
public class StackUsingQueue {

    private Queue<Integer> queue1 = new LinkedList<>();
    private Queue<Integer> queue2 = new LinkedList<>();
    public StackUsingQueue() {
    }

    public void push(int element) {
        if(queue1.isEmpty()){
            queue1.add(element);
            return;
        }

        queue2.add(element);
        while (!queue1.isEmpty()){
            queue2.add(queue1.remove());
        }

        Queue<Integer> temporaryQueue;
        temporaryQueue = queue1;
        queue1 = queue2;
        queue2 = temporaryQueue;
    }

    public int pop() {
        if(!queue1.isEmpty())
            return queue1.remove();

        return -1;
    }

    public int top() {
        return queue1.peek().intValue();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueue su = new StackUsingQueue();
        su.push(1);
        su.push(2);
        su.push(3);

        System.out.println("Top Element : " + su.top());
        su.pop();
        System.out.println("Top element after popping: " + su.pop());
    }
}
