public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == target) {
                return mid; // element found
            }
            else if ( arr[mid] < target ) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1; // element not found
    }
    public static void main(String[] args) {
        int[] arr = {1,2,25,34,56};
        int target = 34;
        int index = binarySearch(arr,target);
        if(index != -1 ){
            System.out.println("Element found at index:" + index);
        }
        else{
            System.out.println("Element not found in the array.");
        }
    }
}
