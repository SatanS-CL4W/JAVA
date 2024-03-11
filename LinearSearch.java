import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Element to be Searched: ");
        int key = sc.nextInt();
        int[] arr = {28,89,56,12,90,34,76,11};

        int search = 0;

        while(search < arr.length){
            if(arr[search] == key){
                System.out.println("Element Found!!");
                break;
            }
            else
                search++;

        }
        if(search == arr.length){
            System.out.println("Element Not Found!!");
        }


    }
}
