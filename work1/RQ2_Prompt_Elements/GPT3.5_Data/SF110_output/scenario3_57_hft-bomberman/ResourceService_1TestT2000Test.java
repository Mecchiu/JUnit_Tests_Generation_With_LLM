// Here's an example of how you can test the ResourceService class using JUnit 5:

@Test
void testGetImageIcon() {
    // Test loading an existing image
    ImageIcon icon = ResourceService.getImageIcon("images/test.png");
    assertNotNull(icon);
    assertNotNull(icon.getImage());

    // Test loading a non-existing image
    icon = ResourceService.getImageIcon("images/non-existing.png");
    assertNull(icon);
} 

// You can add more test cases to cover different scenarios, such as loading images with different formats, loading images from different directories, etc.