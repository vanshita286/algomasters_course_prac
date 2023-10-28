package Assignment2;

import java.util.Arrays;

public class sqofsortedarr {
    public static void main(String[] args) {
        int[] arr = {7,-3,2,3,11};
        int[] squaredarr = sqofsortedarr(arr);


        for (int ele:squaredarr) {
            System.out.println(ele+" ");
        }

    }
    public static int[] sqofsortedarr(int[]nums){
        int n= nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = nums[i]*nums[i];
        }
        Arrays.sort(result);
        return result;
    }
}
