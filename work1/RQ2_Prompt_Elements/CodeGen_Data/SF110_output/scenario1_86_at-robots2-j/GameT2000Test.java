// GameTest.java
package net.virtualinfinity.atrobots.game;

import net.virtualinfinity.atrobots.arena.FrameBuilder;
import net.virtualinfinity.atrobots.arena.RoundState;
import net.virtualinfinity.atrobots.arena.SimulationObserver;
import net.virtualinfinity.atrobots.compiler.RobotFactory;
import net.virtualinfinity.atrobots.robot.FinalRobotScore;
import net.virtualinfinity.atrobots.robot.Robot;
import net.virtualinfinity.atrobots.robot.RobotScore;
import net.virtualinfinity.atrobots.robot.RobotScoreKeeper;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains one unit test case for the {@link Game#stepRound()} method.
*/
class GameTest {
// Game.java
package net.virtualinfinity.atrobots.game;

import net.virtualinfinity.atrobots.arena.FrameBuilder;
import net.virtualinfinity.atrobots.arena.RoundState;
import net.virtualinfinity.atrobots.arena.SimulationObserver;
import net.virtualinfinity.atrobots.compiler.RobotFactory;
import net.virtualinfinity.atrobots.robot.FinalRobotScore;
import net.virtualinfinity.atrobots.robot.Robot;
import net.virtualinfinity.atrobots.robot.RobotScore;
import net.virtualinfinity.atrobots.robot.RobotScoreKeeper;
import java.util.*;

/**
 * This class coordinates rounds, entrants, and the simulation frame buffer.
 *
 * @author Daniel Pitts
 */
public class Game implements RoundListener {

    public synchronized boolean stepRound() {
        if (round == null) {
            return false;
        }
        getRound().step();
        return round!= null;
    }
}

// GameTest.java
package net.virtualinfinity.atrobots.game;

import net.virtualinfinity.atrobots.arena.FrameBuilder;
import net.virtualinfinity.atrobots.arena.RoundState;
import net.virtualinfinity.atrobots.arena.SimulationObserver;
import net.virtualinfinity.atrobots.compiler.RobotFactory;
import net.virtualinfinity.atrobots.robot.FinalRobotScore;
import net.virtualinfinity.atrobots.robot.Robot;
import net.virtualinfinity.atrobots.robot.RobotScore;
import net.virtualinfinity.atrobots.robot.RobotScoreKeeper;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains one unit test case for the {@link Game#stepRound()} method.
*/
class GameTest {
		
    
    private Map<String, Robot> map = new HashMap<>();
    private Map<Robot, RobotScoreKeeper> keeperMap = new HashMap<>();
    private RobotRobotMap robotRobotMap = new RobotRobotMap();

    @Test
	@SuppressWarnings("unchecked")
    public void stepRoundTest001(){
		Game.game = new Game() {
            @Override
            public Robot getRobot(RobotFactory factory, String name) {
            	Robot robot = super.getRobot(factory, name);
            	if (robotRobotMap.containsKey(robot)) {
            		return robotRobotMap.getSimul().get(robot);
            	}
            	return robot;
            }
        };
        Robot robot = RobotFactory.createRobot("Failed");
        robotRobotMap.put(robot, RobotRobotMap.NO_KEEPER);
        Game.thread.startWithTask(new Runnable() {
            /**
             * Main test code for the game's run method.
             */
            @SuppressWarnings("unchecked")
            public void run() {
                final String name = "RouterTest001StepRoundFailed";
                final Robot robot  = robotRobotMap.getRobotByNameNoKeep(name) ;
                final RobotFactory factory = RobotFactory.createRobot("failed");
                final String[] args = new String[]{ "Failed" };
                final RobotRobotMap finalRobotRobotMap = RobotRobotMap.getRobotRobotMap();
                factory.addRobot(robot, "Failed");
                RobotRobotMap.putRobotRobotMap(name, finalRobotRobotMap);
                RobotRobotMap.putRobotRobotMap(robot, factory);
                RobotFactory.stopRobot(robot);
                RobotFactory.stopRobot(factory);
                
                Game.game = new Game(false);
                for (RobotRobotMap.RobotScoreMap.Entry entry : factory.getFinalRobotScores().entrySet()){
                    RobotFactory.deleteFinalRobot(entry.getKey());
                    Entry.entry = entry;
                }
                
                final RobotRobotMap finalRobotRobotMap = RobotRobotMap.getRobotRobotMap();
                // We're now using a robot-based test.
                Game.game = new Game(false);

                //We're now using a robot-based test.
                Game.thread.startWithTask(new Runnable() {
                    /**
                     * Main test code for the game's run method.
                     */
                    @SuppressWarnings("unchecked")
                    public void run() {
                        final String name = RobotFactory.createRobot("failed").getName();
                        Game.thread.executeWithTask(new Runnable() {

                            /**
                             * Main test code for the game's work method.
                             */
                            public void run() {
                                RobotFactory factory = new RobotFactory();
                                Robot robot = factory.makeRobot("Failed");
                                
                                robotRobotMap.setRobotRobotMap(name, robotRobotMap);
                                robotRobotMap.setRobotName(robot);
                                robotRobotMap.setRobotFactory(factory);
                                Map<Robot, RobotScore> finalRobotRobotMap = RobotRobotMap.getRobotRobotMap();
                                System.setProperty("robotPlayer",factory.getRobotName());
                                 	final RobotRobotMap.putRobotRobotMap(name, finalRobotRobotMap);
                                
                                FrameBuilder builder = RobotRobotMap.getRobotRobotBuilder(robot, "failed");
                                RobotRobotMap.putRobotRobotBuilder(robot, builder, finalRobotRobotMap);

                                Thread t = new Thread() {
                                    public void run() {
                                        Robot player = RobotRobotMap.getRobotByNameNoKeep(Game.game.getName());
                                        doTest(robot, finalRobotRobotMap, name, player);
                                    }
                                };
                                Game.thread.addTask(t);
                    
                            Game.thread.executeWithTask(new Runnable() {

                                /**
                                 * Main test code for the game's work method.
                                 */
                                private void doTest(Robot robot, RobotScore scores[], String name, Robot player) {
                                    Game game = new Game(false);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(name);
                                    sb.append(Arrays.toString(scores));
                                    while (sb.toString().endsWith("/robotPlayer"))
                                    {
                                        sb.append("_");
                                    }
                                    System.setProperty("robotPlayer",new String(sb.toString()));
                                    game.game = true;
                                    RobotScore s = factory.makeRobotScore(player);
                                    game.roundState = new RoundState();
                                    game.simulationObserver = new SimulationObserver(RobotScoreKeeper.getRobotScoreKeeper(), RobotFactory.stopRobot);
                                    game.round = new Round(s, game.roundState, robot(robot), Robot.getDefaultFactory()).simulateAndGetRobotScore();
                                    game.getRound().setRobot(robot);
                                    if (!RobotRobotMap.contains(robot)) {
                                        RobotRobotMap.putRobotRobotMap(name, RobotRobotMap.NO_KEEPER);
                                    }
                                }
                                    public void executeWithTask_threaded() {
                                    }
                                    public void executeWithTask_inMainThread() {
                                    }
                                };
                                Game.thread.addTask(t);
                        }
                        });
                    }
                });
            }
        }, RobotFactory.NO_KEEPER);
    }
    
    
    //Test methods
    public boolean finishedRobotTest() {
        return 1==0;
    }
    
    public boolean finishedTaskTest() {
        return 1==1;
    }

    private Robot robot(Robot robot) {
        RobotRobotMap robotRobotMap = RobotRobotMap.getRob