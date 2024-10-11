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
    public String getToolTipText(MouseEvent evt) {
        if (handleMouseEvent(evt)) {
            return scrollAreaToolTipText;
        }
        return null;
    }
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
		
    @Test
    void testDrawBorderAndContent() {
        JFrame frame = new ProgressDialog().showInitDialog();
        assertTrue(1 == frame.getContentPane().getComponentCount());
        
        List<String> options = new ArrayList<String>();
        options.add("-border: solid -background: white");
        options.add("-border: solid -background: black");
        options.add("-border: solid -background: black");
        options.add("-border: solid -background: white");
        
        List<String> text = new ArrayList<String>();
        text.add("Testing");
        
        final BufferedImage img1 = new BufferedImage(256, 256, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage img2 = new BufferedImage(256, 256, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage img3 = new BufferedImage(256, 256, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage img4 = new BufferedImage(256, 256, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage img5 = new BufferedImage(256, 256, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage img6 = new BufferedImage(256 * 2, 256 * 2, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage img7 = new BufferedImage(256, 256, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage img8 = new BufferedImage(256 * 2, 256 * 2, BufferedImage.TYPE_INT_ARGB);
        
        final ConvolveOp convOp = new ConvolveOp(new Kernel(4, 8, new int[]{0, 128, 0, 128}), null, ConvolveOp.EDGE_NO_OP, null);
        
        addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
            	if ("border".equals(evt.getPropertyName())) {
            		assertTrue(options.remove(str(evt.getNewValue())));
            	} else if ("content".equals(evt.getPropertyName())) {
            		assertTrue(str(evt.getNewValue()).contains(text.remove(0)));
            	} else if ("background".equals(evt.getPropertyName())) {
            		assertTrue(img2.getSource()!= null);
                }
            }
        })

        AboutPanel.getToolTipText(new MouseEvent(null, 0, 0, 0, 0, MouseEvent.MOUSE_PRESSED, 2))
               .replace("\n", "<br/>\n<b>\n<b>Testing\n</b>\n</b><br/>\n<br/>Content: <span style=\"background-color: black\">"
                              + img1.getSource() + "</span>\n<br/>", null)

               .replace("\n", "<br/>\n<b>\n<b>Testing\n</b>\n</b><br/>\n<br/>Content: <span style=\"background-color: "
                              + img2.getSource() + "\">" + text.remove(0) + "</span>\n<br/>", null)

                
               .replace("\n", "<br/>\n<b>\n<b>Testing\n</b>\n</b><br/>\n<br/>Content: <span style=\"background-color: black\">"
                              + img3.getSource() + "</span><br/>\n<br/>", null)
               .replace("\n", "<br/>\n<b>\n<b>Testing\n</b>\n</b><br/>\n<br/>Content: <span style=\"background-color: "
                              + img4.getSource() +"\">" + text.remove(0) + "</span><br/>\n<br/>", null)

               .replace("\n", "<br/>\n<b>\n<b>Testing\n</b>\n</b><br/>\n<br/>Content: <span style=\"background-color: black\">"
                              + img4.getSource() + "</span><br/>\n<br/>", null)

               .replace("\n", "<br/>\n<b>\n<b>Testing\n</b>\n</b><br/>\n<br/>Content: <span style=\"background-color: "
                              + img5.