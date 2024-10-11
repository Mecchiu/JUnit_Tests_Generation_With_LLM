// ConditionalBorder_0Test.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.*;
import javax.swing.border.AbstractBorder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConditionalBorder}.
* It contains one unit test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
*/
class ConditionalBorder_0Test {
		
		/**
		 * Unit test for calling {@link AbstractBorder#getBorderInsets(Component)} via reflection.
		 */
		@Test
		public void getBorderInsets() {
			// Arrange
			Container cont = new Container();			
			final Border border = new CustomLineBorder();
			
			// Act
			Class<? extends Border> expectedClass = CustomLineBorder.class;
			Border borderToReturn = AbstractBorder.getBorder(BorderInfo.EMPTY, border, cont, null);
			assertEquals(expectedClass, borderToReturn.getClass());
			
			// Assert
			assertNotNull(borderToReturn);
			assertTrue(borderToReturn instanceof AbstractBorder);
			
			// Assert
			assertTrue(ObjectUtilities.setEquals(border, borderToReturn, cont));
		}
		
		/**
		 * Unit test for calling {@link AbstractBorder#getBorderInsets(Component)} via reflection.
		 */
		@Test
		public void getBorderInsets_JUnit5() {
			
			// Arrange
			final Border b = new CustomLineBorder();
			Object toReturn = AbstractBorder.getBorder(BorderInfo.EMPTY, b, new Container(), null);
			assertTrue(ObjectUtilities.setEquals(b, toReturn, null));
			
			// Assert
			assertNotNull(toReturn);
			assertTrue(toReturn instanceof Border);
			
			// Assert
			assertTrue(AbstractBorder.getBorder(toReturn, new Container(), null) instanceof CustomLineBorder);
			
			// Act
			toReturn = AbstractBorder.getBorder(toReturn, new Container(), null);
			assertTrue(ObjectUtilities.setEquals(toReturn, b, null));
			
			// Assert
			assertTrue(AbstractBorder.getBorder(toReturn, new Container(), null) instanceof CustomLineBorder);
			
		}
		
		/**
		 * Unit test for calling {@link AbstractBorder#getBorderInsets(Component)} via reflection.
		 */
		@Test
		public void getBorderInsets_JUnit5_1() {
			
			// Arrange
			final Border b = new CustomLineBorder();
			Class<?>  classToReturn = CustomLineBorder.class;
			Object toReturn = AbstractBorder.getBorder(classToReturn, b, new Container(), null);
			assertEquals(classToReturn, toReturn);
			
			// Assert
			assertNotNull(toReturn);
			assertTrue(toReturn instanceof Border);
			
			// Assert
			assertTrue(AbstractBorder.getBorder(toReturn, b, new Container(), null) instanceof CustomLineBorder);
			
			// Act
			toReturn = AbstractBorder.getBorder(toReturn, b, null);
			assertTrue(ObjectUtilities.setEquals(toReturn, b, null));
			
			// Assert
			assertTrue(AbstractBorder.getBorder(toReturn, b, null) instanceof CustomLineBorder);
			
		}
		
		/**
		 * Unit test for calling {@link AbstractBorder#getBorderInsets(Component)} via reflection.
		 */
		@Test
		public void getBorderInsets_JUnit5_2() {
			// Arrange
			final Border b = new CustomLineBorder();
			Class<?>  classToReturn = CustomLineBorder.class;
			Object toReturn = AbstractBorder.getBorder(classToReturn, b, toReturn, null);
			assertNotNull(toReturn);
			assertTrue(toReturn instanceof Border);
			
			// Assert
			assertTrue(AbstractBorder.getBorder(toReturn, b, toReturn, null) instanceof CustomLineBorder);
			
			// Act
			toReturn = AbstractBorder.getBorder(toReturn, b, toReturn, null);
			assertTrue(ObjectUtilities.setEquals(toReturn, b, null));
			
			// Assert
			assertTrue(AbstractBorder.getBorder(toReturn, b, toReturn, null) instanceof CustomLineBorder);
			
			// Act
			toReturn = AbstractBorder.getBorder(toReturn, b, toReturn, null);
			assertTrue(ObjectUtilities.setEquals(toReturn, b, null));
			
			// Assert
			assertTrue(AbstractBorder.getBorder(toReturn, b, toReturn, null) instanceof CustomLineBorder);
			
		}
}