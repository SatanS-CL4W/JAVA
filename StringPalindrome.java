import java.util.Scanner;

public class StringPalindrome {
    public static boolean isPalindrome(String s) {
        if(s.isEmpty()) {
            return true;
        }
        String x = s;
        String revStr = "";
        for(int i=s.length()-1; i>=0; --i){
            revStr = revStr + x.charAt(i);
        }
        if(x.equals(revStr)){
            return true;
        }else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(isPalindrome(str));




    }
}
