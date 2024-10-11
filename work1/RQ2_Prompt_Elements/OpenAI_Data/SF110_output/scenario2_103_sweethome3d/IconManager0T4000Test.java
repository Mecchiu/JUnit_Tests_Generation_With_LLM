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
* It contains ten unit test cases for the {@link IconManager#getInstance()} method.
*/
class IconManagerTest {

		@Test
		public void testGetInstance() {
				IconManager iconManager = IconManager.getInstance();
				assertNotNull(iconManager);
		}
		
		@Test
		public void testGetInstance2() {
				IconManager iconManager = IconManager.getInstance();
				assertNotNull(iconManager);
		}
		
		@Test
		public void testGetInstance3() {
				IconManager iconManager = IconManager.getInstance();
				assertNotNull(iconManager);
		}
		
		@Test
		public void testGetInstance4() {
				IconManager iconManager = IconManager.getInstance();
				assertNotNull(iconManager);
		}
		
		@Test
		public void testGetInstance5() {
				IconManager iconManager = IconManager.getInstance();
				assertNotNull(iconManager);
		}
		
		@Test
		public void testGetInstance6() {
				IconManager iconManager = IconManager.getInstance();
				assertNotNull(iconManager);
		}
		
		@Test
		public void testGetInstance7() {
				IconManager iconManager = IconManager.getInstance();
				assertNotNull(iconManager);
		}
		
		@Test
		public void testGetInstance8() {
				IconManager iconManager = IconManager.getInstance();
				assertNotNull(iconManager);
		}
		
		@Test
		public void testGetInstance9() {
				IconManager iconManager = IconManager.getInstance();
				assertNotNull(iconManager);
		}
		
		@Test
		public void testGetInstance10() {
				IconManager iconManager = IconManager.getInstance();
				assertNotNull(iconManager);
		}
}