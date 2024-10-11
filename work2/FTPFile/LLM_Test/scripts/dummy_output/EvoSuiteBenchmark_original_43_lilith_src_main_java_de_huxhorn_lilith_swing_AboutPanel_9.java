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
		ColorTintFilter filter = new ColorTintFilter(Color.black);

    @Test
    void testGetToolTipTextInvalidMouseEvent() {
        final JEditorPane jpe = new JEditorPane("text/text");
        jpe.setOpaque(false);
        jpe.setContentType("text/plain");
        final ComponentListener listener = new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                jpe.repaint();
            }
        };

        JPanel panel = new JPanel();
        panel.add(jpe);

        jpe.addMouseListener(listener);
        assertTrue(!jpe.isOpaque());
        assertTrue(jpe.contains(MouseEvent.MOUSE_PRESSED));

        assertNull(AboutPanel.getToolTipText(null));
    }

    @Test
    void testGetToolTipText() throws IOException {
        final BufferedImage orig = GraphicsUtilities.getBufferedImage("img.png");
        final BufferedImage scaled = GraphicsUtilities.getBufferedImage(orig.getScaledInstance(200, 50, Image.SCALE_SMOOTH));
        scaled.replacePixels(100, 100, 250, 250, Filter.DEFAULT);
        final BufferedImageOp originalOp = new ConvolveOp(scaled, kernelRadius, ConvolveOp.EDGE_NO_MITER, null);

		final JEditorPane jpe = new JEditorPane("text/text");
		final JPanel panel = new JPanel();
		jpe.setOpaque(false);
 		jpe.setContentType("text/plain");
		panel.add(jpe);

        jpe.addMouseListener(new MouseAdapter() {
         @Override
         public void mousePressed( MouseEvent e ) {
            jpe.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
         }

		@Override
		public void mouseClicked( MouseEvent ignore ) {
            jpe.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		}
		});

		jpe.getDocument().addDocumentListener(new DocumentListener() {
         @Override
         public void insertUpdate(DocumentEvent e) {

			   final String text = originalOp.filter(e.getDocument().getText(0, e.getDocument().getLength()));

            jpe.setToolTipText(text);
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
         //     final String text = originalOp.filter(e.getDocument().getText(0, e.getDocument().getLength()));
            jpe.setToolTipText(null);
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
         //     final String text = originalOp.filter(e.getDocument().getText(0, e.getDocument().getLength()));
            jpe.setToolTipText(null);
        }
      });

		final JToolBar tb = new JToolBar(JToolBar.HORIZONTAL);
		final JScrollPane scr = new JScrollPane(jpe, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        tb.add(scr);
        panel.add(tb);
		assertEquals(AboutPanelTest.getToolTipText(""), jpe.getToolTipText());
	}

	@Test
    void testGetToolTipTextColor() throws IOException {
        final BufferedImage orig = GraphicsUtilities.getBufferedImage("img.png");
        final BufferedImage scaled = GraphicsUtilities.getBufferedImage(orig.getScaledInstance(200, 50, Image.SCALE_SMOOTH));
        scaled.replacePixels(100, 100, 250, 250, ColorTintFilter.RED);
        final BufferedImageOp originalOp = new ConvolveOp(scaled, kernelRadius, ConvolveOp.EDGE_NO_MITER, null);

		final JEditorPane jpe = new JEditorPane("text/text");
		final JPanel panel = new JPanel();
		jpe.setOpaque(false);
        jpe.setContentType("text/plain");

}
}