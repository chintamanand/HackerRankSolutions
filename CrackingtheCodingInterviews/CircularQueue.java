package DataStructures;

class CustomCircularQueue {
    char[] arr;
    int front;
    int rear;
    int capacity;

    CustomCircularQueue(int size) {
        front = -1;
        rear = -1;
        arr = new char[size];
        capacity = size;
    }

    boolean isFull() {
        if (rear == capacity - 1 && front == 0) {
            return true;
        }
        return front == rear + 1;
    }

    boolean isEmpty() {
        return front == -1 || rear == -1;
    }

    void enqueue(char ch) {
        if (isFull()) {
            System.out.println("Unable to insert element into Queue");
        } else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % capacity;
            arr[rear] = ch;
        }

    }

    char dequeue() {
        if (isEmpty()) {
            System.out.println("Unable to Retreive the element from queue");
            return Character.MIN_VALUE;
        } else {
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % capacity;
            }
            return arr[front];
        }
    }

    void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            for (i = front; i != rear; i = (i + 1) % capacity)
                System.out.print(arr[i] + " ");
            System.out.println(arr[i]);
        }
    }

}

public class Main6 {
    public static void main(String[] args) {
        CustomCircularQueue circularQueue = new CustomCircularQueue(5);
        circularQueue.enqueue('a');
        circularQueue.enqueue('b');
        circularQueue.enqueue('c');
        circularQueue.enqueue('d');
        circularQueue.enqueue('e');
        circularQueue.enqueue('f');

        circularQueue.display();
        circularQueue.dequeue();
        circularQueue.enqueue('f');
        circularQueue.display();

    }
}
