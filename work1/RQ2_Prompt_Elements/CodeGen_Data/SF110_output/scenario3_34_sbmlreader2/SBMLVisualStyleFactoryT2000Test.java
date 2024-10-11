// SBMLVisualStyleFactoryTest.java
package sbmlreader2;

import cytoscape.*;
import cytoscape.visual.*;
import cytoscape.visual.calculators.*;
import cytoscape.visual.mappings.*;
import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SBMLVisualStyleFactory}.
* It contains one unit test case for the {@link SBMLVisualStyleFactory#createVisualStyle(CyNetwork)} method.
*/
class SBMLVisualStyleFactoryTest {
/** DOCUMENT ME! */
		final CytoppiFactory factory;

	/**
	 * This constructor creates an SBMLVisualStyleFactory test object
	 * with a network in the given factory and then runs through the
	 * tests with the network in the factory.
	 */
	SBMLVisualStyleFactoryTest() {
		factory = Cytoscape.init(new SvgFactory());
		Cytoscape.setInstance(new Svg());	
	}

		/**
	 * This constructor creates an SBMLVisualStyleFactory test object
	 * with two factory in the given factory and then runs through the
	 * tests with the two factory for the default factory.
	 */
	SBMLVisualStyleFactoryTest(final CytoscapeFactoryImpl factory1) {
		factory = factory1.clone();
		factory.getConfig().setType(CytoscapeFactory.TYPE);
		factory.getConfig().setMode(VisualizerConfig.MODE.DRAW);
	}

	/**
	 * This constructor creates an SBMLVisualStyleFactory test object
	 * with one factory in the given factory and then runs through
	 * the tests with the factory in the default factory.
	 */
	SBMLVisualStyleFactoryTest(final CytoscapeFactoryImpl factory) {
		factory = factory.clone();	
		factory.getConfig().setType(CytoscapeFactory.TYPE);
		factory.getConfig().setMode(VisualizerConfig.MODE.DRAW);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @throws Exception DOCUMENT ME!
	 */
	@Test
	public final void test() throws Exception {
	
		// create test object
		CytoppiFactory defaultFactory = factory.getConfig().getFactory();
		SvgFactory svgFactory = (SvgFactory)defaultFactory;
		CytoscapeFactory cytoscapeFactory = (CytoscapeFactory) svgFactory.getConfig().getFactory();
		
		// create test object with the default factory
		SBMLVisualStyleFactoryTest sbmlVisualStyleFactoryTest = new SBMLVisualStyleFactoryTest(cytoscapeFactory);
	
		// get the default factory
		CytoscapeFactory factory1 = null;
		CytoscapeFactory cytoscapeFactory1 = null;
		try {
			factory1 = cytoscapeFactory.getDefaultFactory();
			cytoscapeFactory1 = (CytoscapeFactory) factory1.clone();
		} catch(CytoscapeFactoryException ex) {
			// exception should never be thrown on a bad manager in the context of one factory
			throw new RuntimeException("Could not create factory", ex);
		}

		// create test object with the cytoscape factory
		sbmlVisualStyleFactoryTest = new SBMLVisualStyleFactoryTest(cytoscapeFactory1);
		
		// get the factory in context of the default factory
		try {
			cytoscapeFactory1 = (CytoscapeFactory)defaultFactory.clone();
		} catch(CytoscapeFactoryException ex) {
			// exception should never be thrown on a bad manager in the context of one factory
			throw new RuntimeException("Could not create factory", ex);
		}

		// create test object with the cytoscape factory
		sbmlVisualStyleFactoryTest = new SBMLVisualStyleFactoryTest(factory1);
		
		// assert a new default factory is created
		assertNotNull("Could not create factory", factory1);
		assertEquals("SBML default factory is not the same", factory, factory1);		
	}
}
