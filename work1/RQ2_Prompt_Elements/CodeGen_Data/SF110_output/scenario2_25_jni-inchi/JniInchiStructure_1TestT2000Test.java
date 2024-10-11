// JniInchiStructure_1Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#addBond(JniInchiBond)} method.
*/
class JniInchiStructure_1Test {

	/**
	* Returns a valid list of tests cases.
	* It has two tests cases: 
	* 	1) Two bond with two attributes (no property) 
	* 		- creates a new {@link JniInchiBond} and adds two to it.
	*
	* 	2)  Two bond and two properties (no attribute) 
	*	 	- adds one to one bond and the other to the second
	* 
	* @return a valid
	*/	
	@Test
	public void returnsValid() {
		
		// return empty list if null input
		List<JniInchiBond> list = new ArrayList<JniInchiBond>();
		assertEquals("List cannot be empty", list.size(), 0);
		
		// add a new bond with a property
		JniInchiBond bond = null;
		assertNotNull("list cannot be null", bundle);
		bond = bundle.addBond(bundle); 
		assertNotNull("addBond fails with null input", bond);
		
		// add a new bond
		bundle.addBond(bundle); 
		assertEquals("test failed", bond, bundle);
			
		// add two as a property
		List<JniInchiProp> prop = new ArrayList<JniInchiProp>();
		assertEquals("List cannot be empty", prop.size(), 2);
		List<JniInchiProp> bondProps = new ArrayList<JniInchiProp>();
		bondProps.add(new JniInchiProp("value", "2"));
		bondProps.add(new JniInchiProp("value", "3"));  
		assertEquals("Length of prop list cannot be wrong", 2, bondProps.size());
		
		// add the same property
		bundle.addProp(bundle, "value", "2");
		bundle.addProp(bundle, "value", "3");
		bundle.addBond(bond); //add property to the bond (and property to a new bond)
		
		// add a bond to the prop array
		bundle.addBond(new JniInchiBond(bundle, bundle.properties(),"value"));
		
		// return the valid list
		List<JniInchiBond> listAfter = new ArrayList<JniInchiBond>();
		assertEquals("Incorrect list", listAfter, list);
		List<JniInchiBond> bondListAfter = bundle.inchiBonds(); 
		
		// add a different list of properties
		List<JniInchiProp> bundlePropList = new ArrayList<JniInchiProp>();
		bundlePropList.add(new JniInchiProp("value", "4"));
		bundlePropList.add(new JniInchiProp("value", "5"));
		bundlePropList.add(new JniInchiProp("value", "6"));
		bundlePropList.add(new JniInchiProp("value", "7"));
		assertEquals("Prop list cannot be empty", bundlePropList.size(), 8);
		
		// add some elements except for the first
		for (int i=1; i<=5; i++) {
			bundleProps.add(new JniInchiProp("value", Integer.toString(i)));
		}
		
		// return the valid list
		List<JniInchiBond> listAfterAll = new ArrayList<JniInchiBond>();
		assertEquals("Incorrect list", listAfterAll, listAfter);
		
		// return the bondListAfter because it equals the bondListOne
		List<JniInchiBond> bondListAfterOne = bundle.inchiBonds(); 
		assertEquals("Incorrect list", listAfterOne, bondListAfter);
	}
}
