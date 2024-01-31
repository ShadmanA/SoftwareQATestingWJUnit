package lab1q7;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
 
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeThat;
import static org.junit.Assume.*;

@RunWith(Theories.class)
public class PairSumTest {
	
	

	  @DataPoints
	  public static int[] newVal() {
	       return new int[]{
	                        0, -1, -10, -1234, 1, 10, 6789};
	  }
	  @Theory
	  public void a_plus_b_is_greater_than_a_and_greater_than_b(Integer a, Integer b) {
	      assertTrue(a + b > a);
	      assertTrue(a + b > b);
	  }
	  
	  @Theory
	  public void addition_is_commutative(Integer a, Integer b) {
	     assertTrue(a + b == b + a);
	  }

}
