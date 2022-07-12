package com.bl.linkedlist;
import java.util.LinkedList;
public class MainMethod {
    public static void main(String[] args) {
        LL ll = new LL();
//        ll.addLast(56);
//        ll.addLast(70);
//        ll.insertBetween(56,70,30);
//        ll.show();
//        //ll.popLast();
//        System.out.println();
//        ll.show();
//        ll.searchNode(30);
//        ll.insertAfterSearch(30,40);
//        ll.show();
//        System.out.println("Size = " +ll.getSize());
//        System.out.println();
//        ll.deleteAfterSearch(40);
//        ll.show();
//        System.out.println("Size = " +ll.getSize());

        ll.sortedInsert(56);
        ll.sortedInsert(30);
        ll.sortedInsert(40);
        ll.sortedInsert(70);
        ll.show();
        System.out.println("Size = " +ll.getSize());
    }
}
