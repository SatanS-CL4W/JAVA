import java.util.Scanner;

public class CeilingElementInSortedArray {
    static int CeilingValue(int[] num, int target){
        int s = 0;
        int e = num.length-1;
        if(target > num[e]){
            return -1;
        }

        if(num[s] < num[e]) {
            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (num[mid] == target) {
                    return num[mid];
                } else if (target > num[mid]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        else if (num[s] > num[e]) {
            while (s >= e) {
                int mid = s + (e - s) / 2;
                if (num[mid] == target) {
                    return num[mid];
                } else if (target < num[mid]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        return num[s];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,78,56,90,190,245,500,1232};
        int target = sc.nextInt();

        int ans = CeilingValue(arr, target);
        System.out.println("Ceiling Value of Element: " + ans);
    }
}
