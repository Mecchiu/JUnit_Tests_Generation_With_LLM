// ClientHttpRequest_0Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post()} method.
*/
class ClientHttpRequest_0Test {

    @Test
    public void test01add_param_file() throws IOException {
        // file as directory
        String dir_1 = "D:\\test\\";
        File f_1 = new File(dir_1);
        f_1.mkdir();
        File f_1_1 = new File(dir_1, "1");
        f_1_1.mkdir();
        
        ClientHttpRequest request = new ClientHttpRequest();
        Map<String, String> form = new HashMap<String, String>();
        form.put("file", "file1.txt");
        Map<String, File> file = new HashMap<String, File>();
//		file.put("1", new File("D:\\test\\1.txt"));
//		request.file = file;
        String fileName = "fFileName.txt";
//		request.file = file;
        
        request.put(null, form); //add all form data
        request.add((InputStream)null, file);//add files or files as directory 
        File file2 = new File(f_1, fileName);
        f_1_1.mkdir();
        request.post("/upload/", file2, null);
//		System.out.println("Client test: file2 created");
    }
	
    @Test
    public void test02getHeaderOnly() throws IOException {
        // file as directory
        String dir_1 = "D:\\test\\";
        File f_1 = new File(dir_1);
        f_1.mkdir();
        File f_1_1 = new File(dir_1, "1");
        f_1_1.mkdir();
        
        ClientHttpRequest request = new ClientHttpRequest();
        Map<String, String> form = new HashMap<String, String>();
        form.put("file", "file1.txt");
        Map<String, File> file = new HashMap<String, File>();
//		file.put("1", new File("D:\\test\\1.txt"));
//		request.file = file;
        String fileName = "fFileName.txt";
        request.file = file;
        request.put(null, form); //add all form data		

        request.getHeaderOnly("/upload/"); //get upload request only
        String requestValue = request.getHeaderOnly(null); //get only header value
        assertEquals("Get header value:file1.txt", form.get("file1.txt"), requestValue);
    }

    @Test
    public void test03getHeaderOnlyWithCookie() throws IOException {
        // file as directory
        String dir_1 = "D:\\test\\";
        File f_1 = new File(dir_1);
        f_1.mkdir();
        File f_1_1 = new File(dir_1, "1");
        f_1_1.mkdir();

        ClientHttpRequest request = new ClientHttpRequest();
        Map<String, String> form = new HashMap<String, String>();
        form.put("file", "file1.txt");
        Map<String, File> file = new HashMap<String, File>();
        file.put("1", new File("D:\\test\\1.txt"));
//		file.put("1", new File("D:\\test\\1.txt"));
        String fileName = "fFileName.txt";

        request.file = file;
        request.put(null, form); //add all form data
        request.getHeaderOnly("/upload/", null, "Cookie");
        String requestValue = request.getHeaderOnly(null);

        request.file = file;
        request.getHeaderOnly("/upload/"); //get upload request only
        assertEquals("Get header value:file1.txt", form.get("file1.txt"), requestValue);
    }
	
    @Test
    public void test04postOnlyWithContentLength(){
            int contentLength = (new Random()).nextInt(500);
            String contentLength = Integer.toString(contentLength);
            
            ClientHttpRequest request = new ClientHttpRequest();
            String formData = "ContentLength: " + contentLength;
            Map<String, String> form = new HashMap<String, String>();
            form.put("contentLength", contentLength);
            request.put(null, form); //add form data
            System.out.println("ContentLength request created with " + form.get("contentLength"));
            
            //post with content length
            OutputStream os = null;
            try {
            	
                URLConnection connection = new URL("http://localhost:"+port+"/test").openConnection();
                connection.setDoOutput(true);     //request use Data  
                
                //create a connection with content length
                connection = (URLConnection) connection.getConnection();
                
                // send the multipart request
                os = connection.getOutputStream();
                os.write("POST /test/ HTTP/1.1\r\n" + formData + "\r\n".getBytes());
                os.flush();
                os.close();
                os = null;

                InputStream is = connection.getInputStream();
                
                FileInputStream fis = new FileInputStream(file);//Create a FileInputStream. The stream is not closed by this object.
                byte[] buffer = new byte[10000]; //buffer size
                int readNumber = 0;
                while ((readNumber = is.read(buffer))!= -1) {
                    //write bytes to outputstream
                    os.write(buffer);
                    os.flush();
                }
                
                InputStream is2 = connection.getInputStream();
                int bufferSize = os.available();
                String b = "";
                while (is2.read()!= -1) {
                    //read bytes from outputstream
                    b += (char)is2.read();
                }
                System.out.println(b);
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }

            fis = new FileInputStream(file);//Create a FileInputStream. The stream is not closed by this object
            String fileContent = new String(fis.read(10000));// create string
            assertEquals(contentLength, fileContent);
            assertEquals(contentLength, fileContent.length());
    }
}