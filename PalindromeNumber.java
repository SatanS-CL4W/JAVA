
//A palindrome number is a number that remains the same when digits are reversed. For example, the number 12321 is a palindrome number.

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverseNum = 0;
        int temp = num;
        while(temp > 0) {
            int lastDigit = temp % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            temp = temp / 10;
        }
        if(num == reverseNum){
            System.out.println("True");
        }
        else
            System.out.println("False");
    }
}
