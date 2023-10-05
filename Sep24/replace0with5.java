package Sep24;

public class replace0with5 {
    public static void main(String[] args) {
        int num = 105;
        System.out.println(replace0with5(num));
    }

    public static int replace0with5(int num){
        int rev = 0;
        int rem = 0;
        while(num!=0){
            rem = num % 10;
            if (rem == 0){
                rem = 5;
            }
            rev = rev*10 + rem;
            num = num/10;
        };
        return reverse(rev);
    }
    public static int reverse(int num){
        int rev = 0;
        int rem = 0;
        while(num!=0){
            rem = num%10;
            rev = rev*10 +rem;
            num = num/10;
        }
        return rev;
    }
}
