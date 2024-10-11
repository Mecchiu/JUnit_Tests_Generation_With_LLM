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
		* The expected result is that the method returns an icon with a width and a height equals to 0.
		* </p>
		*/
		@Test
		public void testGetIcon_1() {
				Content content = null;
				int height = 0;
				Component waitingComponent = null;
				IconManager iconManager = new IconManager();
				Icon result = iconManager.getIcon(content, height, waitingComponent);
				assertEquals(0, result.getIconWidth());
				assertEquals(0, result.getIconHeight());
		}
		
		/**
		* Test case 2:
		* The method {@link IconManager#getIcon(Content, int, Component)} is tested with the following inputs:
		* <ul>
		* <li>content = null</li>
		* <li>height = -1</li>
		* <li>waitingComponent = null</li>
		* </ul>
		* <p>
		* The expected result is that the method returns an icon with a width and a height equals to 0.
		* </p>
		*/
		@Test
		public void testGetIcon_2() {
				Content content = null;
				int height = -1;
				Component waitingComponent = null;
				IconManager iconManager = new IconManager();
				Icon result = iconManager.getIcon(content, height, waitingComponent);
				assertEquals(0, result.getIconWidth());
				assertEquals(0, result.getIconHeight());
		}
		
		/**
		* Test case 3:
		* The method {@link IconManager#getIcon(Content, int, Component)} is tested with the following inputs:
		* <ul>
		* <li>content = null</li>
		* <li>height = 1</li>
		* <li>waitingComponent = null</li>
		* </ul>
		* <p>
		* The expected result is that the method returns an icon with a width and a height equals to 1.
		* </p>
		*/
		@Test
		public void testGetIcon_3() {
				Content content = null;
				int height = 1;
				Component waitingComponent = null;
				IconManager iconManager = new IconManager();
				Icon result = iconManager.getIcon(content, height, waitingComponent);
				assertEquals(1, result.getIconWidth());
				assertEquals(1, result.getIconHeight());
		}
		
		/**
		* Test case 4:
		* The method {@link IconManager#getIcon(Content, int, Component)} is tested with the following inputs:
		* <ul>
		* <li>content = null</li>
		* <li>height = 2</li>
		* <li>waitingComponent = null</li>
		* </ul>
		* <p>
		* The expected result is that the method returns an icon with a width and a height equals to 2.
		* </p>
		*/
		@Test
		public void testGetIcon_4() {
				Content content = null;
				int height = 2;
				Component waitingComponent = null;
				IconManager iconManager = new IconManager();
				Icon result = iconManager.getIcon(content, height, waitingComponent);
				assertEquals(2, result.getIconWidth());
				assertEquals(2, result.getIconHeight());
		}
		
		/**
		* Test case 5:
		* The method {@link IconManager#getIcon(Content, int, Component)} is tested with the following inputs:
		* <ul>
		* <li>content = null</li>
		* <li>height = 3</li>
		* <li>waitingComponent = null</li>
		* </ul>
		* <p>
		* The expected result is that the method returns an icon with a width and a height equals to 3.
		* </p>
		*/
		@Test
		public void testGetIcon_5() {
				Content content = null;
				int height = 3;
				Component waitingComponent = null;
				IconManager iconManager = new IconManager();
				Icon result = iconManager.getIcon(content, height, waitingComponent);
				assertEquals(3, result.getIconWidth());
				assertEquals(3, result.getIconHeight());
		}
		
		/**
		* Test case 6:
		* The method {@link IconManager#getIcon(Content, int, Component)} is tested with the following inputs:
		* <ul>
		* <li>content = null</li>
		* <li>height = 4</li>
		* <li>waitingComponent = null</li>
		* </ul>
		* <p>
		* The expected result is that the method returns an icon with a width and a height equals to 4.
		* </p>
		*/
		@Test
		public void testGetIcon_6() {
				Content content = null;
				int height = 4;
				Component waitingComponent = null;
				IconManager iconManager = new IconManager();
				Icon result = iconManager.getIcon(content, height, waitingComponent);
				assertEquals(4, result.getIconWidth());
				assertEquals(4, result.getIconHeight());
		}
		
		/**
		* Test case 7:
		* The method {@link IconManager#getIcon(Content, int, Component)} is tested with the following inputs:
		* <ul>
		* <li>content = null</li>
		* <li>height = 5</li>
		* <li>waitingComponent = null</li>
		* </ul>
		* <p>
		* The expected result is that the method returns an icon with a width and a height equals to 5.
		* </p>
		*/
		@Test
		public void testGetIcon_7() {
				Content content = null;
				int height = 5;
				Component waitingComponent = null;
				IconManager iconManager = new IconManager();
				Icon result = iconManager.getIcon(content, height, waitingComponent);
				assertEquals(5, result.getIconWidth());
				assertEquals(5, result.getIconHeight());
		}
		
		/**
		* Test case 8:
		* The method {@link IconManager#getIcon(Content, int, Component)} is tested with the following inputs:
		* <ul>
		* <li>content = null</li>
		* <li>height = 6</li>
		* <li>waitingComponent = null</li>
		* </ul>
		* <p>
		* The expected result is that the method returns an icon with a width and a height equals to 6.
		* </p>
		*/
		@Test
		public void testGetIcon_8() {
				Content content = null;
				int height