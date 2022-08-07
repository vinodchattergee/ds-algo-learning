package net.vinlabs.ds;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {

        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;

        }
        tail = newNode;
        length++;
    }


    public Node removeLast() {
        if (length == 0) return null;
        Node temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;

        }
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }


    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node get(int index) {
        if (length == 0) return null;
        if (index < 0 || index >= length) {
            return null;
        }
        Node temp;
        if (index < length / 2) {
            temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
            return temp;
        }

    }

    @Override
    public String toString() {
        if (length == 0) return "There are no items in the list";
        return "DoublyLinkedList{" +
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

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index >= length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        } else if (index == length - 1) {
            append(value);
            return true;
        } else {
            Node before = get(index - 1);
            Node newNode = new Node(value);
            Node after = before.next;

            newNode.prev = before;
            newNode.next = after;

            before.next = newNode;
            after.prev = newNode;

            length++;
            return true;
        }
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();
        Node temp = get(index);

        Node before = temp.prev;
        Node after = temp.next;

        before.next = after;
        after.prev = before;
        length--;
        return temp;

    }
}
