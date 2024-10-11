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
		
     /**
     * Test method for
     * {@link com.allenstudio.ir.util.XmlIO#load(URL)}
     *. It starts testing with an input stream but it writes the output
     * to a file.
     */
    @Test
    public void loadFile() {
        try {
            InputStream inputStream =
		   new XmlIO().load("file:///home/sad/workspace/XmlIO/TestFiles/simpleTestXML");
	    Writer writer = new BufferedWriter(new OutputStreamWriter(
			    new FileOutputStream("/home/sad/workspace/XmlIO/file/output.txt"), "UTF-8"));
            while(true){
                writer.write("This is a test string");
                writer.flush();
            }
        } catch(IOException ioe){
          IllegalArgumentException ilae = new IllegalArgumentException("could not write to specified location");
          String message = "IllegalArgumentException has been thrown: "	+ilae.getMessage();
          JOptionPane.showMessageDialog(null, message);
          System.exit(1);
        } catch(Exception e){
            // Do nothing
        }
    }
}