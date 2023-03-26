package DataStructures;

public class Main77 {
    // Below method is used to check whether the value is present in sorted Array or not.
    public static void main(String[] args) {

        int[] arr = new int[]{10, 20, 30, 40, 50, 60, 70, 80};

        int valueToCheck = 20;
        int resultIndex = 0;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (valueToCheck < arr[mid]) {
                end = mid - 1;
            } else if (valueToCheck > arr[mid]) {
                start = mid + 1;
            } else {
                resultIndex = mid;
                break;
            }
        }

        System.out.println("mid number in array -- " + resultIndex);
    }
}
