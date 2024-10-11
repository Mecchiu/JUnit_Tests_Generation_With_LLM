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

    public ListBoxFigure getListBoxFigure() {
        return this.listBoxFigure;
    }

    public void setListBoxFigure(ListBoxFigure listBoxFigure) {
        this.listBoxFigure = listBoxFigure;
    }

    public TextBoxFigure getTextBoxFigure() {
        return this.textBoxFigure;
    }

    public void setTextBoxFigure(TextBoxFigure textBoxFigure) {
        this.textBoxFigure = textBoxFigure;
    }
}

// ExplorerFigureTest.java
package de.paragon.explorer.figure;

import de.paragon.explorer.figure.ExplorerFigureBuilder;
import de.paragon.explorer.figure.ListBoxFigure;
import de.paragon.explorer.figure.TextBoxFigure;
import de.paragon.explorer.gui.ExplorerDrawingPanel;
import de.paragon.explorer.util.ExplorerManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExplorerFigure}.
* It contains ten unit test cases for the {@link ExplorerFigure#getListBoxFigure()}, {@link ExplorerFigure#setListBoxFigure(ListBoxFigure)}, {@link ExplorerFigure#getTextBoxFigure()} and {@link ExplorerFigure#setTextBoxFigure(TextBoxFigure)} methods.
*/
class ExplorerFigureTest {
		
		@Test
		void testGetListBoxFigure() {
				ExplorerFigure explFig = new ExplorerFigure();
				ListBoxFigure listBoxFig = new ListBoxFigure();
				explFig.setListBoxFigure(listBoxFig);
				assertEquals(listBoxFig, explFig.getListBoxFigure());
		}
		
		@Test
		void testSetListBoxFigure() {
				ExplorerFigure explFig = new ExplorerFigure();
				ListBoxFigure listBoxFig = new ListBoxFigure();
				explFig.setListBoxFigure(listBoxFig);
				assertEquals(listBoxFig, explFig.getListBoxFigure());
		}
		
		@Test
		void testGetTextBoxFigure() {
				ExplorerFigure explFig = new ExplorerFigure();
				TextBoxFigure textBoxFig = new TextBoxFigure();
				explFig.setTextBoxFigure(textBoxFig);
				assertEquals(textBoxFig, explFig.getTextBoxFigure());
		}
		
		@Test
		void testSetTextBoxFigure() {
				ExplorerFigure explFig = new ExplorerFigure();
				TextBoxFigure textBoxFig = new TextBoxFigure();
				explFig.setTextBoxFigure(textBoxFig);
				assertEquals(textBoxFig, explFig.getTextBoxFigure());
		}
}

// ExplorerFigureBuilder.java
package de.paragon.explorer.figure;

import de.paragon.explorer.figure.ExplorerFigureBuilder;
import de.paragon.explorer.figure.ListBoxFigure;
import de.paragon.explorer.figure.TextBoxFigure;
import de.paragon.explorer.gui.ExplorerDrawingPanel;
import de.paragon.explorer.util.ExplorerManager;

public final class ExplorerFigureBuilder {

    public ExplorerFigure createNewExplorerFigure() {
        ExplorerFigure explFig;
        ListBoxFigure listBoxFig;
        TextBoxFigure textBoxFig;
        explFig = new ExplorerFigure();
        listBoxFig = this.getListBoxFigureBuilder().createNewListBoxFigure();
        textBoxFig = this.getTextBoxFigureBuilder().createNewTextBoxFigure();
        this.connect(explFig, listBoxFig, textBoxFig);
        return explFig;
    }
}

// ExplorerFigureBuilderTest.java
package de.paragon.explorer.figure;

import de.paragon.explorer.figure.ExplorerFigureBuilder;
import de.paragon.explorer.figure.ListBoxFigure;
import de.paragon.explorer.figure.TextBoxFigure;
import de.paragon.explorer.gui.ExplorerDrawingPanel;
import de.paragon.explorer.util.ExplorerManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExplorerFigureBuilder}.
* It contains ten unit test cases for the {@link ExplorerFigureBuilder#createNewExplorerFigure()} method.
*/
class ExplorerFigureBuilderTest {
		
		@Test
		void testCreateNewExplorerFigure() {
				ExplorerFigureBuilder explFigBuild = new ExplorerFigureBuilder();
				ExplorerFigure explFig = explFigBuild.createNewExplorerFigure();
				assertNotNull(explFig);
		}
}

// ListBoxFigure.java
package de.paragon.explorer.figure;

import de.paragon.explorer.figure.ExplorerFigureBuilder;
import de.paragon.explorer.figure.ListBoxFigure;
import de.paragon.explorer.figure.TextBoxFigure;
import de.paragon.explorer.gui.ExplorerDrawingPanel;
import de.paragon.explorer.util.ExplorerManager;

public final class ListBoxFigure {

    public ListBoxFigure() {
    }
}

// ListBoxFigureTest.java
package de.paragon.explorer.figure;

import de.paragon.explorer.figure.ExplorerFigureBuilder;
import de.paragon.explorer.figure.ListBoxFigure;
import de.paragon.explorer.figure.TextBoxFigure;
import de.paragon.explorer.gui.ExplorerDrawingPanel;
import de.paragon.explorer.util.ExplorerManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ListBoxFigure}.
* It contains ten unit test cases for the {@link ListBoxFigure#ListBoxFigure()} method.
*/
class ListBoxFigureTest {
		
		@Test
		void testListBoxFigure() {
				ListBoxFigure listBoxFig = new ListBoxFigure();
				assertNotNull(listBoxFig);
		}
}

// ListBoxFigureBuilder.java
package de.paragon.explorer.figure;

import de.paragon.explorer.figure.ExplorerFigureBuilder;
import de.paragon.explorer.figure.ListBoxFigure;
import de.paragon.explorer.figure.TextBoxFigure;
import de.paragon.explorer.gui.ExplorerDrawingPanel;
import de.paragon.explorer.util.ExplorerManager;

public final class ListBoxFigureBuilder {

    public ListBoxFigure createNewListBoxFigure() {
        ListBoxFigure listBoxFig;
        listBoxFig = new ListBoxFigure();
        return listBoxFig;
    }
}

// ListBoxFigureBuilderTest.java
package de.paragon.explorer.figure;

import de.paragon.explorer.figure.ExplorerFigureBuilder;
import de.paragon.explorer.figure.ListBoxFigure;
import de.paragon.explorer.figure.TextBoxFigure;
import de.paragon.explorer.gui.ExplorerDrawingPanel;
import de.paragon.explorer.util.ExplorerManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ListBoxFigureBuilder}.
* It contains ten unit test cases for the {@link ListBoxFigureBuilder#createNewListBoxFigure()} method.
*/
class ListBoxFigureBuilderTest {
		
		@Test
		void testCreateNewListBoxFigure() {
				ListBoxFigureBuilder listBoxFigBuild = new ListBoxFigureBuilder();
				ListBoxFigure listBoxFig = listBoxFigBuild.createNewListBoxFigure();
				assertNotNull(listBoxFig);
		}