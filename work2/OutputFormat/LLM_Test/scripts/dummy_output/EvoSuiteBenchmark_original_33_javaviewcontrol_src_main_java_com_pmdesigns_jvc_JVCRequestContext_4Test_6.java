
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
class JVCRequestContext_4Test {
  private RequestHandler req = new RequestHandler();
     private ServletEnvironment env = new ServletEnvironment("jm");
     private Log log = req.getLogger();
     private static final long serialVersionUID = -Long.parseLong("6624377079551905824");
     JVCRequestContext_4Test() {};
     void testGetSessionAttr() throws IOException, ServletException {
       assertNotNull(req.getSessionAttr("javax.servlet.xpowered.request.path"));
       assertNotNull(req.getSessionAttr("javax.servlet.xpowered.response.path"));
       assertEquals(req.getSessionAttr("javax.servlet.xpowered.request.path"), "/testGetSessionAttr");
       assertEquals(req.getSessionAttr("javax.servlet.xpowered.response.path"), "/testGetSessionAttr");
       Map<String, Object> flash = req.getSessionAttr("flash");
       assertNotNull(flash);
       ArrayList<String> slist = new ArrayList<String>();
       Iterator<String> keys = flash.keySet().iterator();
       while (keys.hasNext()) {
         String key = keys.next();
         ArrayList<String> value = (ArrayList<?>)flash.get(key);
         ArrayList<String> rvalue = new ArrayList<String>();
         Iterator<String> values = value.iterator();
         while (values.hasNext()) {
           rvalue.add(values.next());
         }
         slist.addAll(value);
       }
       assertEquals(slist.size(), 2);
     }
        @Test
     void testGetSessionAttrNames() throws IOException, ServletException {
       String sessionAttr = "/javax.servlet.xpowered.request.path";
       req.setSessionAttr(sessionAttr, "/testGetSessionAttr");
       Map<String,Object> flash = req.getSessionAttrNames().values();
       assertNotNull(flash);
       ArrayList<String> slist = new ArrayList<String>();
       Iterator<String> keys = flash.keySet().iterator();
       while (keys.hasNext()) {
         String key = keys.next();
         ArrayList<String> value = (ArrayList<?>)flash.get(key);
         ArrayList<String> rvalue = new ArrayList<String>();
         Iterator<String> values = value.iterator();
         while (values.hasNext()) {
           rvalue.add(values.next());
         }
         slist.addAll(value);
       }
       assertEquals(slist.size(), 2);
     }
}