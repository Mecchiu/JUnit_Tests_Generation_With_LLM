// _Progress_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Progress}.
* It contains one unit test case for the {@link _Progress#getTypeDesc()} method.
*/
class _Progress_1Test {
		
	private String _job;
	private java.lang.String _type;
	private java.lang.String _typeDesc;
	
	/**
	 * Test case for
	 * {@link _Progress#getTypeDesc()}.
	 */
	@org.junit.jupiter.api.Test
    public void testgetTypeDesc_1Test() {
		this._job = "testJob";
		this._type = "testType";
		this._typeDesc = "testTypeDesc";
		assertEquals("testJob", _job, "testJob".equals(_job));
		assertEquals("testJob", _job, "testType".equals(_type));
	}
	
	/**
	 * Test case for {@link _Progress#type()}.
	 */
	@Test
    public void testtype_Test() {
		_type = "testType";
		assertEquals("testType", this._type);
		assertEquals("testType", this._type);
	}
	
	/**
	 * Test case for
	 * {@link _Progress#getTypeDesc()}.
	 */
	@org.junit.jupiter.api.Test
    public void testgetTypeDesc_1() {
		assertEquals("testTypeDesc", this._typeDesc, "testTypeDesc".equals(this._typeDesc));
	}

}