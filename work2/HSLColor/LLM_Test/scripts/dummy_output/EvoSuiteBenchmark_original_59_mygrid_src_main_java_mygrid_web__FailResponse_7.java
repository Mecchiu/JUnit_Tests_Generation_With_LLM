// _FailResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _FailResponse}.
* It contains one unit test case for the {@link _FailResponse#getTypeDesc()} method.
*/
class _FailResponseTest {
		private final String name;
	protected _FailResponse() {
		name = null;
	}
	
	public _TryResponse getResponse(java.time.LocalDate time1, java.time.LocalDate time2, java.time.LocalDate time3, java.time.LocalDate time4, java.time.LocalDate time5, java.time.LocalDate time6, java.time.LocalDate time7, java.time.LocalDate time8, java.time.LocalDate time9);
	
	@Test
	public void testStatic() throws Exception {
		assertEquals(false, new _FailResponse().getTypeDesc().isEmpty());
	}
	
	@Test
	public void testDynamic() throws Exception {
		assertNotNull(new _TryResponse(null), new _FailResponse().getTypeDesc());
	}


}