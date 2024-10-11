// ExplorerModelBuilder_2Test.java
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
class ExplorerModelBuilder_2Test {

		/**
		* Test case for {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()}.
		* It tests if the method returns a new instance of {@link ExplorerModel}.
		*/
		@Test
		void testCreateNewExplorerModelWithFigure() {
				ExplorerModelBuilder instance = ExplorerModelBuilder.getInstance();
				ExplorerModel result = instance.createNewExplorerModelWithFigure();
				assertNotNull(result);
		}
		
		/**
		* Test case for {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()}.
		* It tests if the method returns a new instance of {@link ExplorerModel} with a new instance of {@link ExplorerFigure}.
		*/
		@Test
		void testCreateNewExplorerModelWithFigure_2() {
				ExplorerModelBuilder instance = ExplorerModelBuilder.getInstance();
				ExplorerModel result = instance.createNewExplorerModelWithFigure();
				assertNotNull(result.getFigure());
		}
		
		/**
		* Test case for {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()}.
		* It tests if the method returns a new instance of {@link ExplorerModel} with a new instance of {@link ExplorerFigure} and if the {@link ExplorerModel} is connected to the {@link ExplorerFigure}.
		*/
		@Test
		void testCreateNewExplorerModelWithFigure_3() {
				ExplorerModelBuilder instance = ExplorerModelBuilder.getInstance();
				ExplorerModel result = instance.createNewExplorerModelWithFigure();
				assertNotNull(result.getFigure());
				assertEquals(result, result.getFigure().getModel());
		}
		
		/**
		* Test case for {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()}.
		* It tests if the method returns a new instance of {@link ExplorerModel} with a new instance of {@link ExplorerFigure} and if the {@link ExplorerModel} is connected to the {@link ExplorerFigure} and if the {@link ExplorerFigure} is connected to the {@link ExplorerModel}.
		*/
		@Test
		void testCreateNewExplorerModelWithFigure_4() {
				ExplorerModelBuilder instance = ExplorerModelBuilder.getInstance();
				ExplorerModel result = instance.createNewExplorerModelWithFigure();
				assertNotNull(result.getFigure());
				assertEquals(result, result.getFigure().getModel());
				assertEquals(result.getFigure(), result.getFigure().getModel().getFigure());
		}
		
		/**
		* Test case for {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()}.
		* It tests if the method returns a new instance of {@link ExplorerModel} with a new instance of {@link ExplorerFigure} and if the {@link ExplorerModel} is connected to the {@link ExplorerFigure} and if the {@link ExplorerFigure} is connected to the {@link ExplorerModel} and if the {@link ExplorerModel} is connected to the {@link ExplorerManager}.
		*/
		@Test
		void testCreateNewExplorerModelWithFigure_5() {
				ExplorerModelBuilder instance = ExplorerModelBuilder.getInstance();
				ExplorerModel result = instance.createNewExplorerModelWithFigure();
				assertNotNull(result.getFigure());
				assertEquals(result, result.getFigure().getModel());
				assertEquals(result.getFigure(), result.getFigure().getModel().getFigure());
				assertEquals(result, ExplorerManager.INSTANCE.getExplorerModel(0));
		}
		
		/**
		* Test case for {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()}.
		* It tests if the method returns a new instance of {@link ExplorerModel} with a new instance of {@link ExplorerFigure} and if the {@link ExplorerModel} is connected to the {@link ExplorerFigure} and if the {@link ExplorerFigure} is connected to the {@link ExplorerModel} and if the {@link ExplorerModel} is connected to the {@link ExplorerManager} and if the {@link ExplorerManager} is connected to the {@link ExplorerModel}.
		*/
		@Test
		void testCreateNewExplorerModelWithFigure_6() {
				ExplorerModelBuilder instance = ExplorerModelBuilder.getInstance();
				ExplorerModel result = instance.createNewExplorerModelWithFigure();
				assertNotNull(result.getFigure());
				assertEquals(result, result.getFigure().getModel());
				assertEquals(result.getFigure(), result.getFigure().getModel().getFigure());
				assertEquals(result, ExplorerManager.INSTANCE.getExplorerModel(0));
				assertEquals(ExplorerManager.INSTANCE.getExplorerModel(0), ExplorerManager.INSTANCE.getExplorerModel(0).getFigure().getModel());
		}
		
