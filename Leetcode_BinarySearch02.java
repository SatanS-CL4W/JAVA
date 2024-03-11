
// https://leetcode.com/problems/peak-index-in-a-mountain-array/
// https://leetcode.com/problems/find-peak-element/
public class Leetcode_BinarySearch02 {

    static int MountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid+1]){
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element

            }
            else if(arr[mid] > arr[mid+1]){
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return arr[start]; // or return end as both are =

    }
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 5, 9, 7, 6, 3, 2};

        System.out.println(MountainArray(arr));//

    }
}
