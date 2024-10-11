package net.virtualinfinity.atrobots.arena;
java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArenaTest {

    @Test
    void testCountActiveRobotsEmptyArena() {
        Arena arena = new Arena();
        assertEquals(0, arena.countActiveRobots());
    }

    @Test
    void testCountActiveRobotsWithOneRobot() {
        Arena arena = new Arena();
        TangibleArenaObject robot = new TangibleArenaObject();
        arena.addRobot(robot);
        assertEquals(1, arena.countActiveRobots());
    }

    @Test
    void testCountActiveRobotsWithMultipleRobots() {
        Arena arena = new Arena();
        TangibleArenaObject robot1 = new TangibleArenaObject();
        TangibleArenaObject robot2 = new TangibleArenaObject();
        arena.addRobot(robot1);
        arena.addRobot(robot2);
        assertEquals(2, arena.countActiveRobots());
    }

    @Test
    void testCountActiveRobotsWithDeadRobots() {
        Arena arena = new Arena();
        TangibleArenaObject robot1 = new TangibleArenaObject();
        TangibleArenaObject robot2 = new TangibleArenaObject();
        robot2.setDead(true);
        arena.addRobot(robot1);
        arena.addRobot(robot2);
        assertEquals(1, arena.countActiveRobots());
    }

    @Test
    void testCountActiveRobotsWithIntangibleObjects() {
        Arena arena = new Arena();
        TangibleArenaObject robot = new TangibleArenaObject();
        ArenaObject intangibleObject = new ArenaObject();
        arena.addRobot(robot);
        arena.addIntangible(intangibleObject);
        assertEquals(1, arena.countActiveRobots());
    }

    @Test
    void testCountActiveRobotsWithCollidableObjects() {
        Arena arena = new Arena();
        TangibleArenaObject robot = new TangibleArenaObject();
        CollidableArenaObject collidableObject = new CollidableArenaObject();
        arena.addRobot(robot);
        arena.addCollidable(collidableObject);
        assertEquals(1, arena.countActiveRobots());
    }

    @Test
    void testCountActiveRobotsWithDeadCollidableObjects() {
        Arena arena = new Arena();
        TangibleArenaObject robot = new TangibleArenaObject();
        CollidableArenaObject collidableObject = new CollidableArenaObject();
        collidableObject.setDead(true);
        arena.addRobot(robot);
        arena.addCollidable(collidableObject);
        assertEquals(1, arena.countActiveRobots());
    }

    @Test
    void testCountActiveRobotsWithAllRobotsDead() {
        Arena arena = new Arena();
        TangibleArenaObject robot1 = new TangibleArenaObject();
        TangibleArenaObject robot2 = new TangibleArenaObject();
        robot1.setDead(true);
        robot2.setDead(true);
        arena.addRobot(robot1);
        arena.addRobot(robot2);
        assertEquals(0, arena.countActiveRobots());
    }

    @Test
    void testCountActiveRobotsWithAllRobotsDeadAndIntangibleObjects() {
        Arena arena = new Arena();
        TangibleArenaObject robot1 = new TangibleArenaObject();
        TangibleArenaObject robot2 = new TangibleArenaObject();
        ArenaObject intangibleObject = new ArenaObject();
        robot1.setDead(true);
        robot2.setDead(true);
        arena.addRobot(robot1);
        arena.addRobot(robot2);
        arena.addIntangible(intangibleObject);
        assertEquals(0, arena.countActiveRobots());
    }
}
