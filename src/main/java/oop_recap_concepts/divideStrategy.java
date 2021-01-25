package oop_recap_concepts;

public class divideStrategy extends Calculator {
    int totalDividend = 0;

    public divideStrategy(int a,  int b) {
        super(calculator);
        this.totalDividend = a / b;
        System.out.println((totalDividend) + " is the dividend of  "+ a +" / "+ b);
    }



}