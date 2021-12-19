package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    private static int minus(int m) {
        return m - x;
    }

    public int divide(int d) {
        return d / x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int sumAllOperation(int all) {
        return sum(all) + minus(all) + divide(all) + multiply(all);
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int resultMinus = minus(95);
        System.out.println(resultMinus);
        Calculator calculatorDiv = new Calculator();
        int resultDivide = calculatorDiv.divide(25);
        System.out.println(resultDivide);
        Calculator calculatorSumAll = new Calculator();
        int resultSumAll = calculatorSumAll.sumAllOperation(5);
        System.out.println(resultSumAll);
    }
}
