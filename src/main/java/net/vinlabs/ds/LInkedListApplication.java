package net.vinlabs.ds;

public class LInkedListApplication {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList(20);
        linkedList.append(10);
        linkedList.append(10);
        linkedList.append(10);
        linkedList.append(10);
        linkedList.append(40);
        linkedList.removeLast();
        linkedList.removeLast();
        linkedList.removeLast();
        linkedList.removeLast();
        linkedList.prepend(8);
        linkedList.prepend(7);
        linkedList.prepend(6);
        linkedList.removeFirst();
        linkedList.removeFirst();
        linkedList.insert(2,30);
        System.out.println(linkedList.get(0).value);
        System.out.println(linkedList.get(1).value);
        System.out.println(linkedList.get(2).value);
        System.out.println(linkedList.toString());
        linkedList.printList();
    }
}
