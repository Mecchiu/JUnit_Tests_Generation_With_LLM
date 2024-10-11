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
* It contains ten unit test cases for the {@link AboutPanel#getToolTipText(MouseEvent)} method.
*/
class AboutPanelTest {
private final Logger logger = LoggerFactory.getLogger(AboutPanelTest.class);

		private static final String BACKGROUND_IMAGE_RESOURCE = "background.png";

		private static final String ABOUT_IMAGE_RESOURCE = "about.png";

		private static final String TEXT_RESOURCE_PREFIX = "about.";

		private static final String SCROLL_TEXT_RESOURCE = TEXT_RESOURCE_PREFIX + "scroll.text";

		private static final String VERSION_TEXT_RESOURCE = TEXT_RESOURCE_PREFIX + "version.text";

		private static final String VERSION_HEIGHT_RESOURCE = TEXT_RESOURCE_PREFIX + "version.height";

		private static final String SCROLL_AREA_RESOURCE_BASE = TEXT_RESOURCE_PREFIX + "scroll.area.";

		private static final String SCROLL_AREA_X_RESOURCE = SCROLL_AREA_RESOURCE_BASE + "x";

		private static final String SCROLL_AREA_Y_RESOURCE = SCROLL_AREA_RESOURCE_BASE + "y";

		private static final String SCROLL_AREA_WIDTH_RESOURCE = SCROLL_AREA_RESOURCE_BASE + "width";

		private static final String SCROLL_AREA_HEIGHT_RESOURCE = SCROLL_AREA_RESOURCE_BASE + "height";

		private static final String SCROLL_AREA_TOOLTIP_TEXT_RESOURCE = SCROLL_AREA_RESOURCE_BASE + "tooltip.text";

		private static final String TEXT_RESOURCE_BUNDLE_RESOURCE = "TextResources";

		private static final int MOUSE_DISABLED = 0;

		private static final int MOUSE_COMPONENT = 1;

		private static final int MOUSE_SCROLLAREA = 2;

		private static final int MOUSE_BACKGROUND = 3;

		//private static final int SCROLL_SLEEP_TIME = 50;
		private static final int SCROLL_PIXELS = 1;

		private BufferedImage backgroundImage;

		private BufferedImage aboutImage;

		//private ImageIcon aboutImageIcon;
		private FontMetrics fontMetrics;

		private Insets insets;

		private Dimension size;

		private Dimension preferredSize;

		private Point offscreenOffset;

		private String[] scrollLines;

		private String versionText;

		private String scrollAreaToolTipText;

		private int versionHeight;

		private int scrollPosition;

		private int maxScrollPosition;

		private int minScrollPosition;

		private Rectangle maxScrollArea;

		private Rectangle backgroundImageArea;

		private Rectangle translatedBackgroundImageArea;

		private Rectangle translatedScrollArea;

		private Rectangle scrollArea;

		private Rectangle paintArea;

		private BufferedImage offscreenImage;

		private BufferedImage scrollImage;

		private boolean scrolling;

		//private boolean painted;
		private int mouseEventHandling = MOUSE_BACKGROUND;

		//private transient Thread scrollThread;
		private boolean debug;

		private Timer timer;

		/**
		 * Creates a new <code>AboutPanel</code> initialized with the given parameters.
		 *
		 * @param backgroundImageUrl The URL to the Background-Image of the
		 *                           AboutPanel. This parameter is mandatory.
		 * @param scrollArea         The Rectangle inside the background-image where
		 *                           scrolling should take place. This parameter is optional. If it's null
		 *                           then the scroll-area is set to (0, 0, background.width,
		 *                           background.height).
		 */
		public AboutPanel(URL backgroundImageUrl, Rectangle scrollArea, String scrollText) throws IOException {
		}

		public boolean isDebug();

		public void setDebug(boolean debug);

		/**
		 * Creates a new <code>AboutPanel</code> initialized with the given parameters.
		 *
		 * @param backgroundImageUrl The URL to the Background-Image of the
		 *                           AboutPanel. This parameter is mandatory.
		 * @param scrollArea         The Rectangle inside the background-image where
		 *                           scrolling should take place. This parameter is optional. If it's null
		 *                           then the scroll-area is set to (0, 0, background.width,
		 *                           background.height).
		 * @param versionText        The String describing the version of the program.
		 *                           It is painted centered to the scroll-rectangle at the specified height.
		 *                           This parameter is optional.
		 * @param versionHeight      The height at which the version-string is
		 *                           supposed to be painted. This parameter is optional but should be given
		 *                           a correct value if versionText!=null..
		 */
		public AboutPanel(URL backgroundImageUrl, Rectangle scrollArea, String scrollText, String versionText, int versionHeight) throws IOException {
		}

		/**
		 * Creates a new <code>AboutPanel</code> initialized with the given parameters.
		 *
		 * @param backgroundImageUrl The URL to the Background-Image of the
		 *                           AboutPanel. This parameter is mandatory.
		 * @param scrollArea         The Rectangle inside the background-image where
		 *                           scrolling should take place. This parameter is optional. If it's null
		 *                           then the scroll-area is set to (0, 0, background.width,
		 *                           background.height).
		 * @param imageUrl           The URL to the Image that will be painted at the
		 *                           start of the scroll-area. This parameter is optional.
		 * @param versionText        The String describing the version of the program.
		 *                           It is painted centered to the scroll-rectangle at the specified height.
		 *                           This parameter is optional.
		 * @param versionHeight      The height at which the version-string is
		 *                           supposed to be painted. This parameter is optional but should be given
		 *                           a correct value if versionText!=null..
		 */
		public AboutPanel(URL backgroundImageUrl, Rectangle scrollArea, String scrollText, URL imageUrl, String versionText, int versionHeight) throws IOException {
		}

		public AboutPanel() {
		}

		private void init(URL backgroundImageUrl, Rectangle scrollArea, String scrollText, URL imageUrl, String versionText, int versionHeight) throws IOException;

		private void initAttributes();

		public void setScrollText(String ScrollText);

		protected void setScrollLines(String[] scrollLines);

		/**
		 * Sets the backgroundImage attribute of the <code>AboutPanel</code> object
		 */
		public void setBackgroundImage(URL imageUrl) throws IOException;

		/**
		 * Sets the backgroundImage attribute of the <code>AboutPanel</code> object
		 *
		 * @param BackgroundImage The new backgroundImage value
		 */
		public void setBackgroundImage(BufferedImage BackgroundImage);

		public void setAboutImage(URL imageUrl) throws IOException;

		public void setAboutImage(BufferedImage AboutImage);

		/**
		 * Sets the scrollArea attribute of the <code>AboutPanel</code> object
		 *
		 * @param ScrollArea The new scrollArea value
		 */
		public void setScrollArea(Rectangle ScrollArea);

		/**
		 * Description of the Method
		 */
		private void flushScrollImage();

		/**
		 * Description of the Method
		 */
		private void flushOffscreenImage();

		/**
		 * Description of the Method
		 */
		private void updateBackgroundAttributes();

		/**
		 * Sets the ToolTipText that will appear if the user moves the mouse over the
		 * scroll-area of this component.
		 *
		 * @param toolTipText The new ScrollAreaToolTipText value
		 */
		