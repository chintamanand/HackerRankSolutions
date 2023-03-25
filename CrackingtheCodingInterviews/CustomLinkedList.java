package DataStructures;

//linkedList is the linear data structure that includes series of connected nodes.
//Where each node contains data and address for next element.
class Node {
    int data;
    Node next;

    Node(int value) {
        this.data = value;
    }

}

class LinkedList {
    Node head;

    //detect loop - floyd's cycle finding algorithm
    void getMiddleAndLastElementAndDetectLoop(LinkedList linkedList) {
        Node ptr1 = linkedList.head;
        Node ptr2 = linkedList.head;
        boolean loop = false;
        while (ptr1 != null && ptr1.next != null) {
            ptr1 = ptr1.next.next;
            ptr2 = ptr2.next;

            if (ptr1 == ptr2) {
                loop = true;
                break;
            }
        }

        if (ptr1 != null) {
            System.out.println("Last Element in Linkedlist -- " + ptr1.data);
        }
        if (ptr2 != null) {
            System.out.println("Middle element in Linkedlist -- " + ptr2.data);
        }

        System.out.println("Loop present in linkedList -- " + loop);
    }
}

public class Main3 {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(7);

        linkedList.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = null;

        Node ptr = linkedList.head;
        while (ptr != null) {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }

        linkedList.getMiddleAndLastElementAndDetectLoop(linkedList);
    }
}
