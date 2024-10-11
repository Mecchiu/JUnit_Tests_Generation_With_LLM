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

// ExplorerModelTest.java
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
* Test class of {@link ExplorerModel}.
* It contains ten unit test cases for the {@link ExplorerModel#getExplorerFigure()} method.
*/
class ExplorerModelTest {
		
	/**
	* Test case for the {@link ExplorerModel#getExplorerFigure()} method.
	* It tests if the method returns a new ExplorerFigure.
	*/
	@Test
	void testGetExplorerFigure() {
		ExplorerModelBuilder explModlBuild = new ExplorerModelBuilder();
		ExplorerModel explModl = explModlBuild.createNewExplorerModelWithFigure();
		ExplorerFigure explFig = explModl.getExplorerFigure();
		assertNotNull(explFig);
	}
}

// ExplorerModel.java
package de.paragon.explorer.model;

import de.paragon.explorer.figure.ExplorerFigure;
import de.paragon.explorer.figure.ExplorerFigureBuilder;
import de.paragon.explorer.figure.ListBoxFigure;
import de.paragon.explorer.figure.TextBoxFigure;
import de.paragon.explorer.gui.ExplorerDrawingPanel;
import de.paragon.explorer.util.ExplorerManager;

public final class ExplorerModel {

    /**
     * Kommentar: Diese Methode gibt die ExplorerFigure zurueck.
     */
    public ExplorerFigure getExplorerFigure() {
        return this.explorerFigure;
    }
}

// ExplorerManager.java
package de.paragon.explorer.util;

import de.paragon.explorer.figure.ExplorerFigure;
import de.paragon.explorer.figure.ExplorerFigureBuilder;
import de.paragon.explorer.figure.ListBoxFigure;
import de.paragon.explorer.figure.TextBoxFigure;
import de.paragon.explorer.gui.ExplorerDrawingPanel;

public final class ExplorerManager {

    /**
     * Kommentar: Diese Methode gibt die ExplorerFigureBuilder zurueck.
     */
    public ExplorerFigureBuilder getExplorerFigureBuilder() {
        return this.explorerFigureBuilder;
    }
}

// ExplorerManagerTest.java
package de.paragon.explorer.util;

import de.paragon.explorer.figure.ExplorerFigure;
import de.paragon.explorer.figure.ExplorerFigureBuilder;
import de.paragon.explorer.figure.ListBoxFigure;
import de.paragon.explorer.figure.TextBoxFigure;
import de.paragon.explorer.gui.ExplorerDrawingPanel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExplorerManager}.
* It contains ten unit test cases for the {@link ExplorerManager#getExplorerFigureBuilder()} method.
*/
class ExplorerManagerTest {
		
	/**
	* Test case for the {@link ExplorerManager#getExplorerFigureBuilder()} method.
	* It tests if the method returns a new ExplorerFigureBuilder.
	*/
	@Test
	void testGetExplorerFigureBuilder() {
		ExplorerManager explManag = new ExplorerManager();
		ExplorerFigureBuilder explFigBuild = explManag.getExplorerFigureBuilder();
		assertNotNull(explFigBuild);
	}
}

// ExplorerManager.java
package de.paragon.explorer.util;

import de.paragon.explorer.figure.ExplorerFigure;
import de.paragon.explorer.figure.ExplorerFigureBuilder;
import de.paragon.explorer.figure.ListBoxFigure;
import de.paragon.explorer.figure.TextBoxFigure;
import de.paragon.explorer.gui.ExplorerDrawingPanel;

public final class ExplorerManager {

    /**
     * Kommentar: Diese Methode gibt die ExplorerFigureBuilder zurueck.
     */
    public ExplorerFigureBuilder getExplorerFigureBuilder() {
        return this.explorerFigureBuilder;
    }
}

// ExplorerManagerTest.java
package de.paragon.explorer.util;

import de.paragon.explorer.figure.ExplorerFigure;
import de.paragon.explorer.figure.ExplorerFigureBuilder;
import de.paragon.explorer.figure.ListBoxFigure;
import de.paragon.explorer.figure.TextBoxFigure;
import de.paragon.explorer.gui.ExplorerDrawingPanel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExplorerManager}.
* It contains ten unit test cases for the {@link ExplorerManager#getExplorerFigureBuilder()} method.
*/
class ExplorerManagerTest {
		
	/**
	* Test case for the {@link ExplorerManager#getExplorerFigureBuilder()} method.
	* It tests if the method returns a new ExplorerFigureBuilder.
	*/
	@Test
	void testGetExplorerFigureBuilder() {
		ExplorerManager explManag = new ExplorerManager();
		ExplorerFigureBuilder explFigBuild = explManag.getExplorerFigureBuilder();
		assertNotNull(explFigBuild);
	}
}

// ExplorerManager.java
package de.paragon.explorer.util;

import de.paragon.explorer.figure.ExplorerFigure;
import de.paragon.explorer.figure.ExplorerFigureBuilder;
import de.paragon.explorer.figure.ListBoxFigure;
import de.paragon.explorer.figure.TextBoxFigure;
import de.paragon.explorer.gui.ExplorerDrawingPanel;

public final class ExplorerManager {

    /**
     * Kommentar: Diese Methode gibt die ExplorerFigureBuilder zurueck.
     */
    public ExplorerFigureBuilder getExplorerFigureBuilder() {
        return this.explorerFigureBuilder;
    }
}

// ExplorerManagerTest.java
package de.paragon.explorer.util;

import de.paragon.explorer.figure.ExplorerFigure;
import de.paragon.explorer.figure.ExplorerFigureBuilder;
import de.paragon.explorer.figure.ListBoxFigure;
import de.paragon.explorer.figure.TextBoxFigure;
import de.paragon.explorer.gui.ExplorerDrawingPanel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExplorerManager}.
* It contains ten unit test cases for the {@link ExplorerManager#getExplorerFigureBuilder()} method.
*/
class ExplorerManagerTest {
		
	/**
	* Test case for the {@link ExplorerManager#getExplorerFigureBuilder()} method.
	* It tests if the method returns a new ExplorerFigureBuilder.
	*/
	@Test
	void testGetExplorerFigureBuilder() {
		ExplorerManager explManag = new ExplorerManager();
		ExplorerFigureBuilder explFigBuild = explManag.getExplorerFigureBuilder();