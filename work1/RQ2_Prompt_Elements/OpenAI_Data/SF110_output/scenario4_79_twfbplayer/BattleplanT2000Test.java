// BattleplanTest.java
package de.outstare.fortbattleplayer.player;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Battleplan}.
* It contains ten unit test cases for the {@link Battleplan#numberOfRounds()} method.
*/
class BattleplanTest {
private static final transient Logger LOG = Logger.getLogger(BattleplanTest.class.getName());

		@Test
		void testNumberOfRounds() {
				final SortedMap<Integer, Round> rounds = new TreeMap<Integer, Round>();
				final Battleplan plan = new Battleplan(rounds.values());
				assertEquals(0, plan.numberOfRounds());
				rounds.put(1, new Round(1));
				assertEquals(1, plan.numberOfRounds());
				rounds.put(2, new Round(2));
				assertEquals(2, plan.numberOfRounds());
				rounds.put(3, new Round(3));
				assertEquals(3, plan.numberOfRounds());
				rounds.put(4, new Round(4));
				assertEquals(4, plan.numberOfRounds());
				rounds.put(5, new Round(5));
				assertEquals(5, plan.numberOfRounds());
				rounds.put(6, new Round(6));
				assertEquals(6, plan.numberOfRounds());
				rounds.put(7, new Round(7));
				assertEquals(7, plan.numberOfRounds());
				rounds.put(8, new Round(8));
				assertEquals(8, plan.numberOfRounds());
				rounds.put(9, new Round(9));
				assertEquals(9, plan.numberOfRounds());
				rounds.put(10, new Round(10));
				assertEquals(10, plan.numberOfRounds());
		}
}

// Round.java
package de.outstare.fortbattleplayer.player;

import java.util.Collection;
import java.util.logging.Logger;

/**
 * A round of a battle.
 *
 * @author daniel
 */
public class Round {
    private static final transient Logger LOG = Logger.getLogger(Round.class.getName());

    private final int number;

    /**
     * Create a new round with the given number.
     *
     * @param number
     */
    public Round(final int number) {
    }

    /**
     * @return the number of this round
     */
    public int getNumber();

    /**
     * @return the number of actions this round has
     */
    public int numberOfActions();

    /**
     * @param actionNo
     * @return the action with the given number
     */
    public Action getAction(final int actionNo);

    /**
     * @param actionNo
     * @return <code>true</code> if this round contains an action with the given
     *         number
     */
    public boolean hasActionNo(final int actionNo);

    /**
     * @param actionNo
     * @return <code>true</code> if more actions follow after the given action
     *         number.
     */
    public boolean hasMoreActions(final int actionNo);

    /**
     * @param currentActionNo
     * @return the number of the following action
     */
    public int getNextAction(final int currentActionNo);

    /**
     * @param currentActionNo
     * @return all actions that follow after the given action number
     */
    private Collection<Action> getRemainingActions(final int currentActionNo);
}

// Action.java
package de.outstare.fortbattleplayer.player;

import java.util.logging.Logger;

/**
 * An action of a round.
 *
 * @author daniel
 */
public class Action {
    private static final transient Logger LOG = Logger.getLogger(Action.class.getName());

    private final int number;

    /**
     * Create a new action with the given number.
     *
     * @param number
     */
    public Action(final int number) {
    }

    /**
     * @return the number of this action
     */
    public int getNumber();

    /**
     * @return the number of steps this action has
     */
    public int numberOfSteps();

    /**
     * @param stepNo
     * @return the step with the given number
     */
    public Step getStep(final int stepNo);

    /**
     * @param stepNo
     * @return <code>true</code> if this action contains a step with the given
     *         number
     */
    public boolean hasStepNo(final int stepNo);

    /**
     * @param stepNo
     * @return <code>true</code> if more steps follow after the given step
     *         number.
     */
    public boolean hasMoreSteps(final int stepNo);

    /**
     * @param currentStepNo
     * @return the number of the following step
     */
    public int getNextStep(final int currentStepNo);

    /**
     * @param currentStepNo
     * @return all steps that follow after the given step number
     */
    private Collection<Step> getRemainingSteps(final int currentStepNo);
}

// Step.java
package de.outstare.fortbattleplayer.player;

import java.util.logging.Logger;

/**
 * A step of an action.
 *
 * @author daniel
 */
public class Step {
    private static final transient Logger LOG = Logger.getLogger(Step.class.getName());

    private final int number;

    /**
     * Create a new step with the given number.
     *
     * @param number
     */
    public Step(final int number) {
    }

    /**
     * @return the number of this step
     */
    public int getNumber();

    /**
     * @return the number of commands this step has
     */
    public int numberOfCommands();

    /**
     * @param commandNo
     * @return the command with the given number
     */
    public Command getCommand(final int commandNo);

    /**
     * @param commandNo
     * @return <code>true</code> if this step contains a command with the given
     *         number
     */
    public boolean hasCommandNo(final int commandNo);

    /**
     * @param commandNo
     * @return <code>true</code> if more commands follow after the given command
     *         number.
     */
    public boolean hasMoreCommands(final int commandNo);

    /**
     * @param currentCommandNo
     * @return the number of the following command
     */
    public int getNextCommand(final int currentCommandNo);

    /**
     * @param currentCommandNo
     * @return all commands that follow after the given command number
     */
    private Collection<Command> getRemainingCommands(final int currentCommandNo);
}

// Command.java
package de.outstare.fortbattleplayer.player;

import java.util.logging.Logger;

/**
 * A command of a step.
 *
 * @author daniel
 */
public class Command {
    private static final transient Logger LOG = Logger.getLogger(Command.class.getName());

    private final int number;

    /**
     * Create a new command with the given number.
     *
     * @param number
     */
    public Command(final int number) {
    }

    /**
     * @return the number of this command
     */
    public int getNumber();

    /**
     * @return the number of subcommands this command has
     */
    public int numberOfSubcommands();

    /**
     * @param subcommandNo
     * @return the subcommand with the given number
     */
    public Subcommand getSubcommand(final int subcommandNo);

    /**
     * @param subcommandNo
     * @return <code>true</code> if this command contains a subcommand with the
     *         given number
     */
    public boolean hasSubcommandNo(final int subcommandNo);

    /**
     * @param subcommandNo
     * @return <code>true</code> if more subcomm