package Sep23;

public class reverseNum {
    public static void main(String args[]){
        int reverse = reverseNum(1234);
        System.out.println(reverse);
    }

    public static int reverseNum(int num){
        int rev = 0;
        int rem = 0;
        while(num!=0){
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        return rev;
    }
}
