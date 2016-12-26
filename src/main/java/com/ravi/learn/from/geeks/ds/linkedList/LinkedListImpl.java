package com.ravi.learn.from.geeks.ds.linkedList;

/**
 * Created by ravra03 on 12/24/2016.
 */
public class LinkedListImpl {
    Node head;

    public static void main(String[] args) {
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.head = new Node(12);
        Node second = new Node(23);
        linkedList.head.next = second;
        Node third = new Node(223);
        second.next = third;
        Node head = linkedList.head;
        while (head != null) {
            System.out.print(head.data + "-->");
            head = head.next;
        }

    }
}
