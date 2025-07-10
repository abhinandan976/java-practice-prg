
import java.util.Arrays;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {1,23,32,2,5};
        int secondLargest = findsecondLargest(arr);
        System.out.println("Second largest element is: " + secondLargest);
    }
    
    public static int findsecondLargest(int[] arr) {
        if(arr.length < 2 ){
            System.out.println("Array size is not sufficeint");
            return -1;
        }
        else {
            Arrays.sort(arr);
            int largest = arr[arr.length - 1];
            // Find the first element from the end that is less than the largest
            for (int i = arr.length - 2; i >= 0; i--) {
                if (arr[i] < largest) {
                    return arr[i];
                }
            }
            // If all elements are equal
            System.out.println("No second largest element found.");
            return -1;
        }
    }
}
