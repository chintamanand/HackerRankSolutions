package DataStructures;

//stack is the linear data structure that follows the LIFO principle.
//It means that the last element that is inserted into to data structure will be removed first.
class CustomStack {
    int capacity;
    int[] arr;
    int top;

    CustomStack(int size) {
        this.capacity = size;
        this.arr = new int[size];
        this.top = -1;
    }

    Boolean isFull() {
        if (this.top == capacity - 1) {
            System.out.println("Stack is Full");
            return true;
        } else {
            return false;
        }
    }

    Boolean isEmpty() {
        if (this.top == -1) {
            System.out.println("Stack is Empty");
            return true;
        } else {
            return false;
        }
    }

    void push(int value) {
        if (Boolean.FALSE.equals(isFull())) {
            arr[++top] = value;
        } else {
            System.out.println("Unable to Push has stack is full");
        }

    }

    int pop() {
        if (Boolean.FALSE.equals(isEmpty())) {
            return arr[top--];
        } else {
            System.out.println("Unable to pop has stack is empty");
            return 0;
        }
    }

    void display() {
        for (int j : arr) {
            System.out.println(j);
        }
    }

}

public class Main4 {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.display();
        System.out.println(stack.pop());
    }
}
