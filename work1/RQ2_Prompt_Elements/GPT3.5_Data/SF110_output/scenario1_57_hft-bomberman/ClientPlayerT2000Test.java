I can help you write the test cases for the `ClientPlayer` class. Here's an example of how you can write a test case:

```
@Test
void testCanBowlBombs() {
    ClientPlayer player = new ClientPlayer();
    assertFalse(player.canBowlBombs()); // By default, the player should not be able to bowl bombs
    player.setBowlBombs(true);
    assertTrue(player.canBowlBombs()); // After setting the flag, the player should be able to bowl bombs
}
```

You can write similar test cases to test different scenarios for the `canBowlBombs()` method.