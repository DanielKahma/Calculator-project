package se.danielk;

import java.util.Scanner;

public class Main {
    // greeting message

    public static void main(String[] args) {

        int operator;
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            double number1, number2;

            System.out.println("--------------------");
            System.out.println("Daniels Calculator!");
            System.out.println("--------------------");

            System.out.println("Enter your first number:");
            number1 = scanner.nextInt();

            System.out.println("Choose between: ");
            System.out.println("1.+");
            System.out.println("2.-");
            System.out.println("3.*");
            System.out.println("4./");

            operator = scanner.nextInt();

            System.out.println("Enter your second number: ");
            number2 = scanner.nextInt();

            double result = 0;

            switch (operator) {
                case 1:
                    result = number1 + number2;
                    break;

                case 2:
                    result = number1 - number2;
                    break;

                case 3:
                    result = number1 * number2;
                    break;

                case 4:
                    result = number1 / number2;
                    break;

                default:
                    System.out.println("Invalid option.");
            }

            System.out.println("Answer: " + result);


            System.out.println("Want yo calculate more? yes or no");
            answer = scanner.next();

        }
        while (answer.equals("yes"));





    }
}
