public class DigitSumCalculator {

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = sumOfDigits(n);
        System.out.println("Sum " + n + " is " + result);
    }
}
