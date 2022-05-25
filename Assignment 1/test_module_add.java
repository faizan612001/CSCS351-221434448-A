import static org.junit.Assert.*;
import org.junit.Test;
public class Main
{
	public static void main(String[] args) {
		import static org.junit.Assert.*;
import org.junit.Test;
 
public class AddSubTest {
  
   public void testAddPass() {
      // assertEquals(String message, long expected, long actual)
      assertEquals("error in add()",  3, Calculator.add(1, 2));
      assertEquals("error in add()", -3, Calculator.add(-1, -2));
      assertEquals("error in add()",  9, Calculator.add(9, 0));
   }
 
	}
}
