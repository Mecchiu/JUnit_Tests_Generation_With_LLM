// ClientHttpRequest_6Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(String, Object, String, Object)} method.
*/
class ClientHttpRequest_6Test {
		
	class TestMap extends HashMap<String,Object>{
		@Override
		public Object put(Object key, Object value) {
			return super.put(as(key,value.toString()), value);
		}
	}
	
	@Test
	public void test1() throws IOException{
		
        String fileName = new File("../pics/1.png").getAbsolutePath();
		System.out.println(fileName);
		
		InputStream in = this.getClass().getResourceAsStream("/images/1.png");
		ClientHttpRequest.post("name1", "value1", "name2", "value2");
		FileInputStream fis = new FileInputStream(fileName);
		ClientHttpRequest.post(fis);
		while(true){
            try{
            	Thread.sleep(10);
            }catch(Exception e){

            }
            fis = new FileInputStream(fileName);
			ClientHttpRequest.post(fis);
		}
	}
	
	@Test
	public void test2() throws IOException{
		
        InputStream in = this.getClass().getResourceAsStream("/images/1.png");
		ClientHttpRequest.post("name1", "value1", "name2", "value2");
		ClientHttpRequest.post(in);
		in = this.getClass().getResourceAsStream("/images/1.png");
		ClientHttpRequest.post(in);
		in = this.getClass().getResourceAsStream("/images/1.png");
		ClientHttpRequest.post(in);
		
		try (OutputStream fos = new FileOutputStream(new File("target/testData/1.png"))) {
			ClientHttpRequest.post(fos);
        } catch (IOException ioe) {
            throw new Exception("", ioe);
        }
	}
	
	@Test
	public void test3() throws IOException{
		
		InputStream in = this.getClass().getResourceAsStream("/images/1.png");
		ClientHttpRequest.post("name1", "value1", "name2", "value2");
		ClientHttpRequest.post(in);
		in = this.getClass().getResourceAsStream("/images/1.png");
		ClientHttpRequest.post(in);
		in = this.getClass().getResourceAsStream("/images/1.png");
		ClientHttpRequest.post(in);
		in = this.getClass().getResourceAsStream("/images/1.png");
		ClientHttpRequest.post(in);
		
		try (OutputStream fos = new FileOutputStream(new File("target/testData/1.png"))) {
			ClientHttpRequest.post(fos);
        } catch (IOException ioe) {
            throw new Exception("", ioe);
        }
	}
	
	@Test
	public void test4() throws IOException{
		
		InputStream in = this.getClass().getResourceAsStream("/images/1.png");
		ClientHttpRequest.post("name1", "value1", "name2", "value2");
		ClientHttpRequest.post(in);
		in = this.getClass().getResourceAsStream("/images/1.png");
		ClientHttpRequest.post(in);
		in = this.getClass().getResourceAsStream("/images/1.png");
		ClientHttpRequest.post(in);
		in = this.getClass().getResourceAsStream("/images/1.png");
		ClientHttpRequest.post(in);
		
		try (OutputStream fos = new FileOutputStream(new File("target/testData/1.png"))) {
			ClientHttpRequest.post(fos);
        } catch (IOException ioe) {
            throw new Exception("", ioe);
        }
	}
	
	@Test
	public void test5() throws IOException{
				
		InputStream in = this.getClass().getResourceAsStream("/images/1.png");
		ClientHttpRequest.post("name1", "value1", "name2", "value2");
		ClientHttpRequest.post(in);
		in = this.getClass().getResourceAsStream("/images/1.png");
		ClientHttpRequest.post(in);
		in = this.getClass().getResourceAsStream("/images/1.png");
		ClientHttpRequest.post(in);
		in = this.getClass().getResourceAsStream("/images/1.png");
		ClientHttpRequest.post(in);
		
		try (OutputStream fos = new FileOutputStream(new File("target/testData/1.png"))) {
			ClientHttpRequest.post(fos);
        } catch (IOException ioe) {
            throw new Exception("", ioe);
        }
	}
	
	@Test
	public void test6() throws IOException{
		
		URLConnection connection = this.getClass().getResourceAsStream("/images/1.png");				
		URLConnection connection1 = this.getClass().getResourceAsStream("/images/1.png"); 
		URLConnection connection2 = this.getClass().getResourceAsStream("/images/1.png"); 				
		URLConnection connection3 = this.getClass().getResourceAsStream("/images/1.png"); 				
		
		assertEquals(connection, this.getClass().getResourceAsStream("/images/1.png"));
				
		assertEquals(connection1, this.getClass().getResourceAsStream("/images/1.png"));
				
		assertEquals(connection2, this.getClass().getResourceAsStream("/images/1.png"));
				
		assertEquals(connection3, this.getClass().getResourceAsStream("/images/1.png"));
		
        InputStream in = this.getClass().getResourceAsStream("/images/1.png");
		ClientHttpRequest.post("name1", "value1", "name2", "value2");
		ClientHttpRequest.post(in);
		in = this.getClass().getResourceAsStream("/images/1.png");
		ClientHttpRequest.post(in);
		in = this.getClass().getResourceAsStream("/images/1.png");
		ClientHttpRequest.post(in);
}
}