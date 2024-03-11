// Program for Summation of all Array elements.

import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("My Array is: " +Arrays.toString(arr));

        int start = 0;
        for(int i=0; i<arr.length; i++){
            start = start + arr[i];
        }
        System.out.println("Sum of array Elements: " + start);
    }
}
