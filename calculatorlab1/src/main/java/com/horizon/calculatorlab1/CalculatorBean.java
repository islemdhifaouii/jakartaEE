package com.horizon.calculatorlab1;

public class CalculatorBean {
    private int num2;
    private int num1;

    // No-arg constructor
    public CalculatorBean() {}

    // Getters and Setters
    public int getNum1() { return num1; }
    public void setNum1(int num1) { this.num1 = num1; }

    public int getNum2() { return num2; }
    public void setNum2(int num2) { this.num2 = num2; }

    // Arithmetic operations
    public int add() { return num1 + num2; }
    public int sub() { return num1 - num2; }
    public int mul() { return num1 * num2; }

    public double div() {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        return (double) num1 / num2;
    }
}


