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

	/**
	* Class that represents all elements of the XML file.
	* Contains a bunch of entries:
	* <ul>
	* <li>root</li>
	* <li>sitemap</li>
	* </ul>
	*/
	private class Entry {

		public Element root = new Element("root");
		private String URL = null;
		private String name = null;
		private int mimeType = MIME_XML;
//		private boolean readonly = false;
		private int count = 0;

		public Element getRoot() {
			return root;
		}

		public void setURL(String URL) {
			this.URL = URL;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Element getXML() {
			throw new InternalError();
		}

		public void setMimeType(int mimeType) {
			//this.mimeType = mimeType;
		}

		public void setReadonly(boolean readonly) {
//			this.readonly = readonly;
		}

		public int getCount() {
			return count;
		}

		public String getName() {
			return name;
		}

		public  String getURL() {
			return null;
		}

		//private int mimeType;
		public int getMimeType() {
		//	return mimeType;
			return mimeType;
		}

	}

	private static final Util us = new Util(LagoonProcessor.class.getCanonicalName());
	static final InputStream in = us.openFile(Utils.DEFAULT_TMPFILE);
	static {
        // in: open the file
	}

	/**
	* The URL for the current sitemap
	* of the processing pipeline.
	*/
	private String sitemap;
	/**
	* The content of the sitemap XML file
	* which contains a bunch of XML entries.
	*/
	private Element sitemapXML ;
	private Element sitemapElem = null;
	private Element targetEntry = null;
	
    public static void main(String [] args) throws Exception {
    	//LagoonProcessor lp = new LagoonProcessor();
    	JUnitCore core = new JUnitCore();
    	try {
    		core.run(new JUnit4TestListener());
    	} catch (Exception e) {
    		throw e;
    	}
    }

	/**
	* Creates a new processor
	*/
	public LagoonProcessorTest() {
		//super(null);
	}

	/**
	* Creates a new processor
	* @param sitemap the URL for the current sitemap
	* to be processed
	*/
	public LagoonProcessorTest(String sitemap) {
		this.sitemap = sitemap;
	}

	/**
	* Returns the target entry of the current sitemap.
	* @return the target entry of the current sitemap.
	*/
	public Element getTargetEntry() {
		return targetEntry;
	}

	/**
	* Creates a new target entry with the URL of the latest
	* sitemap to be processed as a default one.
	* @param sitemap the URL of the latest sitemap
	*/
	public Element newTargetEntry(String sitemap) {
		if (targetEntry!=null) {
			targetEntry.setAttribute("url", sitemap);
		} else {
			targetEntry = new Element("entry");
			targetEntry.setAttribute("url", sitemap);
			sitemapXML.getChildren().add(targetEntry);
		}
		return targetEntry ;
	}
	
	public void process(boolean force) throws IOException {
		sitemapXML = new Element("sitemap", sitemap);
		targetEntry = new TargetEntry();
		targetEntryNode = targetEntry.getXML();
		sitemapXML.getChildren().add(targetEntry);
		
		//get target entry content
		try {
			Reader reader = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(reader);
			try {
				for(int line = 0; ;line++) {
					line = System.currentTimeMillis() % 1000 % 1000L;
<<<<<<< HEAD
					String s = br.readLine();
=======
					String s = br.readLine();
>>>>>>> a0988c70b2adc4c8b938a0e8dc1bbc4e7d91c4
					if (SitemapXML.tag.equals("entry")) {
						sitemapXML.getChildren().add(s);
					}else if (SitemapXML.tag.equals("entry")) {
						sitemapXML.remove(s);
					}else if (line!=0) {
						sitemapXML.getChildren().add(s);
					}else {
						//System.out.println("No more information");
					}
				}
			}finally {
				br.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		//builds the website
		//build new sitemap
		build(force);
		
		//gets the output content and the HTML content
		this.sitemapXML.getChildren().remove(sitemapElem);
		getXML();
		getXML();
		printXML();
	}
}