package com.bl.linkedlist;
import java.util.LinkedList;
public class MainMethod {
    public static void main(String[] args) {

        LL ll = new LL();
        ll.head = new Node(56);
        Node second = new Node(30);
        Node third = new Node(70);

        ll.head.next = second;
        second.next = third;
        ll.show();
    }
}
