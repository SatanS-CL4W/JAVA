import java.util.Arrays;

public class Sorting01BubbleSort {
    static void bubbleSort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {90, 43, -12, 67, 31, 11, -65, 0};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
