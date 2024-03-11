import java.util.Arrays;

public class ReverseArray {
    static void swap(int[] arr1, int index1, int index2){
        int temp = arr1[index1];
        arr1[index1] = arr1[index2];
        arr1[index2] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {21,45,67,22,89,90,121,56};
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            swap(arr, start, end);

            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));



    }
}
