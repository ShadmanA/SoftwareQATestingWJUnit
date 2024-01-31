package lab1q1;

import org.junit.*;
import static org.junit.Assert.*;

public class ArrayMultTest {
    
    private ArrayMult am;
    private int[] array1 = {1, 2, 3, 4, 5};
    private int[] array2 = {1, 2, 3, 4, 5, 6, 7};
    private int [] expected = {1, 4, 9, 16, 25, 6, 7};
    
    @Before
    public void setUp() {
        am = new ArrayMult();
    }
    
    @Test
    public void testMult() {
        int [] outArray = am.mult(array1, array2);
        for(int i = 0; i < expected.length; i++){
            assertEquals(expected[i], outArray[i]);
        }
    }
    
}