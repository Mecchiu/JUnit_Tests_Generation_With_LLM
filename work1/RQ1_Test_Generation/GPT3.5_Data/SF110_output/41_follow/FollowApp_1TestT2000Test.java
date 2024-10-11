@Test
void testGetIconWithValidIconNameKey() {
    ImageIcon icon = FollowApp.getIcon(FollowApp.class, "icon.valid");
    assertNotNull(icon);
}

@Test
void testGetIconWithInvalidIconNameKey() {
    ImageIcon icon = FollowApp.getIcon(FollowApp.class, "icon.invalid");
    assertNull(icon);
}

@Test
void testGetIconWithNullClass() {
    ImageIcon icon = FollowApp.getIcon(null, "icon.valid");
    assertNull(icon);
}

@Test
void testGetIconWithNullIconNameKey() {
    ImageIcon icon = FollowApp.getIcon(FollowApp.class, null);
    assertNull(icon);
}

@Test
void testGetIconWithEmptyIconNameKey() {
    ImageIcon icon = FollowApp.getIcon(FollowApp.class, "");
    assertNull(icon);
}

@Test
void testGetIconWithNonExistentIconNameKey() {
    ImageIcon icon = FollowApp.getIcon(FollowApp.class, "icon.nonexistent");
    assertNull(icon);
}

@Test
void testGetIconWithNullClassAndIconNameKey() {
    ImageIcon icon = FollowApp.getIcon(null, null);
    assertNull(icon);
}

@Test
void testGetIconWithEmptyClassAndIconNameKey() {
    ImageIcon icon = FollowApp.getIcon(null, "");
    assertNull(icon);
}

@Test
void testGetIconWithNonExistentClassAndIconNameKey() {
    ImageIcon icon = FollowApp.getIcon(NonExistentClass.class, "icon.valid");
    assertNull(icon);
}

@Test
void testGetIconWithNonExistentClassAndNonExistentIconNameKey() {
    ImageIcon icon = FollowApp.getIcon(NonExistentClass.class, "icon.nonexistent");
    assertNull(icon);
}

static class NonExistentClass {
    // Empty class for testing purposes
}
}