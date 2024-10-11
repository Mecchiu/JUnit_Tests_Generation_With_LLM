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
		static final String FILE_DATA = "file-content";
		static final String FILE_CONTENT = "content of the file";
		private Random random = new Random();
		private String file = File.separator + System.currentTimeMillis() + random.nextInt();
		private File testFile;
		private static Object[] values;
		private static ClientHttpRequest request;
		
		// Class constructor
		public ClientHttpRequest_2Test(String name) throws IOException{
			request=new ClientHttpRequest();

			HttpRequestBuilder h_builder;
			URLConnection url_conn;
			String file_path;
			
		    url_conn=new URL(HttpRequest.CLIENT_CONTENT_TYPE_FILE+"/"+name+"/"+TestUtil.randomFilename(10));
		    String request_content_string = "Hello world";
		    String content_type_file = request.prepareContentType(url_conn);
		    if (!content_type_file.isEmpty()) {
		    	file_path = url_conn.getURL().getFile();
			}
		    else {
			    content_type_file = HttpRequest.CLIENT_CONTENT_TYPE_TEXT+"/"+request.prepareContentType(url_conn);
		    }
			testFile=new File(file_path);
			if (testFile.exists() && testFile.isFile() && testFile.getName().endsWith("_response_200")){
				Iterator it=request.listMethods().iterator();
				while(it.hasNext()) {
					HttpMethod method = (HttpMethod)it.next();
					String response_type = method.name().replace("-", "-_");
			        if (response_type.equals("POST")) {
			            request.POST(method.toLowerCase());	
			        }
			        else if (response_type.equals("GET")) {
			            request.GET(method.toLowerCase());
			        }
			        else if (response_type.equals("PUT")) {
			            request.PUT(method.toLowerCase());
			        }
			        else if (response_type.equals("DELETE")) {
			            request.DELETE(method.toLowerCase());
				}
			    }
				file=testFile.getName();
				file_path=request.getFile(file);
				InputStream in=new FileInputStream(file_path);
				String file_path=request.submitFile(file_path, "GET", null, null);
				in.close();
				outstream= request.getOutputStream(file);
				request.POST(file_path);
			}
			else {
				// The test does not exist in the list, so no input file was passed
			    System.out.println("The test file does not exist, cannot send the request to the server.");
			}
		}

		// Set a value
		public void setTestFileAndParams(File aFile) throws IOException{
			testFile=aFile;
			values= (Object[])new String[2];
			values[0]=aFile.getName();
			values[1]=file;

		}
		
			 // test parameters
		boolean[] testParameters(){
			return new boolean[] {true};
		}

		// test the file content
			// http://stackoverflow.com/a/28887923
		public void testContentOfFile(){

		}





		// test the file content 
		public void testFileContent(){



			// InputStream InputStream = new FileInputStream(file);
							// String file_content = new String(InputStream.read(new BufferedInputStream(file.length() *random.nextInt())));


				// FileInputStream file_content = new FileInputStream(file);
				// String file_content_test = new String(InputStream.read(new BufferedInputStream(file_content)));
			
			// Map params = new HashMap();
			// params.put(file_content, new String(InputStream.read(new BufferedInputStream(file)))
			// OutputStream outstream = new OutputStream();
			// request.POST( values );
			// outstream.write( request.getBody(values));
			// outstream.close();
			// }
				// String response_body = request.getBody(parameters);



		// test the file content 

		// InputStream InputStream_2 = new FileInputStream(file);

			
		// map params
		// http://stackoverflow.com/a/28887923/28887923
}
}