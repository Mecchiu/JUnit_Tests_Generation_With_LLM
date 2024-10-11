// RIFServiceTest.java
package com.densebrain.rif.server;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import org.apache.axis2.util.Base64;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFService}.
* It contains one unit test case for the {@link RIFService#invoke(String, String, String)} method.
*/
class RIFServiceTest {
		
	@Test
	void testInvoke(){
		RIFService rifService = new RIFService();
		
		String expectedResult = "ABC";
		
		String actualResult = rifService.invoke("RIF.Test", "someValue", String.class.getName());
		
		assertEquals(expectedResult, actualResult);
		
		expectedResult = null;
		actualResult = rifService.invoke("RIF.Test", null, String.class.getName());
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void testInvokeArray(){
		RIFService rifService = new RIFService();
		
		String expectedResult = "ABC";
		
		String[] actualValues = String.valueOf(rifService.invoke("RIF.Test", "someValue", String.class)).split("\n");
		
		assertEquals(expectedResult.replaceAll("\t", ""), actualValues[0]);
		
		expectedResult = null;
		actualValues[0] = null;
		
		String[] expectedValues = rifService.invoke("RIF.Test", "someValue", String.class).split("\n");
		
		assertEquals(expectedValues[0].replaceAll("\t", ""), actualValues[1]);
		
		expectedValues.length = 1;
		actualValues.length = 1;
		
		assertEquals(expectedValues[0].replaceAll("\t", ""), actualValues[1].replaceAll("\t", ""));
		
		String[] expectedValues2 = expectedValues[0].split("\t");
		
		assertEquals(-1, expectedValues2.length);
		
		assertEquals(expectedValues[1].replaceAll("\t", ""), actualValues[2]);
		
		expectedValues2.length = 1;
		actualValues2.length = 1;
		
		assertEquals(expectedValues[1].replaceAll("\t", ""), actualValues2[1].replaceAll("\t", ""));
		
		String[] expectedValues2a = expectedValues[1].split("\t");
		
		assertEquals(expectedValues2.length, expectedValues2a.length);
		
		assertEquals(expectedValues[1].replaceAll("\t", ""), actualValues2[2].replaceAll("\t", ""));
		
	}
	
	@Test
    void testSerialization(){
        
        String serializedParams = "";
        
        String response = "<method>someValue</method>";
        
        Base64 base64 = new Base64();
        byte[] rawData = base64.encode(response.getBytes());
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream dout = new ObjectOutputStream(bout);
        dout.writeObject(new ByteArrayInputStream(rawData));
        dout.close();
        
        String output = new String(bout.toByteArray());
        
        assertEquals(String.valueOf(response), output);
        assertEquals("RIFServiceTest.testSerialization()", output);
        
    }
	
	@Test
	public void serialize(){
		
		String expectedResult = "ABC";
		
		String result = rifService.invoke("RIF.Test", "someValue", String.class).replaceAll(",\"", "");
		
		assertEquals(expectedResult, result);
		
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		ObjectOutputStream dout = new ObjectOutputStream(bout);
		dout.writeObject(new ByteArrayInputStream(expectedResult.getBytes()));
		dout.close();
		
		expectedResult = expectedResult.getBytes();
		dout = new ObjectOutputStream(bout);
		dout.writeObject(new ByteArrayInputStream(String.valueOf(expectedResult).getBytes()));
		dout.close();

		expectedResult = expectedResult.getBytes();

		bout.close();
		
		assertTrue(new String(bout.toByteArray()).contains(String.valueOf(expectedResult)));
        
        result = rifService.invoke("RIF.Test", "someValue", String.class);
        
        assertEquals(expectedResult, new String(result.getBytes()));
    }
}