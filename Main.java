



[A[A[A[A






















[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[Apackage com.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
   
{
   import org.junit.*;
import static org.junit.Assert.*;
 
public class AppTest {
	@Test
	public void testOne(){
		App app=new App();
		int exp=15;
		assertEquals(exp,app.add(8,7));
	}
}
}
