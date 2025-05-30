package solutions.manage_plots;

import java.util.Arrays;

public class Utils {

    public static Object[] resizeArr(Object[] arr){
        return Arrays.copyOf(arr, arr.length == 0 ? 2: arr.length * 2);
    }

    public static boolean isExist(Object[] arr, int numOfItems, Object item) {
        for (int i = 0; i < numOfItems; i++) {
            if (arr[i].equals(item)) {
                return true;
            }
        }
        return false;
    }
}
