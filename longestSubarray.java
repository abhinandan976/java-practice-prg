public class longestSubarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,33,45,6,5};
        long k = 11;

        int result = longestsubarr(arr,k);
        System.out.println("Length of longest subarray with sum less than or equal to " + k + ": " + result); 
    }

    public static int longestsubarr(int[] arr, long k) {
        int n = arr.length;
        int left = 0;
        int right = 0;
        long sum = arr[0];
        int maxlen = 0;

        while(right < n) {
            while(left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }

            if(sum == k) {
                maxlen = Math.max(maxlen, right - left + 1);
            }
            right++;
            if(right < n) {
                sum += arr[right];
            }
        } 
        return maxlen;
    }
}
