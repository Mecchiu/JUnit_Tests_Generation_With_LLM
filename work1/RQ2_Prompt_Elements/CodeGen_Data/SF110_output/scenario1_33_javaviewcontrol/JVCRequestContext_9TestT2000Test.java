// JVCRequestContext_9Test.java
package com.pmdesigns.jvc;

import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JVCRequestContext}.
* It contains one unit test case for the {@link JVCRequestContext#getFlash(String)} method.
*/
class JVCRequestContext_9Test {

    /**
     * Test of {@link JVCRequestContext#getFlash}.
     */ 
    @Test
    public void testGetFlash() throws Exception {
        
        final String fileName = "fileName";

        HttpServletRequest request = createRequest();

        InputStream fileContent = new ServletFileUpload(((ServletExternalContext) request.getExternalContext()).getRequest());
        PrintWriter fileContentWriter = new PrintWriter(new OutputStreamWriter(((ServletExternalContext) request.getExternalContext()).getResponse().getOutputStream()));
        
        fileContentWriter.println("Contents of file:");

        //
        // Ensure this test works.
        //
        String flashValue = request.getParameter("flash");
        assertEquals("Contents of file is not correct.", "Contents of file", flashValue);
        
        String[] fileNames = new String[1];
        fileNames[0] = fileName;
        
        ArrayList<String> flashKeys = new ArrayList<>();
        List<FileItem> uploadItems = new ArrayList<>();
        List<HttpURLConnection> downloads = new ArrayList<>();
        String contentType;
        List <Map<String, Object>> results = new ArrayList<>();
        
        // Create an instance of FileUploader.
        fileUploader = new ServletFileUpload();
   
        // Add an uploader for each of the requested file.
        for(int i=0; i<fileNames.length; i++) {
            fileUploader.addFilenames(fileNames[i]);
            uploadItems.add(new FileItem());
        }

        // Get the file upload objects.  We must get at least one file upload,
        // so the uploader should be non-null.
        assertNotNull("Null file upload.", fileUploader.getFileItemList("fileName"));
        
        // Get the files' content type.
        contentType = fileUploader.getContentType(fileNames[0]);

        for(FileItem content : uploadItems) {
            String fileContentType = content.getField("file_content_type");
            fileContentType.replace(".jar", "");

            // Create a content type object from the file's content type.
            HttpContentType httpContent = new HttpContentType(fileContentType);
            List<ContentDisposition> contentDispositionList = new ArrayList<>();
            
            for(ContentDisposition cd : httpContent.getContentDispositionList()) {
                Collection<String> params = cd.getParameters().get("name");
                assertEquals("One ContentDisposition entry was found.", 2, params.size());
                contentDispositionList.add(new ContentDisposition(params.get(0), cd.getName(), cd.getUpload().getName(), cd.getUpload().getMimeType(), cd.getUpload().getAttachment().getName()));
            }

            fileContentContentType = httpContent.getContentContentType();

            if(httpContent.isMultipart() && content.isFormField() && "fileName".equalsIgnoreCase(content.getFieldName())) {
                fileName = content.getField("files");
                fileSize = Long.parseLong(httpContent.getContentType().substring(11));
            } else if(!"fileName".equalsIgnoreCase(fileName)) {
                if(!fileContentType.equalsIgnoreCase(HttpContentType.APPLICATION_OCTET_STREAM)) {
                    fileContentContentType = "";
                }
            }

            fileContentWriter.println("Content of file:");

            //
            // Ensure this test works.
            //
            if(fileContentType.equalsIgnoreCase("jar")
                    || fileContentType.equalsIgnoreCase("java.jar")
                    || fileContentType.equalsIgnoreCase("class")) {
                if (content.isFormField() && fileName.equalsIgnoreCase("")) {
                    fileName = "unnamedFile";
                }
            }
            try {
                BufferedInputStream bis = new BufferedInputStream(fileContent.getInputStream());
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(fileUrlToSaveTo)));            
                BufferedReader br = new BufferedReader(new InputStreamReader(bis));
                BufferedWriter bw = new BufferedWriter(new FileWriter(new File(fileUrlToSaveTo)));            
                
                PrintWriter writer = new PrintWriter(bw);
                // Create the input stream for the file content
                int bytes = fileContent.read();
                while(bytes!= -1) {
                    bw.write(bytes);
                    if (bytes == '\n') {
                        bw.write('\r');
                    }
                    bytes = fileContent.read();
                }
                
                // Parse JSON
                Object fileObj = JsonUtils.jsonToObj(br.readLine());

                // Parse the content content type.
                String contentContentType = content.getContentType();
                Collection<String> values = fileObj instanceof Collection? ((Collection<? extends Map<String, Object>>) fileObj)
                       .getCollectionByParam(HttpContentType.CONTENT_TYPE_PROPERTY): mapToCollection((Map<String, Object>) fileObj).getCollectionByParam(HttpContentType.CONTENT_TYPE_PROPERTY);

                Iterator<String> valuesIterator = values.iterator();

                Object valueStr;

                if(mapToCollection(collectionOf(valuesIterator)).containsKey(contentContentType)) {
                    valueStr = mapToCollection(collectionOf(valuesIterator))
                           .get(contentContentType);
                }

                else {
                    valueStr = mapToCollection(collectionOf(valuesIterator)).get(contentContentType);
                }

                // Write the content
                if(!content.isFormField()) {
                    br.close();
                    bw.close();
                    writer.close();
                }
                
                // Create the download object
                HttpURLConnection download = (HttpURLConnection)request.getConnection();
                download.setInstanceFollowRedirects((boolean)request.getAttribute(RequestDispatcher.INCLUDE_REDIRECT_AS_PROPERTY));
                download.setRequestContext(new RequestContext(request));
                downloads.add(download);
                
                // Ensure the content length is at least 0
                FileUploadItem item = (FileUploadItem)fileUploader.getFileItem(fileUploader.getFileItem(fileName, content))[0];
                download.setContentLength(