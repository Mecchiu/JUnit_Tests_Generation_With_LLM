// DiscriminatorTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Discriminator}.
* It contains one unit test case for the {@link Discriminator#getTypeDesc()} method.
*/
class DiscriminatorTest {

	/**
	 * Test of getTypeDesc method, of class mygrid.web.Discriminator with no data set.
	 */
	@Test
	public void testGetTypeDesc_NoDataSet() {
            Discriminator instance = new Discriminator();
            java.lang.String expResult = "Dummy Value";
            instance.getTypeDesc();
            // set variables into instance member
            instance.setAllowedEngines(null);
            instance.setProcessor(null);
            instance.getTypeDesc();
            assertEquals(expResult, instance.getTypeDesc());
            expResult = "";
            instance.getProcessor();
            assertNull(instance.getProcessor());
            instance.getTypeDesc();
            assertEquals(expResult, instance.getTypeDesc());
        }
	/**
	* Test of getTypeDesc method, of class mygrid.web.Discriminator with one data set.
	*/
        @Test
	public void testGetTypeDesc_OneDataSet() {
            Discriminator instance = new Discriminator();
            java.lang.String expResult = "Dummy Value";
            instance.setAllowedEngines(new java.lang.String[]{"a","b","c"});
            instance.setProcessor(new mygrid.web.Processor().setAllowedEngines(new java.lang.String[]{"a","b","c"}, instance.getAllowedEngines()));
            instance.getTypeDesc();
            assertEquals(expResult, instance.getTypeDesc());
            expResult = "";
            instance.getProcessor();
            assertNull(instance.getProcessor());
            instance.getTypeDesc();
            assertEquals(expResult, instance.getTypeDesc());
        }
	/**
	* Test of hasNoDataSet method, of class mygrid.web.Discriminator with one data set.
	*/
        @Test
	public void testHasNoDataSet_OneDataSet() {
			java.lang.String expResult = "Dummy Value";
			java.lang.String curResult = "";
			java.lang.String result = instance.hasNoDataSet();
			assertEquals(curResult, expResult);
			assertEquals(result, instance.hasNoDataSet());
			expResult = "false";
			result = instance.hasNoDataSet();
			assertEquals(curResult, expResult);
			assertEquals(result, instance.hasNoDataSet());
        }
	/**
	* Test of isAllowed method, of class mygrid.web.Discriminator with one data set.
	*/
        @Test
	public void testIsAllowed_OneDataSet() {
			java.lang.String expResult = "Dummy Value";
			java.lang.String curResult = "";
			java.lang.String result = instance.isAllowed();
			assertEquals(curResult, expResult);
			assertEquals(result, instance.isAllowed());
			expResult = "false";
			result = instance.isAllowed();
			assertEquals(curResult, expResult);
			assertEquals(result, instance.isAllowed());
        }
	/**
	* Test of setAllowedEngines method, of class mygrid.web.Discriminator with one data set.
	*/
        @Test
	public void testSetAllowedEngines_OneDataSet() {
			java.lang.String expResult = "Dummy Value";
			java.lang.String curResult = "";
			java.lang.String result = instance.setAllowedEngines((java.lang.String) null);
			assertEquals(curResult, expResult);
			assertEquals(result, instance.setAllowedEngines((java.lang.String) null));
			expResult = "true";
			result = instance.setAllowedEngines((java.lang.String) null);
			assertEquals(curResult, expResult);
			assertEquals(result, instance.setAllowedEngines((java.lang.String) null));
        }
}
