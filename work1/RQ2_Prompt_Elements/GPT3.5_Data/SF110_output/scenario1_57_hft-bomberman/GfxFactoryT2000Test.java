Here's an example implementation of the test class for `GfxFactory`:

```
class GfxFactoryTest {

    private GfxFactory gfxFactory = new GfxFactory();

    @Test
    void testGetPowerUpImageReturnsImage() {
        Image image = gfxFactory.getPowerUpImage("powerup");
        assertNotNull(image);
    }

    @Test
    void testGetPowerUpImageReturnsSameImageForSameType() {
        Image image1 = gfxFactory.getPowerUpImage("powerup");
        Image image2 = gfxFactory.getPowerUpImage("powerup");
        assertSame(image1, image2);
    }

    @Test
    void testGetPowerUpImageReturnsDifferentImageForDifferentType() {
        Image image1 = gfxFactory.getPowerUpImage("powerup1");
        Image image2 = gfxFactory.getPowerUpImage("powerup2");
        assertNotSame(image1, image2);
    }

    @Test
    void testGetPowerUpImageReturnsNullForInvalidType() {
        Image image = gfxFactory.getPowerUpImage("invalid");
        assertNull(image);
    }

    @Test
    void testGetPowerUpImageReturnsImageWithCorrectDimensions() {
        Image image = gfxFactory.getPowerUpImage("powerup");
        assertEquals(32, image.getWidth(null));
        assertEquals(32, image.getHeight(null));
    }

    @Test
    void testGetPowerUpImageReturnsImageFromCorrectPath() {
        Image image = gfxFactory.getPowerUpImage("powerup");
        assertNotNull(image);
        String path = "/gfx/powerUps/powerup.png";
        try {
            File file = new File(getClass().getResource(path).toURI());
            Image expectedImage = ImageIO.read(file);
            assertSame(expectedImage, image);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testGetPowerUpImageCachesImages() {
        Image image1 = gfxFactory.getPowerUpImage("powerup");
        Image image2 = gfxFactory.getPowerUpImage("powerup");
        assertSame(image1, image2);
    }

    @Test
    void testGetPowerUpImageHandlesIOException() {
        GfxFactory gfxFactorySpy = spy(gfxFactory);
        doThrow(new IOException()).when(gfxFactorySpy).loadImage(anyString());
        Image image = gfxFactorySpy.getPowerUpImage("powerup");
        assertNull(image);
    }

    @Test
    void testGetPowerUpImageHandlesNullPointerException() {
        GfxFactory gfxFactorySpy = spy(gfxFactory);
        doThrow(new NullPointerException()).when(gfxFactorySpy).loadImage(anyString());
        Image image = gfxFactorySpy.getPowerUpImage("powerup");
        assertNull(image);
    }

    private Image loadImage(String path) throws IOException {
        File file = new File(getClass().getResource(path).toURI());
        return ImageIO.read(file);
    }
}
```

This test class contains ten unit test cases for the `GfxFactory#getPowerUpImage(String)` method. The first six test cases are straightforward and test the basic functionality of the method. The seventh test case checks that the method caches images correctly. The eighth and ninth test cases check that the method handles `IOException` and `NullPointerException` correctly. The last test case is a helper method that loads an image from a file.