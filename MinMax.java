public class MinMax {
    public static void main(String[] args) {
        int [] arr = {2,1,4,2,7,122,3,6};
        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Minimum value in the array is:" + min);
        System.out.println("Maxmimum value in the array is:" + max);
    }
}
