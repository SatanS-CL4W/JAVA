import java.util.Arrays;

public class TwoDMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for(int row=0;row<arr.length;row++){
            for(int j = 0;j<arr[row].length;j++){
                System.out.print(arr[row][j] + " ");
            }
            System.out.println();
        }

    }
}
