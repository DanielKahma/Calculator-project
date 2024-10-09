package se.danielk;

import java.util.Scanner;

public class Main {
    // greeting message

    public static void main(String[] args) {

        int operator, num1, num2;
        Scanner scanner = new Scanner(System.in);
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

        double sum = 0;

        switch (operator) {
            case 1: sum = number1 + number2;
            break;

            case 2: sum = number1 - number2;
            break;

            case 3: sum = number1 * number2;
                break;

            case 4: sum = number1 / number2;
                break;

            default:
                System.out.println("Invalid option.");
        }

        System.out.println("Answer: " + sum);


        }


    }
