// GfxFactory_6Test.java
package client.view;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.imageio.ImageIO;
import org.apache.log4j.Logger;
import common.ResourceService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GfxFactory}.
* It contains ten unit test cases for the {@link GfxFactory#getPowerUpImage(String)} method.
*/
class GfxFactory_6Test {

		/**
		* Test case 1 for {@link GfxFactory#getPowerUpImage(String)} method.
		* It checks if the method returns the correct image for the "bomb" type.
		*/
		@Test
		void testGetPowerUpImage_1() {
				GfxFactory gfxFactory = new GfxFactory();
				Image image = gfxFactory.getPowerUpImage("bomb");
				assertEquals(image, ResourceService.getImage("/gfx/powerUps/bomb.png"));
		}
		
		/**
		* Test case 2 for {@link GfxFactory#getPowerUpImage(String)} method.
		* It checks if the method returns the correct image for the "flame" type.
		*/
		@Test
		void testGetPowerUpImage_2() {
				GfxFactory gfxFactory = new GfxFactory();
				Image image = gfxFactory.getPowerUpImage("flame");
				assertEquals(image, ResourceService.getImage("/gfx/powerUps/flame.png"));
		}
		
		/**
		* Test case 3 for {@link GfxFactory#getPowerUpImage(String)} method.
		* It checks if the method returns the correct image for the "speed" type.
		*/
		@Test
		void testGetPowerUpImage_3() {
				GfxFactory gfxFactory = new GfxFactory();
				Image image = gfxFactory.getPowerUpImage("speed");
				assertEquals(image, ResourceService.getImage("/gfx/powerUps/speed.png"));
		}
		
		/**
		* Test case 4 for {@link GfxFactory#getPowerUpImage(String)} method.
		* It checks if the method returns the correct image for the "wallpass" type.
		*/
		@Test
		void testGetPowerUpImage_4() {
				GfxFactory gfxFactory = new GfxFactory();
				Image image = gfxFactory.getPowerUpImage("wallpass");
				assertEquals(image, ResourceService.getImage("/gfx/powerUps/wallpass.png"));
		}
		
		/**
		* Test case 5 for {@link GfxFactory#getPowerUpImage(String)} method.
		* It checks if the method returns the correct image for the "bombpass" type.
		*/
		@Test
		void testGetPowerUpImage_5() {
				GfxFactory gfxFactory = new GfxFactory();
				Image image = gfxFactory.getPowerUpImage("bombpass");
				assertEquals(image, ResourceService.getImage("/gfx/powerUps/bombpass.png"));
		}
		
		/**
		* Test case 6 for {@link GfxFactory#getPowerUpImage(String)} method.
		* It checks if the method returns the correct image for the "flamepass" type.
		*/
		@Test
		void testGetPowerUpImage_6() {
				GfxFactory gfxFactory = new GfxFactory();
				Image image = gfxFactory.getPowerUpImage("flamepass");
				assertEquals(image, ResourceService.getImage("/gfx/powerUps/flamepass.png"));
		}
		
		/**
		* Test case 7 for {@link GfxFactory#getPowerUpImage(String)} method.
		* It checks if the method returns the correct image for the "disease" type.
		*/
		@Test
		void testGetPowerUpImage_7() {
				GfxFactory gfxFactory = new GfxFactory();
				Image image = gfxFactory.getPowerUpImage("disease");
				assertEquals(image, ResourceService.getImage("/gfx/powerUps/disease.png"));
		}
		
		/**
		* Test case 8 for {@link GfxFactory#getPowerUpImage(String)} method.
		* It checks if the method returns the correct image for the "kick" type.
		*/
		@Test
		void testGetPowerUpImage_8() {
				GfxFactory gfxFactory = new GfxFactory();
				Image image = gfxFactory.getPowerUpImage("kick");
				assertEquals(image, ResourceService.getImage("/gfx/powerUps/kick.png"));
		}
		
		/**
		* Test case 9 for {@link GfxFactory#getPowerUpImage(String)} method.
		* It checks if the method returns the correct image for the "skull" type.
		*/
		@Test
		void testGetPowerUpImage_9() {
				GfxFactory gfxFactory = new GfxFactory();
				Image image = gfxFactory.getPowerUpImage("skull");
				assertEquals(image, ResourceService.getImage("/gfx/powerUps/skull.png"));
		}
		
		/**
		* Test case 10 for {@link GfxFactory#getPowerUpImage(String)} method.
		* It checks if the method returns the correct image for the "random" type.
		*/
		@Test
		void testGetPowerUpImage_10() {
				GfxFactory gfxFactory = new GfxFactory();
				Image image = gfxFactory.getPowerUpImage("random");
				assertEquals(image, ResourceService.getImage("/gfx/powerUps/random.png"));
		}
}

// GfxFactory_7Test.java
package client.view;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.imageio.ImageIO;
import org.apache.log4j.Logger;
import common.ResourceService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GfxFactory}.
* It contains ten unit test cases for the {@link GfxFactory#getTileImage(String)} method.
*/
class GfxFactory_7Test {
		
		/**
		* Test case 1 for {@link GfxFactory#getTileImage(String)} method.
		* It checks if the method returns the correct image for the "ice" type.
		*/
		@Test
		void testGetTileImage_1() {
				GfxFactory gfxFactory = new GfxFactory();
				Image image = gfxFactory.getTileImage("ice");
				assertEquals(image, ResourceService.getImage("/gfx/map/ice/ice.png"));
		}
		
		/**
		* Test case 2 for {@link GfxFactory#getTileImage(String)} method.
		* It checks if the method returns the correct image for the "grass" type.
		*/
		@Test
		void testGetTileImage_2() {
				GfxFactory gfxFactory = new GfxFactory();
				Image image = gfxFactory.getTileImage("grass");
				assertEquals(image, ResourceService.getImage("/gfx/map/ice/grass.png"));
		}
		
		/**
		* Test case 3 for {@link GfxFactory#getTileImage(String)} method.
		* It checks if the method returns the correct image for the "sand" type.
		*/
		@Test
		void testGetTileImage_3() {
				GfxFactory gfxFactory = new GfxFactory();
				Image image = gfxFactory.getTileImage("sand