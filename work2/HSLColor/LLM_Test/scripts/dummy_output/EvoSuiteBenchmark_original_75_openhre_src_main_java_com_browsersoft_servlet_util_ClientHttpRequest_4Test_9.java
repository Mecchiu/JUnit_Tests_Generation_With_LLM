// ClientHttpRequest_4Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
*/
class ClientHttpRequest_4Test {
		
	/** Tests that if an inputstream was set, the outputstream will have the same size */
	@Test
	void testInputStreamSize(){
        String testcase = "";
		int maxSize = 0;
        String fileName = "testfile";
		String fileContent = "testcontent";
		int fileSize = 0;
        String fileName2 = "";
		int maxSize2 = 0;
        String fileContent2 = "";
		String tmpUrl = null;
        String urlPath = "";
		String urlPathArgs = "";
        int maxSize3 = 0;
        int outputLimitTest = FileUpload_1.DEFAULT_MAX_SIZE_FILE;
        
        try{
            int urlParameterIndex = 0;
            String[] urlPathArgsArray = null;
            if(urlPathArgs!= null){
                urlPathArgsArray = urlPathArgs.split(";");
            }
            try{
                int urlParameterCount = urlPathArgsArray.length;
                for (int i = 0; i < urlParameterCount; i ++){
                    urlParameterIndex = i;
                }
			
				tmpUrl = urlPathArgsArray[urlParameterIndex];
				if(! "null".equals(tmpUrl)){
					fileName2 = tmpUrl;
					urlPath = urlPathArgsArray[urlParameterIndex];
				}
			}catch (Exception e){
			}
        }catch(Exception e){
		}
        
		try{
            int fileParameterIndex = 0;
            String[] filePathArgsArray = null;
            if(filePath!= null){
                filePathArgsArray = filePath.split(";");
            }
            try{
                int fileParameterCount = filePathArgsArray.length;
                for (int i = 0; i < fileParameterCount; i ++){
                    fileParameterIndex = i;
                }
			
				fileSize = Integer.parseInt(filePathArgsArray[fileParameterIndex]);
				maxSize3 = Integer.parseInt(filePathArgsArray[fileParameterIndex+1]);
			}catch (Exception e){ }
        }catch(Exception e){
		}
		
		
        ClientHttpRequest.clearClientHttpRequest();
	
		try{
			int count = 0;
            int maxSzReq = FileUpload_1.DEFAULT_MAX_SIZE_FILE;
            int outputLimitReq = FileUpload_1.DEFAULT_MAX_SIZE_FILE_RANDOM;
            int maxSzReqReq = FileUpload_1.DEFAULT_MAX_SIZE_FILE_RANDOM;
            int outputLimitReq2 = FileUpload_1.DEFAULT_MAX_SIZE_FILE;
            int maxSzReqReq2 = FileUpload_1.DEFAULT_MAX_SIZE_FILE_RANDOM;
            String[] fileNameArgs2 = null;
            String[] urlPathArgs2 = null;
            String[] fileNameArgs2Args = null;
            String[] urlPathArgs2Args = null;
            String[] fileNameArgs2All = null;
            String[] urlPathArgs2All = null;
            String[] fileNameArgs2AllArgs = null;
            String[] urlPathArgs2AllArgs = null;
            OutputStream streamReq = null;
            OutputStream streamReq2 = null;
            OutputStream streamReq3 = null;
            InputStream iststreamReq = null;
            InputStream iststreamReq2 = null;
            InputStream iststreamReq3 = null;
            
            if(fileName!= null){
                fileNameArgs2 = new String[]{fileName};
                fileNameArgs2Req = new String[]{fileName};
            }else{
                fileNameArgs2 = new String[]{fileName2};
                fileNameArgs2Req = new String[]{fileName2};
            }
			
			if(urlPath!= null){
				urlPathArgs2 = new String[]{urlPath};
				urlPathArgs2Req = new String[]{urlPath};
			}else{
				urlPathArgs2 = new String[]{urlPath2};
				urlPathArgs2Req = new String[]{urlPath2};
			}
            if(inputLimit > 0){
			
				maxSzReqReq = inputLimit;
				outputLimitReq = inputLimit;
				outputLimitReq2 = inputLimit;
				if (fileName!= null){
				  fileNameArgs2Args = new String[]{fileName, fileSize};
				}else{
				  fileNameArgs2Args = new String[]{fileName2, fileSize};
				}
			}else if(fileName!= null){
				fileNameArgs2Args = new String[]{fileName};
				fileNameArgs2Req = new String[]{fileName};
			}else{
				fileNameArgs2Args = new String[]{fileName2};
				fileNameArgs2Req = new String[]{fileName2};
			}
			
			
            String[] istreamArgs = new String[outputLimit + 1];
			istreamArgs = new String[]{"test.txt"};
			istreamArgsAll = new String[]{};
			count = 1;
        }catch(Exception e){}
		
		ClientHttpRequest.setConnectionParams(maxSize2,fileSize,false,new HashMap<String,String>());
		
        FileInputStream istreamReq = null;
        FileInputStream istreamReq2 = null;
        
        switch(outputLimitReq){
            case FileUpload_1.OUTPUT_SIZE_MULTILINE :
                istreamReq = new FileInputStream(fileName);
                istreamReq2 = new FileInputStream("test.txt");
                break;
            case FileUpload_1.OUTPUT_SIZE_MAXNONE :
            default:
                if(fileName!= null){
                    istreamReq = new FileInputStream(fileName);
                }else{ 
                    istreamReq = new FileInputStream("test.txt");
                }
                istreamReq2 = new FileInputStream("test.txt");
        }

}
}