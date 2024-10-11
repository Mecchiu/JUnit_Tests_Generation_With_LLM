// XmlIO_0Test.java
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
* It contains one unit test case for the {@link XmlIO#load(InputStream)} method.
*/
class XmlIO_0Test {
 
    /** Instantly logging the root XML element name of this object. */
  protected static final Logger LOG = Logger.getLogger(XmlIO_0Test.class.getName());
    
    /**
     * Retrieve from the XML stream the root XML element name of this object. 
     */
    String rootElementName() {
      return (currentElement.getElementName().toString());
    }
    
    /**
     * Retrieve the XML root XML Element of this object. 
     */
    XmlElement rootElement() {
    return (currentElement);
    }
    
    /**
     * Retrieve the root XML Element of this object. 
     */
    XmlElement rootElement(XmlElement xmlElement) {
    return (currentElement);
    }
    
    /**
     * Create the default root XML Element name of this object - "" - 
     */
    String rootElementName_(XmlElement xmlElement) {
      return (xmlElement.toString());
    }
    
    /**
     * Create the default root XML Element name of this object.
     */
    XmlElement rootElement(String rootElementName) {
  return (currentElement);
    }

        /** @test {@link XmlIO#load(InputStream)} with empty root XML Element name. */
    @Test
    public void createEmptyRootElementWithEmptyName(@SuppressWarnings("unused") String name) throws IOException, SAXException {
                                                          throw new IOException(null);
    }
        /** @test {@link XmlIO#load(String)} with an empty root XML Element name. */
    @Test
    public void createEmptyRootElementWithEmptyName(@SuppressWarnings("unused") String name) throws IOException, SAXException {
                              throw new IOException(null);
    }
  
    private String writeLine(String line) {
    writer.write(line);
    writer.newLine();
    return (line);
    }
    
    /** @test {@link XmlIO#write(String)} the empty root XML Element name and the result of writing. */
    @Test
    public void writeEmptyRootElementTest() throws IOException, SAXException {
    writer.write(rootElementName());
    writer.newLine();
    assertEquals(writer.toString(), writer.toString());
    }
  
    /** @test {@link XmlIO#write(String)} the empty root XML Element name and the result of writing. */
    @Test
    public void writeEmptyRootElementTest_withEmptyName() throws IOException, SAXException {
    writer.write(null);
    writer.newLine();
    assertEquals(writer.toString(), writer.toString());
    }
  
    /** @test {@link XmlIO#write(String)} the empty root XML Element name and the result of writing. */
    @Test
    public void writeEmptyRootElementTest_withNonEmptyName() throws IOException, SAXException {
    writer.write(null);
    writer.newLine();
    assertEquals(writer.toString(), writer.toString());
    }
    
   
    private String close(String data) throws SAXException, IOException {
    writer.close();
    output.close();
    return (data);
    }

    private void outputTextFile(String fpath) throws IOException {
        FileOutputStream file;
        if (fpath.contains("__")) {
            file = new FileOutputStream(fpath);
        } else {
            file = new FileOutputStream(fpath, false);
        }
        output.append(this.writeLine(fpath));
        output.newLine();
        writer.setEncoding(null);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(file));
        out.write(close(fpath));
        out.flush();
        out.close();
    }

  private OutputStream writer;
    private Writer output;
    private FileOutputStream outputFile;

    private String xml(String element) {
      String result;
      if (element.contains("elementName=")) {
      result = (rootElementName());
      } else {
        result = element;
      }
      
      