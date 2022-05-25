import static org.junit.Assert.*;
import org.junit.Test;
public class Main
{
  public static void main (String[]args) public class DivTest
    public void testDiv ()
  {
    System.out.println ("Run Test testDiv");
    assertEquals ("error in div()", 2, number2.div (number1).getNumber ());
    assertEquals ("error in div()", 0, number2.div (number1).getNumber ());
  }

  public void testDivByZero ()
  {
    System.out.println ("Run Test testDivByZero");
    number2.setNumber (0);
    number1.div (number2);
  }
}
}
