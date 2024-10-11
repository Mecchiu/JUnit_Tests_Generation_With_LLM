// ExplorerModelBuilderTest.java
package de.paragon.explorer.model;

import de.paragon.explorer.figure.ExplorerFigureBuilder;
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
        assertNotNull(model.getExplorerFigure());
    }

    @Test
    void testCreateNewExplorerModelWithFigureReturnsDifferentModels() {
        ExplorerModelBuilder builder = new ExplorerModelBuilder();
        ExplorerModel model1 = builder.createNewExplorerModelWithFigure();
        ExplorerModel model2 = builder.createNewExplorerModelWithFigure();
        assertNotSame(model1, model2);
    }

    @Test
    void testCreateNewExplorerModelWithFigureReturnsDifferentFigures() {
        ExplorerModelBuilder builder = new ExplorerModelBuilder();
        ExplorerModel model1 = builder.createNewExplorerModelWithFigure();
        ExplorerModel model2 = builder.createNewExplorerModelWithFigure();
        assertNotSame(model1.getExplorerFigure(), model2.getExplorerFigure());
    }

    @Test
    void testCreateNewExplorerModelWithFigureReturnsExplorerFigure() {
        ExplorerModelBuilder builder = new ExplorerModelBuilder();
        ExplorerModel model = builder.createNewExplorerModelWithFigure();
        assertTrue(model.getExplorerFigure() instanceof ExplorerFigureBuilder);
    }

    @Test
    void testCreateNewExplorerModelWithFigureReturnsListBoxFigure() {
        ExplorerModelBuilder builder = new ExplorerModelBuilder();
        ExplorerModel model = builder.createNewExplorerModelWithFigure();
        assertTrue(model.getExplorerFigure().getListBoxFigure() instanceof ListBoxFigure);
    }

    @Test
    void testCreateNewExplorerModelWithFigureReturnsTextBoxFigure() {
        ExplorerModelBuilder builder = new ExplorerModelBuilder();
        ExplorerModel model = builder.createNewExplorerModelWithFigure();
        assertTrue(model.getExplorerFigure().getTextBoxFigure() instanceof TextBoxFigure);
    }

    @Test
    void testCreateNewExplorerModelWithFigureReturnsExplorerDrawingPanel() {
        ExplorerModelBuilder builder = new ExplorerModelBuilder();
        ExplorerModel model = builder.createNewExplorerModelWithFigure();
        assertTrue(model.getExplorerFigure().getExplorerDrawingPanel() instanceof ExplorerDrawingPanel);
    }

    @Test
    void testCreateNewExplorerModelWithFigureReturnsExplorerManager() {
        ExplorerModelBuilder builder = new ExplorerModelBuilder();
        ExplorerModel model = builder.createNewExplorerModelWithFigure();
        assertTrue(model.getExplorerFigure().getExplorerManager() instanceof ExplorerManager);
    }

    @Test
    void testCreateNewExplorerModelWithFigureConnectsModelAndFigure() {
        ExplorerModelBuilder builder = new ExplorerModelBuilder();
        ExplorerModel model = builder.createNewExplorerModelWithFigure();
        assertEquals(model, model.getExplorerFigure().getExplorerModel());
    }

    @Test
    void testCreateNewExplorerModelWithFigureConnectsFigureAndModel() {
        ExplorerModelBuilder builder = new ExplorerModelBuilder();
        ExplorerModel model = builder.createNewExplorerModelWithFigure();
        assertEquals(model.getExplorerFigure(), model.getExplorerFigure().getExplorerModel().getExplorerFigure());
    }
}