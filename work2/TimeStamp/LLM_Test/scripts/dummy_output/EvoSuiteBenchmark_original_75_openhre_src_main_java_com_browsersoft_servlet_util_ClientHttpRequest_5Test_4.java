// ClientHttpRequest_5Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(String, Object)} method.
*/
class ClientHttpRequest_5Test {
		
	/**
	 * Test method for {@link ClientHttpRequest#post(String, Object)}.
	 */
	@Test
    public void testPost() {
		String host1 ="http://www.www.www.computone1.org";
		String host2 ="http://www.www.computone.org";
		String host3 ="http://www.www.www.computone.org";
		
		String [] servers=host1.split(",");
		String [] cookies=host2.split(",");
		String [] parameters=host3.split(",");

		String fileToRead = "/files/test.txt";
		File file = null;
		
		for(int i=0; i<servers.length; i++){
			System.out.println("server " + servers[i]);
			fileToRead = "/files/" + servers[i] + "/" + fileToRead;
		}
		
		for(int i=0; i<parameters.length; i++){
			System.out.println("parameter " + parameters[i]);
			fileToRead = "/files/test.txt?parameter=" + parameters[i];
		}

		ClientHttpRequest a= new ClientHttpRequest();
		a.post("testname", new Object[]{"testvalue"});
		String response="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + 
				"<result>\n" + 
				"<request>\n"+
	            "<method name=\"POST\">\n" + 
	            "   <parameters>\n" + 
	            "      <parameter name=\"testname\" value=\"testvalue\" />\n" + 
	            "   </parameters>\n"+
	            "</request>\n"+
	            "</result>\n" + 
				"";

		System.out.print(response);
		assertTrue(response.indexOf("<testname>testvalue</testname>")>=0);
		assertTrue(response.indexOf("</parameters>")>=0);

		
		for(int i=1; i<servers.length; i++){
			System.out.println("server");
			host1=servers[i].split("://");
			host2=servers[i].split("://");
			output(fileToRead);

		}

		for(int i=1; i<parameters.length; i++){
			System.out.println("parameter");
			parameters[i]=parameters[i].split("=");
			parameters[i][0]=encodedBy;
			outputParameter(parameters[i],(byte)(i));
			
		}

		for(int i=0; i<servers.length; i++){
			System.out.println("server");
			host1=servers[i].split("://");
			host2=servers[i].split(":");
			output(fileToRead);
		}

		for(int i=0; i<fileToRead.length(); i++){
			file=fileToRead.getBytes();
			fileInputStream= new FileInputStream(file);
			OutputStream outputStream= fileOutputStream(new File(fileToRead));
			OutputStream outputStream2= fileOutputStream(new File(fileToRead));
			Random random=new Random();
			int count=0;
			int[] count2=new int[10];
			int countOfInputStream=0;
		
			//add a new parameter(s)
			for(int j=0; j<parameters.length; j++){
				parameters[j]=new String[5];
			}
		
			//add a new parameter(s)
			for(int j=0; j<parameters.length; j++){
				parameters[j][1]= new String((char)random.nextInt());
				count2[count]++;
			}
		
			//the same code should be executed twice. The first time get a set of parameters, 
			//the second time should put the parameters into the string array
			for(int j=0;j<count2.length;j++)
				for(int k=0;k<parameters.length;k++)
					outputParameter2(parameters[k],(byte)(j+1)+i);
			
		}
		
	}
	
	private void outputParameter(String [] parameters, byte encodedBy) throws IOException{
		//this part of the code add a new parameter to the request
		
		int len;
		for(int i=0; i<parameters.length; i++){
			len=parameters[i].length();
			len++;
			parameters[i]= encodedBy +"-"+len;
			i=i+1 ;
		}
	
	}
	
	private void outputParameter2(String[] parameters, byte encodedBy) throws IOException {
		//this part of the code add a new parameter to the request
		
		int c,j;
		int count = 0;
		Map<String, String> parameter = new HashMap<String, String>();
		
		file= new File("/tmp"+System.getProperty("user.dir"));
	
		for(int i=1; i<parameters.length; i++){
			parameters[i]= parameters[i].split("=");
			String val1="",val2="",val3="";
		    c=(int)(Math.random()*(1 - 0.0))*100;
			parameter.put(parameters[i][0],parameters[i][1]);
			val1=(String)parameter.get(parameters[i][0]);
			val2=parameters[i][1];
			if(val1!=null)
				val1=encodedBy+";"+val1;
			if(val2!=null)
				val2=encodedBy+";"+val2;
			val3=encodedBy +";"+val1 + val2 + val3;
		}
		
		
}
}