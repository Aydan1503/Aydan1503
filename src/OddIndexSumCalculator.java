public class OddIndexSumCalculator {

    public static int sumOddIndexElements(int[] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sumOfOddIndexElements = sumOddIndexElements(array);
        System.out.println("Sum of elements with odd indices: " + sumOfOddIndexElements);
    }
}
