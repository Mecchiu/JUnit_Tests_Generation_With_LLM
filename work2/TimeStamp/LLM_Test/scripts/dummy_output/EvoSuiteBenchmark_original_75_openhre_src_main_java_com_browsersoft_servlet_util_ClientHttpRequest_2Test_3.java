// ClientHttpRequest_2Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(Object[])} method.
*/
class ClientHttpRequest_2Test {
		
	
	 /**
	  * Create a new test object.
	  * @throws IOException if problem is found.
	  */
	 @Test
	 public void testCreate() throws IOException {	
	    URL url = new URL("https://www.google.com");
	    ClientHttpRequest objRequest = new ClientHttpRequest();
	    objRequest.post(new Object[]{"a", "b"});
	    InputStream inputStream = new FileInputStream("test2.txt");
	    try {
	    	objRequest.post(new Object[]{"a","b"});
	    } catch (IOException e) {
	    	  fail("Unexpected " + e.getClass());
	    }
	  }
	  
	 /**
	* Get response in input stream, from testObject.
	* @param testObject test object.
	* @return response.
	*/
	 static Response get(Object testObject) {
		try {
			String response = new String(ClientHttpRequest.get(testObject).post(new Object[0]));
			return Response.to(new Object[]{"test "+response}, Response.Status.OK);
		} catch (IOException e) {
			e.printStackTrace();
			return Response.to("test");
		}
	}
	
	 /**
	 * Get response in byte array.
	 * @return response.
	*/
	static byte[] getByte(Object testObject) {
	    System.out.print(Byte.toString(get(testObject).post(new Object[0]).postAsByteArray()));
	    return get(testObject).post(new Object[0]).getPostAsBytes();
	}

	    /**
	     * Set a random parameter in the request.
	     * @param testObject parameter.
	     * @return the request.
	     */
	    public final String setParameter(Object request) {
	        ClientHttpRequest.setParameter(request, Random.nextInt());
	        return get(request).getPostAsString();
	    }
	
	 /**
	* Get string response from a file.
	 * @param file file to get.
	 * @return response.
	*/
		public final String getResponseFromFile(File file) throws IOException {
			String response = getFileContent(file);
			System.out.print(response);
			return response;
		}
	
		/**
	 * Get stream response from a file.
	 * @param file file to get.
	 * @return stream.
	*/
	 public final InputStream getResponseFromFile(File file) throws IOException {
	    FileInputStream fis = new FileInputStream(file);
			return fis;
		}
	 
	 

	 /**
	  * Get string response from an InputStream
	 */
	  public String getResponseFromStream(InputStream inStream) throws IOException {
		String response = new String(ClientHttpRequest.get(inStream).get(new Object[0]).getPostStreamAsString());
		return response;
	}
	
	 /**
	 * Get string response from an OutputStream
	 */
	  public String getResponseFromOutput(OutputStream outStream) throws IOException {
		byte[] bytes = ClientHttpRequest.getOutputStream(outStream).toByteArray();
		return new String(bytes);
	}
	
	 /**
	 * Get string response from an OutputStream.
	 * @param messageToSend Response header (content)
	 * @return string
	 */
	public final String getResponseFromOutput(String messageToSend) {
		OutputStream out = new ClientHttpRequest.ClientHttpResponse().get(this.get(new Object[]{"", 0}));
		return getOutputStream(out).toString();
	}
	
	/**
	 * Get stream.
	 * @param byteArrayFile output file
	 * @return stream
	*/
	  public final InputStream getStreamFromFile(byte[] byteArrayFile) {
		 return new FileInputStream(new File(byteArrayFile));
	    }
	    
	 /**
	 * Get stream.
	 * @param file output file
	 * @return stream
	*/
	public final InputStream getStreamFromFile(File file) {
		 InputStream fileAsInputStream = null;
		 try {
			fileAsInputStream = new FileInputStream(file);
		 } catch (IOException e) {
			System.out.println("Could not get file stream for " + e.getMessage());
		 }
		return fileAsInputStream;
	}
	
	 /**
	 * Get a string from a Map object.
	 * @param <K> key type.
	 * @param <V> value type.
	 * @param map Map object.
	 * @return string.
	 */
	  public static <K, V> String getString(HashMap<K, V> map) {
		 Iterator<K> iter = map.keySet().iterator();
		 K first = iter.next();
		 return map.get(first).toString();
	   }
	
	 /**
	  * Get content bytes of a file.
	  * @param fileName name of the file to be read.
	  * @param length content length of the binary data as a 64 bit unsigned integer from the
	  * header.
	  * @return read response bytes as a byte array.
	  */
	 public final byte[] getContentBytes(String fileName, long length) {
		byte[] bytes = new byte[(int)length];
		long totalLength = 0;
		try {
			for (int cnt = 0; cnt < bytes.length; cnt++) {
				long thisLength = ClientHttpRequest.getLength(fileName);
				totalLength += cnt + (thisLength * (1L << 56));
				if ((totalLength + thisLength) > length) {
					totalLength = length;
					bytes = new byte[totalLength];
				}
				ClientHttpRequest.getInputStream(fileName).read(bytes, cnt, (int)totalLength);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.print(new String(bytes));
		return bytes;
	}
	 
	 
}