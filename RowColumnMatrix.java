import java.sql.SQLOutput;
import java.util.Arrays;

public class RowColumnMatrix {
    static int[] SearchInMatrix(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length-1;

        while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return new int[]{r+1,c+1};
            } else if (matrix[r][c] < target) {
                r++;
            }else if(matrix[r][c] > target){
                c--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, 12, 33, 48},
                {8, 15, 35, 56},
                {22, 30, 42, 63},
                {45, 55, 60, 78}
        };

        System.out.println(Arrays.toString(SearchInMatrix(arr, 15)));
    }
}
