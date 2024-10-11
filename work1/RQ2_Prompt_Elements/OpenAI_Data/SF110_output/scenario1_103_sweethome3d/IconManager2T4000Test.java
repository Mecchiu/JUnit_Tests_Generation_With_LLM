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
* It contains ten unit test cases for the {@link IconManager#getIcon(Content, int, Component)} method.
*/
class IconManagerTest {

		@Test
		public void testGetIcon() {
				IconManager iconManager = new IconManager();
				Content content = new ResourceURLContent(getClass().getResource("/com/eteks/sweethome3d/swing/resources/error.png"));
				Icon icon = iconManager.getIcon(content, 32, null);
				assertNotNull(icon);
				assertEquals(32, icon.getIconWidth());
				assertEquals(32, icon.getIconHeight());
		}
		
		@Test
		public void testGetIcon2() {
				IconManager iconManager = new IconManager();
				Content content = new ResourceURLContent(getClass().getResource("/com/eteks/sweethome3d/swing/resources/error.png"));
				Icon icon = iconManager.getIcon(content, 32, null);
				assertNotNull(icon);
				assertEquals(32, icon.getIconWidth());
				assertEquals(32, icon.getIconHeight());
		}
		
		@Test
		public void testGetIcon3() {
				IconManager iconManager = new IconManager();
				Content content = new ResourceURLContent(getClass().getResource("/com/eteks/sweethome3d/swing/resources/error.png"));
				Icon icon = iconManager.getIcon(content, 32, null);
				assertNotNull(icon);
				assertEquals(32, icon.getIconWidth());
				assertEquals(32, icon.getIconHeight());
		}
		
		@Test
		public void testGetIcon4() {
				IconManager iconManager = new IconManager();
				Content content = new ResourceURLContent(getClass().getResource("/com/eteks/sweethome3d/swing/resources/error.png"));
				Icon icon = iconManager.getIcon(content, 32, null);
				assertNotNull(icon);
				assertEquals(32, icon.getIconWidth());
				assertEquals(32, icon.getIconHeight());
		}
		
		@Test
		public void testGetIcon5() {
				IconManager iconManager = new IconManager();
				Content content = new ResourceURLContent(getClass().getResource("/com/eteks/sweethome3d/swing/resources/error.png"));
				Icon icon = iconManager.getIcon(content, 32, null);
				assertNotNull(icon);
				assertEquals(32, icon.getIconWidth());
				assertEquals(32, icon.getIconHeight());
		}
		
		@Test
		public void testGetIcon6() {
				IconManager iconManager = new IconManager();
				Content content = new ResourceURLContent(getClass().getResource("/com/eteks/sweethome3d/swing/resources/error.png"));
				Icon icon = iconManager.getIcon(content, 32, null);
				assertNotNull(icon);
				assertEquals(32, icon.getIconWidth());
				assertEquals(32, icon.getIconHeight());
		}
		
		@Test
		public void testGetIcon7() {
				IconManager iconManager = new IconManager();
				Content content = new ResourceURLContent(getClass().getResource("/com/eteks/sweethome3d/swing/resources/error.png"));
				Icon icon = iconManager.getIcon(content, 32, null);
				assertNotNull(icon);
				assertEquals(32, icon.getIconWidth());
				assertEquals(32, icon.getIconHeight());
		}
		
		@Test
		public void testGetIcon8() {
				IconManager iconManager = new IconManager();
				Content content = new ResourceURLContent(getClass().getResource("/com/eteks/sweethome3d/swing/resources/error.png"));
				Icon icon = iconManager.getIcon(content, 32, null);
				assertNotNull(icon);
				assertEquals(32, icon.getIconWidth());
				assertEquals(32, icon.getIconHeight());
		}
		
		@Test
		public void testGetIcon9() {
				IconManager iconManager = new IconManager();
				Content content = new ResourceURLContent(getClass().getResource("/com/eteks/sweethome3d/swing/resources/error.png"));
				Icon icon = iconManager.getIcon(content, 32, null);
				assertNotNull(icon);
				assertEquals(32, icon.getIconWidth());
				assertEquals(32, icon.getIconHeight());
		}
		
		@Test
		public void testGetIcon10() {
				IconManager iconManager = new IconManager();
				Content content = new ResourceURLContent(getClass().getResource("/com/eteks/sweethome3d/swing/resources/error.png"));
				Icon icon = iconManager.getIcon(content, 32, null);
				assertNotNull(icon);
				assertEquals(32, icon.getIconWidth());
				assertEquals(32, icon.getIconHeight());
		}
}