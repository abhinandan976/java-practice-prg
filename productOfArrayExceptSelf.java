
import java.util.Arrays;

public class productOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = productofArray(nums);
        System.out.println("Product of array except self is: " + Arrays.toString(result));
    }

    static int[] productofArray(int[] nums) {
        int[] result = new int[nums.length];
        
        Arrays.fill(result,1);
        int left = 1;
        int right = 1;

        for(int i = 0; i < nums.length; i++) {
            result[i] = left;
            left = nums[i] * left;
        }

        for(int j = nums.length - 1; j >= 0; j--) {
            result[j] = result[j] * right;
            right = right * nums[j];
        }

        return result;
    }
}
