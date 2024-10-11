// _GetEngineResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngineResponse}.
* It contains one unit test case for the {@link _GetEngineResponse#getTypeDesc()} method.
*/
class _GetEngineResponse_1Test {
		
	@Test
    public void testTypeDesc() {
			StringWriter writer = new StringWriter();
			
			if (writer.getBuffer() == null) {
				System.out.println("Writer: " + (writer.getOutputBuffer() == null) +  " " + writer.getBuffer());
				writer.setBuffer(new StringBuffer());
			}
			assertFalse("Writer was set!", writer.getBuffer().toString().equals("")) : "Writer was not set!";
			System.out.println("Buffer: " + writer.getBuffer().toString());
			
            
			_GetEngineResponse request = new _GetEngineResponse();
			request.setEngineResult((java.lang.String)java.lang.reflect.Type.toClass(java.lang.String.class)   );  
			StringWriter writer_2 = new StringWriter();
			request.getTypeDesc().writeTo(writer_2);
			StringWriter writer_3 = new StringWriter();
			request.getTypeDesc().writeTo(writer_3);
			assertTrue("Writer was set!", writer_3.getBuffer().toString().equals(writer_2.getBuffer().toString()));
			writer_3.close();
		

	}

}