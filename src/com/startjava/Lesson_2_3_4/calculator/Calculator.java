package com.startjava.Lesson_2_3_4.calculator;

public class Calculator {
    private int firstNum;
    private char mathSign;
    private int secondNum;
    private int result;

    public int calculate(String mathExpr) {
        String[] parsedMathExpr = mathExpr.split(" ");
        int firstNum = Integer.parseInt(parsedMathExpr[0]);
        int secondNum = Integer.parseInt(parsedMathExpr[2]);
        char mathSign = parsedMathExpr[1].charAt(0);

        switch (mathSign) {
            case '+':
                return firstNum + secondNum;
            case '-':
                return firstNum - secondNum;
            case '*':
                return firstNum * secondNum;
            case '/':
                return firstNum / secondNum;
            case '^':
                return (int) Math.pow(firstNum, secondNum);
            case '%':
                return firstNum % secondNum;
            default:
                System.out.println("Неподдерживаемая операция!");
                return 0;
        }
    }
}