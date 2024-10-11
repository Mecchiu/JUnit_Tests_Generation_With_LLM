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
		
    /**
     * setParameter is a helper method for setting parameters.
     * @param name parameter name
     * @param value parameter value
     * @return input stream with an HTTP response
     * @throws IOException
     */
    //TODO test with null value and null param value
    public InputStream setParameter(String name, Object value) throws IOException {
        return ClientHttpRequestWrapper.post(name, value);
    }
    
    /**
     *  post request to the server with parameters, test with file and empty body.
     * @description upload files with the same content type
     * http://codereview.stackexchange.com/questions/5822
     * @thrown IOException if unable to send HTTP request
     */
    @Test
    public void test() throws IOException {
        try {
            OutputStream outputstream = new FileOutputStream("filepath7.txt");
            //upload file3 with the same content body as file without content
            putFile(inputUrl(), "file3.txt", outputstream);
            outputstream.close();
        } catch (IOException ioe){
            ioe.printStackTrace(); //to stop test print in case of failure
        } catch (Exception e){
            e.printStackTrace(); //to stop test print in case of failure
        }
    }
    
    private static void putFile(URL url, String filename, OutputStream outputstream) throws IOException {
      // Create an image File
      File inputFile = new File("filepath"+filename+".jpg");
      // create an Image InputStream
      FileInputStream fis=new FileInputStream(inputFile);

      URLConnection con1=url.openConnection();
      // set some stream parameters (input stream from the server to get the data)
      con1.addRequestProperty(InputStream.class.getCanonicalName(), "foo="+filename);

      //set some stream's HTTP header (set parameter's)
      con1.setRequestProperty("Content-Type", filename);
      
      // set some value
      con1.setDoOutput(true);
      
      // set data and outputStream to the connection
      con1.setDoInput(true);
      con1.addRequestProperty("Content-Length", "0");
      con1.setResponseCode(200);

      //send the data to the OutputStream
      con1.setDoOutput(false);
      con1.connect();
      con1.getOutputStream().close();
      InputStream servletResponse=con1.getInputStream();
      // close connection
      servletResponse.close();
      outputstream.flush();
      outputstream.close();
      
    }

    URL inputUrl() throws IOException {
        URL url;
        Random r=new Random();
        String key="name"+r.nextInt();
        String val="value"+r.nextInt();
        String baseUrl="http://localhost:"+8181;
        String key2="key-"+r.nextInt();
        String val2="val-"+r.nextInt();
        Base64 base64Val = new Base64(1024);
        String base64Val2="base64val"+r.nextInt();
        base64Val.encodeToString(base64Val2.getBytes(),false);
        int id=5;
        byte[] bytesval=base64Val.decode(val2.substring(r.nextInt(2)+1));
        byte[] bytesval=(byte[])new String(bytesval,"UTF-8");
        String s=new String(bytesval);
        String[] param=s.split(":/");
        String[] parmval=param.length==0?"":new String[]{parm[0]};
        //Set the URL to an URLConnection (in case of HTTP) with the parameters sent by the client to the server
        url=new URL(baseUrl+"/"+key+":"+id+"//"+key+":"+val+"//"+key2+":"+val2+"/");
        return url;
    }
    
    /**
     * This test is not useful since the form data is encoded in the same way as the form data would send to the server.
     * To have different test cases we just need to create one map and put the keys and values.
     * @param inputURL the URL of the request to be tested.
     * @param methodMethod to be tested.
     * @param value to be put in the "value" tag, in the form (key2, key, val)
     * @param paramMap  map with the parameters.
     * @throws IOException
     * @see FormDataEncoder
     * @see FormDataParser
     */
    @Test
    public void testParams_NoEncodedParam(String inputURL, String methodMethod, String value, Map<String,String> paramMap) throws IOException{
        InputStream inputStream=ClientHttpRequest.setParameter(inputURL,value);

        ClientHttpRequest request=new ClientHttpRequest();    
        Map<String,String> requestParams=request.getParameterMap();

        if(paramMap==null){
            paramMap=new HashMap<String,String>();
        }else{
            if(paramMap==null)
                paramMap=new HashMap<String,String>();
            else
                paramMap=paramMap.clone();
        }

        //do not encode the form data params
        for(String key:requestParams.keySet()){
            if(!paramMap.containsKey(key)) continue;

            //get the value of the "key-" and test if the param is encoded in the same way as the request param.
            requestParams.put(key,paramMap.get(key));
            try {
                if(paramMap.get(key)!="")
                    inputStream=request.post(inputStream,methodMethod,paramMap.get(key));
            } catch (IOException ioe) {}

        }

        //validate if both parameters are encoded in the same way
        assertTrue(paramMap.containsKey("key-"));
        assertTrue(paramMap.containsKey(methodKey));
        assertTrue(paramMap.containsKey("value"));

    }

    public static URL getInputFile(File inputFile, String name){
        InputStream inputStream = null;
}
}