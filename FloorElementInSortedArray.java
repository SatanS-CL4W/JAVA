import java.util.Scanner;

public class FloorElementInSortedArray {

    static int FloorValue(int[] nums, int target){
        int s = 0;
        int e = nums.length - 1;

        if(target < nums[0]){
            return -1;
        }

        while(s <= e){
            int mid = s + (e-s)/2;
            if(target == nums[mid]){
                return nums[mid];
            }
            else if(target > nums[mid]){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return nums[e];
    }
    public static void main(String[] args) {
        int[] arr = {12, 20, 30, 40, 50, 70, 90, 100, 105};
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        int ans = FloorValue(arr, a);
        System.out.println("Floor Value of the Element: " + ans);
    }
}
