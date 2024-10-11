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
* It contains ten unit test cases for the {@link Game#stepRound()} method.
*/
class GameTest {

		private static final int TOTAL_ROUNDS = 1;
		
		private static final int MAX_PROCESSOR_SPEED = 5;
		
		private static final int MAX_ROBOTS = 2;
		
		private static final int MAX_ROBOT_ID = 1;
		
		private static final int MAX_ROBOT_SCORE = 1;
		
		private static final int MAX_ROBOT_KILLS = 1;
		
		private static final int MAX_ROBOT_DEATHS = 1;
		
		private static final int MAX_ROBOT_DAMAGE_INFLICTED = 1;
		
		private static final int MAX_ROBOT_DAMAGE_RECEIVED = 1;
		
		private static final int MAX_ROBOT_ENERGY = 1;
		
		private static final int MAX_ROBOT_SHIELD = 1;
		
		private static final int MAX_ROBOT_ACCELERATION = 1;
		
		private static final int MAX_ROBOT_SPEED = 1;
		
		private static final int MAX_ROBOT_HEADING = 1;
		
		private static final int MAX_ROBOT_X = 1;
		
		private static final int MAX_ROBOT_Y = 1;
		
		private static final int MAX_ROBOT_GUN_HEATING = 1;
		
		private static final int MAX_ROBOT_GUN_HEADING = 1;
		
		private static final int MAX_ROBOT_RADAR_HEADING = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_X = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_Y = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_HEADING = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_SPEED = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ENERGY = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_SHIELD = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_DAMAGE = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_DAMAGE_INFLICTED = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_DAMAGE_RECEIVED = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_KILLS = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_DEATHS = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_SCORE = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ID = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_NAME = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ROBOT_TYPE = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ROBOT_TYPE_NAME = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ROBOT_TYPE_SHORT_NAME = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ROBOT_TYPE_VERSION = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ROBOT_TYPE_AUTHOR = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ROBOT_TYPE_WEBSITE = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ROBOT_TYPE_DATE = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ROBOT_TYPE_CODE_SIZE = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ROBOT_TYPE_DESCRIPTION = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ROBOT_TYPE_ROBOT_TYPE = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ROBOT_TYPE_ROBOT_TYPE_NAME = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ROBOT_TYPE_ROBOT_TYPE_SHORT_NAME = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ROBOT_TYPE_ROBOT_TYPE_VERSION = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ROBOT_TYPE_ROBOT_TYPE_AUTHOR = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ROBOT_TYPE_ROBOT_TYPE_WEBSITE = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ROBOT_TYPE_ROBOT_TYPE_DATE = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ROBOT_TYPE_ROBOT_TYPE_CODE_SIZE = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ROBOT_TYPE_ROBOT_TYPE_DESCRIPTION = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ROBOT_TYPE_ROBOT_TYPE_ROBOT_TYPE = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ROBOT_TYPE_ROBOT_TYPE_ROBOT_TYPE_NAME = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ROBOT_TYPE_ROBOT_TYPE_ROBOT_TYPE_SHORT_NAME = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ROBOT_TYPE_ROBOT_TYPE_ROBOT_TYPE_VERSION = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ROBOT_TYPE_ROBOT_TYPE_ROBOT_TYPE_AUTHOR = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ROBOT_TYPE_ROBOT_TYPE_ROBOT_TYPE_WEBSITE = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ROBOT_TYPE_ROBOT_TYPE_ROBOT_TYPE_DATE = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ROBOT_TYPE_ROBOT_TYPE_ROBOT_TYPE_CODE_SIZE = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ROBOT_TYPE_ROBOT_TYPE_ROBOT_TYPE_DESCRIPTION = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_ROBOT_TYPE_ROBOT_TYPE_ROBOT_TYPE_ROBOT_TYPE = 1;
		
		private static final int MAX_ROBOT_RADAR_LOCKED_R