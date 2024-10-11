// SequentialTreeBuilderTest.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SequentialTreeBuilder}.
* It contains one unit test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
*/
class SequentialTreeBuilderTest {
		
	
	/** Output file path where the XML sequence is generated. */
	private String outputPath;

    public SequentialTreeBuilderTest(String outputPath) {
        this.outputPath = outputPath;
    }

	/**
	 * Checks that the content is written correctly to the file.
	 * @param tree the tree containing the XML sequence
	 * @throws IOException
	 */
	private void buildXMLContent(Element content) throws IOException{
		System.out.println("Test - parsing XML");
		File file = File.createTempFile("SequentialXMLBuilderTest-", ".xml");

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();

		InputSource is = new InputSource(new FileInputStream(file));
		Document doc = db.parse(is);

		XMLFragmentFragmentHandler fragmentHandler = new XMLFragmentFragmentHandler(content, doc);

		SequentialTreeBuilder.parseXMLSequential(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"), true, fragmentHandler);
	}

	/**
	 * Checks the parsing sequence.  It uses the XML FragmentFragmentHandler to parse the XML sequence,
	 * without having to know anything about the XML source.  It uses the content, which is already parsed into the sequence,
	 * to compare its sequence to the sequence previously generated.
	 * @throws SAXException
	 * @throws IOException
	 */
	@Test
	public void testParse1() throws SAXException, IOException{
		buildXMLContent(root);
		String xmlData = outFile.toString();

		File file = new File(outputPath, "2.xml");
		FileOutputStream fo = new FileOutputStream(file);
		fo.write(xmlData.getBytes("UTF-8"));
		fo.close();

		System.out.println("Test - content generated from " + file.getName());
		File file2 = new File(outputPath, "3.xml");
		FileInputStream fis = new FileInputStream(file2);
		BufferedInputStream b = new BufferedInputStream(fis);
		String xml2 = "";
		java.util.Scanner s = new java.util.Scanner(b);
		while(s.hasNext()){
			xml2 += s.next();
		}
		b.close();

		assertEquals(xmlData, xml2);
	}
	
	/**
	 * Checks the parsing sequence.  It uses the XML FragmentFragmentHandler to parse the XML sequence,
	 * without having to know anything about the XML source.  It uses the root element, which contains the fragments already parsed.
	 * @throws SAXException
	 * @throws IOException
	 */
	@Test
	public void testParseReverse() throws SAXException, IOException{
		System.out.println("Starting testParseReverse");
//		buildXMLContent(root);
//
//		String xmlData = outFile.toString();
//		File file = new File(outputPath, "4.xml");
//		FileOutputStream fo = new FileOutputStream(file);
//		fo.append(xmlData);
//		fo.close();

		File file2 = new File(outputPath, "5.xml");
		FileInputStream fis = new FileInputStream(file2);
		BufferedInputStream b = new BufferedInputStream(fis);
		String xml2 = "";
		java.util.Scanner s = new java.util.Scanner(b);
		while(s.hasNext()){
			xml2 += s.next();
		}
		b.close();

//		System.out.println("Test - content generated from " + file.getName());
//		File file3 = new File(outputPath, "6.xml");
//		FileOutputStream fo2 = new FileOutputStream(file3);
//		fo2.append(xml2);
//		fo2.close();

//		System.out.println("Test - content generated from " + file3.getName());
		File file3 = new File(outputPath, "7.xml");
		FileInputStream fis2 = new FileInputStream(file3);
		BufferedInputStream b2 = new BufferedInputStream(fis2);
		String xml3 = "";
		java.util.Scanner s = new java.util.Scanner(b2);
		while(s.hasNext()){
			xml3 += s.next();
		}
		b2.close();

		System.out.println("Test - sequence generated from " + file2.getName());
		assertEquals(xmlData, xml2 + html(xml3));
	}

	private String html(String html) {
	        StringBuffer sb = new StringBuffer();
	        sb.append("<p>");
	        sb.append(html);
	        sb.append("</p>");
	        return sb.toString();
	}
	
}