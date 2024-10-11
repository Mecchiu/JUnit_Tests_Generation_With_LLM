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
		private static final Logger log = LoggerFactory.getLogger(AboutPanelTest.class);
		private AboutPanel _panel;

		public AboutPanelTest() {
		}

		/**
		 * A unit test case for the method getToolTipText(MouseEvent) which is called
		 * when the <code>JSlider</code> is right-moused up. This method merely wraps the
		 * {@link AboutPanel#getToolTipText(MouseEvent)} method and shows a "scroll-area"
		 * that can be scrolled back or forward, with the intention to adjust the contents.
		 */
		@Test
		public void test() {
				JSlider slider = new JSlider() {
				private String contentString;
				@Override
				public String getLocalizedContentString() {
						return String.format("%s%n%n", contentString);
				}

				@Override
				public void setUI(SliderUI ui) {
						ui.setDefaultValuePanel(null);
								super.setUI(ui);
								}

				public void setUI(String ui) {
				//	super.setUI(new DefaultAUI());
								}
				};
				slider.addMouseListener(new MouseInputAdapter(){
				@Override
				public void mouseMoved(MouseEvent m) {
						System.out.println("Scroll-area changed");
								}
				});

				_panel = AboutPanel.of(slider);


				log.debug("Panel: {}", _panel);

				int size = 1000;
				JButton update = new JButton("update");
				_panel.setOpaque(false);

				update.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
						BufferedImageOp op = GraphicsUtilities.createBufferedImageOp(new ConvolveOp(size, colorTint));
						bufferedImage = op.filter(bufferedImage, null);

				}
				});


		}
}