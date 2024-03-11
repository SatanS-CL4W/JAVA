
// 1295. Find Numbers with Even Number of Digits

public class Leetcode_Array02 {

    // function to check whether a number contains even digits or not

    static boolean even(int num){
        int numberOfDigits = digit(num);

        return numberOfDigits % 2 == 0;
    }
    // count number of digits in a number
    static int digit(int num){
        if(num<0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num > 0){
            count ++;
            num = num/10;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int count = 0;
        for(int element : nums){
            if(even(element)){
                count++;
            }
        }
        System.out.println(digit(count));
    }
}
