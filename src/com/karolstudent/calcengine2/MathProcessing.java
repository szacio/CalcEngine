package com.karolstudent.calcengine2;

/**
 * Created by Karol on 2020-04-13
 */
public interface MathProcessing {
    String SEPARATOR = " ";
    String getKeyword(); // add
    char getSymbol(); // +
    double doCalculation(double leftVal, double rightVal);
}
