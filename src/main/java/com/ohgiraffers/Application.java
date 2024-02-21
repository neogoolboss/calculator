package com.ohgiraffers;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("계산할 숫자들을 입력하세요 (숫자 사이에는 공백을 이용하세요):");
        String input = scanner.nextLine();

        String[] numbers = input.split(" ");

        System.out.println("원하는 연산을 선택하세요 (+, -, *, /, %):");
        char operator = scanner.next().charAt(0);

        try {
            int result = calculator.calculate(operator, numbers);
            System.out.println("결과: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

