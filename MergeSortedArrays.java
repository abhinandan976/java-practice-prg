public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = new int[8];
        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 3;
        nums1[3] = 4;
        int[] nums2 = {5,6,7};
        int m = 4;
        int n = nums2.length;
        MergeSortedArrays(nums1,m,nums2,n);
    }

    public static int MergeSortedArrays(int[] nums1, int m, int[] nums2,int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n -1;

        while(i >=0 && j >=0) {
            if(nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            }
            else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while(j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        for(int num: nums1){
            System.out.println(num);
        }

        return 0;
    }
}
