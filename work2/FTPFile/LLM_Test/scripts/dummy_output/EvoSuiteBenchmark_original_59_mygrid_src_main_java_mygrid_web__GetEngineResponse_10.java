// _GetEngineResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngineResponse}.
* It contains one unit test case for the {@link _GetEngineResponse#getTypeDesc()} method.
*/
class _GetEngineResponseTest {
		
    int m_index;
    
    public static final String m_description = "<h1>Test Description</h1><br/>";
    public static final String m_errorCode = "";
    public static final String m_result = "";
    public com.mydomain.TODO.MyGrid.web._GetEngineResponse.Engine t_getEngineResult=null;
    
	@Test
	public void test_getTypeDesc() {
		assertNotNull(m_getEngineResult.getTypeDesc());
	}
	
	@Test
	public void test_getEngineResult() {
		assertNotNull(t_getEngineResult);
	}
	
	@Test
	public void test_getResult() {
		assertNotNull(t_getEngineResult.getResult());
	}
	
	@Test
	public void test_getErrorCode() {
		assertNotNull(t_getEngineResult.getErrorCode());
	}
	
	@Test
	public void test_getErrorCode_nodata() {
		assertTrue(t_getEngineResult.isNodataException());
	}
	
	@Test
	public void test_getErrorCode_null() {
		assertFalse(t_getEngineResult.isNodataException());
	}
	
	@Test
	public void test_serializeDeserialize() {
		t_getEngineResult = null;
		com.mydomain.TODO.MyGrid.web._GetEngineResponse.Engine t_deserialize = (com.mydomain.TODO.MyGrid.web._GetEngineResponse.Engine) _GetEngineResponse.Engine.deserialize(getEngineResult.getResult());
		
		String getEngineMessage = t_deserialize.getMessage().toString();
		System.out.println("message value:" + getEngineMessage);
		assertTrue("The _GetErrorCode enum value should be enum value'mygrid.web.ErrorCode' according to the JSON deserialization", getEngineMessage.startsWith("mygrid.web.ErrorCode"));
		
		com.mydomain.TODO.MyGrid.web._GetEngineResponse t_serialized = com.mydomain.TODO.MyGrid.web._GetEngineResponse.Engine.getTypeDesc().newInstance();
		
		t_serialized.fromJson(getEngineMessage);
		
		assertEquals("The returned JSON deserialized value is not equal to the expected value", getEngineResult.getResult(), null);
		assertEquals("The _getTypeDesc field in the deserialized object is not equal to the expected _getTypeDesc field", getEngineResult.getTypeDesc(), t_serialized.getClass());
	}
	
	@Test
	public void test_serializeDeserialize_nodata_null() {
		com.mydomain.TODO.MyGrid.web._GetEngineResponse.Engine t_deserialize = new com.mydomain.TODO.MyGrid.web._GetEngineResponse.Engine();
		t_deserialize.setMessage(null);

		String getEngineMessage = t_deserialize.getMessage().toString();

		System.out.println("Message value:" + getEngineMessage);

		String getResultMessage = getEngineMessage.substring(0, getEngineMessage.length()-1);
		System.out.println("Result value:" + getResultMessage);
		assertTrue("The _getTypeDesc field in the deserialized object is not equal to the expected _getTypeDesc field", getEngineResult.getTypeDesc() == null || getEngineResult.getTypeDesc().equals(com.mydomain.TODO.MyGrid.web._GetEngineResponse.Engine.getTypeDesc()));
		assertTrue("_fromJson was not called", "true".equals(getEngineMessage));
		assertTrue("_fromJson was not called_nodata", getResultMessage.startsWith("mygrid.web.ErrorCode"));
	}
	
	@Test
	public void test_serializeDeserialize_nodata_invalid_message() {
		com.mydomain.TODO.MyGrid.web._GetEngineResponse.Engine t_deserialize = new com.mydomain.TODO.MyGrid.web._GetEngineResponse.Engine();
		t_deserialize.setMessage("");
		com.mydomain.TODO.MyGrid.web._GetEngineResponse t_serialized = com.mydomain.TODO.MyGrid.web._GetEngineResponse.Engine.serialize(t_deserialize);
		
		String getEngineMessage = t_serialized.getMessage().toString();
		System.out.println("Message value:" + getEngineMessage);

		com.mydomain.TODO.MyGrid.web._GetEngineResponse t_nodata = com.mydomain.TODO.MyGrid.web._GetEngineResponse.Engine.getTypeDesc().newInstance();
		Thread t = new Thread(new Runnable() {
				public void run() {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
					}
				}
			});
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		assertTrue("_fromJson was not called", "true".equals(getEngineMessage));
		assertTrue("_fromJson was not called_nodata", getResultMessage.startsWith("mygrid.web.ErrorCode"));
	}
}