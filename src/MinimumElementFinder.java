public class MinimumElementFinder {

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = {10, 5, 7, 2, 15, 3};
        int minElement = findMin(array);
        System.out.println("The minimum element of the array is: " + minElement);
    }
}
