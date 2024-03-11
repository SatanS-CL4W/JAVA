import java.util.Arrays;

public class SwapArray {
    static void swap(int[] arr1, int start,int end){
        int temp = arr1[start];
        arr1[start] = arr1[end];
        arr1[end] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {21, 56, 33, 12, 78};
        swap(arr, 0, 4);
        System.out.println(Arrays.toString(arr));

    }


}

