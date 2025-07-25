import java.util.*;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {12,23,11,45,1};
        mergesort(arr,0,arr.length - 1);
        System.out.println("Sorted array:" + Arrays.toString(arr));
    }

    public static void mergesort(int[] arr,int left, int right) {
        if(left < right) {
            int mid = left + (right - left) / 2;


            mergesort(arr,left,mid);
            mergesort(arr,mid+1,right);

            merge(arr,left,mid,right);
        }
    }

    public static void merge(int[] arr, int left,int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        for(int i = 0; i < n2; i++) {
            R[i] = arr[mid + 1+ i];
        }

        int i = 0, j = 0, k = left;

        while(i < n1 && j < n2) {
            if(L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        } 

        // Copy remaining elements of L[], if any
        while(i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[], if any
        while(j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}