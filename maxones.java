package Assignment2;

public class maxones {
    public static void main(String[] args) {
        int[] arr={1,0,1,1,0,1};
        System.out.println(maxCons1(arr));

    }
    public static int maxCons1(int[] arr) {
        int count = 0;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count = 0;
            } else if (arr[i] == 1) {
                count++;
                int prevcount = 0;
                res = 0;
                if (prevcount > count) {
                    res = prevcount;
                } else {
                    res = count;
                }
                prevcount = count;
            }

        }
        return res;
    }
}
