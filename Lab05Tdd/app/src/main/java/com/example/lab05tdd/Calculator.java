package com.example.lab05tdd;

// 사칙연산 계산기. TDD로 테스트 먼저 작성하고 그거 통과시키려고 구현한 클래스
public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("0으로 나눌 수 없음");
        }
        return a / b;
    }
}
