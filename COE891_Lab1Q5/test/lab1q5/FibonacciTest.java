package lab1q5;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

import java.util.Arrays;
import java.util.Collection;
 
import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FibonacciTest {
   private Integer inputNumber;
   private Integer expectedResult;
   private Fibonacci Fib;

   @Before
   public void initialize() {
      Fib = new Fibonacci();
   }
	
   public FibonacciTest(Integer inputNumber, Integer expectedResult) {
      this.inputNumber = inputNumber;
      this.expectedResult = expectedResult;
   }
   
   @Parameterized.Parameters
   public static Collection fibNumbers() {
      return Arrays.asList(new Object[][] {
         { 0, 0 },
         { 1, 1 },
         { 2, 1 },
         { 3, 2 },
         { 4, 3 },
         { 5, 5 },
         { 6, 8 },
         { 7, 13 },
         { 8, 21 },
         { 9, 34 },
      });
   }

   @Test
   public void testFibonacciChecker() {
      assertSame(expectedResult, 
      Fib.compute(inputNumber));
   }
}

