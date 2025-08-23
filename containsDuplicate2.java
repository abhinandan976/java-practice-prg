import java.util.*;
public class containsDuplicate2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        boolean result = containsDuplicate(nums,k);
        System.out.println("Contains Duplicate within a k distance: " + result);
    }

    public static boolean containsDuplicate(int[] nums, int k) {
        Map<Integer, Integer> result = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(result.containsKey(nums[i])) {
              int prevIndex = result.get(nums[i]);
              if(i - prevIndex <= k) {
                return true;
              } 
            }
            result.put(nums[i],i);
        }
        return false;
    }
}
