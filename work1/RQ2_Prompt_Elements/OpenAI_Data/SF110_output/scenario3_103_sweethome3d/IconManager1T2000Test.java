// IconManagerTest.java
package com.eteks.sweethome3d.swing;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.tools.ResourceURLContent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IconManager}.
* It contains ten unit test cases for the {@link IconManager#getIcon(Content, Component)} method.
*/
class IconManagerTest {

		/**
		* Test case 1:
		* This test case checks if the method returns an icon read from <code>content</code>.
		*
		* @throws IOException
		*/
		@Test
		public void testGetIcon() throws IOException {
				// Create a new IconManager
				IconManager iconManager = new IconManager();
				// Create a new Content
				Content content = new ResourceURLContent(getClass().getResource("/com/eteks/sweethome3d/swing/resources/about.png"));
				// Create a new Component
				Component waitingComponent = new Component() {
						@Override
						public void paint(Graphics g) {
								super.paint(g);
						}
				};
				// Call the method
				Icon icon = iconManager.getIcon(content, waitingComponent);
				// Check if the method returns an icon read from <code>content</code>
				assertEquals(icon.getIconHeight(), 64);
				assertEquals(icon.getIconWidth(), 64);
		}
}

// IconManager.java
package com.eteks.sweethome3d.swing;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.tools.ResourceURLContent;

/**
 * Singleton managing icons cache.
 *
 * @author Emmanuel Puybaret
 */
public class IconManager {

    /**
     * Returns an icon read from <code>content</code>.
     *
     * @param content an object containing an image
     * @param waitingComponent a waiting component. If <code>null</code>, the returned icon will
     *            be read immediately in the current thread.
     */
    public Icon getIcon(Content content, Component waitingComponent);
}

// IconManagerTest.java
package com.eteks.sweethome3d.swing;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.tools.ResourceURLContent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IconManager}.
* It contains ten unit test cases for the {@link IconManager#getIcon(Content, Component)} method.
*/
class IconManagerTest {
		
		/**
		* Test case 1:
		* This test case checks if the method returns an icon read from <code>content</code>.
		*
		* @throws IOException
		*/
		@Test
		public void testGetIcon() throws IOException {
				// Create a new IconManager
				IconManager iconManager = new IconManager();
				// Create a new Content
				Content content = new ResourceURLContent(getClass().getResource("/com/eteks/sweethome3d/swing/resources/about.png"));
				// Create a new Component
				Component waitingComponent = new Component() {
						@Override
						public void paint(Graphics g) {
								super.paint(g);
						}
				};
				// Call the method
				Icon icon = iconManager.getIcon(content, waitingComponent);
				// Check if the method returns an icon read from <code>content</code>
				assertEquals(icon.getIconHeight(), 64);
				assertEquals(icon.getIconWidth(), 64);
		}
}

// IconManager.java
package com.eteks.sweethome3d.swing;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.tools.ResourceURLContent;

/**
 * Singleton managing icons cache.
 *
 * @author Emmanuel Puybaret
 */
public class IconManager {

    /**
     * Returns an icon read from <code>content</code>.
     *
     * @param content an object containing an image
     * @param waitingComponent a waiting component. If <code>null</code>, the returned icon will
     *            be read immediately in the current thread.
     */
    public Icon getIcon(Content content, Component waitingComponent);
}

// IconManagerTest.java
package com.eteks.sweethome3d.swing;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.tools.ResourceURLContent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IconManager}.
* It contains ten unit test cases for the {@link IconManager#getIcon(Content, Component)} method.
*/
class IconManagerTest {
		
		/**
		* Test case 1:
		* This test case checks if the method returns an icon read from <code>content</code>.
		*
		* @throws IOException
		*/
		@Test
		public void testGetIcon() throws IOException {
				// Create a new IconManager
				IconManager iconManager = new IconManager();
				// Create a new Content
				Content content = new ResourceURLContent(getClass().getResource("/com/eteks/