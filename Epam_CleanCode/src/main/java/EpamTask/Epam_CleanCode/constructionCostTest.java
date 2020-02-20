package EpamTask.Epam_CleanCode;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

	public class constructionCostTest {
		@Test
		public void testConstructionCostStandard() {
			assertEquals(2400.00,Constructioncost.calculating_Construction_Cost("standard", 2, false), 0.01);
		}
		
		@Test
		public void testConstructionCostHighStandard() {
			assertEquals(180000.00,Constructioncost.calculating_Construction_Cost("high standard", 100, false), 0.01);
		}
	}

