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
        }
        else {
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
    }

