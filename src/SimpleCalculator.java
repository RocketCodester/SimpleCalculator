/*
   10/28/14
   JDK 1.7
   Calculator
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class SimpleCalculator {

    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 10 + 1);
        int randomNum2 = (int) (Math.random() * 10 + 1);
        String operation = "product";
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#,###,###.##");
        System.out.println("Challenge");
        System.out.print("What is the " + operation + " of " + randomNum + " and " + randomNum2 + ":");
        double number1 = scan.nextDouble();
        System.out.print("Enter another number:");
        double number2 = scan.nextDouble();
        System.out.println("Mathematical Operators: \n1 - Addition "
                + "\n2 - Subtraction \n3 - Multiplication \n4 - Division");
        System.out.print("Enter your choice:");
        int operator = scan.nextInt();
        if (number2 == 0 && operator == 4) {
            System.out.println("You cannot divide by 0");
        } else {
            System.out.println("The result is " + formatter.format(calculate(number1, number2, operator)));
        }
    }

    public static double calculate(double number1, double number2, int operator) {
        switch (operator) {
            case 1:
                return number1 + number2;
            case 2:
                return number1 - number2;
            case 3:
                return number1 * number2;
            default:
                return number1 / number2;
        }
    }
}
