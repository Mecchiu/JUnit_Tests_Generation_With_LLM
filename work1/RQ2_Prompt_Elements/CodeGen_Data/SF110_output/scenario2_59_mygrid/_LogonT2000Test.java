// _LogonTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains one unit test case for the {@link _Logon#getTypeDesc()} method.
*/
class _LogonTest {

	@Test
	public void getTypeDesc_NotNull() throws Exception
	{
		_Logon instance = new _Logon();
		
		InstanceValidator validator = instance.getValidator(instance.getFAClient());
		validator.validate();
		
		assertNotNull(validator);
		
		
		assertTrue(validator.isValid());
	}
	
	@Test
	public void getTypeDesc_Null() throws Exception
	{
		_Logon instance = new _Logon();
		
		InstanceValidator validator = instance.getValidator(instance.getFAClient());
		validator.validate();
		
		assertEquals(InstanceValidator.NULL,"NOT_VALID");
		
	}
}

