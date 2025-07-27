public class zerosumSubarrays {
    public static void main(String[] args) {
        int[] arr = {1, -1, 2, -2, 3, -3};

        int count = countzerosumSbuarays(arr);
        System.out.println("NUmber of zero-sum subarrays: " + count);
    }

    public static int countzerosumSbuarays(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
