package Assignment2;

public class duplicate {
    public static void main(String[] args) {
        int[] arr= {1,0,2,3,0,4,5,0};
        int[] res =repzero(arr);
        for (int ele:res) {
            System.out.println(ele);
        }

    }
    public static int[] repzero(int[] arr){
        int[] res = new int[arr.length];
        int resIndex = 0;
        for (int i = 0; i < arr.length-1; i++) {
            res[i+1] =0;
            if (arr[i] == 0 ) {
                res[resIndex] = arr[i];
                resIndex++;
                if (resIndex < arr.length) {
                    res[resIndex] = 0;
                }

            }else{
                res[resIndex]=arr[i];
            }resIndex++;

        }return res;
    }

}
