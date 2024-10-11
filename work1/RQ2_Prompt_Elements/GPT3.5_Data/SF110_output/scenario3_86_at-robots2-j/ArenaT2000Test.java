I can help you write the test cases for the `countActiveRobots()` method. Here's an example:

```
@Test
void testCountActiveRobots() {
    Arena arena = new Arena();
    Robot robot1 = new Robot();
    Robot robot2 = new Robot();
    Robot robot3 = new Robot();
    Robot robot4 = new Robot();
    Robot robot5 = new Robot();
    Robot robot6 = new Robot();
    Robot robot7 = new Robot();
    Robot robot8 = new Robot();
    Robot robot9 = new Robot();
    Robot robot10 = new Robot();
    arena.addRobot(robot1);
    arena.addRobot(robot2);
    arena.addRobot(robot3);
    arena.addRobot(robot4);
    arena.addRobot(robot5);
    arena.addRobot(robot6);
    arena.addRobot(robot7);
    arena.addRobot(robot8);
    arena.addRobot(robot9);
    arena.addRobot(robot10);
    assertEquals(10, arena.countActiveRobots());
    robot1.destroy();
    robot2.destroy();
    robot3.destroy();
    assertEquals(7, arena.countActiveRobots());
    robot4.destroy();
    robot5.destroy();
    robot6.destroy();
    robot7.destroy();
    robot8.destroy();
    robot9.destroy();
    robot10.destroy();
    assertEquals(0, arena.countActiveRobots());
}
```

This test case creates an `Arena` object and adds 10 `Robot` objects to it. It then checks that the `countActiveRobots()` method returns 10. It then destroys the first three robots and checks that the method returns 7. Finally, it destroys the remaining robots and checks that the method returns 0. You can add more test cases to cover different scenarios.