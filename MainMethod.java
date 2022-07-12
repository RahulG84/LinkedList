package com.bl.linkedlist;
import java.util.LinkedList;
public class MainMethod {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.addLast(56);
        ll.addLast(70);
        ll.insertBetween(56,70,30);
        ll.show();
        ll.popLast();
        System.out.println();
        ll.show();
    }
}
