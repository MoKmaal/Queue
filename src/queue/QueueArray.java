/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author mohammed
 */
public class QueueArray {

    int size;
    int[] queue;
    int front;
    int rear;

    public QueueArray(int size) {
        this.size = size;
        queue = new int[size];
        rear = front = 0;
    }

    public void enqueue(int data) {
        if (!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % size;
        } else {
            System.err.println("Queue is Full");
        }

    }

    public int dequeue() {
        int temp = -1;
        if (!isEmpty()) {
            temp = queue[front];
            front = (front + 1) % size;
        } else {
            System.err.println("Queue is Empty");
        }

        return temp;
    }

    public boolean isFull() {

        return front == (rear + 1) % size;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public int length() {
        return (rear - front + size) % size;
    }
    
}
