// _ProgressResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _ProgressResponse}.
* It contains one unit test case for the {@link _ProgressResponse#getTypeDesc()} method.
*/
class _ProgressResponseTest {
		
	@Test
	public void getTypeDesc() throws Exception {
		assertEquals(
		"_ProgressResponse",
		_ProgressResponse.getTypeDesc()
		);
	}
	@Test
	public void getTypeDesc1() {
		_ProgressResponse _instance = new _ProgressResponse();
		assertTypeDesc(
		_instance);
	}
	@Test
	public void getTypeDesc2() {
		_ProgressResponse _instance = new _ProgressResponse();
		assertTypeDesc(
		_instance,
		_instance.getTypeDesc()
		);
	}
}