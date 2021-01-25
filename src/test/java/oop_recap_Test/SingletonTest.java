package oop_recap_Test;

import org.junit.Test;

import static oop_recap.Singleton.getSingletonInstance;
import static org.junit.Assert.assertEquals;

public class SingletonTest {


    @Test
   public void shouldIncrementTotal(){
       //Singleton single = null;
getSingletonInstance();
getSingletonInstance();
assertEquals(2,getSingletonInstance().total);
    }
}