		/**
		* Test case for {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()}.
		* It tests if the method returns a new instance of {@link ExplorerModel} with a new instance of {@link ExplorerFigure} and if the {@link ExplorerModel} is connected to the {@link ExplorerFigure} and if the {@link ExplorerFigure} is connected to the {@link ExplorerModel} and if the {@link ExplorerModel} is connected to the {@link ExplorerManager} and if the {@link ExplorerManager} is connected to the {@link ExplorerModel} and if the {@link ExplorerModel} is connected to the {@link ExplorerDrawingPanel}.
		*/
		@Test
		void testCreateNewExplorerModelWithFigure_7() {
				ExplorerModelBuilder instance = ExplorerModelBuilder.getInstance();
				ExplorerModel result = instance.createNewExplorerModelWithFigure();
				assertNotNull(result.getFigure());
				assertEquals(result, result.getFigure().getModel());
				assertEquals(result.getFigure(), result.getFigure().getModel().getFigure());
				assertEquals(result, ExplorerManager.INSTANCE.getExplorerModel(0));
				assertEquals(ExplorerManager.INSTANCE.getExplorerModel(0), ExplorerManager.INSTANCE.getExplorerModel(0).getFigure().getModel());
				assertEquals(result.getFigure().getPanel(), result.getFigure().getModel().getFigure().getPanel());
		}
		
		/**
		* Test case for {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()}.
		* It tests if the method returns a new instance of {@link ExplorerModel} with a new instance of {@link ExplorerFigure} and if the {@link ExplorerModel} is connected to the {@link ExplorerFigure} and if the {@link ExplorerFigure} is connected to the {@link ExplorerModel} and if the {@link ExplorerModel} is connected to the {@link ExplorerManager} and if the {@link ExplorerManager} is connected to the {@link ExplorerModel} and if the {@link ExplorerModel} is connected to the {@link ExplorerDrawingPanel} and if the {@link ExplorerDrawingPanel} is connected to the {@link ExplorerModel}.
		*/
		@Test
		void testCreateNewExplorerModelWithFigure_8() {
				ExplorerModelBuilder instance = ExplorerModelBuilder.getInstance();
				ExplorerModel result = instance.createNewExplorerModelWithFigure();
				assertNotNull(result.getFigure());
				assertEquals(result, result.getFigure().getModel());
				assertEquals(result.getFigure(), result.getFigure().getModel().getFigure());
				assertEquals(result, ExplorerManager.INSTANCE.getExplorerModel(0));
				assertEquals(ExplorerManager.INSTANCE.getExplorerModel(0), ExplorerManager.INSTANCE.getExplorerModel(0).getFigure().getModel());
				assertEquals(result.getFigure().getPanel(), result.getFigure().getModel().getFigure().getPanel());
				assertEquals(result.getFigure().getPanel(), result.getFigure().getModel().getFigure().getPanel().getModel().getFigure().getPanel());
		}
		
		/**
		* Test case for {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()}.
		* It tests if the method returns a new instance of {@link ExplorerModel} with a new instance of {@link ExplorerFigure} and if the {@link ExplorerModel} is connected to the {@link ExplorerFigure} and if the {@link ExplorerFigure} is connected to the {@link ExplorerModel} and if the {@link ExplorerModel} is connected to the {@link ExplorerManager} and if the {@link ExplorerManager} is connected to the {@link ExplorerModel} and if the {@link ExplorerModel} is connected to the {@link ExplorerDrawingPanel} and if the {@link ExplorerDrawingPanel} is connected to the {@link ExplorerModel} and if the {@link ExplorerModel} is connected to the {@link ExplorerFrameEventConverter}.
		*/
		@Test
		void testCreateNewExplorerModelWithFigure_9() {
				ExplorerModelBuilder instance = ExplorerModelBuilder.getInstance();
				ExplorerModel result = instance.createNewExplorerModelWithFigure();
				assertNotNull(result.getFigure());
				assertEquals(result, result.getFigure().getModel());
				assertEquals(result.getFigure(), result.getFigure().getModel().getFigure());
				assertEquals(result, ExplorerManager.INSTANCE.getExplorerModel(0));
				assertEquals(ExplorerManager.INSTANCE.getExplorerModel(0), ExplorerManager.INSTANCE.getExplorerModel(0).getFigure().getModel());
				assertEquals(result.getFigure().getPanel(), result.getFigure().getModel().getFigure().getPanel());
				assertEquals(result.getFigure().getPanel(), result.getFigure().getModel().getFigure().getPanel().getModel().getFigure().getPanel());
				assertEquals(result.getDrawingFrameEventConverter(), result.getFigure().getModel().getDrawingFrameEventConverter());
		}
		
