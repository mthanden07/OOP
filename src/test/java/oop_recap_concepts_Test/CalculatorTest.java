package oop_recap_concepts_Test;

import oop_recap_concepts.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {



  @Test
    public void shouldBeAbleToAddStrategy(){

      Calculator calculator = new addStrategy(5,6);


      int totalAll = calculator.isEqualTo(new Calculator (new addStrategy(2500,2500)));
      int totalAll1 = calculator.isEqualTo(new Calculator (new addStrategy(0,2501)));
      int totalAll2 = calculator.isEqualTo(new Calculator (new addStrategy(35000,35000)));
      int totalAll3 = calculator.isEqualTo(new Calculator (new addStrategy(5,7)));



assertEquals(5000, totalAll);
assertEquals(2501, totalAll1);
assertEquals(70000, totalAll2);
assertEquals(12, totalAll3);


  }

  @Test
  public void shouldBeAbleToDivideSrategy(){

    Calculator calculator = new divideStrategy(15,3);


    int totalAll = calculator.isEqualTo(new Calculator (new divideStrategy(2500,2500)));
    int totalAll1 = calculator.isEqualTo(new Calculator (new divideStrategy(0,2501)));
    int totalAll2 = calculator.isEqualTo(new Calculator (new divideStrategy(35000,35000)));
    int totalAll3 = calculator.isEqualTo(new Calculator (new divideStrategy(5,7)));



    assertEquals(0, totalAll);
    assertEquals(2501, totalAll1);
    assertEquals(70000, totalAll2);
    assertEquals(12, totalAll3);


  }
  @Test
  public void shouldBeAbleToSubtractStrategy(){

    Calculator calculator = new subtractStrategy(0,0);


    int totalAll = calculator.isEqualTo(new Calculator (new subtractStrategy(2500,2500)));
    int totalAll1 = calculator.isEqualTo(new Calculator (new subtractStrategy(0,2501)));
    int totalAll2 = calculator.isEqualTo(new Calculator (new subtractStrategy(35000,35000)));
    int totalAll3 = calculator.isEqualTo(new Calculator (new subtractStrategy(5,7)));



    assertEquals(0, totalAll);
    assertEquals(2501, totalAll1);
    assertEquals(70000, totalAll2);
    assertEquals(12, totalAll3);

  }


  @Test
  public void shouldBeAbleToMultiplicationStrategy(){

    Calculator calculator = new addStrategy(5,6);


    int totalAll = calculator.isEqualTo(new Calculator (new multiplicationStrategy(2500,2500)));
    int totalAll1 = calculator.isEqualTo(new Calculator (new multiplicationStrategy(0,2501)));
    int totalAll2 = calculator.isEqualTo(new Calculator (new multiplicationStrategy(35000,35000)));
    int totalAll3 = calculator.isEqualTo(new Calculator (new multiplicationStrategy(5,7)));



    assertEquals(0, totalAll);
    assertEquals(2501, totalAll1);
    assertEquals(70000, totalAll2);
    assertEquals(12, totalAll3);

  }
}
