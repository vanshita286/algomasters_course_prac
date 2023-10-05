package Assignment1;

//import java.util.Scanner;

public class primefactors3 {
    public static void main(String[] args) {
        primefactors(315);

    }
    public static void primefactors(int n){
        for (int i = 2; i <n ; i++) {
            while(n%i==0){
                System.out.println(i);
                n = n/i;
            }
        }
        if(n>=2) {
            System.out.println(n);
        }

    }
}

