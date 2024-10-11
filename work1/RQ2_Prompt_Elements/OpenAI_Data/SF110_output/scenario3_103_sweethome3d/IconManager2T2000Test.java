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

		/**
		* Test case 1:
		* The method {@link IconManager#getIcon(Content, int, Component)} is tested with the following inputs:
		* <ul>
		* <li>content = null</li>
		* <li>height = 0</li>
		* <li>waitingComponent = null</li>
		* </ul>
		* <p>
		* The expected result is that the method returns null.
		* </p>
		*/
		@Test
		public void testCase1() {
				Content content = null;
				int height = 0;
				Component waitingComponent = null;
				IconManager iconManager = new IconManager();
				Icon result = iconManager.getIcon(content, height, waitingComponent);
				assertNull(result);
		}
		
		/**
		* Test case 2:
		* The method {@link IconManager#getIcon(Content, int, Component)} is tested with the following inputs:
		* <ul>
		* <li>content = null</li>
		* <li>height = 0</li>
		* <li>waitingComponent = new JComponent() {
		* 																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	