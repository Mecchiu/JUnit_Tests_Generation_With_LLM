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
* It contains ten unit test cases for the {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()} method.
*/
class ExplorerModelBuilderTest {
		
	/**
	* Test case for the {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()} method.
	* It tests if the method returns a new ExplorerModel.
	*/
	@Test
	void testCreateNewExplorerModelWithFigure() {
		ExplorerModelBuilder explModlBuild = new ExplorerModelBuilder();
		ExplorerModel explModl = explModlBuild.createNewExplorerModelWithFigure();
		assertNotNull(explModl);
	}
}