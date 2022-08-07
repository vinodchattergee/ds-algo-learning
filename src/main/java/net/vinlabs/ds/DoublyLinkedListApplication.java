package net.vinlabs.ds;

public class DoublyLinkedListApplication {
    public static void main(String[] args) {
        DoublyLinkedList ddl=new DoublyLinkedList(10);
        ddl.append(20);
        ddl.append(20);
        ddl.append(50);
        ddl.append(20);
        ddl.removeLast();
        ddl.removeLast();
        ddl.removeLast();


        ddl.prepend(100);
        ddl.prepend(100);
        ddl.prepend(100);
        ddl.removeFirst();
        ddl.set(2,300);
        ddl.insert(2,400);
        ddl.insert(2,400);
        ddl.insert(2,400);
        ddl.insert(2,400);
        ddl.insert(2,400);
        ddl.insert(2,400);
        ddl.insert(2,700);
        ddl.remove(2);
        ddl.remove(2);
        ddl.remove(2);
        ddl.remove(2);
        ddl.remove(2);
        ddl.remove(2);
        ddl.remove(2);
        ddl.remove(2);
        ddl.remove(2);
        ddl.remove(2);
        ddl.remove(2);
        ddl.remove(2);
        ddl.remove(0);
        ddl.remove(0);
        ddl.remove(0);
        ddl.printList();
        System.out.println(ddl.toString());
    }
}
