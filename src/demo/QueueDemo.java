/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import queue.QueueArray;
import queue.QueueLinkedList;

/**
 *
 * @author mohammed
 */
public class QueueDemo {

    public static void main(String[] args) {
        int length;
        /**
         * Queue using linkedList
         */
        QueueLinkedList queueLinkedList = new QueueLinkedList();
        queueLinkedList.enqueue(0);
        queueLinkedList.enqueue(1);
        queueLinkedList.enqueue(3);
        queueLinkedList.enqueue(4);
        queueLinkedList.enqueue(5);
        length = queueLinkedList.size();
        System.out.println("Length= " + length);
        System.out.println(queueLinkedList.dequeue().value);
        System.out.println(queueLinkedList.dequeue().value);
        System.out.println(queueLinkedList.dequeue().value);
        queueLinkedList.enqueue(8);
        queueLinkedList.enqueue(9);
        System.out.println(queueLinkedList.dequeue().value);
        System.out.println(queueLinkedList.dequeue().value);

        System.out.println(queueLinkedList.dequeue().value);

        /**
         * queue using array
         */
        QueueArray queueArray = new QueueArray(5);
        queueArray.enqueue(0);
        queueArray.enqueue(1);
        queueArray.enqueue(3);
        queueArray.enqueue(4);
        length = queueArray.length();
        System.out.println("Length= " + length);
        System.out.println(queueArray.dequeue());
        System.out.println(queueArray.dequeue());
        System.out.println(queueArray.dequeue());
        queueArray.enqueue(8);
        queueArray.enqueue(9);
        length = queueArray.length();
        System.out.println("Length= " + length);
        System.out.println(queueArray.dequeue());
        System.out.println(queueArray.dequeue());
        System.out.println(queueArray.dequeue());

    }

}
