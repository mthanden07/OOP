package oop_recap_concepts;

public class addStrategy extends Calculator {
  int total =0;

    public addStrategy(int a , int b) {
        super(calculator);
        this.finalTotal = a + b;
        System.out.println((a+b) + " is the addition of:  "+ a +" + "+ b);


    }
}
