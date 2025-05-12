package solutions.exceptions.convert_to_int;

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
        int[] arr = new int[0];
        if (strings == null || strings.length == 0){
            System.out.println("Error: The list is empty.");
            return arr;
        }
        int number;
        for (String s: strings){
            try{
               number = Integer.parseInt(s);
               arr = Arrays.copyOf(arr, arr.length + 1);
               arr[arr.length - 1] = number;
            }catch (NumberFormatException e){
                System.out.println("Error: '"+ s + "' is not a valid integer.");
            }
        }
        return arr;
    }
}
