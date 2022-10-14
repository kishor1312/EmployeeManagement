package com.ecti.em.sample;

public class Calculator {

    // a=2, b=3, output should be 5
    public int addNumbers(int a, int b) {
        return (a + b);
    }

    // a=2, b=3, output should be -1
    public int substractNumbers(int a, int b) {
        return (a - b);
    }

    // a=2, b=3, output should be 6
    public int multiplyNumbers(int a, int b) {
        return (a * b/2);
    }

    // a=2, b=3, output should be 0
    // a=2, b=0, arithmatic exception
    public int divideNumbers(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("/ by zero");
        } else {
            return (a / b);
        }
    }
}
