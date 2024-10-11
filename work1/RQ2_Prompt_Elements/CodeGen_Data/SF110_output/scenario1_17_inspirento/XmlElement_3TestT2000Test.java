// XmlElement_3Test.java
package com.allenstudio.ir.util;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlElement}.
* It contains one unit test case for the {@link XmlElement#addSubElement(String, String)} method.
*/
class XmlElement_3Test {
private XmlElement_1Test testCase1;
		private Hashtable table;

		public void initTarekPasap() throws Exception {
			// create table for storing attribute values:
			table = new Hashtable();
			// attributes:
			table.put("id","test1");
			table.put("data","data1");
			// elements:
			testCase1 = new XmlElement_1Test();
			testCase1.setData("data1");
			testCase1.addSubElement("a", "a" );
			testCase1.addSubElement("b", "b" );
		}

		@Test
		public void testXmlElementElementReflection() throws Exception {
				testCase1.run();
		}

		protected class XmlElement_1Test extends Observable {
				public void run() throws Exception {
					this.unsubscribe();

					new Vector().removeAllElements();
                    // Create new XmlElement object.
                    String id = "id";
                    String data = "data";

					// Subscription to new events.
					testCase1.subscribe(this);

                    System.out.print( "Unsubscribe on ID: " + id);
					testCase1.unsubscribe(id);

					// Check the content.
					if(table.get(id) instanceof XmlElement) {
						new XmlElement(id, data).toString();
					} else {
						System.out.println("XmlElement not found");
					}
				}

		}
}

// ======================================================================================
