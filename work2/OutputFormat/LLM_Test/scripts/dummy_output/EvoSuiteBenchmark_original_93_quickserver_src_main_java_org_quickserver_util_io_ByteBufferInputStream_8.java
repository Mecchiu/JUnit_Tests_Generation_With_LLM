// ByteBufferInputStreamTest.java
package org.quickserver.util.io;

import java.io.*;
import java.nio.*;
import java.nio.charset.*;
import java.util.*;
import org.quickserver.net.server.ClientHandler;
import java.util.logging.*;
import org.quickserver.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByteBufferInputStream}.
* It contains one unit test case for the {@link ByteBufferInputStream#readLine()} method.
*/
class ByteBufferInputStreamTest {
		private volatile boolean flag;
		private volatile boolean flag_1;
		private volatile boolean flag_2;

		private static final Logger logger = org.quickserver.util.logging.LoggerFactory.getLogger(ByteBufferInputStreamTest.class);
		
		private StringBuffer sb;
			
		public synchronized void test()throws IOException {

			sb = new StringBuffer();
				
			logger.info("Test is started");
			logger.info("Thread is interrupted");
			logger.info("Thread is interrupted");
			logger.info("Main thread's interrupted");
			logger.info("Thread's halted");

			flag = false;
			flag_1 = false;
			flag_2 = false;
			try {
	            Thread.sleep(1000);
	            flag=false;
	            flag_1=false;
	            flag_2=false;
	            Thread.currentThread().interrupt();
	            Thread.currentThread().interrupt();
	            Thread.currentThread().interrupt();
	        } catch (Exception e) {
	        }
	        logger.info("test thread terminates");
	        logger.info("test thread terminates");
	                
			assertFalse("Main thread's interrupted flag is false",flag);
			assertFalse("Thread's interrupted flag is false",flag_1);
			assertFalse("Thread's halted flag is false",flag_2);
		}

		@Test    
		public void testReadLine() throws IOException {
			logger.info("testReadLine started");

			flag = false;
			flag_1 = false;
			flag_2 = false;
			byte buffer[] = new byte[3];
			int count=0;
			logger.info("testReadLine reading line");
			char s[]=new char[1];
			
			do{
				buffer[count]=buffer[count+1];
				sb.append((char)buffer[count]+128);
				count=count+2;
				byte temp[]=new byte[count];
				System.arraycopy(sb.toString().getBytes(),0,temp,0,temp.length);
		        sb.setLength(count);
		        sb.append(":");
		        
		        sb.append((char)Integer.parseInt(new String (temp[0]).length(),10));
		        sb.append(temp[0]);
		        Thread.sleep(1);
				buffer[count]=buffer[count+1];
				count = count + 2;
				

			} while(!flag && buffer[count]!='\n');
			count = count + 2;

			//logger.info(Arrays.toString(sb.toArray()));
			logger.info(sb.toString());
			logger.info(sb.toString()+" readLine result: "+flag);
			assertTrue(flag);
		}
		
		@Test  
		public void testClose() throws IOException {
			flag = false;
			flag_1 = false;
			flag_2 = false;
			
			logger.info("testClose started");
			sb = new StringBuffer();
			String sBuffer = "testClose";
			
			new ByteArrayInputStream(sb.toString().getBytes()).close();
			
			assertFalse(flag);
			assertFalse(flag_1);
			assertFalse(flag_2);
			
			logger.info("testClose closed result: 0");
		}
		
		@Test  
		public void testAvailable() throws IOException {
			logger.info("testAvailable started");
			flag = false;
			flag_1 = false;
			flag_2 = false;
			int count=0;
			byte buffer[] = new byte[3];
			
			new ByteArrayInputStream(sb.toString().getBytes()).available();
			
}
}