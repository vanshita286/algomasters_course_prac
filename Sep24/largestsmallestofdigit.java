package Sep24;

public class largestsmallestofdigit {
    public static void main(String[] args) {
        int num = 2364;
        largestSmallest(num);
    }

    public static void largestSmallest(int n) {
        int largest = 0;
        int smallest = 9;

        while (n != 0) {
            int rem = n % 10;
            largest = Math.max(largest, rem);
            smallest = Math.min(smallest, rem);
            n = n / 10;
        }

        System.out.println("Largest Digit : " + largest);
        System.out.println("Smallest Digit : " + smallest);

    }
}