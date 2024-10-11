// HeroTest.java
package dsachat.share.hero;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Vector;
import org.dom4j.Document;
import org.dom4j.Element;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Hero}.
* It contains one unit test case for the {@link Hero#getAttrValue(String)} method.
*/
class HeroTest {

        private final HeroTestClass fTest;

        public HeroTest(HeroTestClass test) {
            fTest = test;
        }

		/**
		 * test {@link Hero#getAttrValue(String)}.
		 * @see {@link #test}
		 */
		@Test
		public void testAttrValue() {
			
			for(int i=50; i<=100; ++i) {
				fTest.testAttrValue(i);
			}
				
			//assertEquals("Attr value of the class is expected to be equal to 'value'",
			//fTest.fTest.getAttrValue("value"), fTest.fTest.getAttrValue("value"));
		}
		
	     /**
		 * test if the values are expected, from the list of attributes.
		 */
		public void testValues() {
			
			fTest.fTest.setAttribute(HERO_INI, "1000");
			fTest.fTest.setAttribute(HERO_LEP, "100");
			fTest.fTest.setAttribute(HERO_AUP, "200");
			fTest.fTest.setAttribute(HERO_ASP, "300");
			fTest.fTest.setAttribute(HERO_KAP, "400");
			fTest.fTest.setAttribute(HERO_MESSAGE, "test text");
			fTest.fTest.setAttribute(HERO_SPECIAL, "+");
			fTest.fTest.setAttribute(HERO_SPELL, "Spell");
			
			fTest.fTest.setAttribute(HERO_COUNT, "2");
			
			fTest.fTest.setAttribute(HERO_WEAR, "a");
			
			fTest.fTest.setAttribute(HERO_MAIN, "main");
			
			Document doc = fTest.fTest.saveToDom(false);
			Element rootElement = doc.getRootElement();
			
			Vector<Element> els = rootElement.elementIterator("attributes");
			for(Iterator iterator = els.iterator(); iterator.hasNext(); ) {
			   Element e = (Element)iterator.next();
			   
			   String attrName = e.attributeValue("name");
			   if(attrName == null) {
					break;
			   }
				
				Vector<String> values = fTest.fTest.getAttrValues(attrName);
				if(values!= null) {
				    String msg = "Attemtps: ";
					for (int i=0; i<values.size(); i++) {
						msg = msg + values.get(i);
					}
					
					assertTrue(""+msg, values.size() >= 1);  // 2 values or 1!
					
//					fTest.fTest.fTest.setAttrValues(attrs.get(0), values);	   // TODO: fix this hack
//					fTest.fTest.loadDoc(fTest.fDoc);
//					
//					//System.out.println("Attr Name: " + attrName + " Attr Vector " + values);
//					
				}
			} 
			
			Iterator<Element> iter = rootElement.elementIterator("attack");
			while (iter.hasNext()) {
				Element e = iter.next();
				
				assertEquals(""+e.attributeValue("name"), "tactic");
			}
			iter = rootElement.elementIterator("defense");
			while (iter.hasNext()) {

				Element e = iter.next();
				
				String attrValue = fTest.fTest.getAttrValue(e.attributeValue("attrs"));
				assertEquals(""+attrValue, "value");
				
			}
			
			assertNotNull("Attrs getValues are empty", fTest.fTest.getAttrValues(HERO_DEST_WEAR));

		}
	
		/**
		 * test if the values are expected.
		 * @param test case of the test
		 */
		private void testValues(HeroTestClass test) {

			Iterator<Element> iter = test.fDoc.elementIterator("attack");
			
			while( iter.hasNext() ) {
				Element e = iter.next();
				String attrName = e.attributeValue("name");
				assertEquals(attrName,"attack");
				
				Vector<String> values = fTest.fTest.getAttrValues(attrName);
				String msg = "";
				for(int i=0; i<values.size(); i++) {
					msg += values.get(i)