package Assignment1;

public class perfectno4 {
    public static void main(String[] args) {
        perfectno(284);
    }
    public static void perfectno(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println("perfect number");
        }else
            System.out.println("Not a perfect number");
    }
}
