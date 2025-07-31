import java.util.Arrays;
public class mergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        int m = arr1.length;
        int n = arr2.length;

        merge(arr1,arr2,m,n);
    }

    public static void merge(int[] arr1, int[] arr2, int m, int n) {
        int i = m -1;
        int j = n -1;
        int k = m + n -1;

        while(i >= 0 && j >= 0) {
            if(arr1[i] > arr2[j]) {
                arr1[k--] = arr1[i--];
            } 
            else{
                arr1[k--] = arr2[j--];
            }
        }

        while(j >= 0) {
            arr1[k--] = arr2[j--];
        }

        System.out.println(Arrays.toString(arr1));
    }
}
