package Assignment1;

import java.util.Scanner;

public class palindrome2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the range:");
        int a = scn.nextInt();
        int b = scn.nextInt();
//        for (int i = a; i <=b ; i++) {
//            int num=i;
//            if (i == reverseNum(i)) {
//                System.out.println(num);
//            }
//        }
         palindrome(a,b);

    }
    public static void palindrome(int a , int b ){
        int num = 0;
        for (int i = a; i <=b ; i++) {
            num =i;
            if (i==reverseNum(i)){
                System.out.println(num);
            }
        }

    }
    public static int reverseNum(int num){
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
