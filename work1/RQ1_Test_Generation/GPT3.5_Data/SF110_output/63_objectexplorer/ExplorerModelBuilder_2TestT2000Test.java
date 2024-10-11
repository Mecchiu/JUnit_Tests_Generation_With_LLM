```java
class ExplorerModelBuilder_2Test {

    @Test
    void testCreateNewExplorerModelWithFigureNotNull() {
        ExplorerModelBuilder explorerModelBuilder = ExplorerModelBuilder.getInstance();
        ExplorerModel explorerModel = explorerModelBuilder.createNewExplorerModelWithFigure();
        assertNotNull(explorerModel);
        assertNotNull(explorerModel.getFigure());
    }

    @Test
    void testCreateNewExplorerModelWithFigureFigureType() {
        ExplorerModelBuilder explorerModelBuilder = ExplorerModelBuilder.getInstance();
        ExplorerModel explorerModel = explorerModelBuilder.createNewExplorerModelWithFigure();
        assertTrue(explorerModel.getFigure() instanceof ExplorerFigure);
    }

    @Test
    void testCreateNewExplorerModelWithFigureConnection() {
        ExplorerModelBuilder explorerModelBuilder = ExplorerModelBuilder.getInstance();
        ExplorerModel explorerModel = explorerModelBuilder.createNewExplorerModelWithFigure();
        assertNotNull(explorerModel.getFigure().getModel());
        assertNotNull(explorerModel.getModel());
    }

    @Test
    void testCreateNewExplorerModelWithFigureListBoxFigure() {
        ExplorerModelBuilder explorerModelBuilder = ExplorerModelBuilder.getInstance();
        ExplorerModel explorerModel = explorerModelBuilder.createNewExplorerModelWithFigure();
        assertTrue(explorerModel.getFigure() instanceof ListBoxFigure);
    }

    @Test
    void testCreateNewExplorerModelWithFigureExplorerManager() {
        ExplorerModelBuilder explorerModelBuilder = ExplorerModelBuilder.getInstance();
        ExplorerModel explorerModel = explorerModelBuilder.createNewExplorerModelWithFigure();
        assertNotNull(explorerModelBuilder.getExplorerManager());
        explorerModelBuilder.getExplorerManager().addExplorerModel(explorerModel);
        assertTrue(explorerModelBuilder.getExplorerManager().getExplorerModels().contains(explorerModel));
    }

    @Test
    void testCreateNewExplorerModelWithFigureEventConverter() {
        ExplorerModelBuilder explorerModelBuilder = ExplorerModelBuilder.getInstance();
        ExplorerModel explorerModel = explorerModelBuilder.createNewExplorerModelWithFigure();
        assertNotNull(explorerModel.getDrawingFrameEventConverter());
    }

    @Test
    void testCreateNewExplorerModelWithFigurePanel() {
        ExplorerModelBuilder explorerModelBuilder = ExplorerModelBuilder.getInstance();
        ExplorerModel explorerModel = explorerModelBuilder.createNewExplorerModelWithFigure();
        assertNotNull(explorerModel.getFigure().getPanel());
    }

    @Test
    void testCreateNewExplorerModelWithFigureRepaint() {
        ExplorerModelBuilder explorerModelBuilder = ExplorerModelBuilder.getInstance();
        ExplorerModel explorerModel = explorerModelBuilder.createNewExplorerModelWithFigure();
        explorerModel.getFigure().repaint();
        // No assertion as this is a void method
    }

    @Test
    void testCreateNewExplorerModelWithFigureSingleton() {
        ExplorerModelBuilder explorerModelBuilder = ExplorerModelBuilder.getInstance();
        ExplorerModel explorerModel = explorerModelBuilder.createNewExplorerModelWithFigure();
        assertEquals(explorerModelBuilder, ExplorerModelBuilder.getSingleton());
    }

    @Test
    void testCreateNewExplorerModelWithFigureObjectModel() {
        ExplorerModelBuilder explorerModelBuilder = ExplorerModelBuilder.getInstance();
        ExplorerModel explorerModel = explorerModelBuilder.createNewExplorerModelWithFigure();
        assertNotNull(explorerModel.getObjectModels());
    }
}
```
```