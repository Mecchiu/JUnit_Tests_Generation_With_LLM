// TreeBuilder_1Test.java
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
* It contains one unit test case for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
*/
class TreeBuilder_1Test {
private final Element input = new Element("test");
		{ input.addContent(new Text("Hello World!")); }

//		System.out.println(input.toString("UTF-8"));
		ArrayList<TreeBuilder_1Test_Item> testItems;
		/**
		 * Creates a new TreeBuilder_1Test.
		 */
		
		private Class[] types;
        private String[][] namespaces;
        private String uri;
        private String systemId;
	private String[] urls;

	/**
	 * Constructor of this class.
	 */
    TreeBuilder_1Test(Class[] types, String[][] uri, String uri2, String systemId, String urls) {
	//this.types = types;
		this.types = new Class[]{types[1],"*"};
		this.systemId = systemId;
		this.namespaces = uri2.split("\\|");
	// this.systemId = systemId;
        this.uri = uri[0][0];
		if (uri.length == 2) {
			this.urls = uri[0][1].split("+");
		}
        else {
            this.urls = new String[0];
        }
	System.out.println(this.systemId+":\t"+this.uri);
        System.out.println(this.systemId+":\t"+this.namespaces);
        System.out.println(this.systemId+":\t"+this.urls);
        if (this.uri.compareTo(this.systemId + ".xsd") == 0) {
//            ArrayList<Element> el = new ArrayList<Element>();
//            el.add(input);
//            return new TreeBuilder(TreeBuilder.class, el.toArray(new TreeBuilder_1Test_Item[0]), true);
        }
	try {

	XMLGregorianCalendar cal = XMLGregorianCalendar.parse(systemId + ".xsd");

	System.out.println(uri[0].substring(uri[0].lastIndexOf(".") + 1));
	//assert (cal.getTime().compareTo(System.currentTimeMillis())<0);
	System.out.println(cal);
	cal.normalize();
	cal.setTimeZone(TimeZone.getDefault());
		cal.setTime(cal);
		//cal.setOffset(11400, -1400);
/*
        int[] offs = cal.get(XMLGregorianCalendar.ZONE_OFFSET);
        System.out.println(offs);
        offs = cal.get(XMLGregorianCalendar.DST_OFFSET);
        System.out.println(offs);
        int year = cal.get(XMLGregorianCalendar.YEAR);
        System.out.println(year);
        int woy = cal.get(XMLGregorianCalendar.WEEK_OF_YEAR);
        System.out.println(woy);
        long months = cal.get(XMLGregorianCalendar.MONTH) + 1 - 4 - cal.get(XMLGregorianCalendar.DATE)
                            + 6;
        System.out.println(months);
        long weeks = cal.getDateTime().getYear() -
                            cal.getTime().getYear() + 14 - cal.getDate().getMonth() +
                            cal.getDate().getDate() - 1 + (2 * cal.getTime().getDayOfWeek()) - cal.getTime().getDay() + 7 +
                            cal.getTime().getSecond() + cal.getHour() + cal.getMinute() + cal.getSecond();
        System.out.println(weeks);
        System.out.println(weeks % 7);
        int hrs = cal.get(XMLGregorianCalendar.HOUR_OF_DAY) % 12;
        int min = cal.get(XMLGregorianCalendar.MINUTE);
        System.out.println(hrs + ":" + min);
        System.out.println(hrs % 12 + ":" + min);
        System.out.println(hrs % 12 % 1 + ":" + min);
        System.out.println(hrs % (12 * 5) + ":" + min);*/
	} catch (Throwable e) {
	        System.out.printf("Error\n%s%n", e.toString());
        System.exit(0);
	}
    }

	private static class TreeBuilder_1Test_Item {
        public TreeBuilder_1Test_Item(final Node node) {
            this.node = node;
        }
  //	public void setSystemId(String systemId) {
  //	System.out.print("systemId=\t\"");
  //	System.out.println(systemId);
  //	systemId = systemId.replaceAll("\\s", " ");
  //	try {
  //	this.systemId = URL.decode(systemId);
  //	} catch (UnsupportedEncodingException e) {
  //	}
  //	this.systemId = systemId;
  //}

        private Node node;
        private String systemId;
        
    void setSystemId(String systemId) {
        this.systemId = systemId;
    }
    Node getNode() {
        return node;
    }
    String getSystemId() {
        return systemId;
    }
}
    
}
