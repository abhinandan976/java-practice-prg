import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        bubblesorted(arr);
        System.out.println("Sorted array is:" + Arrays.toString(arr));
    }

    static void bubblesorted(int[] arr) {
        boolean swapped;
        //i loop for passes
        for(int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            //j loop for comparisons between the adjacent elements
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false) {
                break;
            }
        }
    }
}
