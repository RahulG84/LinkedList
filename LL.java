package com.bl.linkedlist;

public class LL {
    Node head;
    Node tail;
    int size;

    public void addFirst(int data) {
        Node t = new Node(data);
        t.data = data;
        t.next = head;
        if (size == 0) {
            tail = t;
        }
        head = t;
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        newNode.data = data;
        newNode.next = null;
        if (size == 0) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void show() {
        if (head == null) {
            System.out.println("List Is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void insertBetween(int element1, int element2, int data) {
        if (head == null || head.next == null) {
            System.out.println("List is empty");
        }

        Node currNode = head;
        while (currNode.data != element1 || currNode.next.data != element2) {
            if (currNode.next.next == null) {
                break;
            }
            currNode = currNode.next;
        }
        if (currNode.data == element1 && currNode.next.data == element2) {
            Node newNode = new Node(data);
            Node temp = currNode.next;
            currNode.next = newNode;
            newNode.next = temp;
        }
    }
    public void pop(){
        if(head == null){
            System.out.println("List is empty");
        }
        head = head.next;
    }
    public void popLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
}

