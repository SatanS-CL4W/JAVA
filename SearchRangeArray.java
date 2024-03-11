import java.util.Scanner;

public class SearchRangeArray {

    static void range(int[] arr,int goal, int index1, int index2){
        int z = 0;
        for(int i = index1; i < index2; i++){
            if(goal == arr[i]){
                System.out.println("Element Found");
                z = 1;                
            }
        }
        if(z != 1) {
            System.out.println("Not Found Desired Element");
        }
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {21,45,213,-98,67,41,93,84,-64};
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.print("Enter element to be search: ");
        int tg = sc.nextInt();

        range(nums, tg, n1, n2);
    }
}
