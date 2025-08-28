package starters.exceptions.convert_to_int;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a list of strings separated by spaces: ");
        String[] strings = s.nextLine().split(" ");
        int[] arr = convertToInt(strings);
        if (arr != null && arr.length > 0){
            System.out.println("Converted numbers:"+ Arrays.toString(arr));
        }
        s.close();
    }

    private static int[] convertToInt(String[] strings){
        return null;
    }
}
