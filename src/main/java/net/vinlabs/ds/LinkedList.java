package net.vinlabs.ds;
//https://tesco.udemy.com/course/data-structures-and-algorithms-java/learn/lecture/28748752#overview

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }


    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head.value +
                ", tail=" + tail.value +
                ", length=" + length +
                '}';
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node prev = head;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        tail = prev;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;

    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node get(int index) {
        if (length < 0 || index >= length) return null;
        Node temp = head;
        for (int l = 0; l < index; l++) {
            temp = temp.next;
        }
        return temp;
    }

    public void insert(int index,int value){
        Node newNode=new Node(value);
        Node temp=head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
            head.next=newNode;
            newNode.next=temp;
        }
    }


}
