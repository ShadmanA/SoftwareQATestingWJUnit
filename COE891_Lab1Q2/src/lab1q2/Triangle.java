package lab1q2;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class Triangle {
	
public int side1, side2, side3;

public Triangle(int side1, int side2, int side3) {
this.side1 = side1;
this.side2 = side2;
this.side3 = side3; }

public double calculateArea () {
 //Heron's Formula for area of a triangle
 double s = (side1 + side2 + side3) * 0.5;
 System.out.println("\t s=" + s);
//double result = Math.sqrt(s * (side1 - s) * (side2 - s) * (side3 - s)); Incorrect Implementation that results in negative number for result!
double result = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
System.out.println("\t result=" + result);
return result; }
}
