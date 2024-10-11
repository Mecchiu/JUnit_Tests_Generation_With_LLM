// Here's an example implementation of the GfxFactory class and its test class:

// GfxFactory.java
package client.view;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.imageio.ImageIO;
import org.apache.log4j.Logger;
import common.ResourceService;

/**
 * A factory class for loading images used in the game.
 */
public class GfxFactory {

    private static final String POWERUP_PATH = "resources/powerups/";
    private static final String POWERUP_EXTENSION = ".png";
    private static final HashMap<String, Image> powerUpImages = new HashMap<>();
    private static final Logger logger = Logger.getLogger(GfxFactory.class);

    /**
     * Loads and returns the image for the specified power-up type.
     *
     * @param type the type of power-up
     * @return the image for the specified power-up type
     */
    public static Image getPowerUpImage(String type) {
        if (!powerUpImages.containsKey(type)) {
            try {
                Image image = ImageIO.read(new File(POWERUP_PATH + type + POWERUP_EXTENSION));
                powerUpImages.put(type, image);
            } catch (IOException e) {
                logger.error("Failed to load power-up image for type " + type, e);
            }
        }
        return powerUpImages.get(type);
    }
}

// GfxFactoryTest.java
package client.view;

import java.awt.Image;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link GfxFactory}.
 */
class GfxFactoryTest {

    private static final List<String> POWERUP_TYPES = Arrays.asList("speed", "shield", "bomb", "life");

    /**
     * Tests that the factory returns a non-null image for each power-up type.
     */
    @Test
    void testGetPowerUpImage() {
        for (String type : POWERUP_TYPES) {
            Image image = GfxFactory.getPowerUpImage(type);
            assertNotNull(image, "Image for power-up type " + type + " should not be null");
        }
    }

    /**
     * Tests that the factory returns the same image for the same power-up type.
     */
    @Test
    void testGetPowerUpImageReturnsSameImage() {
        for (String type : POWERUP_TYPES) {
            Image image1 = GfxFactory.getPowerUpImage(type);
            Image image2 = GfxFactory.getPowerUpImage(type);
            assertSame(image1, image2, "Images for power-up type " + type + " should be the same instance");
        }
    }
}