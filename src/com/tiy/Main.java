package com.tiy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number");
        String userInput =scanner.nextLine();
        Double operand1 =Double.parseDouble(userInput);
        System.out.println("Give me a number");
        String userInput2 =scanner.nextLine();
        Double operand2 = Double.parseDouble(userInput2);

        double sum = operand1 + operand2;
        double difference = operand1 - operand2;
        double division = operand1 / operand2;
        double multiplication = operand1 * operand2;

        System.out.println("the sum is "+ sum);
        System.out.println("the result is "+ difference);
        System.out.println("the result is "+ division);
        System.out.println("the result is "+ multiplication);








        }

    }







