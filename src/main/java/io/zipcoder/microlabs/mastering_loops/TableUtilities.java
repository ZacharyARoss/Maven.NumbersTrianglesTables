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
            int a = 1;
            int b = 1;
        for (a = 1; a <= tableSize; a++){

            for (b = 1; b <= tableSize; b++){
                System.out.print(a*b + " " + "|" + " ");
            }
            System.out.println();

        }
        return getMultiplicationTable(0);
    }
}
