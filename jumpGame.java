public class jumpGame {
    public static void main(String[] args) {
        int nums[] = {2,3,1,1,4};
        System.out.println("Number of jumps: " + jumpsNeeded(nums));
    }

    public static int jumpsNeeded(int[] nums) {
        int n = nums.length - 1;
        int jumps = 0;
        int l = 0;
        int r = 0;

        while(r < n) {
            int farthest = 0;
            for(int i = l; i <= r; i++) {
                farthest = Math.max(i+nums[i], farthest);
            }
            l = r + 1;
            r = farthest;
            jumps++;
        }
        return jumps;
    }
}
