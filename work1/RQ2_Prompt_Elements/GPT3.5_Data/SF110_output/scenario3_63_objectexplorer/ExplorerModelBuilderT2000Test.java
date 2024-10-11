// ExplorerModelBuilder.java
package de.paragon.explorer.model;

import de.paragon.explorer.figure.ExplorerFigure;
import de.paragon.explorer.figure.ExplorerFigureBuilder;
import de.paragon.explorer.figure.ListBoxFigure;
import de.paragon.explorer.figure.TextBoxFigure;
import de.paragon.explorer.gui.ExplorerDrawingPanel;
import de.paragon.explorer.util.ExplorerManager;

public final class ExplorerModelBuilder {

    /**
     * Creates a new ExplorerModel and a new ExplorerFigure, and links them together.
     * @return the newly created ExplorerModel
     */
    public ExplorerModel createNewExplorerModelWithFigure() {
        ExplorerModel model = new ExplorerModel();
        ExplorerFigureBuilder builder = new ExplorerFigureBuilder();
        ExplorerFigure figure = builder.build();
        model.setFigure(figure);
        return model;
    }
}

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
        ExplorerModelBuilder builder = new ExplorerModelBuilder();
        ExplorerModel model = builder.createNewExplorerModelWithFigure();
        assertNotNull(model);
        assertNotNull(model.getFigure());
    }
    
    @Test
    void testCreateNewExplorerModelWithFigure_setsFigure() {
        ExplorerModelBuilder builder = new ExplorerModelBuilder();
        ExplorerModel model = builder.createNewExplorerModelWithFigure();
        assertNotNull(model.getFigure());
    }
    
    @Test
    void testCreateNewExplorerModelWithFigure_returnsNewInstance() {
        ExplorerModelBuilder builder = new ExplorerModelBuilder();
        ExplorerModel model1 = builder.createNewExplorerModelWithFigure();
        ExplorerModel model2 = builder.createNewExplorerModelWithFigure();
        assertNotSame(model1, model2);
    }
    
    @Test
    void testCreateNewExplorerModelWithFigure_figureIsExplorerFigure() {
        ExplorerModelBuilder builder = new ExplorerModelBuilder();
        ExplorerModel model = builder.createNewExplorerModelWithFigure();
        assertTrue(model.getFigure() instanceof ExplorerFigure);
    }
    
    @Test
    void testCreateNewExplorerModelWithFigure_figureIsListBoxFigure() {
        ExplorerFigureBuilder figureBuilder = new ExplorerFigureBuilder();
        figureBuilder.setType(ExplorerFigureBuilder.TYPE_LISTBOX);
        ExplorerFigure expectedFigure = figureBuilder.build();
        
        ExplorerModelBuilder builder = new ExplorerModelBuilder();
        ExplorerModel model = builder.createNewExplorerModelWithFigure();
        model.setFigure(expectedFigure);
        
        assertEquals(expectedFigure, model.getFigure());
    }
    
    @Test
    void testCreateNewExplorerModelWithFigure_figureIsTextBoxFigure() {
        ExplorerFigureBuilder figureBuilder = new ExplorerFigureBuilder();
        figureBuilder.setType(ExplorerFigureBuilder.TYPE_TEXTBOX);
        ExplorerFigure expectedFigure = figureBuilder.build();
        
        ExplorerModelBuilder builder = new ExplorerModelBuilder();
        ExplorerModel model = builder.createNewExplorerModelWithFigure();
        model.setFigure(expectedFigure);
        
        assertEquals(expectedFigure, model.getFigure());
    }
    
    @Test
    void testCreateNewExplorerModelWithFigure_figureIsExplorerDrawingPanel() {
        ExplorerFigureBuilder figureBuilder = new ExplorerFigureBuilder();
        figureBuilder.setType(ExplorerFigureBuilder.TYPE_EXPLORER_DRAWING_PANEL);
        ExplorerFigure expectedFigure = figureBuilder.build();
        
        ExplorerModelBuilder builder = new ExplorerModelBuilder();
        ExplorerModel model = builder.createNewExplorerModelWithFigure();
        model.setFigure(expectedFigure);
        
        assertEquals(expectedFigure, model.getFigure());
    }
    
    @Test
    void testCreateNewExplorerModelWithFigure_figureIsExplorerFigureBuilder() {
        ExplorerFigureBuilder figureBuilder = new ExplorerFigureBuilder();
        figureBuilder.setType(ExplorerFigureBuilder.TYPE_EXPLORER_FIGURE_BUILDER);
        ExplorerFigure expectedFigure = figureBuilder.build();
        
        ExplorerModelBuilder builder = new ExplorerModelBuilder();
        ExplorerModel model = builder.createNewExplorerModelWithFigure();
        model.setFigure(expectedFigure);
        
        assertEquals(expectedFigure, model.getFigure());
    }
    
    @Test
    void testCreateNewExplorerModelWithFigure_figureIsNull() {
        ExplorerModelBuilder builder = new ExplorerModelBuilder();
        ExplorerModel model = builder.createNewExplorerModelWithFigure();
        model.setFigure(null);
        
        assertNull(model.getFigure());
    }
    
    @Test
    void testCreateNewExplorerModelWithFigure_modelIsNull() {
        ExplorerModelBuilder builder = new ExplorerModelBuilder();
        ExplorerModel model = builder.createNewExplorerModelWithFigure();
        model = null;
        
        assertNull(model);
    }
}