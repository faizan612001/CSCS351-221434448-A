import static org.junit.Assert.*;
import org.junit.Test;
public class Main
{
  public static void main (String[]args)
  {
    public void testSubPass ()
    {
      assertEquals ("error in sub()", 1, Calculator.sub (2, 1));
      assertEquals ("error in sub()", -1, Calculator.sub (-2, -1));
      assertEquals ("error in sub()", 0, Calculator.sub (2, 2));

    }
  }
