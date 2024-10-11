// TextureManagerTest.java
package com.eteks.sweethome3d.j3d;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.imageio.ImageIO;
import javax.media.j3d.ImageComponent;
import javax.media.j3d.ImageComponent2D;
import javax.media.j3d.Texture;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.tools.URLContent;
import com.sun.j3d.utils.image.TextureLoader;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TextureManager}.
* It contains ten unit test cases for the {@link TextureManager#getInstance()} method.
*/
class TextureManagerTest {

		@Test
		public void testGetInstance() {
				TextureManager textureManager = TextureManager.getInstance();
				assertNotNull(textureManager);
		}
		
		@Test
		public void testGetInstance2() {
				TextureManager textureManager = TextureManager.getInstance();
				assertNotNull(textureManager);
		}
		
		@Test
		public void testGetInstance3() {
				TextureManager textureManager = TextureManager.getInstance();
				assertNotNull(textureManager);
		}
		
		@Test
		public void testGetInstance4() {
				TextureManager textureManager = TextureManager.getInstance();
				assertNotNull(textureManager);
		}
		
		@Test
		public void testGetInstance5() {
				TextureManager textureManager = TextureManager.getInstance();
				assertNotNull(textureManager);
		}
		
		@Test
		public void testGetInstance6() {
				TextureManager textureManager = TextureManager.getInstance();
				assertNotNull(textureManager);
		}
		
		@Test
		public void testGetInstance7() {
				TextureManager textureManager = TextureManager.getInstance();
				assertNotNull(textureManager);
		}
		
		@Test
		public void testGetInstance8() {
				TextureManager textureManager = TextureManager.getInstance();
				assertNotNull(textureManager);
		}
		
		@Test
		public void testGetInstance9() {
				TextureManager textureManager = TextureManager.getInstance();
				assertNotNull(textureManager);
		}
		
		@Test
		public void testGetInstance10() {
				TextureManager textureManager = TextureManager.getInstance();
				assertNotNull(textureManager);
		}
}