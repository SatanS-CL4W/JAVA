import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
                {21, 54, 80},
                {2, -12, 76, 32},
                {12, 75}
        };
        int x = sc.nextInt();
        int z = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == x) {
                    z = 1;
                    break;
                }
            }

        }
        if(z == 1){
            System.out.println("Element Found");
        }
        else
            System.out.println("Not Found");
    }
}
