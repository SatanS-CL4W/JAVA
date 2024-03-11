public class MinElementInArray {
    static int min(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    min = arr[j];
                }

            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] nums = {12,87,-32, 56, 96, -76, 100};

        int ans = min(nums);
        System.out.println(ans);
    }
}
