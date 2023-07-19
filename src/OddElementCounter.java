public class OddElementCounter {

    public static int countOddElements(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int oddElementCount = countOddElements(array);
        System.out.println("Number of odd elements in an array: " + oddElementCount);
    }
}
