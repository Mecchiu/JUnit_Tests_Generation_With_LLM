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
		/**
		* Test with empty component with no text.
		*/
	@Test
	void testEmpty_1() {
		//@formatter:off
		assertSame(ColorTintFilter.NEVER_SELECTED, GraphicsUtilities.createColorTintFilter());
        //@formatter:on
		JFrame frame = new JFrame();
		JTextField textField = new JTextField(" ");
		textField.setOpaque(true);
		AboutPanel panel = new AboutPanel(frame, textField);
		//@formatter:off
        frame.getContentPane().add(panel, BorderLayout.CENTER);
		String tooltip = panel.getToolTipText(new MouseEvent(textField, 0, true, 0, 0, 0, 0, 0, false));
		//@formatter:off
        assertTrue(tooltip.startsWith("<html>"));
        //@formatter:on
		aboutPanel(frame);
	}
	/**
	* Test with text (no color).
	*/
	@Test
	void testEmpty_2() {
		//@formatter:off
		assertNull( GraphicsUtilities.createColorTintFilter());
        //@formatter:on
		JFrame frame = new JFrame();
		JTextField textField = new JTextField(" ");
		textField.setOpaque(true);
		AboutPanel panel = new AboutPanel(frame);
		aboutPanel(frame);
		//@formatter:off
        frame.getContentPane().add(panel, BorderLayout.CENTER);
		//@formatter:off
		aboutPanel(frame);
	}
	/**
	* Test with text and a color.
	*/
	@Test
	void testColor() {
		//@formatter:off
    	assertNotNull(GraphicsUtilities.createColorTintFilter());
//        assertEquals(Color.BLUE, GraphicsUtilities.createColorTintFilter().getTintColor());
        //@formatter:on
		JFrame frame = new JFrame();
		JTextField textField = new JTextField(" ");
		textField.setOpaque(true);
		AboutPanel panel = newAboutPanel(frame);
		BorderLayout layout = new BorderLayout (0, 0);
		frame.getContentPane().add(panel, layout);
		aboutPanel(frame);
		//@formatter:off
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        aboutPanel(frame);

		aboutPanel(frame);

		aboutPanel(frame);
	}
	/**
	* Test with text and a color and text color.
	*/
	@Test
	void testColorTextColor() {
		//@formatter:off
    	assertNotNull(GraphicsUtilities.createColorTintFilter());
//        assertEquals(Color.BLUE, GraphicsUtilities.createColorTintFilter().getTintColor());
        aboutPanel(new JFrame());
	}
	/**
	 * Tests the <code>ColorTintFilter</code> in a Swing-Frame-like environment.
	 */
	private void aboutPanel(JFrame frame) {
		//@formatter:off
		frame.getContentPane().add(new JLabel("AboutPanel"), BorderLayout.CENTER);
        //@formatter:on
		Color color = frame.getContentPane().getBackground();
		assertNotNull(frame.getContentPane().getBackground());
	}
	/**
	 * Test with text and an img for the icon.
	 */
	@Test
	public void testIcon() {
		//@formatter:off
        System.setProperty("sun.awt.disableXdpiOverride", "true");
        JFrame frame = new JFrame();
        Icon icon = new BufferedImage(25, 25, BufferedImage.TYPE_INT_ARGB);
		icon.getGraphics().setBackground(Color.white);
        BufferedImageOp iconOp = new ConvolveOp(icon, new Kernel(25, 25, 0.125f), null);
        JPanel iconPanel = new JPanel();
        iconPanel.setBackground(Color.white);
        iconPanel.setOpaque(true);
        Icon icon_2 = new BufferedImage(25, 25, BufferedImage.TYPE_INT_ARGB);
        icon_2.getGraphics().setBackground(Color.white);
        BufferedImageOp op_2 = new ConvolveOp(icon_2, new Kernel(25, 25, 0.0f), null);
        JPanel buttonPanel = new JPanel();
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(new JRadioButton("Yes"));
        buttonGroup.add(new JRadioButton("No"));
}
}