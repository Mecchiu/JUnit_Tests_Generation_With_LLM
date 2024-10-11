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
	 * Sets up the unit test.
	 * @throws IOException
	 */
	@Test
	void getToolTipText() throws IOException {
		final JFrame frame = new JFrame("AboutPanelTest");
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.getContentPane().add(new JLabel("AboutPanelTest"));
		
		// Set toolTipText
		final List<Rectangle2D.Double> scrollAreaRects = new ArrayList<>();
		BufferedImage screenImage = new BufferedImage(800, 600, BufferedImage.TYPE_INT_ARGB);
		GraphicsUtilities.drawPaint(screenImage, Color.BLACK);
		GraphicsUtilities.drawPaint(screenImage, Color.WHITE, 5, 5, 5, 5, 5, 5, 5, 5); //
		GraphicsUtilities.drawPaint(screenImage, Color.WHITE);
		Rectangle2D.Double scrollArea = new Rectangle2D.Double(0, 0, 1.0, 1.0);
		scrollAreaRects.add(scrollArea);
		frame.getContentPane().setToolTipText(scrollArea.toString());
		frame.pack();
		frame.setVisible(true);	
		
		// Wait for the ToolTipManager to display the tooltip.
		Thread waitForToolTip = new Thread(() -> {
			JToolBar toolBar = new JToolBar();
			Object obj = toolBar.getModel();
			JComponent c = (JComponent)obj;
			assertNotNull("toolBar should have been initialized", c);
			toolBar.setTitle("toolBarTest");
			
			StringBuffer stringBuffer = new StringBuffer("");
			listenToMouseEvents(c);
			while(!c.getToolTipText().equals("")){
				stringBuffer.append(c.getToolTipText()).append("\n");
				c = (JComponent)obj;
				listenToMouseEvents(c);
			}
		});	
		waitForToolTip.start();
		
		Thread.sleep(800);
		
		// Check if the tool tip is displayed with a centered color.
		BufferedImageOp ops = new ConvolveOp(screenImage);
		assertTrue("Color is centered in scroll area", ops.intersects(scrollAreaRects));
		
		// Check if the tool tip has been displayed with an alpha-channel.
		BufferedImageOp ops_alpha = new ConvolveOp(screenImage, ConvolveOp.EDGE_IN);
		assertFalse("Alpha channel is not enabled", ops_alpha.intersects(scrollAreaRects));
		
		// Check that an alpha-channel of the image has been scaled to 16-bit.
		int[] rgb = new int[2];
		for (int i = 0; i < screenImage.getWidth(null) * screenImage.getHeight(null); i += 2) {
			rgb[0] = (rgb[0] & 0xFF) << 8 | rgb[1];
			rgb[1] = 255;
			BufferedImage op_alpha = new BufferedImage(16, 16, BufferedImage.TYPE_INT_RGB);
			ops_alpha.filter(rgb, null);
			int[] rgb_alpha = new int[2];
			for (int j=0; j<rgb[1]/2; j++) {
				for (int k=0; k<rgb[0]/2; k++) {
					rgb_alpha[0] = k * j;
					rgb_alpha[1] = v.length;
					BufferedImageOp op_alpha_scale = new ConvolveOp(op_alpha, new Kernel(2, 2, rgb_alpha));
					Graphics2D g = GraphicsUtilities.fromBufferedImageOp(op_alpha_scale);
					
			    	// Get the original image.
					BufferedImage original = g.getSource();
			    	int w = original.getWidth(null);
			    	int h = original.getHeight(null);
			    	BufferedImage tmp = new BufferedImage(w, h, original.getType());
			    	g.drawImage(original, 0,0, null);
			    	
			    	// Save to the temporary image.
					BufferedImageOp op = new ConvolveOp(tmp, CropFilter.CROP_GAUSSIAN, 0, 0, 0, 0);
					g.drawImage(op, 0,0, null);
					
					original = tmp;
				}
			}
			System.out.println(rgb);
		}
	}

    private void listenToMouseEvents(JComponent component) {
}
}