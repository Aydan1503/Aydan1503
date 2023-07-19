import java.util.Arrays;

public class ArrayHalfSwapper {

    public static void swapArrayHalves(int[] arr) {
        int middle = arr.length / 2;
        for (int i = 0; i < middle; i++) {
            int temp = arr[i];
            arr[i] = arr[i + middle];
            arr[i + middle] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {7, 8, 9, 1};
        System.out.println("Source array: " + Arrays.toString(array));

        swapArrayHalves(array);
        System.out.println("Array after swapping halves: " + Arrays.toString(array));
    }
}
