import java.util.Scanner;

public class StringSearch {

    static boolean search(String s, char target){
        if(s.length() == 0){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if(target == s.charAt(i)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String x = sc.nextLine();
            char target = sc.next().charAt(0);

            boolean ans = search(x,target);
        System.out.println(ans);
    }
}
