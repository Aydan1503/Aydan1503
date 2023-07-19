public class MirrorNumber {

    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10; //
            number /= 10; //
        }
        return reversedNumber;
    }

    public static void main(String[] args) {
        int a = 567;
        int mirrorNumber = reverseNumber(a);
        System.out.println("The number" + a + " in mirror image: " + mirrorNumber);
    }
}
