package ismaell;

import static org.junit.Assert.*;

import org.junit.Test;

public class problemaTesthora {

	@Test
	public void testMin() {
		
		int val = problema.calculMin(10, 20);
		assertEquals(200, val);

//		fail("Not yet implemented");
	}
	
	@Test
	public void testHora() {
		
		int val = problema.calculHora(10, 2);
		assertEquals(5, val);

//		fail("Not yet implemented");
	}
	
	@Test
	public void testDia() {
		
		int val = problema.calculDia(10, 2);
		assertEquals(5, val);

//		fail("Not yet implemented");
	}
	
	@Test
	public void testAño() {
		
		int val = problema.calculAño(10, 2);
		assertEquals(5, val);

//		fail("Not yet implemented");
	}

}
