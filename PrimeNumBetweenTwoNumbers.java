import java.util.*;

public class PrimeNumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int flag;
        int count = 0;
        

        System.out.printf("Prime Numbers Between %d and %d are: ",a,b);
        for(int i=a ; i <= b;i++){

            if(i == 0 || i == 1)
                continue;

            flag =1;
            for(int j = 2; j < i/2; ++j){
                if(i % j == 0 ){
                    flag = 0;
                    break;
                }
            }
            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if(flag == 1){
                System.out.print(i + "  ");
                count++;
            }


        }
        System.out.println();
        System.out.println(count);

    }
}
