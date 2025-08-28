public class twouniqueelements {
    public static void main(String[] args) {
        int[] arr = {2,2,3,2,2,1};
        twounique(arr);
    }

    static void twounique(int[] nums) {
        int xor = 0;
        for(int num: nums)
          xor ^= num;

        int setbit = xor & -xor;
        int x = 0, y = 0;
        for(int num: nums)
          if((num & setbit) != 0)
            x ^= num;
          else
            y ^= num;
        System.out.println("The two unique elements are: " + x + " and " + y);
    }
}
