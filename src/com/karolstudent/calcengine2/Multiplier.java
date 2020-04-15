package com.karolstudent.calcengine2;

/**
 * Created by Karol on 2020-04-11
 */
public class Multiplier extends CalculateBase {
    public Multiplier() {}
    public Multiplier(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }
    @Override
    public void calculate() {
        double value = getLeftVal() * getRightVal();
        setResult(value);;
    }
}
