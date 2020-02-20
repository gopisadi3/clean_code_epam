package EpamTask.Epam_CleanCode;

import org.junit.Test;

import junit.framework.TestCase;

public class InterestTest extends TestCase {
  
	@Test
	public void testCompoundInterest() throws Exception {
		assertEquals(10.0,CalculatingInterest.CompoundInterestCalculation(100, 1, 10), 0.001);
	}
	@Test
	public void testSimpleInterest() throws Exception {
		assertEquals(20.0,CalculatingInterest.simpleInterestCalculation(100, 2, 10), 0.001);
	}
}


