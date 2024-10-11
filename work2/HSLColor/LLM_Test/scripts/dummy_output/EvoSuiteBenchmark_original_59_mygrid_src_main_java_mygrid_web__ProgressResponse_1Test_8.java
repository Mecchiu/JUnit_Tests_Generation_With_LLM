// _ProgressResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _ProgressResponse}.
* It contains one unit test case for the {@link _ProgressResponse#getTypeDesc()} method.
*/
class _ProgressResponse_1Test {
		private static byte[] Content;
		
__init__(java.lang.String[] content) {
		Content = (java.lang.String[]) content.clone();
}
	
	@Test
	public void testConstructor(){
		new _ProgressResponse();
	}

	@Test
	public void testset_null(){
		_ProgressResponse pv = new _ProgressResponse();
		assertNotNull(pv);
	}

}