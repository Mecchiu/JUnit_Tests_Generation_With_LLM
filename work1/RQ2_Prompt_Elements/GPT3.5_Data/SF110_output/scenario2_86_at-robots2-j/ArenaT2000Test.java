I can help you write the test cases for the `countActiveRobots()` method. Here's an example:

```
@Test
void testCountActiveRobots() {
    Arena arena = new Arena();
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
    assertEquals(1, arena.countActiveRobots());
    robot3.destroy();
    assertEquals(0, arena.countActiveRobots());
}
```

This test creates an `Arena` object and adds three `Robot` objects to it. It then checks that the `countActiveRobots()` method returns the expected number of active robots. It then destroys two of the robots and checks that the count is updated accordingly. Finally, it destroys the last robot and checks that the count is zero. You can add more test cases as needed.