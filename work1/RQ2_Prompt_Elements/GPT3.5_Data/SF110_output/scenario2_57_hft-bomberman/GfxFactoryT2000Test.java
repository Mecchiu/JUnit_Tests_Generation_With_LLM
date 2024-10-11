// Test cases for GfxFactory class
class GfxFactoryTest {

    // Test case 1: Test if the method returns an image for a valid power up type
    @Test
    void testGetPowerUpImage_validType_returnsImage() {
        GfxFactory gfxFactory = new GfxFactory();
        Image image = gfxFactory.getPowerUpImage("speed");
        assertNotNull(image);
    }

    // Test case 2: Test if the method returns null for an invalid power up type
    @Test
    void testGetPowerUpImage_invalidType_returnsNull() {
        GfxFactory gfxFactory = new GfxFactory();
        Image image = gfxFactory.getPowerUpImage("invalid");
        assertNull(image);
    }

    // Test case 3: Test if the method returns the same image for the same power up type
    @Test
    void testGetPowerUpImage_sameType_returnsSameImage() {
        GfxFactory gfxFactory = new GfxFactory();
        Image image1 = gfxFactory.getPowerUpImage("speed");
        Image image2 = gfxFactory.getPowerUpImage("speed");
        assertSame(image1, image2);
    }

    // Test case 4: Test if the method returns different images for different power up types
    @Test
    void testGetPowerUpImage_differentType_returnsDifferentImage() {
        GfxFactory gfxFactory = new GfxFactory();
        Image image1 = gfxFactory.getPowerUpImage("speed");
        Image image2 = gfxFactory.getPowerUpImage("shield");
        assertNotSame(image1, image2);
    }

    // Test case 5: Test if the method returns an image with the correct dimensions
    @Test
    void testGetPowerUpImage_validType_returnsImageWithCorrectDimensions() {
        GfxFactory gfxFactory = new GfxFactory();
        Image image = gfxFactory.getPowerUpImage("speed");
        assertEquals(32, image.getWidth(null));
        assertEquals(32, image.getHeight(null));
    }

    // Test case 6: Test if the method throws an exception for a null power up type
    @Test
    void testGetPowerUpImage_nullType_throwsException() {
        GfxFactory gfxFactory = new GfxFactory();
        assertThrows(IllegalArgumentException.class, () -> {
            gfxFactory.getPowerUpImage(null);
        });
    }

    // Test case 7: Test if the method throws an exception for an empty power up type
    @Test
    void testGetPowerUpImage_emptyType_throwsException() {
        GfxFactory gfxFactory = new GfxFactory();
        assertThrows(IllegalArgumentException.class, () -> {
            gfxFactory.getPowerUpImage("");
        });
    }

    // Test case 8: Test if the method throws an exception for a power up type with spaces
    @Test
    void testGetPowerUpImage_typeWithSpaces_throwsException() {
        GfxFactory gfxFactory = new GfxFactory();
        assertThrows(IllegalArgumentException.class, () -> {
            gfxFactory.getPowerUpImage("power up");
        });
    }

    // Test case 9: Test if the method throws an exception for a power up type with special characters
    @Test
    void testGetPowerUpImage_typeWithSpecialCharacters_throwsException() {
        GfxFactory gfxFactory = new GfxFactory();
        assertThrows(IllegalArgumentException.class, () -> {
            gfxFactory.getPowerUpImage("power@up");
        });
    }

    // Test case 10: Test if the method throws an exception for a power up type with uppercase letters
    @Test
    void testGetPowerUpImage_typeWithUppercaseLetters_throwsException() {
        GfxFactory gfxFactory = new GfxFactory();
        assertThrows(IllegalArgumentException.class, () -> {
            gfxFactory.getPowerUpImage("PowerUp");
        });
    }
}