import static org.junit.Assert.*;
import org.junit.Test;
public class Main
{
  public static void main (String[]args) public class DivTest
  {
    public void testDivIntPass ()
    {
      assertEquals ("error in divInt()", 3, Calculator.divInt (9, 3));
      assertEquals ("error in divInt()", 0, Calculator.divInt (1, 9));
    }
  }
}
