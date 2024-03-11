//To Print The value of a particular location in  fibonacci series
import java.util.Scanner;

public class fibonacci {
    static int check(int n){
        if(n<=1){
            return n;
        }
        return check(n-1) + check(n-2);
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int find = sc.nextInt();

        System.out.println(check(find));
    }
}
