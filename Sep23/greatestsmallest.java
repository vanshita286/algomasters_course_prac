package Sep23;

import java.util.Scanner;

public class greatestsmallest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number:");
        int x = scn.nextInt();
        System.out.println("Enter second number:");
        int y = scn.nextInt();
        System.out.println("Enter third number:");
        int z = scn.nextInt();
        System.out.println("Greatest:"+ greatest(x,y,z));
        System.out.println("Smallest:"+smallest(x,y,z));
    }
    public static int greatest(int x, int y, int z){
        if (x>=y && x>=z){
            return x;
        } else if (y>=x &&y>=z) {
            return y;
        }else {
            return z;
        }
    }
    public static int smallest(int x, int y, int z){
        if (x<=y && x<=z){
            return x;
        } else if (y<=x &&y<=z) {
            return y;
        }else {
            return z;
        }
    }
}
