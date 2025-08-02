public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,3,3,4};

        int answer = singleNo(nums);
        System.out.println(answer);
    }

    public static int singleNo(int[] nums) {
        
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
