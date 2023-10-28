package Assignment2;

public class movezero {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int[] res = move0toR(arr);
        for (int ele:res) {
            System.out.println(ele);
        }
    }
    public static int[] move0toR(int[]nums){
        int zero =0;
        int i=0;
        while(i<nums.length){
            if (nums[i]!=0) {
                int temp = nums[i];
                nums[i]= nums[zero];
                nums[zero]=temp;
                zero++;
            }i++;
        }return nums;
    }
}
