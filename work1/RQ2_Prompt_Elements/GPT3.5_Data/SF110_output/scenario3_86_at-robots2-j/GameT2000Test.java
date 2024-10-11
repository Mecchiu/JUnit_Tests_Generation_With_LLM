I can help you generate the source code for the ten unit test cases for the `Game#stepRound()` method. Here's an example:

```
@Test
void testStepRoundReturnsTrueWhenRoundIsNotOver() {
    Game game = new Game();
    RoundState roundState = new RoundState();
    roundState.setRoundOver(false);
    boolean result = game.stepRound(roundState);
    assertTrue(result);
}
```

You can use this as a template and modify the test case name and the `RoundState` object to test different scenarios.