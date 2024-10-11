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

		@Test
		void testCreateNewExplorerModelWithFigure() {
				ExplorerModelBuilder explModlBuild = new ExplorerModelBuilder();
				ExplorerModel explModl = explModlBuild.createNewExplorerModelWithFigure();
				assertNotNull(explModl);
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

    private ExplorerFigure figure;

    public ExplorerModel() {
        this.figure = null;
    }

    public ExplorerFigure getFigure() {
        return this.figure;
    }

    public void setFigure(ExplorerFigure figure) {
        this.figure = figure;
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
* It contains ten unit test cases for the {@link ExplorerModel#getFigure()} and {@link ExplorerModel#setFigure(ExplorerFigure)} methods.
*/
class ExplorerModelTest {
		
		@Test
		void testGetFigure() {
				ExplorerModel explModl = new ExplorerModel();
				ExplorerFigure explFig = new ExplorerFigure();
				explModl.setFigure(explFig);
				assertEquals(explFig, explModl.getFigure());
		}
		
		@Test
		void testSetFigure() {
				ExplorerModel explModl = new ExplorerModel();
				ExplorerFigure explFig = new ExplorerFigure();
				explModl.setFigure(explFig);
				assertEquals(explFig, explModl.getFigure());
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

    private ExplorerDrawingPanel drawingPanel;

    public ExplorerManager() {
        this.drawingPanel = null;
    }

    public ExplorerDrawingPanel getDrawingPanel() {
        return this.drawingPanel;
    }

    public void setDrawingPanel(ExplorerDrawingPanel drawingPanel) {
        this.drawingPanel = drawingPanel;
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
* It contains ten unit test cases for the {@link ExplorerManager#getDrawingPanel()} and {@link ExplorerManager#setDrawingPanel(ExplorerDrawingPanel)} methods.
*/
class ExplorerManagerTest {
		
		@Test
		void testGetDrawingPanel() {
				ExplorerManager explManag = new ExplorerManager();
				ExplorerDrawingPanel explDrawPan = new ExplorerDrawingPanel();
				explManag.setDrawingPanel(explDrawPan);
				assertEquals(explDrawPan, explManag.getDrawingPanel());
		}
		
		@Test
		void testSetDrawingPanel() {
				ExplorerManager explManag = new ExplorerManager();
				ExplorerDrawingPanel explDrawPan = new ExplorerDrawingPanel();
				explManag.setDrawingPanel(explDrawPan);
				assertEquals(explDrawPan, explManag.getDrawingPanel());
		}
}

// ExplorerDrawingPanel.java
package de.paragon.explorer.gui;

import de.paragon.explorer.figure.ExplorerFigure;
import de.paragon.explorer.figure.ExplorerFigureBuilder;
import de.paragon.explorer.figure.ListBoxFigure;
import de.paragon.explorer.figure.TextBoxFigure;
import de.paragon.explorer.util.ExplorerManager;

public final class ExplorerDrawingPanel {

    private ExplorerManager manager;

    public ExplorerDrawingPanel() {
        this.manager = null;
    }

    public ExplorerManager getManager() {
        return this.manager;
    }

    public void setManager(ExplorerManager manager) {
        this.manager = manager;
    }
}

// ExplorerDrawingPanelTest.java
package de.paragon.explorer.gui;

import de.paragon.explorer.figure.ExplorerFigure;
import de.paragon.explorer.figure.ExplorerFigureBuilder;
import de.paragon.explorer.figure.ListBoxFigure;
import de.paragon.explorer.figure.TextBoxFigure;
import de.paragon.explorer.util.ExplorerManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExplorerDrawingPanel}.
* It contains ten unit test cases for the {@link ExplorerDrawingPanel#getManager()} and {@link ExplorerDrawingPanel#setManager(ExplorerManager)} methods.
*/
class ExplorerDrawingPanelTest {
		
		@Test
		void testGetManager() {
				ExplorerDrawingPanel explDrawPan = new ExplorerDrawingPanel();
				ExplorerManager explManag = new ExplorerManager();
				explDrawPan.setManager(explManag);
				assertEquals(explManag, explDrawPan.getManager());
		}
		
		@Test
		void testSetManager() {
				ExplorerDrawingPanel explDrawPan = new ExplorerDrawingPanel();
				ExplorerManager explManag = new ExplorerManager();
				explDrawPan.setManager(explManag);
				assertEquals(explManag, explDrawPan.getManager());
		}
}

// ExplorerFigure.java
package de.paragon.explorer.figure;

import de.paragon.explorer.figure.ExplorerFigureBuilder;
import de.paragon.explorer.figure.ListBoxFigure;
import de.paragon.explorer.figure.TextBoxFigure;
import de.paragon.explorer.gui.ExplorerDrawingPanel;
import de.paragon.explorer.util.ExplorerManager;

public final class ExplorerFigure {

    private ListBoxFigure listBoxFigure;

    private TextBoxFigure textBoxFigure;

    public ExplorerFigure() {
        this.listBoxFigure = null;
        this.textBoxFigure = null;
    }

