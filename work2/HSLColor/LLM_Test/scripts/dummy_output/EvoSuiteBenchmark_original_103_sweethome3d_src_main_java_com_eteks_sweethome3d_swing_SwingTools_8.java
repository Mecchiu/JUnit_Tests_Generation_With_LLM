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
	 * It tests the {@link SwingTools#getDropableComponentBorder()} method.
	 * It ensures that a reasonable number of components are created for the given size of the {@link JFrame}.
	 */
	@Test
	void testGetDropableComponentBorder() {
		assertNotNull(SwingTools.getDropableComponentBorder(new JFrame()));
		assertNotNull(SwingTools.getDropableComponentBorder(new JPanel()));
		assertNotNull(SwingTools.getDropableComponentBorder(new JViewport()));
		assertNotNull(SwingTools.getDropableComponentBorder(new JTextComponent()));
		assertNotNull(SwingTools.getDropableComponentBorder(new JMenuBar()));
		assertNotNull(SwingTools.getDropableComponentBorder(new JToolBar()));
	}
	
	/**
	 * Provides a means to test the {@link SwingTools#getResourceString(int)} method.
	 * @throws MissingResourceException
	 */
	@Test
	void getResourceStringTest() throws MissingResourceException{
		ResourceBundle res = ResourceBundle.getBundle("resName", Locale.getDefault());
		assertEquals("Hi: ", res.getString("Hi"));
	}
	
	/**
	 * Provides a list of available {@link Desktop} APIs,
	 */
	@Test
	void providesAvailableDesktopCapabilities() {
}
}