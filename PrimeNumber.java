import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int num = a.nextInt();

        for(int i=2 ; i<num; i++){
            if(num%i == 0){
                System.out.println("Not Prime");
                break;
            }
            else {
                System.out.println("Prime Number ");
                break;
            }

        }

    }
}
