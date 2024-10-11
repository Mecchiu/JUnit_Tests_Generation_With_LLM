// XmlIO_1Test.java
package com.allenstudio.ir.util;

import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlIO}.
* It contains one unit test case for the {@link XmlIO#load(URL)} method.
*/
class XmlIO_1Test {
		
//	@Test
//	public void testLoadStream() throws IOException{
//		URL url = this.getClass().getResource("/Iri4-stream");
//		InputStream is = HttpURLConnection.openStream(url);
//		Reader reader = new InputStreamReader(is);
//		StringBuilder sb = new StringBuilder();
//		int c;
//		while ((c=reader.read())!=-1){
//			sb.append((char) c);
//		}
//		is.close();
//		InputStream is1 = new BufferedInputStream(this.getClass().getResourceAsStream("/Iri4-stream"));
//		Reader reader1 = new InputStreamReader(is1);
//		System.out.println(new String(sb.toString().getBytes()));
//		Reader reader2 = new BufferedReader(new StringReader(sb.toString()));
//		System.out.println(new String((char) reader.read()));
//	}
    
    
//    @Test
//    /**
//     * This test test cases are used for {@link XmlIO#load(URL)} for an existing XML file.
//     */
//    public void testLoad() {
//		try {
//		   InputStream is = this.getClass().getResourceAsStream("/Iri4-marshall");
//              XMLReader xmler =  new XMLReader();    
//              SAXParserFactory factory = SAXParserFactory.newInstance();
//              factory.setValidating(false);
//              SAXParser parser = factory.newSAXParser();
//              XMLReader xmler1 = parser.getXMLReader();
//              
//              List list = new Vector();
//              char[] chars = "Hello, World!".toCharArray();        
//              XMLSerializer serializer= new XMLSerializer (new OutputStreamWriter(new FileOutputStream("XML2.dat")));
//              XMLReaderHandler handler = new XMLReaderHandler(new DefaultHandler(serializer, chars), new DefaultHandler(){
//			    public List getData() throws SAXException {
//			        return list;
//			    }
//			});
//	            
////                  
//              //System.out.println("Loading file\n"+file.getName());
//              char[] chars = "Hello, World!";
//              XMLReaderHandler handler1= new XMLReaderHandler(new DefaultHandler(chars, chars), new DefaultHandler(){
//					
//			 		public List getData() throws SAXException {
//			 			return list;
//			 		}
//			  
//			  //	    });
//              list = new Vector();
//              list = handler.getData();
//              System.out.println("\n"+new String(chars)+"\n");
//              handler.startElement(null, null, "string1", new Attributes());
//              handler.startElement(null, null, "string1", new Attributes());
//              String[] str = { "a", "b" };
//              list.addAll( Arrays.asList(str) );
//              handler.endElement(null,null,null);
//              System.out.println(list);
//              
//              //System.out.println(handler.getData().iterator());
//              xmlWriter.putNamespace("xlml", new Namespace("", "xmlns:xlml"));
//              
//              list = new Vector();
//              list = handler.getData();
//              System.out.println("\n"+new String(chars)+"\n");
//              handler.endElement(null,null,null);
//              System.out.println(list);
//              handler.endElement(null,null,null);
//              System.out.println(handler.getData()::iterator.next().toString());
//              list = handler.getData();
//              System.out.println("\n"+new String(chars)+"\n");
//              System.out.println(list);
//              handler.endElement(null,null,null);
//              try {
//             		System.out.println("loading end-part");
//                 list.add(new String[]{ "a" });
//                 System.out.println("loading end part"+list.size());
//                 list.add(new String[]{ "b" });
//             }
//             catch (Exception e1) {
//             	System.out.println("*** Test Exception, try with an XML parser");
//             }
//              try {
//                 Thread.sleep(2000);    
//                 System.out.println(list.iterator().next().toString());
//              }
//              catch (InterruptedException ex) {
//                // TODO Auto-generated catch block
//                ex.printStackTrace();
//              }
//              Thread.sleep(2000);
//           }
//           catch (Exception e1) {
//             System.out.println("*** Test Exception\n"+e1);
//           }
//	    }
//
//	}	
}