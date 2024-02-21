package com.ohgiraffers;

import java.util.Arrays;

public class Calculator {

    public int calculate(char operator, String[] numbers) {
        int[] intNumbers = Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();

        switch (operator) {
            case '+':
                return add(intNumbers);
            case '-':
                return subtract(intNumbers);
            case '*':
                return multiply(intNumbers);
            case '/':
                return divide(intNumbers);
            case '%':
                return modulo(intNumbers);
            default:
                throw new IllegalArgumentException("잘못된 연산자입니다.");
        }
    }

    private int add(int[] numbers) {
        return Arrays.stream(numbers).sum();
    }

    private int subtract(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }

    private int multiply(int[] numbers) {
        int result = 1;
        for (int num : numbers) {
            result *= num;
        }
        return result;
    }

    private int divide(int[] numbers) {
        if (numbers.length < 2) {
            throw new IllegalArgumentException("나누기 연산을 수행하려면 최소 두 개의 숫자가 필요합니다.");
        }
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
            }
            result /= numbers[i];
        }
        return result;
    }

    private int modulo(int[] numbers) {
        if (numbers.length < 2) {
            throw new IllegalArgumentException("나머지 연산을 수행하려면 최소 두 개의 숫자가 필요합니다.");
        }
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
            }
            result %= numbers[i];
        }
        return result;

    }

}

