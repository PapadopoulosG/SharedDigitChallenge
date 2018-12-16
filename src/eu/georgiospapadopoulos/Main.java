package eu.georgiospapadopoulos;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 13));
    }

    /**
     * Receives 2 numbers and checks if any digit in the first number, appears in the second.
     *
     * @param first First number given.
     * @param second Second number given.
     *
     * @return true if the numbers have a shared digit , false if they don't or if
     * any of the numbers are not in the challenge's valid range.
     *
     */
    private static boolean hasSharedDigit(int first, int second) {
        if ((first < 10 || (first > 99)) || (second < 10 || (second > 99)))
            return false;

        int currentFirstDigit, currentSecondDigit, duplicateSecond = second;

        while (first > 0) {
            currentFirstDigit = first % 10;
            first /= 10;

            while (second > 0) {
                currentSecondDigit = second % 10;
                second /= 10;
                if (currentSecondDigit == currentFirstDigit) {
                    return true;
                }
            }
            second = duplicateSecond;
        }
        return false;
    }

}