package oop_recap_concepts;

public class multiplicationStrategy extends Calculator {

    int totalSum = 0;

    public multiplicationStrategy(int a,  int b) {
        super(calculator);
        this.totalSum = a * b;
        System.out.println((totalSum) + " is the sum of  "+ a +" * "+ b);
    }

}
