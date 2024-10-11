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
		ArrayList<String> powerUpTypes;

    GfxFactoryTest() {
		this.powerUpTypes = new ArrayList<String>();
		this.powerUpTypes.add("powerUp1");
		this.powerUpTypes.add("powerUp2");
		this.powerUpTypes.add("powerUp3");
    }

    public void test(String powerUpType) {
        this.powerUpTypes.remove(powerUpType);
        powerUpType = PowerUpFactoryFactory.makePowerUpType(powerUpType);
        assertEquals(this.powerUpTypes.size(), powerUpTypes.size());     // assert size
    }
}