I can help you write the test cases for the `ResourceService` class. Here are some examples:

```
@Test
void testGetImage_validPath() {
    Image image = ResourceService.getImage("images/test.png");
    assertNotNull(image);
}

@Test
void testGetImage_invalidPath() {
    Image image = ResourceService.getImage("invalid/path.png");
    assertNull(image);
}

@Test
void testGetImage_nullPath() {
    Image image = ResourceService.getImage(null);
    assertNull(image);
}

@Test
void testGetImage_emptyPath() {
    Image image = ResourceService.getImage("");
    assertNull(image);
}

@Test
void testGetImage_nonImageFile() {
    Image image = ResourceService.getImage("sounds/test.wav");
    assertNull(image);
}

@Test
void testGetImage_largeImage() {
    Image image = ResourceService.getImage("images/large.png");
    assertNotNull(image);
    assertTrue(image.getWidth(null) > 1000);
    assertTrue(image.getHeight(null) > 1000);
}

@Test
void testGetImage_smallImage() {
    Image image = ResourceService.getImage("images/small.png");
    assertNotNull(image);
    assertTrue(image.getWidth(null) < 100);
    assertTrue(image.getHeight(null) < 100);
}

@Test
void testGetImage_transparentImage() {
    Image image = ResourceService.getImage("images/transparent.png");
    assertNotNull(image);
    assertTrue(image instanceof BufferedImage);
    assertTrue(((BufferedImage) image).getColorModel().hasAlpha());
}

@Test
void testGetImage_samePathTwice() {
    Image image1 = ResourceService.getImage("images/test.png");
    Image image2 = ResourceService.getImage("images/test.png");
    assertNotNull(image1);
    assertNotNull(image2);
    assertNotSame(image1, image2);
}

@Test
void testGetImage_differentPaths() {
    Image image1 = ResourceService.getImage("images/test.png");
    Image image2 = ResourceService.getImage("images/other.png");
    assertNotNull(image1);
    assertNotNull(image2);
    assertNotSame(image1, image2);
}
``` 

Feel free to modify or add more test cases as needed.