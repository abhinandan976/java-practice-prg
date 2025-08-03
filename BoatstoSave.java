
import java.util.Arrays;

public class BoatstoSave {
    public static void main(String[] args) {
        int[] people = {1,2,2,3}; // number of peoples
        int limit = 3; // limit of weights

        int result = boatstosavePeople(people,limit);
        System.out.println("Number of boats needed to rescue people is: " + result);
    }

    public static int boatstosavePeople(int[] arr, int limit) {
        Arrays.sort(arr);
        int left = 0; 
        int right = arr.length - 1; 
        int noofBoats = 0;

        while(left <= right) {
            if(arr[left] + arr[right] <= limit) {
                left++;
            }
            right--;
            noofBoats++;
        }
        return noofBoats;
    }
}
