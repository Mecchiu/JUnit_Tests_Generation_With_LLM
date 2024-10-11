// XisemeleFactoryTest.java
package net.sf.xisemele.impl;

import net.sf.xisemele.api.Xisemele;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XisemeleFactory}.
* It contains one unit test case for the {@link XisemeleFactory#newXisemele()} method.
*/
class XisemeleFactoryTest {

	/**
	* Valida que todos os testos estão está no XML que estao das
	* fazem noisíndicos. 
	*/
	@Test
	public void testXisemeleSerializeInstance() {
		{
			Xisemele xisemelogic = newXisemele();
			String xmlLogic = "<?xml version=\"1.0\"?>"
						+ "<a xmlns=\"http://www.w3.org/2000/07/xmldsig#\""
						+ " xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\""
						+ " xsi:type=\"xisemele\">a</a>";
	
			String serialize = xisemelogic.getXisemeleSerializeXML();
   			// Check xmlLogic
	    	assertTrue("Check the xmlLogic", serialize.equals(xmlLogic));
	    	try {
	    		Xisemele.deSerializeXML(xmlLogic);
	    		assertTrue("There should be a parse exception", false);
	    	} catch (Exception e) {
	    		assertTrue("There should be no parse exception", true);
	    	} 		    		
			
			
	        Xisemele anotherXisemelogic = newXisemele();
			String anotherXmlLogic = "<?xml version=\"1.0\"?>"
				                                        + "<a xmlns=\"http://www.w3.org/2000/07/xmldsig#\" "
				                                        + "      xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\""
				                                        + "      xsi:type=\"xisemele\">a</a>";
			
			anotherXisemelogic.setXisemeleSerializeXML(anotherXmlLogic);
	        String anotherSerialize = anotherXisemelogic.getXisemeleSerializeXML();
	        assertEquals("Check the different result XML", theXisemelogic.getXisemelogic(), anotherXisemelogic.getXisemelogic());
     			
    		}
	}

}