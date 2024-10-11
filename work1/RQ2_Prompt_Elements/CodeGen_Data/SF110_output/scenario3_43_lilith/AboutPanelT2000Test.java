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
// AboutPanel.java
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

/**
 * <code>AboutPanel</code> is a component which has a background-image and a
 * rectangle in which a given text is scrolling (the scroll-area). You may also
 * specify an Image (e.g. a png-file with alpha-channel) that is drawn before
 * the scroll-text itself. An optional version-string may be given that will be
 * painted centered relative to the scroll-area.
 *
 * @author Joern Huxhorn
 */
public class AboutPanel extends JComponent {

    /**
     * This method returns ScrollAreaToolTipText if the point of the <code>MouseEvent</code>
     * is inside the scroll-area and <code>null</code> otherwise.<p />
     * <p/>
     * It's needed by the <code>ToolTipManager</code>.
     *
     * @param evt a <code>MouseEvent</code>.
     * @return The toolTipText value for the <code>ToolTipManager</code>.
     */
    public String getToolTipText(MouseEvent evt);
}

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
		* Initializes the Test object for an unit test.
		*/
	@Test
    public void runTest() {
        final JFrame frame = new JFrame("AboutPanelTest");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        AboutPanel aboutPanel = new AboutPanel(frame);
        aboutPanel.setPreferredSize(new Dimension(300, 300));
        final Font font = frame.getFont();
        final Font plainFont = new Font("SansSerif", Font.BOLD, 48);
        frame.setFont(new Font(plainFont, Font.PLAIN, 40));
        final BufferedImage originalImage = new BufferedImage(300, 300, BufferedImage.TYPE_4BYTE_ABGR);
        final BufferedImageOp op = new ConvolveOp(originalImage, null);
        final BufferedImage img = op.filter(originalImage, null);
        final Color color = Color.BLACK;
        int colorIndex = aboutPanel.getBackground().getRGB() & 0x00FFFFFF;
        aboutPanel.setBackground(Color.WHITE);
        aboutPanel.addPropertyChangeListener("background", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent e) {
                AboutPanel.this.setSize(aboutPanel.getPreferredSize());
                aboutPanel.setPreferredSize(aboutPanel.getPreferredSize());
                aboutPanel.setBackground(Color.BLACK);
            }
        });
        String text = aboutPanel.getToolTipText(new MouseEvent(aboutPanel,  MouseEvent.MOUSE_PRESSED, 0, 0,   2, 1, MouseEvent.BUTTON1));
        assertTrue("toolTip text should be present.", text!= null);
        // check if the background is set correctly
        color = aboutPanel.getBackground().getRGB();
        colorIndex = aboutPanel.getBackground().getRGB() & 0x00FFFFFF;
        assertTrue("background color was not corrected.", (color.getRed() == colorIndex));
        // test a text inside the scroll-area
        text = aboutPanel.getToolTipText(new MouseEvent(aboutPanel,  MouseEvent.MOUSE_RELEASED, 0, 0,   2, 1, MouseEvent.BUTTON1));
        aboutPanel.getToolTipText(new MouseEvent(aboutPanel,  MouseEvent.MOUSE_PRESSED, 0, 0,   1, 1, MouseEvent.BUTTON1));
        aboutPanel.getToolTipText(new MouseEvent(aboutPanel,  MouseEvent.MOUSE_RELEASED, 0, 0,   2, 1, MouseEvent.BUTTON1));
        assertEquals("toolTip text was not properly rendered.", "", text);
        aboutPanel.getToolTipText(new MouseEvent(aboutPanel, MouseEvent.MOUSE_CLICKED, 0, 0,   1, 1, MouseEvent.BUTTON1));
        aboutPanel.getToolTipText(new MouseEvent(aboutPanel, MouseEvent.MOUSE_CLICKED, 0, 0,   3, 0, MouseEvent.ALT_MASK));
        assertEquals("toolTip text was not proper transformed.", aboutPanel, aboutPanel.getParent());
        frame.setVisible(false);
        aboutPanel.removePropertyChangeListener("preferredSize", aboutPanel);
        aboutPanel.removeAll();
        aboutPanel.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentHidden(ComponentEvent e) {
                 if (aboutPanel.getPreferredSize().height > 300) {
                     aboutPanel.setSize(aboutPanel.getPreferredSize());
                     aboutPanel.setPreferredSize(aboutPanel.getPreferredSize());
                 }
            }
        });
        aboutPanel.adjustSize();
        aboutPanel.getContentPane().setLayout(new BorderLayout());
        aboutPanel.getContentPane().add(aboutPanel, BorderLayout.NORTH);
        aboutPanel.getContentPane().add(new JLabel("AboutPanelTest"), BorderLayout.SOUTH);
        aboutPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                aboutPanel.removeAll();
                aboutPanel.removePropertyChangeListener("preferredSize", aboutPanel);
                aboutPanel.addComponentListener(new ComponentAdapter() {
                    @Override
                    public void componentHidden(ComponentEvent e) {
                        aboutPanel.setPreferredSize(aboutPanel.getPreferredSize());
                        aboutPanel.setPreferredSize(aboutPanel.getPreferredSize());
                    }
                });
                aboutPanel.addMouseInputAdapter(new MouseInputAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        aboutPanel.setSize(aboutPanel.getPreferred