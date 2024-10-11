// ArenaTest.java
package net.virtualinfinity.atrobots.arena;

import net.virtualinfinity.atrobots.ArenaObjectVisitor;
import net.virtualinfinity.atrobots.arenaobjects.ArenaObject;
import net.virtualinfinity.atrobots.arenaobjects.CollidableArenaObject;
import net.virtualinfinity.atrobots.arenaobjects.DamageInflicter;
import net.virtualinfinity.atrobots.measures.Duration;
import net.virtualinfinity.atrobots.radio.RadioDispatcher;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Arena}.
* It contains one unit test case for the {@link Arena#countActiveRobots()} method.
*/
class ArenaTest {

    @Test
    public void testAllActiveRobotsActive(){
        Arena arena = new Arena();
        //System.out.println("countActiveRobots: "+ arena.countActiveRobots());
    }

    @Test
    public void testActiveRobotsNoDamage(){
        Arena arena = new Arena();
        int count = arena.countActiveRobots();
        // System.out.println("countActiveRobots: "+ new Integer(count));
        assertTrue("A robot should have one active one", count == 1);		
    }

    @Test
    public void testActiveRobotsBadDamage(){
        Arena arena = new Arena();
        double damage = 0.1;
        CollidableArenaObject ro = new CollidableArenaObject(damage);
        int count = arena.countActiveRobots();
        //System.out.println("count: "+ count);
        assertTrue("A robot should have one active one", count == 1);		
        for(int i = 0; i < RobotSpawner.MAX_ROBOTS; i++){
            Roboteer shooter = RobotSpawner.getRoboteer(i);
            boolean noDamage = false;
            if(shooter == RobotSpawner.NO_SHOOTER){
                noDamage = true;
			}
            if(ro.equals(shooter.getTarget()) && noDamage){
                fail("Found bad damage object in active robot at " + i);
            }
        }
    }

    @Test
    public void testActiveRobotsActiveSameDisplacement(){
        Arrays.asList(Arrays.asList(0,0,0,0,0,1,1,1,1,1))
        .forEach(ro -> assertTrue("Robot should see same offset in same displacement", ro.getRadius() > 0));
    }

    @Test
    public void testActiveRobotsActiveDifferentDisplacement(){
        Arrays.asList(Arrays.asList(0,0,0,0,0,2,2,2,2,2))
        .forEach(ro -> assertTrue("Robot should see same offset when changing displacement", ro.getRadius() > 0));
    }

	@Test
    public void testActiveRobotsActiveChangeDamage(){
        double damageX = 0.1;
        double damageY = 0.1;
        Collection<CollidableArenaObject> ros = Arrays.asList(new CollidableArenaObject(damageX,damageY));
        int count = arena.countActiveRobots();
        for(int i = 0; i < RobotSpawner.MAX_ROBOTS; i++){
            Roboteer shooter = RobotSpawner.getRoboteer(i);
            if(robs.indexOf(shooter.getTarget()) == 0){
                String msg = "Active robot should not see itself as a damage object with one";
                msg += " offset";
                if(shooter!= RobotSpawner.NO_SHOOTER)
					msg += " at offset " + shooter.getTargetAsDistance();
                msg = msg + " as a damaged robot at " + (i + 1);
                msg += " for " + robotSpawner.MAX_ROBOTS + " robots";
                msg += ", but I have a robot at " + i + " with a " +robs.size()+ " damage object attached";
                msg = msg + ". This means that I must update this robot or make it inactive after next robot death.";
                throw new RuntimeException(msg);
            }
        }
    }

    @Test
    public void testActiveRobotsActiveRandomDisplacement(){
        Arrays.asList(Arrays.asList(0,0,0,0,0,1,1,1,1,1))
        .forEach(ro -> assertTrue("Robot should see same offset in same displacement", ro.getRadius() > 0));
    }

	@Test
    public void testActiveRobotsActiveDifferentDisplacement(){
        Arrays.asList(Arrays.asList(0,0,0,0,0,2,2,2,2,2))
        .forEach(ro -> assertTrue("Robot should see same offset when changing displacement", ro.getRadius() > 0));
    }

	@Test
    public void testDestroyedRobotsCount(){
		Arrays.asList(Arrays.asList(0,0,0,0,0,1,1,1,1,1)).forEach(ro -> {
            ArenaObject oldActiveRobot = ro.getActiveRobot(); 
            assertNull("active robot should not exist anymore", oldActiveRobot);
        });
    }
    
    @Test
    public void testDestroyedRobotsRotation(){
        Arrays.asList(Arrays.asList(0,0,0,0,0,1,1,1,1,1)).forEach(ro -> {
            Roboteer oldActiveRobot = ro.getActiveRobot();
            assertNull("active robot should not exist anymore", oldActiveRobot);
        });
    }
	
    @Test
    public void testDestroyedRobotsRotations(){
        Arrays.asList(Arrays.asList(0,0,0,0,0,1,1,1,1,1)).forEach(ro -> {
            CollidableArenaObject roc = ro.getTarget();
            CollidableArenaObject newRo = null;
            double rotX = (ro.getRadius()*2);
            double rotY = (ro.getRadius()*2);
            if(roc instanceof DamageInflicter){
                newRo = new CollidableArenaObject(ro.getRadius()+rotX,ro.getRadius()+rotY);
            } else if (roc instanceof DamageInflicter2D){
                newRo = new CollidableArenaObject(ro.getRadius() + rotX,ro.getRadius()+rotY);
            } else {
                newRo = new CollidableArenaObject(ro.getRadius() + rotX,ro.getRadius() + rotY);
            }
            assertNotNull("Collidable arena object disappeared",newRo);
            assertFalse("Collidable arena object has been destroyed, I shouldn't be able to destroy it",newRo.isPresent());
        });
    }
    
    @Test
    public void testMaxDamageCount(){
        Arrays.asList(Arrays.asList(0,0,0,0,0,1,1,1,1,1)).forEach(ro -> {
            CollidableArenaObject roc = ro.getTarget();
            int maxDamage = 40;
            long expectedRobotCount = maxDamage + (10 * (ro