		/**
		* Test case for {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()}.
		* It tests if the method returns a new instance of {@link ExplorerModel} with a new instance of {@link ExplorerFigure} and if the {@link ExplorerModel} is connected to the {@link ExplorerFigure} and if the {@link ExplorerFigure} is connected to the {@link ExplorerModel} and if the {@link ExplorerModel} is connected to the {@link ExplorerManager} and if the {@link ExplorerManager} is connected to the {@link ExplorerModel} and if the {@link ExplorerModel} is connected to the {@link ExplorerDrawingPanel} and if the {@link ExplorerDrawingPanel} is connected to the {@link ExplorerModel} and if the {@link ExplorerModel} is connected to the {@link ExplorerFrameEventConverter} and if the {@link ExplorerFrameEventConverter} is connected to the {@link ExplorerModel}.
		*/
		@Test
		void testCreateNewExplorerModelWithFigure_10() {
				ExplorerModelBuilder instance = ExplorerModelBuilder.getInstance();
				ExplorerModel result = instance.createNewExplorerModelWithFigure();
				assertNotNull(result.getFigure());
				assertEquals(result, result.getFigure().getModel());
				assertEquals(result.getFigure(), result.getFigure().getModel().getFigure());
				assertEquals(result, ExplorerManager.INSTANCE.getExplorerModel(0));
				assertEquals(ExplorerManager.INSTANCE.getExplorerModel(0), ExplorerManager.INSTANCE.getExplorerModel(0).getFigure().getModel());
				assertEquals(result.getFigure().getPanel(), result.getFigure().getModel().getFigure().getPanel());
				assertEquals(result.getFigure().getPanel(), result.getFigure().getModel().getFigure().getPanel().getModel().getFigure().getPanel());
				assertEquals(result.getDrawingFrameEventConverter(), result.getFigure().getModel().getDrawingFrameEventConverter());
				assertEquals(result.getDrawingFrameEventConverter(), result.getFigure().getModel().getDrawingFrameEventConverter().getModel().getDrawingFrameEventConverter());
		}
}

// ExplorerModelBuilder_Test.java
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
* It contains ten unit test cases for the {@link ExplorerModelBuilder#add1stModel(Object)} method.
*/
class ExplorerModelBuilder_Test {
		
		/**
		* Test case for {@link ExplorerModelBuilder#add1stModel(Object)}.
		* It tests if the method returns a new instance of {@link ExplorerDrawingPanel}.
		*/
		@Test
		void testAdd1stModel() {
				ExplorerModelBuilder instance = ExplorerModelBuilder.getInstance();
				ExplorerDrawingPanel result = instance.add1stModel(null);
				assertNotNull(result);
		}
		
		/**
		* Test case for {@link ExplorerModelBuilder#add1stModel(Object)}.
		* It tests if the method returns a new instance of {@link ExplorerDrawingPanel} with a new instance of {@link ExplorerModel}.
		*/
		@Test
		void testAdd1stModel_2() {
				ExplorerModelBuilder instance = ExplorerModelBuilder.getInstance();
				ExplorerDrawingPanel result = instance.add1stModel(null);
				assertNotNull(result.getModel());
		}
		
		/**
		* Test case for {@link ExplorerModelBuilder#add1stModel(Object)}.
		* It tests if the method returns a new instance of {@link ExplorerDrawingPanel} with a new instance of {@link ExplorerModel} and if the {@link ExplorerModel} is connected to the {@link ExplorerDrawingPanel}.
		*/
		@Test
		void testAdd1stModel_3() {
				ExplorerModelBuilder instance = ExplorerModelBuilder.getInstance();
				ExplorerDrawingPanel result = instance.add1stModel(null);
				assertNotNull(result.getModel());
				assertEquals(result, result.getModel().getFigure().getPanel());
		}
		
		/**
		* Test case for {@link ExplorerModelBuilder#add1stModel(Object)}.
		* It tests if the method returns a new instance of {@link ExplorerDrawingPanel} with a new instance of {@link ExplorerModel} and if the {@link ExplorerModel} is connected to the {@link ExplorerDrawingPanel} and if the {@link ExplorerDrawingPanel} is connected to the {@link ExplorerModel}.
		*/
		@Test
		void testAdd1stModel_4() {
				ExplorerModelBuilder instance = ExplorerModelBuilder.getInstance();
				ExplorerDrawingPanel result = instance.add1stModel(null);
				assertNotNull(result.getModel());
				