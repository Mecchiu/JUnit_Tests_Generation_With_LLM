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
		
    ClientHttpRequest_0Test(){
        
		Random random = new Random();
        int[] array = new int[random.nextInt(5)];
        int value = random.nextInt();
        HashMap<String, String> parameters = new HashMap<String, String>();
        parameters.put("key1", "value1-1");
        parameters.put("key2", "value2-2");
        parameters.put("key1", "value1-1");
        parameters.put("key1", "value1-1");
        parameters.put("key1", "value1-1");
        parameters.put("key1", "value1-1");
        parameters.put("key2", "value2-2");
        parameters.put("key2", "value2-2");

        for (int i=0; i < array.length; i++)
        {
            array[i] = i;
        }

		byte[] bytes = new byte[1024];

        for (int i=0; i < bytes.length; i++){
		    int index = random.nextInt(array.length);
		    bytes[i] = (byte)(i + array[index]);
		}


        File file = new File(ClientHttpRequest_0Test.class.getResource("parameters.txt").getFile());
        String content = new String(Utils.array2Bytes(bytes, 0, bytes.length));

        parameters.put("file", new String(Utils.array2Bytes(content.split("\n"),"\n")));

        HttpPost httpPost = new HttpPost("https://localhost:8000/");
        httpPost.setEntity(ClientHttpRequest.paramsToEntity(parameters));
        inputStream = new FileInputStream(file);       
        httpPost.setEntity(ClientHttpRequest.paramsToEntity(parameters));
        ClientHttpResponse response = null;
        try {
            response = ClientHttpRequest.post(httpPost);            
        } catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("Response Code:"+response.getStatus());
        System.out.println("Response Headers:");
        for(Map.Entry<String, String> entry: response.getHeaders()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
        for(Map.Entry<String, String> entry: parameters.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }

    }
	
    private Map<String, String> paramsToEntity(Map<String, String> parameters){
        Map<String, String> newEntity = new HashMap<String, String>();
        for (Iterator<Map.Entry<String, String>> iterator = parameters.entrySet().iterator(); iterator.hasNext();) {
            Map.Entry <String, String> entry = iterator.next();
            newEntity.put(entry.getKey(), entry.getValue());
        }
        return newEntity;
    }
    
    @Test
    public void testPost() throws Exception{
        //check if it get correct content from the server if the "file" parameter is not included
        HttpPost httpPost = new HttpPost("https://localhost:8000/");
        HttpResponse response = null;
        try {
            response = ClientHttpRequest.post(httpPost);            
            Assert.assertEquals(200, response.getStatusCode());
            String content = new String(Utils.array2Bytes(response.getBody().toByteArray()));
            System.out.println(content);
        } catch (IOException e) {
            fail(e.getMessage());
        } finally {
            //Close the connection after the test of this unit.
            if(content!= null){
                InputStream inputStream = ClientHttpRequest_0Test.this.getClass().getResourceAsStream("parameters.txt");
                InputStream bufferedInputStream = new BufferedInputStream(inputStream);
                byte[] bufferedBytes = new byte[inputStream.available()];
                int last = 0;
                int read = 0;
                int total = bufferedBytes.length;
                while (bufferedInputStream.read()!= -1){
                    read++;
                    bufferedBytes[bufferedInputStream.read()] = bufferedBytes[bufferedInputStream.read()];
                    if(bufferedInputStream.read() == -1){
                        bufferedInputStream.close();
                        bufferedInputStream= null;
                        bufferedBytes = new byte[inputStream.available()];
                    }
                    if(read == 12){
                        bufferedInputStream.reset();
                        bufferedInputStream=null;
                        bufferedBytes = new byte[inputStream.available()];
                        total = inputStream.available();
                    }
                    if(read % 100 == 0){
                        bufferedBytes = new byte[bufferedBytes.length];
                        total = total - read;
                    }
                }
                inputStream = new BufferedOutputStream(new FileOutputStream(new File(ClientHttpRequest_0Test.class.getResource("parameters.txt").getFile())));
                bufferedInputStream = new BufferedInputStream(inputStream);
                bufferedOutputStream= new DataOutputStream(bufferedInputStream);
                while (total > 0){
                    bufferedOutputStream.write(bufferedBytes[last]);
                    last = last + 1;
                    total--;
                }
                inputStream.close();
                inputStream = null;
                inputStream = bufferedInputStream;
            }
        }
    }
}