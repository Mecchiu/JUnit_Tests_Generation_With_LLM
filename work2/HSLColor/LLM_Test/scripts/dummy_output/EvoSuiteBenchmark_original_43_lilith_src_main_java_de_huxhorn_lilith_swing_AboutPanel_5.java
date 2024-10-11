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
* It contains one unit test case for the {@link AboutPanel#getToolTipText(MouseEvent)} method.
*/
class AboutPanelTest {
		
	// PropertyChangeListener:
	@SuppressWarnings("rawtypes")
	private class MovedUpPropertyChangeListener extends PropertyChangeListener {
		MovedUpPropertyChangeListener() {
			this.mousePressed = false;
		}

		@Override
		public void propertyChange(PropertyChangeEvent evt) {
			if (evt.getPropertyName() == "movedUp") {
				this.mousePressed = true;
			}
		}}


	/**
	 * Tests whether the scroll-area is currently displayed.
	 *
	 * @throws Exception
	 * @see AboutPanel#getToolTipText(MouseEvent)
	 */
	@Test
	void getToolTipText() throws Exception {
		// JPanel:
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(10,10));
		PanelWrapper wrapper = new PanelWrapper(panel);
		JPanel scrollArea = new JPanel() {
			@Override
			public Dimension getPreferredSize() {
				Dimension d = super.getPreferredSize();
				d.width = 120;
				return d;
			}};

		// set up scrolling-area:
		final String scrollText = "ScrollArea - TestText"; //$NON-NLS-1$
		scrollArea.add(new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 10, 10));
		scrollArea.add(new JScrollBar(JScrollBar.VERTICAL, 0, 1, 10, 10));
		scrollArea.add(new JTextArea());

		//
		AboutPanel sp1 = new AboutPanel(panel);
		sp1.setBorderColor(Color.GRAY);
		sp1.setBackground(Color.BLACK);
		sp1.setScrollColor(Color.BLACK.brighter());

		sp1.addPropertyChangeListener(new MovedUpPropertyChangeListener());
		sp1.setToolTipText(scrollText);
		Thread.sleep(500);

		//
		sp1.setScrollColor(Color.GREEN.brighter());
		assertNotNull(sp1.getToolTipText());
		assertNotNull(scrollText);
		assertEquals("ToolTipText should not be null", scrollText, sp1.getToolTipText());
		assertTrue(sp1.isScrollable());
		assertTrue(scrollArea.isScrollable());
		assertEquals("ScrollColor should be green", Color.GREEN, sp1.getScrollColor());
		assertEquals("BackgroundColor should be green", Color.GREEN, scrollArea.getBackground());

		//
		sp1.setScrollColor(Color.LIGHT_GRAY);
		assertNotNull(sp1.getToolTipText());
		assertNotNull(scrollText);
		sp1.setScrollColor(Color.RED.brighter().darker().brighter());
		assertNotNull(sp1.getToolTipText());
		assertNotNull(scrollText);
		assertEquals("ToolTipText should not be null", scrollText, sp1.getToolTipText());
		assertFalse(scrollArea.isScrollable());
		assertFalse(scrollArea.isScrollable());
		Thread.sleep(500);
		//
		sp1.setScrollColor(Color.GRAY.brighter().brighter().brighter());
		assertNotNull(sp1.getToolTipText());
		assertNotNull(scrollText);
		assertTrue(scrollText, sp1.getToolTipText().contains("ScrollText"));
		assertTrue(scrollText, sp1.getToolTipText().contains("ToolTipText"));
		assertNotNull(scrollText);
		Thread.sleep(500);

		//
		sp1.setScrollColor(Color.BLACK.brighter().brighter());
		Thread.sleep(500);
		assertEquals("ToolTipText should be null", "ToolTipText", sp1.getToolTipText());
		assertEquals("ScrollColor should be null", Color.BLACK.brighter().brighter(), sp1.getScrollColor().brighter());
		assertEquals("BackgroundColor should be null", Color.BLACK, scrollArea.getBackground());

		//
		sp1.setScrollColor(Color.GRAY.BRIGHTER.brighter().brighter());
		assertNotNull(sp1.getToolTipText());
		assertNotNull(scrollText);
		assertTrue(scrollText, sp1.getToolTipText().contains("ScrollText"));
		assertTrue(scrollText, sp1.getToolTipText().contains("ToolTipText"));
		assertNotNull(scrollText);
		sp1.setScrollColor(Color.GREEN.brighter());
		assertNotNull(sp1.getToolTipText());
}
}