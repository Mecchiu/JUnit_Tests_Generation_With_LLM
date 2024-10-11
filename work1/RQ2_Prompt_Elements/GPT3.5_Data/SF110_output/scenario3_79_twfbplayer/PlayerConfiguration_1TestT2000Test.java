I can help you write the test cases for the `PlayerConfiguration` class. Here's an example of how you can write the test cases for the `showMoveTargets()` method:

```
@Test
void testShowMoveTargets() {
    PlayerConfiguration config = new PlayerConfiguration();
    assertTrue(config.showMoveTargets(), "By default, showMoveTargets should be true");

    config.setShowMoveTargets(false);
    assertFalse(config.showMoveTargets(), "showMoveTargets should be false after setting it to false");

    config.setShowMoveTargets(true);
    assertTrue(config.showMoveTargets(), "showMoveTargets should be true after setting it to true");
}
```

You can add more test cases to cover different scenarios and edge cases.