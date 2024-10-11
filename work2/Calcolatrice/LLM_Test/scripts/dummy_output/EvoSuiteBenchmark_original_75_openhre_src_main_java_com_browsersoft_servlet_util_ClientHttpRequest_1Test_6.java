// ClientHttpRequest_1Test.java
package com.browsersoft.servlet.util;

import java.net.URLConnection;
import java.net.URL;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.InputStream;
import java.util.Random;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientHttpRequest}.
* It contains one unit test case for the {@link ClientHttpRequest#post(Map)} method.
*/
class ClientHttpRequest_1Test {
		
	/**
	 * Tests that the constructor throws RuntimeException when no parameters were passed.
	 *
	 * @throws IOException 
	.* @throws NullPointerException 
	 * @throws ClassCastException 
	 */
	@Test
    public void testPOSTWhenNoParametersPassWithNoCookies() throws IOException {
		assertThrows(RuntimeException.class, () -> new ClientHttpRequest());
    }
	
	/**
	 * Tests that the constructor that accepts parameters throws an exception when a post is submitted with parameters.
	 *
	 * @throws IOException 
	 * @throws IllegalArgumentException 
	 * @throws NullPointerException 
	 */
	@Test
    public void testPOSTWithParametersThenThrowException() throws IOException {
		ClientHttpRequest chr = new ClientHttpRequest_1Test.ClientHttpRequest();
		
		chr.setParameters(new HashMap<String, Object>());
		chr.setParameters(new HashMap<String, Object>());
		chr.setParameters(new HashMap<String, Object>());
		
		try {
			chr.post(null);
		} catch (final NullPointerException e) {
			// this is what we are expecting here.
		}
	}
	
	/**
	 * Tests that the constructor that accepts parameters that have been added with a cookie added before is accepted succesfully.
	 *
	 * @throws IOException 
	 * @throws IllegalArgumentException 
	 * @throws NullPointerException 
	 */
	@Test
    public void testPOSTWithCookiesOfSameSchemeSameCookiesCreated() throws IOException {
    	ClientHttpRequest chr = new ClientHttpRequest_1Test.ClientHttpRequest();
    	chr.setCookies(new HashMap<String, Object>());
    	chr.setCookies(new HashMap<String, Object>());
    	chr.setCookies(new HashMap<String, Object>());

        chr.setParameters(new HashMap<String, Object>());
        chr.setParameters(new HashMap<String, Object>());
        chr.setParameters(new HashMap<String, Object>());

        final byte[] randomBytes = new byte[50];
        new Random().nextBytes(randomBytes);

        final String randomString = "The quick brown fox jumped over the lazy dog";

        try {
            chr.post(null);
        } catch (final NullPointerException e) {
            // this is what we are expecting here.
        }

        final int value = new Random().nextInt(20000000);

            final Map<String,Object> values = new HashMap<>();
            values.put("random", randomBytes);
            values.put("random-string", randomString);

            // this should pass because each value was added with the correct parameters from the request.
        assertEquals(value, chr.post(values).size());
    }

    /**
	 * Tests that a new form data containing cookies set with the values of an object doesn't get lost.
	 *
	 * @throws IOException 
	 * @throws IllegalArgumentException 
	 * @throws NullPointerException 
	 */
	@Test
    public void testPOSTWithCookies() throws IOException {
    	ClientHttpRequest chr = new ClientHttpRequest_1Test.ClientHttpRequest();
  
    	chr.setCookies(new HashMap<String, Object>());
    	chr.setCookies(new HashMap<String, Object>());
    	chr.setCookies(new HashMap<String, Object>());

        chr.setParameters(new HashMap<String, Object>());
        chr.setParameters(new HashMap<String, Object>());
        chr.setParameters(new HashMap<String, Object>());

        final byte[] randomBytes = new byte[50];
        new Random().nextBytes(randomBytes);

        final String randomString = "The quick brown fox jumped over the lazy dog";

        try {
            chr.post(null);
        } catch (final IOException | NullPointerException e) {
            // this is what we are expecting here.
        }
        
        final Map<String,Object> values = new HashMap<>();
        values.put("random", randomBytes);
        values.put("random-string", randomString);
        
        final InputStream inputStream = new ByteArrayInputStream(randomBytes);

        try {
            chr.post(inputStream);
        } catch (final IOException | NullPointerException e) {
            // this is what we are expecting here.
        }
    }
	
	/**
	 * Test of the {@link ClientHttpRequest#post(Map)} method.
	 *
	 * @throws IOException 
	 * @throws ClassCastException 
	 * @throws NullPointerException 
	 */
	@Test
    public void testPOSTWithParameters() throws IOException {		
		ClientHttpRequest chr = new ClientHttpRequest_1Test.ClientHttpRequest();
		
		// given that a post contains two parameters
		chr.setParameters(new HashMap<String, Object>());
		chr.setParameters(new HashMap<String, Object>());
		chr.setParameters(new HashMap<String, Object>());
		
		// when we call post with the form parameters
		@SuppressWarnings("unused")
		OutputStream out = new OutputStream() {
			public void write(int b) {
				// this makes sure the post object doesn't get lost.
				// (the second one uses the "bytes" value that is defined here)
				// also, the second one uses the value of "randomBytes", which might get lost.
				this.write(b);
			}
		};
		
		InputStream inputStream = new ByteArrayInputStream(randomBytes);
		
		// when I call post with the form parameters
		Object o = chr.post(null);
		
		// this should return <null>.
		assertNull(o);

		inputStream = new FileInputStream(new File("tests/client/testData/dataFile.txt"));
		
		// when I call post with the form parameters
		o = chr.post(new HashMap<String, Object>());
		
		// this should return the number of times the request is called.
		o = chr.post(new HashMap<String, Object>());
		
		// this should return the number of times the request is called in the end.
}
}