public class DivisibilityByThree {

    public static boolean isDivisibleBy3(int[] A) {
        // Calculate the sum of digits
        int sumOfDigits = 0;
        for (int digit : A) {
            sumOfDigits += digit;
        }
        return sumOfDigits % 3 == 0;
    }

    public static void main(String[] args) {
        int[] A1 = {1, 2, 3};
        System.out.println(isDivisibleBy3(A1));
        int[] A2 = {1, 0, 0, 1, 2};
        System.out.println(isDivisibleBy3(A2));
}
}