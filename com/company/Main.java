package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        startCalc();

        while (true) {

            System.out.println("Ввод: ");
            String line = scanner.nextLine().toUpperCase();

            if (line.equals("ВЫХОД")) {
                exitCalc();
                break;
            }

            try {
                String[] symbols = line.split(" ");
                if (symbols.length != 3) throw new Exception("Вы ввели не правильно");

                Number firstNumber = NumberService.parseAndValidate(symbols[0]);
                Number secondNumber = NumberService.parseAndValidate(symbols[2], firstNumber.getType());
                String result = OperationService.calculate(firstNumber, secondNumber, symbols[1]);
                System.out.println("Output: \n" + result);

            } catch (Exception e) {
                System.out.println(e.getMessage());
                exitCalc();
                break;
            }
        }

        scanner.close();
    }

    private static void startCalc() {
        System.out.printf("Приветствую, Я Электронный Калькулятор(по простому ЭК)!!!%n- Использование Арабских и Римских чисел - возможно%n- Ипользование Арабских и Римских чисел вместе - невозможно%nЕсли хочешь выйти, достаточно просто написать слово 'exit'%n");
    }

    private static void exitCalc() {

        System.out.println("Адъиос!!!");

    }
}
