package io.zipcoder.microlabs.mastering_loops;

import java.sql.SQLOutput;

public class TableUtilities {
    int tableParams = 0;

    public static String getSmallMultiplicationTable() {

        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {

        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
//             int i = 1;
//             while (i <= 20) {
//                 System.out.printf("%4d", tableSize * 1);
//                 i = i + 1;
//             }
//
        StringBuilder sb = new StringBuilder(tableSize); // tableSize feeds the parameter into the string builder.
        for (int a = 1; a <= tableSize; a++) {

            for (int b = 1; b <= tableSize; b++) {
                sb.append(String.format("%3d |", a*b));
            }
            sb.append("\n");

        }
        return sb.toString();
    }
}



