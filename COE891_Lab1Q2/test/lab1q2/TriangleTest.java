package lab1q2;

import org.junit.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertSame;
import java.util.*;


public class TriangleTest {

	
	public int expected1 = 6;
	public int expected2 = 6;
	public int expected3 = 12;
	

    Triangle triangle1 = new Triangle(3, 4, 5);
    Triangle triangle2 = new Triangle(5, -4, 3);
    Triangle triangle3 = new Triangle(8, 5, 5);
    

    
    @Test
    public void testArea() {
    	double area1 = triangle1.calculateArea();
    	double area2 = triangle2.calculateArea();
    	double area3 = triangle3.calculateArea();

    	
    	int area1int = (int) area1;
    	int area2int = (int) area2;
    	int area3int = (int) area3;

    	assertSame(expected1,area1int);
    	assertSame(expected2,area2int);
    	assertSame(expected3,area3int);
    	

    }
    
}
