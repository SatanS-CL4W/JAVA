//34. Find First and Last Position of Element in Sorted Array


public class Leetcode_BinarySearch01 {
    public static int[] searchRange(int[] nums, int target) {

        return new int[]{first(nums, target), last(nums, target)};

    }
        public static int first(int[] nums, int target) {
            int ans = -1;
            int low = 0, high = nums.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums[mid] == target) {
                    ans = mid;
                    high = mid - 1;
                } else if (nums[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return ans;
        }

        public static int last(int[] nums, int target) {
            int ans = -1;
            int low = 0, high = nums.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums[mid] == target) {
                    ans = mid;
                    low = mid + 1;
                } else if (nums[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return ans;
        }

    public static void main(String[] args) {
       int[] nums = {5, 7, 7, 8, 8, 10};
       int target = 8;

       int[] ans = searchRange(nums, target);
        System.out.println(ans);
    }
}
