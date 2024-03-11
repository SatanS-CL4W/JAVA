import java.util.Scanner;

public class BinarySearchAlgorithm {
    static String binarySearch01(int[] arr, int target){
        int start = 0;
        int last = arr.length - 1;

        while(start <= last){
            int mid = start + (last - start) / 2;

            if(arr[mid] < target){
                start = mid + 1;
            }else if(arr[mid] > target){
                last = mid - 1;
            }
            else
                return "Element Found";
        }
        return "Element doesn't exist";
    }
    public static void main(String[] args) {
        int[] arr = {-12,-5,0,14,15,50,75,100,150};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        String ans = binarySearch01(arr,target);
        System.out.println(ans);
    }
}
