package DataStructures;

class CustomQueue {
    String arr[];
    int size;
    int front, rear;

    CustomQueue(int size) {
        this.arr = new String[size];
        this.size = size;
        this.front = -1;
        this.rear = -1;
    }

    Boolean isFull() {
        if (this.front == 0 && this.rear == size - 1) {
            System.out.println("Queue is Full");
            return true;
        } else {
            return false;
        }
    }

    Boolean isEmpty() {
        if (this.rear == -1 || this.front == -1) {
            System.out.println("Queue is Empty");
            return true;
        } else {
            return false;
        }
    }

    void display() {
        for (int i = front; i <= rear; i++) {
            System.out.println(arr[i]);
        }
    }

    void enqueue(String data) {
        if (Boolean.FALSE.equals(isFull())) {
            if (this.front == -1) {
                this.front = 0;
            }
            arr[rear++] = data;
        } else {
            System.out.println("Unable to enqueue");
        }
    }

    String dequeue() {
        if (Boolean.FALSE.equals(isEmpty())) {
            String x = arr[front];
            front++;
            return x;
        } else {
            System.out.println("Unable to dequeue");
            return null;
        }
    }

}

public class Main5 {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        queue.enqueue("4");
        queue.enqueue("5");

        queue.display();


        queue.enqueue("6");


    }
}
