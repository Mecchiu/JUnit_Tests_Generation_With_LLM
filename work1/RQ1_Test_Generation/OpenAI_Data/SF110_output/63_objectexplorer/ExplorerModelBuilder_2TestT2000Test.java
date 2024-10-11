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
				assertEquals(result, ExplorerManager.INSTANCE.getExplorerModel(result.getFigure()));
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
				assertEquals(result, ExplorerManager.INSTANCE.getExplorerModel(result.getFigure()));
				assertEquals(result.getFigure(), ExplorerManager.INSTANCE.getExplorerModel(result.getFigure()).getFigure());
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
				assertEquals(result, ExplorerManager.INSTANCE.getExplorerModel(result.getFigure()));
				assertEquals(result.getFigure(), ExplorerManager.INSTANCE.getExplorerModel(result.getFigure()).getFigure());
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
				assertEquals(result, ExplorerManager.INSTANCE.getExplorerModel(result.getFigure()));
				assertEquals(result.getFigure(), ExplorerManager.INSTANCE.getExplorerModel(result.getFigure()).get