import java.util.Arrays;
import java.util.Scanner;

public class Leetcode_Array01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {2,3,11,15,7};
        int target = sc.nextInt();

        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    System.out.println(i + "," + j);
                }
            }
        }
    }
}
