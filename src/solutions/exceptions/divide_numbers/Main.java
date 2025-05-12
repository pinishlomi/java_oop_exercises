package solutions.exceptions.divide_numbers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1, num2;
        while (true){
            try{
                System.out.println("Enter number 1: ");
                num1 = s.nextInt();
                System.out.println("Enter number 2: ");
                num2 = s.nextInt();
                Integer result = divideNumbers(num1, num2);
                if (result != null){
                    System.out.println("The result of the division is:" +  result);
                    break;
                }
            }catch (InputMismatchException e){
                System.out.println("Error: Please enter valid numbers.");
                s.nextLine();
            }
        }
        s.close();
    }

    private static Integer divideNumbers(int a, int b) {
        try {
            return a / b;
        }catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        return null;
    }
}
