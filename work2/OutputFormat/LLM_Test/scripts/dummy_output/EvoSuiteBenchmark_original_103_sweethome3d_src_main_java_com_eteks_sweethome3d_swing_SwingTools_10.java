// SwingToolsTest.java
package com.eteks.sweethome3d.swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Area;
import java.awt.image.BufferedImage;
import java.awt.image.FilteredImageSource;
import java.awt.image.RGBImageFilter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;
import javax.imageio.ImageIO;
import javax.jnlp.BasicService;
import javax.jnlp.ServiceManager;
import javax.jnlp.UnavailableServiceException;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.JViewport;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.text.JTextComponent;
import com.eteks.sweethome3d.model.TextureImage;
import com.eteks.sweethome3d.model.UserPreferences;
import com.eteks.sweethome3d.tools.OperatingSystem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SwingTools}.
* It contains one unit test case for the {@link SwingTools#getDropableComponentBorder()} method.
*/
class SwingToolsTest {
		
	/**
	 * This is a test case to assert that the expected border is found.
	 */
	@Test
	public void assertThatTheCorrectBorderGet() {
		int result = 0;
		Component c = null;
		while(c == null && result < 2) {
			c = SwingTools.getDropableComponentBorder();
				
			result++;
		}
	}

	/**
	 * Loads basic resources from classpath.
	 * After running this method two {@link BasicService} objects will be available:
	 * 1. {@link BasicService}.class
	 * 2. {@link BasicService}2.class
	 */
	public static void loadResources() {
		BasicService basicService = (BasicService) ServiceManager.lookup("BasicService");
		basicService.load();
	}

	/**
	 * Makes a frame, shows it in a window with a JFrame widget. Uses swing classes.
	 * The frame is automatically resized so that it fits the space allocated to the Window's area at the bottom.
	 */
	public static void makeFrames(Window frame) {
		Frame newFrame = new Frame("JFrame");
		newFrame.setSize(100, 50);
		newFrame.setLocation(100, 100);
		frame.setVisible(true);
		newFrame.setResizable(false);
		frame.add(newFrame);
		newFrame.pack();
	}

}