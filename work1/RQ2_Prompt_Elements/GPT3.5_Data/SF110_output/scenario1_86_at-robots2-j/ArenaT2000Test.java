I can help you write the test cases for the `countActiveRobots()` method. Here's an example:

```
@Test
void testCountActiveRobots() {
    Arena arena = new Arena();
    assertEquals(0, arena.countActiveRobots());

    Robot robot1 = new Robot();
    Robot robot2 = new Robot();
    Robot robot3 = new Robot();

    arena.addRobot(robot1);
    arena.addRobot(robot2);
    arena.addRobot(robot3);

    assertEquals(3, arena.countActiveRobots());

    robot1.destroy();
    assertEquals(2, arena.countActiveRobots());

    robot2.destroy();
    robot3.destroy();
    assertEquals(0, arena.countActiveRobots());
}
```

You can add more test cases to cover different scenarios, such as adding and removing robots, destroying robots, and checking the count after a certain duration of time.