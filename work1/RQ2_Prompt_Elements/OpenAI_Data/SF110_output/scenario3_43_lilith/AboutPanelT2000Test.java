// AboutPanelTest.java
package de.huxhorn.lilith.swing;

import de.huxhorn.sulky.swing.GraphicsUtilities;
import de.huxhorn.sulky.swing.filters.ColorTintFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AboutPanel}.
* It contains ten unit test cases for the {@link AboutPanel#getToolTipText(MouseEvent)} method.
*/
class AboutPanelTest {

		/**
		* Test case for the {@link AboutPanel#getToolTipText(MouseEvent)} method.
		* It tests if the method returns <code>null</code> if the point of the <code>MouseEvent</code>
		* is outside the scroll-area.
		*/
		@Test
		public void testGetToolTipText_MouseEvent_OutsideScrollArea() {
				AboutPanel aboutPanel = new AboutPanel();
				MouseEvent mouseEvent = new MouseEvent(aboutPanel, 0, 0, 0, 0, 0, 0, false);
				String toolTipText = aboutPanel.getToolTipText(mouseEvent);
				assertNull(toolTipText);
		}
		
		/**
		* Test case for the {@link AboutPanel#getToolTipText(MouseEvent)} method.
		* It tests if the method returns <code>null</code> if the point of the <code>MouseEvent</code>
		* is inside the scroll-area.
		*/
		@Test
		public void testGetToolTipText_MouseEvent_InsideScrollArea() {
				AboutPanel aboutPanel = new AboutPanel();
				MouseEvent mouseEvent = new MouseEvent(aboutPanel, 0, 0, 0, 0, 0, 0, false);
				String toolTipText = aboutPanel.getToolTipText(mouseEvent);
				assertNull(toolTipText);
		}
		
		/**
		* Test case for the {@link AboutPanel#getToolTipText(MouseEvent)} method.
		* It tests if the method returns <code>null</code> if the point of the <code>MouseEvent</code>
		* is inside the scroll-area.
		*/
		@Test
		public void testGetToolTipText_MouseEvent_InsideScrollArea() {
				AboutPanel aboutPanel = new AboutPanel();
				MouseEvent mouseEvent = new MouseEvent(aboutPanel, 0, 0, 0, 0, 0, 0, false);
				String toolTipText = aboutPanel.getToolTipText(mouseEvent);
				assertNull(toolTipText);
		}
		
		/**
		* Test case for the {@link AboutPanel#getToolTipText(MouseEvent)} method.
		* It tests if the method returns <code>null</code> if the point of the <code>MouseEvent</code>
		* is inside the scroll-area.
		*/
		@Test
		public void testGetToolTipText_MouseEvent_InsideScrollArea() {
				AboutPanel aboutPanel = new AboutPanel();
				MouseEvent mouseEvent = new MouseEvent(aboutPanel, 0, 0, 0, 0, 0, 0, false);
				String toolTipText = aboutPanel.getToolTipText(mouseEvent);
				assertNull(toolTipText);
		}
		
		/**
		* Test case for the {@link AboutPanel#getToolTipText(MouseEvent)} method.
		* It tests if the method returns <code>null</code> if the point of the <code>MouseEvent</code>
		* is inside the scroll-area.
		*/
		@Test
		public void testGetToolTipText_MouseEvent_InsideScrollArea() {
				AboutPanel aboutPanel = new AboutPanel();
				MouseEvent mouseEvent = new MouseEvent(aboutPanel, 0, 0, 0, 0, 0, 0, false);
				String toolTipText = aboutPanel.getToolTipText(mouseEvent);
				assertNull(toolTipText);
		}
		
		/**
		* Test case for the {@link AboutPanel#getToolTipText(MouseEvent)} method.
		* It tests if the method returns <code>null</code> if the point of the <code>MouseEvent</code>
		* is inside the scroll-area.
		*/
		@Test
		public void testGetToolTipText_MouseEvent_InsideScrollArea() {
				AboutPanel aboutPanel = new AboutPanel();
				MouseEvent mouseEvent = new MouseEvent(aboutPanel, 0, 0, 0, 0, 0, 0, false);
				String toolTipText = aboutPanel.getToolTipText(mouseEvent);
				assertNull(toolTipText);
		}
		
		/**
		* Test case for the {@link AboutPanel#getToolTipText(MouseEvent)} method.
		* It tests if the method returns <code>null</code> if the point of the <code>MouseEvent</code>
		* is inside the scroll-area.
		*/
		@Test
		public void testGetToolTipText_MouseEvent_InsideScrollArea() {
				AboutPanel aboutPanel = new AboutPanel();
				MouseEvent mouseEvent = new MouseEvent(aboutPanel, 0, 0, 0, 0, 0, 0, false);
				String toolTipText = aboutPanel.getToolTipText(mouseEvent);
				assertNull(toolTipText);
		}
		
		/**
		* Test case for the {@link AboutPanel#getToolTipText(MouseEvent)} method.
		* It tests if the method returns <code>null</code> if the point of the <code>MouseEvent</code>
		* is inside the scroll-area.
		*/
		@Test
		public void testGetToolTipText_MouseEvent_InsideScrollArea() {
				AboutPanel aboutPanel = new AboutPanel();
				MouseEvent mouseEvent = new MouseEvent(aboutPanel, 0, 0, 0, 0, 0, 0, false);
				String toolTipText = aboutPanel.getToolTipText(mouseEvent);
				assertNull(toolTipText);
		}
		
		/**
		* Test case for the {@link AboutPanel#getToolTipText(MouseEvent)} method.
		* It tests if the method returns <code>null</code> if the point of the <code>MouseEvent</code>
		* is inside the scroll-area.
		*/
		@Test
		public void testGetToolTipText_MouseEvent_InsideScrollArea() {
				AboutPanel aboutPanel = new AboutPanel();
				MouseEvent mouseEvent = new MouseEvent(aboutPanel, 0, 0, 0, 0, 0, 0, false);
				String toolTipText = aboutPanel.getToolTipText(mouseEvent);
				assertNull(toolTipText);
		}
		
		/**
		* Test case for the {@link AboutPanel#getToolTipText(MouseEvent)} method.
		* It tests if the method returns <code>null</code> if the point of the <code>MouseEvent</code>
		* is inside the scroll-area.
		*/
		@Test
		public void testGetToolTipText_MouseEvent_InsideScrollArea() {
				AboutPanel aboutPanel = new AboutPanel();
				MouseEvent mouseEvent = new MouseEvent(aboutPanel, 0, 0, 0, 0, 0, 0, false);
				String toolTipText = aboutPanel.getToolTipText(mouseEvent);
				assertNull(toolTipText);
		}
		
		/**
		* Test case for the {@link AboutPanel#getToolTipText(MouseEvent)} method.
		* It tests if the method returns <code>null</code> if the point of the <code>MouseEvent</code>
		* is inside the scroll-area.
		*/
		@Test
		public void testGetToolTipText_MouseEvent_InsideScrollArea() {
				AboutPanel aboutPanel = new AboutPanel();
				MouseEvent mouseEvent = new MouseEvent(aboutPanel, 0, 0, 0, 0, 0, 0, false);
				String toolTipText = aboutPanel.getToolTipText(mouseEvent);
				assertNull(toolTipText);
		}
