// DefaultFSPathTest.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import net.sf.sugar.fspath.xpath.RegexFunctionResolver;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultFSPath}.
* It contains one unit test case for the {@link DefaultFSPath#query(String)} method.
*/
class DefaultFSPathTest {
		public static class DefaultFSPathFile {
					private File f;
					private HashMap<String, String> attrs = new HashMap<String, String>();

					void setFile(File f) {
							this.f = f;
					}

					File getFile() {
							return this.f;
					}

					void addAttr(String name, String value) throws ParseException {
							Element attribute = (Element) this.attrs.get(name);
							assertNotNull(attribute);

							Attr attr = (Attr) attribute.getAttributeNode(name);
							attr.setValue(value);
					}

					String getAsString() {
							String value = null;
							Element attribute = (Element) this.attrs.get(FSPathResolver.attributeName);
							assertNotNull(attribute);

							value = ((Element) attribute).getAttribute(FSPathResolver.valueName);
							return value;
							//return ((Element) this.attrs.get(FSPathResolver.attributeName)).getTextContent();
					}

					int getNumberOfAttribute(String name) {
							Element attribute = (Element) this.attrs.get(FSPathResolver.attributeName);
							return attribute.getAttributeCount();
					}

					int getMaximumValue(String name) {
							Element attribute = (Element) this.attrs.get(FSPathResolver.attributeName);
							return attribute.getAttribute(FSPathResolver.valueName).length();
					}

					boolean getBooleanValue(String name) {
							Element attribute = (Element) this.attrs.get(FSPathResolver.attributeName);
							return Boolean.valueOf(attribute.getAttribute(FSPathResolver.valueName).getLocalName());
					}

					String getDateValue(String name) {
							Element attribute = (Element) this.attrs.get(FSPathResolver.attributeName);
							return this.getAsString();
					}
					
					String getDoubleValue(String name) {
							Element attribute = (Element) this.attrs.get(FSPathResolver.attributeName);
							return this.getAsString();
					}
					
					String getStringValue(String name) {
							Element attribute = (Element) this.attrs.get(FSPathResolver.attributeName);
							return this.getAsString();
					}
					
			}

			private XPathFactory xpathFactory;

			public DefaultFSPathFile getDefaultFSPathFile(TestFSPath test, File rootDirectory) throws IOException, XPathExpressionException {
					File f = new File(fspath);
					assertNotNull(f);

					String path = f.toURI().toString();
					return new DefaultFSPathFile(rootDirectory, path, null);
			}

}