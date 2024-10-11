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
        ExplorerModelBuilder builder = ExplorerModelBuilder.getInstance();
        ExplorerDrawingPanel panel = builder.createNewExplorerModelWithFigure().getExplorerDrawingPanel();
        assertNotNull(panel);
    }
    
    @Test
    void testCreateNewExplorerModelWithFigureExplorerModelNotNull() {
        ExplorerModelBuilder builder = ExplorerModelBuilder.getInstance();
        ExplorerModel model = builder.createNewExplorerModelWithFigure();
        assertNotNull(model);
    }
    
    @Test
    void testCreateNewExplorerModelWithFigureExplorerFigureNotNull() {
        ExplorerModelBuilder builder = ExplorerModelBuilder.getInstance();
        ExplorerFigure figure = builder.createNewExplorerModelWithFigure().getExplorerFigure();
        assertNotNull(figure);
    }
    
    @Test
    void testCreateNewExplorerModelWithFigureExplorerModelExplorerFigureNotNull() {
        ExplorerModelBuilder builder = ExplorerModelBuilder.getInstance();
        ExplorerModel model = builder.createNewExplorerModelWithFigure();
        ExplorerFigure figure = model.getExplorerFigure();
        assertNotNull(model);
        assertNotNull(figure);
    }
    
    @Test
    void testCreateNewExplorerModelWithFigureExplorerModelExplorerFigureListBoxFigureNotNull() {
        ExplorerModelBuilder builder = ExplorerModelBuilder.getInstance();
        ExplorerModel model = builder.createNewExplorerModelWithFigure();
        ExplorerFigure figure = model.getExplorerFigure();
        ListBoxFigure listBoxFigure = figure.getListBoxFigure();
        assertNotNull(model);
        assertNotNull(figure);
        assertNotNull(listBoxFigure);
    }
    
    @Test
    void testCreateNewExplorerModelWithFigureExplorerModelExplorerFigureListBoxFigureTextBoxFigureNotNull() {
        ExplorerModelBuilder builder = ExplorerModelBuilder.getInstance();
        ExplorerModel model = builder.createNewExplorerModelWithFigure();
        ExplorerFigure figure = model.getExplorerFigure();
        ListBoxFigure listBoxFigure = figure.getListBoxFigure();
        TextBoxFigure textBoxFigure = listBoxFigure.getTextBoxFigure();
        assertNotNull(model);
        assertNotNull(figure);
        assertNotNull(listBoxFigure);
        assertNotNull(textBoxFigure);
    }
    
    @Test
    void testCreateNewExplorerModelWithFigureExplorerModelExplorerFigureListBoxFigureTextBoxFigureTextNotNull() {
        ExplorerModelBuilder builder = ExplorerModelBuilder.getInstance();
        ExplorerModel model = builder.createNewExplorerModelWithFigure();
        ExplorerFigure figure = model.getExplorerFigure();
        ListBoxFigure listBoxFigure = figure.getListBoxFigure();
        TextBoxFigure textBoxFigure = listBoxFigure.getTextBoxFigure();
        String text = textBoxFigure.getText();
        assertNotNull(model);
        assertNotNull(figure);
        assertNotNull(listBoxFigure);
        assertNotNull(textBoxFigure);
        assertNotNull(text);
    }
    
    @Test
    void testCreateNewExplorerModelWithFigureExplorerModelExplorerFigureListBoxFigureTextBoxFigureTextEmpty() {
        ExplorerModelBuilder builder = ExplorerModelBuilder.getInstance();
        ExplorerModel model = builder.createNewExplorerModelWithFigure();
        ExplorerFigure figure = model.getExplorerFigure();
        ListBoxFigure listBoxFigure = figure.getListBoxFigure();
        TextBoxFigure textBoxFigure = listBoxFigure.getTextBoxFigure();
        String text = textBoxFigure.getText();
        assertTrue(text.isEmpty());
    }
    
    @Test
    void testCreateNewExplorerModelWithFigureExplorerModelExplorerFigureListBoxFigureTextBoxFigureEditable() {
        ExplorerModelBuilder builder = ExplorerModelBuilder.getInstance();
        ExplorerModel model = builder.createNewExplorerModelWithFigure();
        ExplorerFigure figure = model.getExplorerFigure();
        ListBoxFigure listBoxFigure = figure.getListBoxFigure();
        TextBoxFigure textBoxFigure = listBoxFigure.getTextBoxFigure();
        assertTrue(textBoxFigure.isEditable());
    }
    
    @Test
    void testCreateNewExplorerModelWithFigureExplorerModelExplorerFigureListBoxFigureTextBoxFigureNotSelected() {
        ExplorerModelBuilder builder = ExplorerModelBuilder.getInstance();
        ExplorerModel model = builder.createNewExplorerModelWithFigure();
        ExplorerFigure figure = model.getExplorerFigure();
        ListBoxFigure listBoxFigure = figure.getListBoxFigure();
        assertFalse(listBoxFigure.isSelected());
    }
}