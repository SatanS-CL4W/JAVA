
//1672. Richest Customer Wealth

public class Leetcode_Array03 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,5},
                {7,3},
                {3,5}
        };
        int sum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            // when you start a new row, take a new sum for that row
            int rowsum = 0;
            for(int j = 0; j < arr[i].length; j++){
                rowsum = rowsum + arr[i][j];
            }
            // now we have sum of accounts of person
            // check with overall ans
            if(sum < rowsum) {
                sum = rowsum;
            }
        }
        System.out.println(sum);
    }
}
