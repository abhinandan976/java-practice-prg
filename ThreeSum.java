import java.util.*;
public class ThreeSum {
    public static void main(String[] args) {
        int[] nums =  {-1,0,1,2,-1,-4};
        List<List<Integer>> map = threeS(nums);
        System.out.println(map);
    }
    
    public static List<List<Integer>> threeS(int[] nums) {
        List<List<Integer>> myList = new ArrayList<>();
        Arrays.sort(nums);

        int n = nums.length;

        for(int i = 0; i < n - 2; i++) {
            if(i > 0 && nums[i] == nums[i -1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0) {
                    myList.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left < right && nums[left] == nums[left + 1]) left++;
                    while(left < right && nums[right] == nums[right - 1]) right--;
                
                    left++;
                    right--;
                }

                else if(sum < 0) {
                    left++;
                }

                else {
                    right--;
                }
            }
        }
        return myList;
    }
}
