package lab1q4;

import org.junit.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertSame;
import java.util.*;

public class RETest {

	private RE RegEx;
	private String number1 = "123 123-1234";
	private String number2 = "123 456-7890";
	private String number3 = "777 8 9012 53983052";
	
    @Before
    public void setUp() {
        RegEx = new RE();
    }
    
	@Test
	public void testNum(){	
		boolean realPhoneNum1 = RegEx.checkPhoneNumber(number1);
		assertTrue(realPhoneNum1);
		boolean realPhoneNum2 = RegEx.checkPhoneNumber(number2);
		assertTrue(realPhoneNum2);
		//boolean realPhoneNum3 = RegEx.checkPhoneNumber(number3);
		//assertTrue(realPhoneNum3);
		
	}
}
