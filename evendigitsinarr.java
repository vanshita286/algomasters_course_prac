package Assignment2;

public class evendigitsinarr {
    public static void main(String[] args) {
        int[] nums = {12,254,63,98,741};
        System.out.println(EvenCounter(nums));

//        int digit =25;
//        CountDigit(digit);
    }
    public static int CountDigit(int digit){
        int count=0;
        while (digit!=0){
            digit = digit/10;
            count ++;

        }
        return count;
    }
    public static int EvenCounter(int[]nums){
        int evencount = 0;
        for (int i :nums) {
            int countdigits = CountDigit(i);
            if (countdigits % 2==0){
                evencount++;
            }
        }return evencount;
    }
}
