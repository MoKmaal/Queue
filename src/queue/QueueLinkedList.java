/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import LinkedList.LinkedList;
import LinkedList.Node;

/**
 *
 * @author mohammed
 */
public class QueueLinkedList {

    LinkedList linkedList;

    public QueueLinkedList() {
        linkedList = new LinkedList(null);
    }

    public void enqueue(int data) {
        linkedList.addLast(new Node(data, null));
    }

    public Node dequeue() {
        return linkedList.deleteFirst();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    public int size() {
        return linkedList.size();
    }

    public void deleteQueue() {
        while (!isEmpty()) {
            linkedList.deleteFirst();
        }
    }
}
