public class SearchinMatrix {
    public static void main(String[] args) {
        int[][] matrix = 
        {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        int target = 5;

        boolean found = searchElement(matrix,target);

        if(found) {
            System.out.println("Element " + target + " Found in the matrix.");
        }
        else{
            System.out.println("Element" + target + "Not found in the matrix.");
        }

    }

    public static boolean searchElement(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
    
        int left = 0;
        int right = rows * cols - 1; // treate the matrix as a 1D array

        while(left <= right) {
            int mid = left + (right - left) / 2;

            int midValue = matrix[mid /cols][mid % cols];

            if(midValue == target) {
                return true;
            }
            else if(midValue < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
            }
            return false;
        }
    
}

