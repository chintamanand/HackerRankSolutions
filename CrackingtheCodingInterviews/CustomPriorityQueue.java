package DataStructures;

import java.util.ArrayList;

// Priority Queue is a special type of queue where each element is associated with priority.
// Based on the priority, the elements are removed from the structure.
class PriorityQueue {
    void insertElement(ArrayList<Integer> list, int value) {
        int size = list.size();
        if (list.isEmpty()) {
            list.add(value);
        } else {
            list.add(value);
            //last leaf Node
            for (int i = size / 2 - 1; i >= 0; i--) {
                heapify(list, i);
            }
        }
    }

    // Print the tree
    void printArray(ArrayList<Integer> array, int size) {
        for (Integer i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void heapify(ArrayList<Integer> list, int index) {
        int l = (2 * index) + 1;
        int r = (2 * index) + 2;
        int largest = index;

        if (l < list.size() && list.get(l) > list.get(largest)) {
            largest = l;
        } else if (r < list.size() && list.get(r) > list.get(largest)) {
            largest = r;
        }

        if (largest != index) {
            int largestValue = list.get(largest);
            int indexValue = list.get(index);
            list.set(largest, indexValue);
            list.set(index, largestValue);

            heapify(list, largest);
        }
    }
}

public class Main7 {
    public static void main(String[] args) {

    }
}
