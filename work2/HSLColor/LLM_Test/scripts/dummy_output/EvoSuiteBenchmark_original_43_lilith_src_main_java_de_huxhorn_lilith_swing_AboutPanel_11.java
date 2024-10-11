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
		
    private static final Logger log = LoggerFactory.getLogger("AboutPanelTest");

    //.................................................................

    /**
    * Test method for
    * {@link AboutPanel#getToolTipText(MouseEvent)}.
    */
    @Test
    public void testGetToolTipText() {
        final AboutPanel p = new AboutPanel();
        final ToolTipManager tm = (ToolTipManager) p.getToolTipManager();
        final Image image = GraphicsUtilities.createImage(10, 10);
        Image bgImage = GraphicsUtilities.createImage(10, 10);
        final String[] text = new String[2];
        text[0] = "";
        text[1] = "";
        final int[] x = new int[2];
        x[0] = 0;
        x[1] = 0;
        final Point px = bgImage.getGraphics().getClipBounds().getLocation();
        tm.uninstallComponents();
        p.addMouseListener(new MouseAdapter() {
            public void mousePressed(final MouseEvent evt) {
                tm.uninstallComponents();
                final Point p1 = p.computeVerticalLocation(evt);
                final Point px1 = x[0];
                final Point p2 = p.computeVerticalLocation(evt);
                image.setLocation((p2.x - px1.x) / 2, (p2.y - px1.y) / 2);
            }
            public void mouseReleased(final MouseEvent evt) {
                tm.uninstallComponents();
                final Point p1 = p.computeVerticalLocation(evt);
                final Point px1 = x[0];
                final Point p2 = p.computeVerticalLocation(evt);
                image.setLocation((p2.x - px1.x) / 2, (p2.y - px1.y) / 2);
            }
        });
        p.addMouseMoveListener(new MouseAdapter() {
            public void mouseDragged(final MouseEvent evt) {
                bgImage.setLocation(bgImage.getLocation().x + 15, bgImage.getLocation().y + 15);
                image.setLocation(fgImage.getWidth() / 2, fgImage.getHeight() / 2);
            }
            public void mouseMoved(final MouseEvent evt) {
                bgImage.setLocation(bgImage.getLocation().x + 10, bgImage.getLocation().y + 10);
                image.setLocation(fgImage.getWidth() / 2, fgImage.getHeight() / 2);
            }
        });
        final Rectangle2D px2 = bgImage.getBounds2D();
        final Rectangle p2 = p.computeVerticalLocation(evt);
        final Point p1 = p.computeVerticalLocation(evt);
        p.addComponentListener(new ComponentAdapter() {
            public void componentMoved(final ComponentEvent evt) {
                bgImage.setLocation(bgImage.getLocation().x + 40, bgImage.getLocation().y + 40);
            }
        });
        final ToolTip tt = tm.install(
                        new AbstractImageIcon("images/sulc.png")
               , BorderFactory.createEmptyBorder(5, 5, 5, 5)
               , new String[] {"SulC"}
                );
        p.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5),
                "AboutPanelTest",
                BorderFactory.createEmptyBorder(5, 5, 5, 5),
                TitledBorder.DEFAULT_JUSTIFICATION,
                TitledBorder.TOP,
                new ImageIcon("images/sulc.png"),
                TitledBorder.DEFAULT_JUSTIFICATION)
        );
        final Dimension p1Dim = p1.getSize();
        final Dimension p2Dim = p2.getSize();
        p.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        final Dimension px2Dim = px2.getSize();
        final Dimension p2Dim2 = p2.getSize();
		
        image.setMIMEType("image/png");
        //image.setMagnification(5);
        image.transpose();
        image.translate(px2Dim2.getWidth() / 2, px2Dim2.getHeight() / 2);
        final BufferedImage img = new BufferedImage(p1Dim.width, p1Dim.height, BufferedImage.TYPE_4BYTE_ABGR);
		final Graphics2D g2 = img.createGraphics();
}
}