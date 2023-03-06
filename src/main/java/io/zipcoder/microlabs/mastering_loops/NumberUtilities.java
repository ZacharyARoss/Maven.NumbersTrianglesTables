package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static boolean  isOdd(int n){
        return (n % 2 != 0);
    }


    public static String getEvenNumbers(int start, int stop) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < stop; i++) {
            if (isOdd(i) == false) { //call to isOdd code above
                sb.append(i);
            }
        }
        return sb.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < stop; i++) {
            if (isOdd(i) == true) { //call to isOdd code above
                sb.append(i);
            }
        }
        return sb.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {

        return getExponentiations(start, stop, step, 2); //calls on getExponentiations() below
    }

    public static String getRange(int stop) {

        return getExponentiations(0, stop, 1, 1);
    }

    public static String getRange(int start, int stop) {

        return getExponentiations(start, stop, 1, 1);
    }


    public static String getRange(int start, int stop, int step) {

        return getExponentiations(start, stop, step, 1);
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < stop; i+=step){
            sb.append((int) Math.pow(i,exponent));
        }
        return sb.toString();
    }
}
