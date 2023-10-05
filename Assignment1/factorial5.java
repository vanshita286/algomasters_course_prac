package Assignment1;
//import java.util.Scanner;
public class factorial5 {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
        int res =factorial(11);
        System.out.println(res);
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

}
