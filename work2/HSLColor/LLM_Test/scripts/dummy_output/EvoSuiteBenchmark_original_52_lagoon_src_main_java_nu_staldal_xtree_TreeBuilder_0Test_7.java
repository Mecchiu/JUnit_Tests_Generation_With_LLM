// TreeBuilder_0Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TreeBuilder}.
* It contains one unit test case for the {@link TreeBuilder#fileToInputSource(File)} method.
*/
class TreeBuilder_0Test {
		static Vector<String> data;
		static List<String> dataLists;
		static DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		static {
			factory.setNamespaceAware(true);
			factory.setValidating(false);
		}
		static final String XTreeImpl_0_XMLString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
	            + "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 \"-//W3C//DTD XML \"" 
	            + XTreeImpl_0_XMLString 
	            + "\uffff" 
	            + ">" 
	            + "<html> <body> <p>TestText 1 </p></body></html>";
	static Map<String, Vector<String>> map 
	            = new TreeMap();
	protected static final int NUMBER_OF_NUMBERS = 7;
	protected static String path;
    protected static String testSource;
	
	static {
		Vector<String> numbers = new Vector<String>(NUMBER_OF_NUMBERS);
		for (int i=0; i < NUMBER_OF_NUMBERS; i++) {
			numbers.add("  n" + i);
		}
		data = numbers;
    dataLists=data;
    TreeBuilder_0Test.path="/Users/philipp/GitHub/nodexternaldist/test-treebuilder-0";
    }

    final static String[] EMPTY = new String[0];
  
	@Test
	public void testOne()
	{
		try {
			URL pathUrl = getClass().getResource(path);
			File file = new File(pathUrl.toURI());
			testSource = fileToInputSource(file);
			System.out.println("Successfully read from: " + pathUrl);
		} catch (IOException ioe) {
			ioe.printStackTrace();
            System.exit(-1);
		}
	}

	/**
	 * Returns the document, containing <p> elements.
	 *
	 * @return the parsed document
	 * @throws ParserConfigurationException if some parser configuration error occurred
	 * @throws SAXException if some SAX parsing error occurred
	 * @throws IOException if some I/O error occurred
	 */
    public Document getDocument() throws ParserConfigurationException, SAXException, IOException {
        Document result = null ;
        DocumentBuilder builder = factory.newDocumentBuilder();
        InputSource is = fileToInputSource(new File(root, testSource));
        result = builder.parse(is);
        return result;
    }

    @Test
	public void testTwo() throws IOException
	{
        Document doc = getDocument();
        doc.getDocumentElement().normalize();
        TreeBuilder tb = new TreeBuilder();
        Vector<String> strings = new Vector();
        Element root = doc.getDocumentElement();
        String tag = root.getNodeName();
        tb.addNodes(root, Tag.ELEMENT, strings, tb.TAG_TEXT, tb.TAG_ELEMENT);
        tb.startNode(tb.ELEMENT, tag, tb.TAG_TEXT);
        tb.startNode(tb.ELEMENT, tag, tb.TAG_ELEMENT);
        
        
      /*   
    String line = null;
    while ((line = reader.readLine())!= null) {
    	System.out.println(line);

    }*/

        String[] data = dataLists.toArray(EMPTY);

        // test empty strings
        for (int i = 0; i < NUMBER_OF_NUMBERS; i++) {
        	int x = (data.length-1) / NUMBER_OF_NUMBERS * i;
        	for (int j = 0; j < NUMBER_OF_NUMBERS; j++) {
        		int y = x + (j % (NUMBER_OF_NUMBERS - 1));
        		Vector<String> list = map.get(data[y]);
        		if (list == null) {
        			list = new Vector();
        			map.put(data[y],list);
		  	}
        		list.add(data[y+1]);
        	}
        }


        /*
        for (int i = 0; i < NUMBER_OF_NUMBERS; i++){
            System.out.println(lines[i]);
        }
        System.out.println("******************");
        String[] list = map.get(data[0]);
        if (list!= null){
        	int lastIndex = list.lastIndexOf(";");
        	int rest = list.length - 1 - lastIndex;
        	System.out.print(list[rest]);
        }
        */
      
        // test one text node per string
        tb.startNode(tb.TEXT, data[0], tb.TAG_TEXT, tb.TAG_ELEMENT, tb.TAG_TEXT);
        for (int i = 0; i < NUMBER_OF_NUMBERS; i++) {
        	int x = (data.length-1) / NUMBER_OF_NUMBERS * i;
        	for (int j = 0; j < NUMBER_OF_NUMBERS; j++) {
        		int y = x + (j % (NUMBER_OF_NUMBERS - 1));
        		Vector<String> list = map.get(data[j]);
        		if (list == null) {
        			list = new Vector();
        			map.put(data[j],list);
		  	}
        		list.add(data[j+1]);
        	}
        }
        tb.endNode();

        Vector<String> resultLists = new Vector<String>();
        tb.getList(tb.TEXT, resultLists, tb.TAG_TEXT);
     
        tb.startNode(tb.TEXT, data[0], tb.TAG_TEXT);
        for (int i = 0; i < NUMBER_OF_NUMBERS; i++) {
            int x = (data.length-1) / NUMBER_OF_NUMBERS * i;
            for (int j = 0; j < NUMBER_OF_NUMBERS; j++) {
            	int y = x + (j % (NUMBER_OF_NUMBERS - 1));
            	Vector<String> list = map.get(data[y]);
            	if (list == null) {
            		list = new Vector();
            		map.put(data[y],list);
		  	}
            	list.add(data[j+1]);
            }
        }
        tb.endNode();
        tb.endNode();
        
        
       
        // test both strings
        tb.startNode(tb.TEXT, data[0], tb.TAG_TEXT);
}
}