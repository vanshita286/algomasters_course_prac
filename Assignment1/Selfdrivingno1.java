package Assignment1;


public class Selfdrivingno1 {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter left:");
//        int left = scn.nextInt();
//        System.out.println("Enter right:");
//        int right = scn.nextInt();
        Self_driving(1,22);
    }
    public static void Self_driving(int left, int right) {

        int num = 0;
        for (int i = left; i <= right; i++) {
            num = i;
            while (i != 0) {
                int rem = i%10;
                if(num/rem ==0){
                   System.out.println(num);
               }
            }
        }
    }
}
