package oop_recap_concepts;

import oop_recap.Singleton;

public class Calculator {
    static  Calculator calculator;
    public  static int finalTotal =0;
    private int total;

    public Calculator(Calculator calculator) {
    this.calculator = calculator;
    
}    public static void main (String[]args){
//        Calculator calculator = new Calculator(new addStrategy(3,6));
//        Calculator calculator1 = new Calculator(new multiplicationStrategy(3,6));
//        Calculator calculator2 = new Calculator(new divideStrategy(108,9));
    //    Calculator calculator3 = new Calculator(new subtractStrategy(10008,2500));


}
    public  int isEqualTo(Calculator calculator){
        this.finalTotal += calculator.total;
        return finalTotal;
    }

}


