package com.kainv;

import java.util.Scanner;
import java.util.stream.Stream;

enum Operation {
    ADDITION("+"),
    SUBTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/"),
    REMAINDER("%");

    private String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}

public class KainVadimKn41CalcV3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите: <число 1> <арифм. операция> <число 2>: ");
        Number number_1 = scanner.nextDouble();
        String line_operation = scanner.next();
        Number number_2 = scanner.nextDouble();

        Operation operation = Stream.of(Operation.values())
                .filter(operation1 -> operation1.getSymbol().equals(line_operation))
                .findFirst()
                .orElse(null);

        System.out.println(operation != null ? calculate(number_1, number_2, operation) : "Такой арифметической операции несуществует. Можно только + - / * %");

    }

    public static <T extends Number> Number calculate(T x, T y, Operation operation) {
        Double result = null;

        switch (operation) {
            case ADDITION -> {
                result = x.doubleValue() + y.doubleValue();
            }
            case SUBTRACTION -> {
                result = x.doubleValue() - y.doubleValue();
            }
            case MULTIPLICATION -> {
                result = x.doubleValue() * y.doubleValue();
            }
            case DIVISION -> {
                result = x.doubleValue() / y.doubleValue();
            }
            case REMAINDER -> {
                result = x.doubleValue() % y.doubleValue();
            }
        }

        if (result % 1 == 0) {
            return result.intValue();
        } else {
            return result;
        }
    }
}
