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
    
    //Detecting loop using floyd's cycle finding algorithm
    void getMiddleAndLastElementAndDetectLoop(LinkedList root) {
        Node ptr1 = root;
        Node ptr2 = root;
        boolean loop = false;

        while (ptr1.next != null) {
            ptr1 = ptr1.next;
            if (ptr1.next != null) {
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }
            
            if (ptr1 == ptr2) {
                loop = true;
                break;
            }
        }

        System.out.println("");
        System.out.println("First Element is " + root.data);
        System.out.println("Middle Element is " + ptr2.data);
        System.out.println("Last Element is " + ptr1.dafta);
        
        System.out.println("Loop present in linkedList -- " + loop);
    }

    public ListNode reverseList(LinkedList node) {
        LinkedList current = node;
        LinkedList prev = null;
        LinkedList next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
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
