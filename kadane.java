public class kadane {
    public static void main(String[] args) {
        int[] num = {1,2,-1,23,45};
        int maxi = maxSum(num);
        System.out.println(maxi);
    }

    public static int maxSum(int[] num) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i = 0; i < num.length; i++) {
            currentSum += num[i];
            maxSum = Math.max(maxSum,currentSum);

            if(currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
