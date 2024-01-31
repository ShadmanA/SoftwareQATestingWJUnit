package lab1q8;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeThat;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assume.*;

@RunWith(Theories.class)
public class PrimeNumberCheckerTheoryTest {
	
	private PrimeNumberChecker PNC;
	
	
    @Before
    public void init() {
        this.PNC = new PrimeNumberChecker();
    }
    

	  @DataPoints
	  public static Object[][] primeNumInputs() {
		  return new Object[][] {
	         { 2, true },
	         { 6, false },
	         { 19, true },
	         { 22, false },
	         { 23, true }
	      };
	   }

	    
	   
	 	  @Theory
		  public void primeTest(Object[] input) {
	 		 assertTrue(PNC.isPrime((int)input[0]) == (boolean)input[1]);
		  }
		  
	  }
