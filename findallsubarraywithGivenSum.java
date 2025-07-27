public class findallsubarraywithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 6, 4, 9};

        int targetSum = 10;
        int cnt = findallsubarrays(arr,targetSum);
        System.out.println("Total subarrays with sum : " + targetSum + " is " + cnt);
    }

    public static int findallsubarrays(int[] arr, int targetSum) {

        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum == targetSum) {
                    count++;
                }
            }
        }
        return count;
    }
}