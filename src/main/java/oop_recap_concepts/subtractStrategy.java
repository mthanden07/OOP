package oop_recap_concepts;

public class subtractStrategy extends Calculator {
    int totalDiff = 0;

    public subtractStrategy(int a,  int b) {
        super(calculator);
        this.totalDiff = a - b;
        System.out.println((totalDiff) + " is the difference of:  "+ a +" - "+ b);
    }

}