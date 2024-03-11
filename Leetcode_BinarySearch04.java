//Searching In Rotated Sorted Array using Binary Search.(Leetcode medium 033)

public class Leetcode_BinarySearch04 {
    static int searchInRBS(int[] nums, int target){
        int s = 0;
        int e = nums.length - 1;

        while(s <= e){
            int mid = s + (e - s) / 2;
            if(target == nums[mid]){
                return mid;
            }
            //Left part of the rotated sorted array
            else if(nums[s] <= nums[mid]){
                if(target >= nums[s] && target < nums[mid]){
                    e = mid - 1;
                }
                else
                    s = mid + 1;
            }
            //Right part of thr rotated sorted array
            else
            if(target > nums[mid] && target <= nums[e]){
                s = mid + 1;
            }
            else
                e = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;

        int ans = searchInRBS(nums, target);

        System.out.println(ans);
    }
}
