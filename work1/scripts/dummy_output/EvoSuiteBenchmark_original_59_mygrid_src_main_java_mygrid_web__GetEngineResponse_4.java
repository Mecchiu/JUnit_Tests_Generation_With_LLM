// _GetEngineResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngineResponse}.
* It contains one unit test case for the {@link _GetEngineResponse#getTypeDesc()} method.
*/
class _GetEngineResponseTest {
		/**
         * Constructor.
		*/
	public _GetEngineResponseTest() {
	}
		
	/**
     * Test the {@code getTypeDesc} method
     */
	@Test
    public void testGetTypeDesc() {
        // set some stuff into the model
        mygrid.web.Engine.Bundle aBundle;
        final String aBundleName = "BAR_BEING_HERE";
        mygrid.web.Engine.Bundle aBundle2;
        final String aBundleName2 = "BAR_BEING_HERE2";
        
        // set some stuff into the model
        mygrid.web.Engine aModel;

        // create some types
        aBundle = new mygrid.web.Engine.Bundle();
        aBundle.name = "BAR_BEING_HERE";
        aBundle.type = 1;

        aBundle2 = new mygrid.web.Engine.Bundle();
        aBundle2.name = "BAR_BEING_HERE2";
        aBundle2.type = 2;

        // get a descriptor of the model
		com.myGrid.web.dao.engine.model.Bundle.Bundle aBundleDescriptor = 
            com.myGrid.web.dao.engine.model.BundleDescriptor.fromEngine(_ModelHelper.instance().getEngineModel().getBundleDescriptor(_mygrid.web.WEB_DEFAULT_BEING));
        com.myGrid.web.dao.engine.model.BundleDescriptor aBundleDescriptor2 = aBundleDescriptor.getDescriptor(1);
        com.myGrid.web.dao.engine.model.Bundle aModelDescriptor = _ModelHelper.instance().getEngine().getBundle(aBundleDescriptor2.getName());
        com.myGrid.web.dao.engine.model.Bundle aBundleDescriptor3 = aBundleDescriptor.getDescriptor(2);
        com.myGrid.web.dao.engine.model.Bundle aModelDescriptor2 = _ModelHelper.instance().getEngine().getBundle(aBundleDescriptor3.getName());


        // and create a result object
		com.myGrid.web.dao.engine.model.Engine engine = aModelDescriptor.createEngine(aModel);

		// check the type information
		assertEquals(com.myGrid.web.dao.engine.model.Engine.class, engine.getClass());
	}
}