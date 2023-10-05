package Assignment1;

public class strongnumber6 {
    public static void main(String[] args) {
        strongnumber(200);
    }
    public static int factorial(int n){
        if (n ==0){
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <=n ; i++) {
            fact = fact *i;

        }
        return fact;
    }
    public static void strongnumber(int n){
        int sum = 0;
        int num = n;
        while (num!=0){
            int rem= num %10;
            int fact= factorial(rem);
            sum+= fact;
            num/=10;
        }
        if (sum == n) {
            System.out.println("Strong Number");
        }
        else
            System.out.println("Not a strong number");
    }
}
