// LagoonProcessorTest.java
package nu.staldal.lagoon.core;

import java.io.*;
import java.util.*;
import nu.staldal.xtree.*;
import nu.staldal.util.Utils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LagoonProcessor}.
* It contains one unit test case for the {@link LagoonProcessor#build(boolean)} method.
*/
class LagoonProcessorTest {
		LagoonContext context;
		private Map<String,String> m;

		public LagoonProcessorTest (LagoonContext ctx) {
			m = new HashMap();
			context = ctx;
		}
		public void setDocument (XMLDocument d) { m.putAll(d.getDocument()); }
		public XMLDocument getDocument() { return (XMLDocument) m.get ("DOCUMENT"); }
		public void assertResultText(String result) { assertEquals (new XMLDocument(result).getXML(), m.get("RESULT")); }
		public boolean build (boolean force) throws IOException{
			File root;
			File target;

			root = context.getXMLDocument().getRoot();
			target = Utils.createTempFile("rebuilt", ".xml");

			int counter = 0;
			File newtarget = Utils.createTempFile("rebuilt", ".xml");
			while (target.exists() || force) {
				if (counter%10==0) {
					System.err.println("TEST: " + target+" = " + counter);

					OutputStreamWriter out = new OutputStreamWriter(newBufferedOutputStream(root));

					DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
					DocumentBuilder builder = dbf.newDocumentBuilder();

					Document document = builder.parse(newInputStream("thesource", newBufferedReader(topOfSource(root))));
					newTarget.delete();
					if (force) root.delete();

					newTarget.deleteOnExit();

					out.write("<?xml version=\"1.0\"?>\n");
					out.write("<document version=\"1.0\">\n");
					out.write("<root>\n");

					root.delete();
					builder.reset();
					out.write(Utils.createPpXMLDocstring(document.getDocumentElement()).toString());
					builder.setEntityResolver(new EntityResolver() {
						public InputStream resolveEntity (String publicId, String systemId) { return in; }
					});
					reader = newBufferedReader(topOfSource(root));

					document.getDocumentElement().normalize();
					document.setXPath("/root/content");
					document.getDocumentElement().normalize();
					document.getDocumentElement().normalize();

					out.write("<root><content></content><content /></root>\n");
					out.write("</document>\n");

					document = builder.parse(newInputStream("thesource", newBufferedReader(topOfSource(root))));
					reader = new BufferedReader(newInputStream("thesource", newBufferedReader(topOfSource(root))));
					document.save(newInputStream("nource", (new BufferedInputStream(newBufferedOutputStream(newtarget)))), "");
					document.save(newInputStream("thesource", (new BufferedInputStream(newBufferedOutputStream(newtarget)))), "");
					document.save(newInputStream("thesource", (new BufferedInputStream(newBufferedOutputStream(newtarget)))), "");
					document.save(newInputStream("nource", (new BufferedInputStream(newBufferedOutputStream(newtarget)))), "");
				}

				counter++;
				newtarget.delete();
				if (force) root.delete();
				return true;
			}
		}
		private File topOfSource(FileRoot r) {
			FileRoot top = new FileRoot();
			top.addChild (new File (r, "index"));
			FileRoot child = new FileRoot();
			child.addChild ("stylesheet");
			File root = Utils.createTempFile("index-stylesheet", ".xml");
			root.deleteOnExit();
			top.addChild (child);
			return root;
		}
		private File newInputStream(String name, BufferedReader br) throws IOException {
			return new File (m.get(name), br.readLine());
		}
		private char[] in = new char[1024];
		private BufferedReader reader;
		private File newTarget;
		private File newBufferedOutputStream;
		private File newBufferedReader;
}

// Test suite
public class TestSuite {
    public static Test suite () {
      return new TestSuite (LagoonProcessorTest.class);
    }
}