// ExplorerModelBuilderTest.java
package de.paragon.explorer.model;

import de.paragon.explorer.figure.ExplorerFigure;
import de.paragon.explorer.figure.ExplorerFigureBuilder;
import de.paragon.explorer.figure.ListBoxFigure;
import de.paragon.explorer.figure.TextBoxFigure;
import de.paragon.explorer.gui.ExplorerDrawingPanel;
import de.paragon.explorer.util.ExplorerManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExplorerModelBuilder}.
* It contains one unit test case for the {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()} method.
*/
class ExplorerModelBuilderTest {
UniverseImpl world;
	
	@Test
	public void createNewExplorerModelWithFigure_1() throws Exception {
		this.world = new UniverseImpl();
		ExplorerModel explModl = this.getModelBuilder().createNewExplorerModelWithFigure();
		ExplorerManager explMgr = explModl.getElements().getExplorerManagers().getExplorerManagers().size() > 1? new ExplorerManager(explModl.getElements().getExplorerManagers()) :null;
		assertEquals(explModl.getElements(), explMgr);
		ExplorerManagerBuilder explorerMgrBuilder = new ExplorerManagerBuilder().withElements(explModl.getElements());
	    ExplorerDrawingPanel dpg = new ExploreDrawingPanel();
        assertTrue(explModl.getElements()!= null);
        assertTrue(explModl.getElements().getExplorerManagers().getExplorerManagers().size() >= 1 );
        assertTrue(explModl.getElements().getExplorerManagers().getExplorerManagers().size() == explMgr.getElements().getExplorerManagers().size() + 1);
	}
	
	@Test
	public void createNewExplorerModelWithFigure_2() throws Exception {
		this.world = new UniverseImpl();
		ExplorerModel explModl = this.getModelBuilder().createNewExplorerModelWithFigure();
		ExplorerManager explMgr = explModl.getElements().getExplorerManagers();
		ExplorerManagerBuilder explorerMgrBuilder = new ExplorerManagerBuilder().withElements(explModl.getElements());
		ExplorerDrawingPanel dpg = new ExploreDrawingPanel();
        assertTrue(explModl.getElements().getExplorerManagers()!= null);
		assertTrue(explModl.getElements().getExplorerManagers().size() == explMgr.getElements().getExplorerManagers().size() + 1);
	}
	
	private ExplorerModelBuilder getModelBuilder() {
		return new ExplorerModelBuilder();
	}

	private ExplorerManagerBuilder getExplorerManagerBuilder() {
		return new ExplorerManagerBuilder();
	}
	
}
