public class twoSum {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6};
        int targetSum = 7;

        int[] result = targetSum(nums,targetSum);
        System.out.println("indices that add up to target sum: " + result[0] + ", " + result[1]);
    }

    public static int[] targetSum(int[] nums,int targetSum) {
        
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == targetSum) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
