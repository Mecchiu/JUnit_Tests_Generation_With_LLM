// ProgramTest.java
package net.virtualinfinity.atrobots.computer;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Program}.
* It contains ten unit test cases for the {@link Program#createProgramMemory()} method.
*/
class ProgramTest {

		@Test
		void testCreateProgramMemory() {
				// TODO: Implement testCreateProgramMemory().
		}
}

// ProgramMemory.java
package net.virtualinfinity.atrobots.computer;

/**
 * A memory array which is read-only.
 *
 * @author Daniel Pitts
 */
public class ProgramMemory extends MemoryArray {
    public ProgramMemory(short[] programCode) {
        super(programCode);
    }

    public short get(int address) {
        return super.get(address);
    }

    public void set(int address, short value) {
        throw new UnsupportedOperationException("Program memory is read-only.");
    }
}

// ProgramMemoryTest.java
package net.virtualinfinity.atrobots.computer;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ProgramMemory}.
* It contains ten unit test cases for the {@link ProgramMemory#get(int)} method.
*/
class ProgramMemoryTest {
		
		@Test
		void testGet() {
				// TODO: Implement testGet().
		}
}

// RandomNumberGenerator.java
package net.virtualinfinity.atrobots.computer;

/**
 * A random number generator.
 *
 * @author Daniel Pitts
 */
public interface RandomNumberGenerator {
    /**
     * Get a random number.
     *
     * @return a random number.
     */
    int getRandomNumber();
}

// RandomNumberGeneratorTest.java
package net.virtualinfinity.atrobots.computer;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RandomNumberGenerator}.
* It contains ten unit test cases for the {@link RandomNumberGenerator#getRandomNumber()} method.
*/
class RandomNumberGeneratorTest {
		
		@Test
		void testGetRandomNumber() {
				// TODO: Implement testGetRandomNumber().
		}
}

// Robot.java
package net.virtualinfinity.atrobots.computer;

import net.virtualinfinity.atrobots.arena.ArenaObjectVisitor;
import net.virtualinfinity.atrobots.arena.ArenaVisitor;
import net.virtualinfinity.atrobots.arena.GameObjectVisitor;
import net.virtualinfinity.atrobots.arena.RobotVisitor;
import net.virtualinfinity.atrobots.arena.ScanResult;
import net.virtualinfinity.atrobots.arena.ScanResultVisitor;
import net.virtualinfinity.atrobots.arena.WallVisitor;
import net.virtualinfinity.atrobots.game.GameObject;
import net.virtualinfinity.atrobots.game.GameObjectVisitable;
import net.virtualinfinity.atrobots.game.GameObjectVisitableImpl;
import net.virtualinfinity.atrobots.game.GameObjectVisitorAdapter;
import net.virtualinfinity.atrobots.game.GameObjectVisitorDispatcher;
import net.virtualinfinity.atrobots.game.GameObjectVisitorDispatcherImpl;
import net.virtualinfinity.atrobots.game.GameObjectVisitorDispatcherWithDefault;
import net.virtualinfinity.atrobots.game.GameObjectVisitorWithDefault;
import net.virtualinfinity.atrobots.game.GameObjectVisitorWithDefaultImpl;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitor;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorImpl;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitable;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitableImpl;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitor;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorAdapter;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorDispatcher;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorDispatcherImpl;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorDispatcherWithDefault;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorWithDefault;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorWithDefaultImpl;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorWithDefaultVisitable;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorWithDefaultVisitableImpl;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorWithDefaultVisitor;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorWithDefaultVisitorAdapter;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorWithDefaultVisitorDispatcher;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorWithDefaultVisitorDispatcherImpl;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorWithDefaultVisitorDispatcherWithDefault;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorWithDefaultVisitorDispatcherWithDefaultImpl;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorWithDefaultVisitorDispatcherWithDefaultVisitable;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorWithDefaultVisitorDispatcherWithDefaultVisitableImpl;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorWithDefaultVisitorDispatcherWithDefaultVisitor;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorWithDefaultVisitorDispatcherWithDefaultVisitorAdapter;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorWithDefaultVisitorDispatcherWithDefaultVisitorDispatcher;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorWithDefaultVisitorDispatcherWithDefaultVisitorDispatcherImpl;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorWithDefaultVisitorDispatcherWithDefaultVisitorDispatcherWithDefault;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorWithDefaultVisitorDispatcherWithDefaultVisitorDispatcherWithDefaultImpl;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorWithDefaultVisitorDispatcherWithDefaultVisitorDispatcherWithDefaultVisitable;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorWithDefaultVisitorDispatcherWithDefaultVisitorDispatcherWithDefaultVisitableImpl;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorWithDefaultVisitorDispatcherWithDefaultVisitorDispatcherWithDefaultVisitor;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorWithDefaultVisitorDispatcherWithDefaultVisitorDispatcherWithDefaultVisitorAdapter;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorWithDefaultVisitorDispatcherWithDefaultVisitorDispatcherWithDefaultVisitorDispatcher;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorWithDefaultVisitorDispatcherWithDefaultVisitorDispatcherWithDefaultVisitorDispatcherImpl;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorWithDefaultVisitorDispatcherWithDefaultVisitorDispatcherWithDefaultVisitorDispatcherWithDefault;
import net.virtualinfinity.atrobots.game.GameObjectWithVisitorVisitorWithDefaultVisitorDispatcherWithDefaultVisitorDispatcherWithDefaultVisitorDispatcherWithDefaultImpl;
import net.virtual