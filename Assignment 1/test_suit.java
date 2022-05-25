import static org.junit.Assert.*;
import org.junit.Test;

public class TestSuite
{

  public void testAddPass ()
  {
    // assertEquals(String message, long expected, long actual)
    assertEquals ("error in add()", 3, Calculator.add (1, 2));
    assertEquals ("error in add()", -3, Calculator.add (-1, -2));
    assertEquals ("error in add()", 9, Calculator.add (9, 0));
  }


  public void testAddFail ()
  {
    // assertNotEquals(String message, long expected, long actual)
    assertNotEquals ("error in add()", 0, Calculator.add (1, 2));
  }


  public void testSubPass ()
  {
    assertEquals ("error in sub()", 1, Calculator.sub (2, 1));
    assertEquals ("error in sub()", -1, Calculator.sub (-2, -1));
    assertEquals ("error in sub()", 0, Calculator.sub (2, 2));
  }

  public void testSubFail ()
  {
    assertNotEquals ("error in sub()", 0, Calculator.sub (2, 1));

    public void testDivRealPass ()
    {
      assertEquals ("error in divInt()", 0.333333, Calculator.divReal (1, 3),
		    1e-6);
      assertEquals ("error in divInt()", 0.111111, Calculator.divReal (1, 9),
		    1e-6);

      public void testDivIntFail ()
      {
	assertNotEquals ("error in divInt()", 1, Calculator.divInt (9, 3));
      }
    }
  }
}
