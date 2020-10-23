package COOL;

import java.util.ArrayList;
import java.util.List;

public class MathUtils {
    public static void main(String[] args) {
        System.out.println(checkArrayForNumbers(new int []{1,4,5,4}));
    }
    private MathUtils() {}
    /*
    public static int calc(int a, int b) {
        return a + b;
    }

    public static double sqrt (double a) {
        return Math.sqrt(a);
    }

    public static double divide (double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Can't be divided by zero!");
        }
        return a / b;
    }

     */

    public static int [] findElmentsInArrayAfterFour(int [] array, int target) {
        List<Integer> madeList = new ArrayList<>();
        if (array.length == 0) {
            System.out.println("The array is empty");
            return array;
        }
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] != target) {
                madeList.add(array[i]);
            }
            else throw new RuntimeException("The array doesn't have any " + target);
        }


        array = new int[madeList.size()];

        for (int i = 0; i < madeList.size(); i++) {
            array[i]= madeList.get(i);
        }
        /*
        Integer [] newArray = madeList.toArray(new Integer[0]);

        int [] returnedArray = (int) newArray;
         */

        return array;
    }

    public static boolean checkArrayForNumbers (int [] arrayToCheck) {
        for (int i = 0; i < arrayToCheck.length - 1; i++) {
            if ((arrayToCheck[i] != 1) && (arrayToCheck[i] != 4)) {
                return false;
            } else {
                System.out.println("Go next!");
            }
        }
        return true;
    }
}
