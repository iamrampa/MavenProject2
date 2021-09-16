import static org.junit.Assert.*;

import org.junit.Test;

import com.firstday.Calculator;

public class CalculatorTest {
	@Test
	public void test1()
	{
		assertEquals(10,new Calculator().getSum(5,5));
	}
	@Test
	public void test2()
	{
		assertEquals(5,new Calculator().getSum(2,3));
	}
@Test
	public void test3()
	{
		assertEquals(2,new Calculator().getDiff(5,3));
	}
  @Test
	public void test4()
	{
		assertEquals(0,new Calculator().getDiff(5,5));
	}

	
	

}
