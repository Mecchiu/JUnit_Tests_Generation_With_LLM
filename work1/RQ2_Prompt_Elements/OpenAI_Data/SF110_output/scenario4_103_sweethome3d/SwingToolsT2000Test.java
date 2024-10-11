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
* It contains ten unit test cases for the {@link SwingTools#getDropableComponentBorder()} method.
*/
class SwingToolsTest {

	@Test
	void testGetDropableComponentBorder() {
		// Test 1
		assertEquals(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLACK, 2), BorderFactory.createEmptyBorder(2, 2, 2, 2)), SwingTools.getDropableComponentBorder());
		// Test 2
		assertEquals(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLACK, 2), BorderFactory.createEmptyBorder(2, 2, 2, 2)), SwingTools.getDropableComponentBorder());
		// Test 3
		assertEquals(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLACK, 2), BorderFactory.createEmptyBorder(2, 2, 2, 2)), SwingTools.getDropableComponentBorder());
		// Test 4
		assertEquals(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLACK, 2), BorderFactory.createEmptyBorder(2, 2, 2, 2)), SwingTools.getDropableComponentBorder());
		// Test 5
		assertEquals(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLACK, 2), BorderFactory.createEmptyBorder(2, 2, 2, 2)), SwingTools.getDropableComponentBorder());
		// Test 6
		assertEquals(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLACK, 2), BorderFactory.createEmptyBorder(2, 2, 2, 2)), SwingTools.getDropableComponentBorder());
		// Test 7
		assertEquals(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLACK, 2), BorderFactory.createEmptyBorder(2, 2, 2, 2)), SwingTools.getDropableComponentBorder());
		// Test 8
		assertEquals(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLACK, 2), BorderFactory.createEmptyBorder(2, 2, 2, 2)), SwingTools.getDropableComponentBorder());
		// Test 9
		assertEquals(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLACK, 2), BorderFactory.createEmptyBorder(2, 2, 2, 2)), SwingTools.getDropableComponentBorder());
		// Test 10
		assertEquals(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLACK, 2), BorderFactory.createEmptyBorder(2, 2, 2, 2)), SwingTools.getDropableComponentBorder());
	}
}

// SwingTools.java
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

/**
 * Gathers some useful tools for Swing.
 *
 * @author Emmanuel Puybaret
 */
public class SwingTools {

    // Borders for focused views
    private static Border unfocusedViewBorder;

    private static Border focusedViewBorder;

    private SwingTools() {
    }

    /**
     * Updates the border of <code>component</code> with an empty border
     * changed to a colored border when it will gain focus.
     * If the <code>component</code> component is the child of a <code>JViewPort</code>
     * instance this border will be installed on its scroll pane parent.
     */
    public static void installFocusBorder(JComponent component) {
        if (unfocusedViewBorder == null) {
            unfocusedViewBorder = component.getBorder();
            focusedViewBorder = new AbstractBorder() {

                @Override
                public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                    g.setColor(UIManager.getColor("textHighlight"));
                    g.drawRect(x, y, width - 1, height - 1);
                }

                @Override
                public Insets getBorderInsets(Component c) {
                    return new Insets(1, 1, 1, 1);
                }
            };
        }
        if (component.getParent() instanceof JViewport) {
            component = (JComponent) component.getParent().getParent();
        }
        component.addFocusListener(new FocusListener() {

            public void focusGained(FocusEvent ev) {
                JComponent component = (JComponent) ev.getComponent();
                component.setBorder(focusedViewBorder);
            }

            public void focusLost(FocusEvent ev) {
                JComponent component = (JComponent) ev.getComponent();
                component.setBorder(unfocusedViewBorder);
            }
        });
    }

    /**
     * Updates the Swing resource bundles in use from the current Locale and class loader.
     */
    public static void updateSwingResourceLanguage() {
        updateSwingResourceLanguage(Arrays.asList(SwingTools.class.getClassLoader()));
    }

    /**
     * Updates the Swing resource bundles in use from the current Locale and the class loaders of preferences.
     */
    public static void updateSwingResourceLanguage(UserPreferences preferences) {
        updateSwingResourceLanguage(Arrays.asList(SwingTools.class.getClassLoader(), preferences.getClass().getClassLoader()));
    }

    /**
     * Updates the Swing resource bundles in use from the