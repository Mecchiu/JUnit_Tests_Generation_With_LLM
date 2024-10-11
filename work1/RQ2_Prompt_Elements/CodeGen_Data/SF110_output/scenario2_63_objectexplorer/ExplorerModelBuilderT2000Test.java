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

	private ExplorerModelBuilder t = new ExplorerModelBuilder();
    @Test
    public void testCreateNewExplorerModelWithFigure() {
        final ExplorerFigure explFig = this.t.getExplorerFigureBuilder().createNewExplorerFigure();
        this.t.connect(explFig, false);
        this.t.buildModel(new ExplorerManager<>(explFig));
        
        assertNotNull(explFig);
        assertEquals(explFig.getExplorerFigure(), this.t.explorerFigure.getExplorerFigure());
    } 
	
    @Test
    public void testCreateExplorerCollectionOfAllExplorers() {
        final ExplorerManager<ExplorerModel<ExplorerFigure>> explMan = new ExplorerManager<>();
        this.t.buildModel(explMan);
        assertNotNull(explMan);
        assertFalse(explMan.getExplorerFigureByIndex(0).getExplorerFigure().getExplorerFigure().isVisible());
       
    }
    
    @Test
    public void buildModel() {
        final ExplorerManager<ExplorerModel<ExplorerFigure>> explMan = new ExplorerManager<>();
        assertTrue(explMan.getExplorerFigureByIndex(0).getExplorerFigure().getExplorerFigure().isVisible());
        
    } 
	
    @Test
    void connect(final ExplorerFigure explFig, final ExplorerFigure explOut) {
        this.t.connect(explFig, explOut);
        assertEquals(explFig.getExplorerFigure().getExplorerFigure(), explOut);
     }
}