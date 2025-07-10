
import java.util.Arrays;

public class insertionsort {
public static void main(String[] args) {
    int[] arr = {5,3,4,1,2};
    insertionsorted(arr);
    System.out.println("Sorted array is:" + Arrays.toString(arr));
}

static void insertionsorted(int[] arr) {
    //i loop for passes
    for(int i = 0; i < arr.length - 1; i++) {
        // j loop for comparisons between the index of elements
        for(int j = i + 1; j > 0; j--) {
            if(arr[j] < arr[j -1]) { 
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
            else {
                break; // if the currrent element is in the correct position, break the loop
            }
        }
    }
}
}
