package lab1q8;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeThat;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assume.*;

@RunWith(Theories.class)
public class FibonacciTest {

	   private Fibonacci Fib;

	   @Before
	   public void init() {
	      this.Fib = new Fibonacci();
	   }

	   @DataPoints
	   public static int[][] fibVals() {
			return new int[][] {{0, 0},{1, 1},{2, 1},{3, 2},
	            {4, 3},{5, 5},{6, 8},{7, 13},
	            {8, 21},{9, 34}};
		      }
	   

	   @Theory
	   public void testFibonacciChecker(int[] input) {
		   assertTrue(Fib.compute(input[0]) == input[1]);
	   }
	}
