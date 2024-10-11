// GfxFactoryTest.java
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
* It contains one unit test case for the {@link GfxFactory#getPowerUpImage(String)} method.
*/
class GfxFactoryTest {


public static void main(String[] args){
    	ResourceService.init(args[0], args[1]); 
	}
	
	@Test
	public void test() {

		Logger logger = Logger.getLogger(GfxFactoryTest.class.getName());
		File f = ResourceService.getProject().getFile("gfx/PowerUps/" + "PowerUps.png");
			//File f = ResourceService.getProject().getFile("gfx/PowerUps.png");
	    System.err.println(f.getAbsolutePath());


		GfxFactory.getPowerUpImage("PowerUp");
		GfxFactory.getPowerUpImage("Night");
		
		File[] files = f.listFiles(imageFile -> { return imageFile.getName().endsWith(".png"); });
		assertNotNull("File exists", files);
		
		HashMap<Integer, Image> powerUp = new HashMap<>();
		for (File f : files) {
			System.err.println("extracting from " + f.getExtension());
			powerUp = f.getCanonicalFile().toURI().toURL().getLastPathSegment();
			String powerUpImageUrl = powerUp.get("PowerUp").toString();
			String powerUpImageFilename = powerUp.get("PowerUp").getAbsolutePath();
			Image powerUpImage = loadImage(powerUpImageUrl);
			powerUp.remove(powerUp.size()-1);
			powerUp.put(powerUp.size()-1, powerUpImage);
			logger.debug("Extracting " + powerUpImageFilename);
			//powerUpImage = ImageIO.read(f);
			testPowerUp(powerUpImage, powerUpImageFilename);
		}
		
	}
	
	public void testPowerUp(Image powerUp1, String powerUpImageFilenameA)
			throws IOException {
		PowerUp powerUp2 = new PowerUp();
		powerUp2.parseImage(powerUp1);
		
		logger.debug("Getting " + powerUpImageFilenameA);
		powerUpImageFilenameA = powerUpImageFilenameA.replaceAll("PowerUp\\d", "");
		
		testPowerUp(powerUp2, powerUpImageFilenameA);
	}

	
	/**
	 * Test implementation of {@link GfxFactory#getPowerUpImage(String)}
	 * to get the powerUps image from a file in some kind of PNG format.
	 */
	public void testPowerUpImage() throws IOException {
		File f = ResourceService.getProject().getFile("gfx/PowerUps-" + "PowerUps-PowerUp-1.png");
		
		File[] files = f.listFiles(imageFile -> { return imageFile.getName().endsWith(".png"); });
		assertNotNull("no poweruptmp", files);
	
		
		Image powerUpImage = loadImage(f.getURI().toString());

		logger.debug("Getting powerUps");
        Image powerUpImageA = powerUpImage.getScaledTo(32,32);
		
		logger.debug(powerUpImageA.getSize());
		for (File f : files)
			testPowerUp(powerUpImageA, f.getAbsolutePath());
	}


	/**
	 * Parsing the powerUp image.
	 *
	 * @param powerUp1PowerUp1
	 *
	 */
	public void testPowerUpImage(PowerUp powerUp1PowerUp1) {
		powerUp1PowerUp1.parseImage();
		
		System.err.println("Got and cleaned " + powerUp1PowerUp1.getPowerUpImage());
		System.err.println(powerUp1PowerUp1.getPowerUpsImage());
		
	}
    /**
     * Load image from a given URL
     *
     * @param powerUpImageUrl
     *
     * @return
     *
     */
    public static Image loadImage(String powerUpImageUrl) throws IOException {
            
            ImageIO.setUseCache(true);

            return ImageIO.read(new GfxFactoryTest().getPowerUpImage(powerUpImageUrl));
    }
            
}