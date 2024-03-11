//283. Move Zeroes

import java.util.Arrays;
public class Leetcode_Array04 {
    public static void moveZeroes(int[] nums) {
        int temp;
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};

        moveZeroes(arr);


    }
}
