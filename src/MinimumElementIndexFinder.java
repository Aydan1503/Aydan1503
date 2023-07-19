public class MinimumElementIndexFinder {

    public static int findMinIndex(int[] arr) {
        int min = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] array = {10, 5, 7, 2, 15, 3};
        int minIndex = findMinIndex(array);
        System.out.println("The index of the minimum element in the array is: " + minIndex);
    }
}
