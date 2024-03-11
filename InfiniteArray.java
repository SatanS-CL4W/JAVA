// Position of an element in an infinite array.
//Logic: Basically Question is telling we don't have to use (array.length), since we don't know the end of the array.

//import static java.util.Arrays.binarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {12, 22, 33, 41, 45, 67, 72, 89, 92};
        int target = 67;

        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int temp = end + 1;

            end = end + (end - start + 1) * 2;

            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] num, int target, int start, int end) {
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target > num[mid]){
                start = mid + 1;
            }
            else if(target < num[mid]){
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

}
