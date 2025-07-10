public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,23,233,45,23};
        int target = 45;
        for(int i = 0; i<= arr.length -1; i++) {
            if(arr[i] == target) {
                System.out.println("Element found at the index:" + i);
            }
        }
        System.out.println("Element not found in the array.");
    }
}
