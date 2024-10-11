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
		* 	<li><code>content</code>: a {@link Content} object</li>
		* 	<li><code>height</code>: a positive integer</li>
		* 	<li><code>waitingComponent</code>: a {@link Component} object</li>
		* </ul>
		*
		* <p>Expected result:
		* <ul>
		* 	<li>an {@link Icon} object is returned</li>
		* </ul>
		* </p>
		*
		* @throws IOException
		*/
		@Test
		void testGetIcon_1() throws IOException {
				Content content = new ResourceURLContent(IconManagerTest.class.getResource("/com/eteks/sweethome3d/swing/resources/about.png"));
				int height = 1;
				Component waitingComponent = new Component() {};
				IconManager iconManager = new IconManager();
				Icon result = iconManager.getIcon(content, height, waitingComponent);
				assertNotNull(result);
		}
		
		/**
		* Test case 2:
		* The method {@link IconManager#getIcon(Content, int, Component)} is tested with the following inputs:
		* <ul>
		* 	<li><code>content</code>: a {@link Content} object</li>
		* 	<li><code>height</code>: a positive integer</li>
		* 	<li><code>waitingComponent</code>: a {@link Component} object</li>
		* </ul>
		*
		* <p>Expected result:
		* <ul>
		* 	<li>an {@link Icon} object is returned</li>
		* </ul>
		* </p>
		*
		* @throws IOException
		*/
		@Test
		void testGetIcon_2() throws IOException {
				Content content = new ResourceURLContent(IconManagerTest.class.getResource("/com/eteks/sweethome3d/swing/resources/about.png"));
				int height = 1;
				Component waitingComponent = new Component() {};
				IconManager iconManager = new IconManager();
				Icon result = iconManager.getIcon(content, height, waitingComponent);
				assertNotNull(result);
		}
		
		/**
		* Test case 3:
		* The method {@link IconManager#getIcon(Content, int, Component)} is tested with the following inputs:
		* <ul>
		* 	<li><code>content</code>: a {@link Content} object</li>
		* 	<li><code>height</code>: a positive integer</li>
		* 	<li><code>waitingComponent</code>: a {@link Component} object</li>
		* </ul>
		*
		* <p>Expected result:
		* <ul>
		* 	<li>an {@link Icon} object is returned</li>
		* </ul>
		* </p>
		*
		* @throws IOException
		*/
		@Test
		void testGetIcon_3() throws IOException {
				Content content = new ResourceURLContent(IconManagerTest.class.getResource("/com/eteks/sweethome3d/swing/resources/about.png"));
				int height = 1;
				Component waitingComponent = new Component() {};
				IconManager iconManager = new IconManager();
				Icon result = iconManager.getIcon(content, height, waitingComponent);
				assertNotNull(result);
		}
		
		/**
		* Test case 4:
		* The method {@link IconManager#getIcon(Content, int, Component)} is tested with the following inputs:
		* <ul>
		* 	<li><code>content</code>: a {@link Content} object</li>
		* 	<li><code>height</code>: a positive integer</li>
		* 	<li><code>waitingComponent</code>: a {@link Component} object</li>
		* </ul>
		*
		* <p>Expected result:
		* <ul>
		* 	<li>an {@link Icon} object is returned</li>
		* </ul>
		* </p>
		*
		* @throws IOException
		*/
		@Test
		void testGetIcon_4() throws IOException {
				Content content = new ResourceURLContent(IconManagerTest.class.getResource("/com/eteks/sweethome3d/swing/resources/about.png"));
				int height = 1;
				Component waitingComponent = new Component() {};
				IconManager iconManager = new IconManager();
				Icon result = iconManager.getIcon(content, height, waitingComponent);
				assertNotNull(result);
		}
		
		/**
		* Test case 5:
		* The method {@link IconManager#getIcon(Content, int, Component)} is tested with the following inputs:
		* <ul>
		* 	<li><code>content</code>: a {@link Content} object</li>
		* 	<li><code>height</code>: a positive integer</li>
		* 	<li><code>waitingComponent</code>: a {@link Component} object</li>
		* </ul>
		*
		* <p>Expected result:
		* <ul>
		* 	<li>an {@link Icon} object is returned</li>
		* </ul>
		* </p>
		*
		* @throws IOException
		*/
		@Test
		void testGetIcon_5() throws IOException {
				Content content = new ResourceURLContent(IconManagerTest.class.getResource("/com/eteks/sweethome3d/swing/resources/about.png"));
				int height = 1;
				Component waitingComponent = new Component() {};
				IconManager iconManager = new IconManager();
				Icon result = iconManager.getIcon(content, height, waitingComponent);
				assertNotNull(result);
		}
		
		/**
		* Test case 6:
		* The method {@link IconManager#getIcon(Content, int, Component)} is tested with the following inputs:
		* <ul>
		* 	<li><code>content</code>: a {@link Content} object</li>
		* 	<li><code>height</code>: a positive integer</li>
		* 	<li><code>waitingComponent</code>: a {@link Component} object</li>
		* </ul>
		*
		* <p>Expected result:
		* <ul>
		* 	<li>an {@link Icon} object is returned</li>
		* </ul>
		* </p>
		*
		* @throws IOException
		*/
		@Test
		void testGetIcon_6() throws IOException {
				Content content = new ResourceURLContent(IconManagerTest.class.getResource("/com/eteks/sweethome3d/swing/resources/about.png"));
				int height = 1;
				Component waitingComponent = new Component() {};
				IconManager iconManager = new IconManager();
				Icon result = iconManager.getIcon(content, height, waitingComponent);
				assertNotNull(result);
		}
		
		/**
		* Test case 7:
		* The method {@link IconManager#getIcon(Content, int, Component)} is tested with the following inputs:
		* <ul>
		* 	<li><code>content</code>: a {@link Content} object</li>
		* 	<li><code>height</code>: a positive integer</li>
		* 	<li><code>waitingComponent</code>: a {@link Component} object</li>
		* </ul>
		*
		* <p>Expected result:
		* <ul>
		* 	<li>an {@link Icon} object is returned</li>
		* </ul>
		* </p>
		*
		* @throws IOException
		*/
		@Test
		void testGetIcon_7() throws IOException {
				Content content = new ResourceURLContent(IconManagerTest.class.getResource("/com/eteks/sweethome3d/swing/resources/about.png"));
				int height = 1;
				Component waitingComponent = new Component() {};
				IconManager iconManager = new IconManager();
				Icon result = iconManager.getIcon(content, height, waitingComponent);
				assertNotNull(result);
		}
		
		/**
		* Test case 8:
		* The method {@link IconManager#getIcon(Content, int, Component)} is tested with the following inputs:
		* <ul>
		* 	<li><code>content</code>: a {@link Content} object</li>
		* 	<li><code>height</code>: a positive integer</li>
		* 	<li><code>waitingComponent</code>: a {@link Component} object</li>
		* </ul>
		*
		* <p>Expected result:
		* <ul>
		* 	<li>an {@link Icon} object is returned</li>
		* </ul>
		* </p>
		*
		* @throws IOException
		*/
		@Test
		void testGetIcon_8() throws IOException {
				Content content = new ResourceURLContent(IconManagerTest.class.getResource("/com/eteks/sweethome3d/swing/resources/about.png"));
				int height = 1;
				Component waitingComponent = new Component() {};
				IconManager iconManager = new IconManager();
				Icon result = iconManager.getIcon(content, height, waitingComponent);
				assertNotNull(result);
		}
		
		/**
		* Test case 9:
		* The method {@link IconManager#getIcon(Content, int, Component)} is tested with the following inputs:
		* <ul>
		* 	<li><code>content</code>: a {@link Content} object</li>
		* 	<li><code>height</code>: a positive integer</li>
		* 	<li><code>waitingComponent</code>: a {@link Component} object</li>
		* </ul>
		*
		* <p>Expected result:
		* <ul>
		* 	<li>an {@link Icon} object is returned</li>
		* </ul>
		* </p>
		*
		* @throws IOException
		*/
		@Test
		void testGetIcon_9() throws IOException {
				Content content = new ResourceURLContent(IconManagerTest.class.getResource("/com/eteks/sweethome3d/swing/resources/about.png"));
				int height = 1;
				Component waitingComponent = new Component() {};
				IconManager iconManager = new IconManager();
				Icon result = iconManager.getIcon(content, height, waitingComponent);
				assertNotNull(result);
		}
		
		/**
		* Test case 10:
		* The method {@link IconManager#getIcon(Content, int, Component)} is tested with the following inputs:
		* <ul>
		* 	<li><code>content</code>: a {@link Content} object</li>
		* 	<li><code>height</code>: a positive integer</li>
		* 	<li><code>waitingComponent</code>: a {@link Component} object</li>
		* </ul>
		*
		* <p>Expected result:
		* <ul>
		* 	<li>an {@link Icon} object is returned</li>
		* </ul>
		* </p>
		*
		* @throws IOException
		*/
		@Test
		void testGetIcon_10() throws IOException {
				Content content = new ResourceURLContent(IconManagerTest.class.getResource("/com/eteks/sweethome3d/swing/resources/about.png"));
				int height = 1;
				Component waitingComponent = new Component() {};
				IconManager iconManager = new IconManager();
				Icon result = iconManager.getIcon(content, height, waitingComponent);
				assertNotNull(result);
		}
}