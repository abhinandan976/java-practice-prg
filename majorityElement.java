public class majorityElement {
    public static void main(String[] args) {
        int [] arr = {-1,23,-1,3,-1};

        int answer = majorityelement(arr);
        System.out.println("Majority Element: " + answer);
    }

    public static int majorityelement(int[] arr) {
        int n = arr.length;
        int count = 0;
        int candidate = -1;

        for(int i = 0; i < n; i++) {
            if(count == 0) {
                candidate = arr[i];
                count = 1;
            }
            else if(arr[i] == candidate) {
                count++;
            }
            else {
                count --;
            }
        }
        return candidate;
    }
}
