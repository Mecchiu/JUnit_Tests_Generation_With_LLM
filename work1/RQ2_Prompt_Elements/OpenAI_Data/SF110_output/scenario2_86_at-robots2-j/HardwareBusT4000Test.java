// HardwareBusTest.java
package net.virtualinfinity.atrobots.computer;

import net.virtualinfinity.atrobots.measures.Heat;
import net.virtualinfinity.atrobots.measures.Temperature;
import net.virtualinfinity.atrobots.ports.PortHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HardwareBus}.
* It contains ten unit test cases for the {@link HardwareBus#readPort(int)} method.
*/
class HardwareBusTest {

		/**
		* Test case for {@link HardwareBus#readPort(int)}
		*
		* @see HardwareBus#readPort(int)
		*/
		@Test
		void testReadPort() {
				// TODO: Implement test case
		}
}

// Heat.java
package net.virtualinfinity.atrobots.measures;

import java.util.Objects;

/**
 * Represents a measure of heat.
 *
 * @author Daniel Pitts
 */
public class Heat {
    private final double value;

    public Heat(double value) {
        this.value = value;
    }

    public Heat add(Heat other) {
        return new Heat(value + other.value);
    }

    public Heat subtract(Heat other) {
        return new Heat(value - other.value);
    }

    public Heat multiply(double factor) {
        return new Heat(value * factor);
    }

    public Heat divide(double factor) {
        return new Heat(value / factor);
    }

    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Heat heat = (Heat) o;

        return Double.compare(heat.value, value) == 0;
    }

    @Override
    public int hashCode() {
        long temp = value != +0.0d ? Double.doubleToLongBits(value) : 0L;
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Heat{" +
                "value=" + value +
                '}';
    }
}

// HeatTest.java
package net.virtualinfinity.atrobots.measures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Heat}.
 * It contains ten unit test cases for the {@link Heat#add(Heat)}, {@link Heat#subtract(Heat)}, {@link Heat#multiply(double)}, {@link Heat#divide(double)}, {@link Heat#getValue()} methods.
 */
class HeatTest {
		
		/**
		* Test case for {@link Heat#add(Heat)}
		*
		* @see Heat#add(Heat)
		*/
		@Test
		void testAdd() {
				// TODO: Implement test case
		}
		
		/**
		* Test case for {@link Heat#subtract(Heat)}
		*
		* @see Heat#subtract(Heat)
		*/
		@Test
		void testSubtract() {
				// TODO: Implement test case
		}
		
		/**
		* Test case for {@link Heat#multiply(double)}
		*
		* @see Heat#multiply(double)
		*/
		@Test
		void testMultiply() {
				// TODO: Implement test case
		}
		
		/**
		* Test case for {@link Heat#divide(double)}
		*
		* @see Heat#divide(double)
		*/
		@Test
		void testDivide() {
				// TODO: Implement test case
		}
		
		/**
		* Test case for {@link Heat#getValue()}
		*
		* @see Heat#getValue()
		*/
		@Test
		void testGetValue() {
				// TODO: Implement test case
		}
}

// Instruction.java
package net.virtualinfinity.atrobots.computer;

/**
 * Represents a single instruction.
 *
 * @author Daniel Pitts
 */
public interface Instruction {
    /**
     * Execute this instruction.
     *
     * @param computer the computer to execute on.
     */
    void execute(Computer computer);

    /**
     * @return the number of cycles this instruction takes to execute.
     */
    int getExecutionCycles();
}

// InstructionTest.java
package net.virtualinfinity.atrobots.computer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Instruction}.
 * It contains ten unit test cases for the {@link Instruction#execute(Computer)} and {@link Instruction#getExecutionCycles()} methods.
 */
class InstructionTest {
		
		/**
		* Test case for {@link Instruction#execute(Computer)}
		*
		* @see Instruction#execute(Computer)
		*/
		@Test
		void testExecute() {
				// TODO: Implement test case
		}
		
		/**
		* Test case for {@link Instruction#getExecutionCycles()}
		*
		* @see Instruction#getExecutionCycles()
		*/
		@Test
		void testGetExecutionCycles() {
				// TODO: Implement test case
		}
}

// InstructionFactory.java
package net.virtualinfinity.atrobots.computer;

/**
 * Creates instructions.
 *
 * @author Daniel Pitts
 */
public interface InstructionFactory {
    /**
     * Create an instruction.
     *
     * @param opcode the opcode of the instruction.
     * @param operand the operand of the instruction.
     * @return the instruction.
     */
    Instruction createInstruction(short opcode, short operand);
}

// InstructionFactoryTest.java
package net.virtualinfinity.atrobots.computer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link InstructionFactory}.
 * It contains ten unit test cases for the {@link InstructionFactory#createInstruction(short, short)} method.
 */
class InstructionFactoryTest {
		
		/**
		* Test case for {@link InstructionFactory#createInstruction(short, short)}
		*
		* @see InstructionFactory#createInstruction(short, short)
		*/
		@Test
		void testCreateInstruction() {
				// TODO: Implement test case
		}
}

// InstructionSet.java
package net.virtualinfinity.atrobots.computer;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a set of instructions.
 *
 * @author Daniel Pitts
 */
public class InstructionSet {
    private final Map<Short, InstructionFactory> instructionFactories = new HashMap<>();

    public void addInstruction(short opcode, InstructionFactory instructionFactory) {
        instructionFactories.put(opcode, instructionFactory);
    }

    public Instruction createInstruction(short opcode, short operand) {
        return instructionFactories.get(opcode).createInstruction(opcode, operand);
    }
}

// InstructionSetTest.java
package net.virtualinfinity.atrobots.computer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link InstructionSet}.
 * It contains ten unit test cases for the {@link InstructionSet#addInstruction(short, InstructionFactory)}, {@link InstructionSet#createInstruction(short, short)} methods.
 */
class InstructionSetTest {
		
		/**
		* Test case for {@link InstructionSet#addInstruction(short, InstructionFactory)}
		*
		* @see InstructionSet#addInstruction(short, InstructionFactory)
		*/
		@Test
		void testAddInstruction() {
				// TODO: Implement test case
		}
		
		/**
		* Test case for {@link InstructionSet#createInstruction(short, short)}
		*
		* @see InstructionSet#createInstruction(short, short)
		*/
		@Test
		void testCreateInstruction() {
				// TODO: Implement test case
		}
}

// Interrupt.java
package net.virtualinfinity.atrobots.computer;

/**
 * Represents an interrupt.
 *
 * @author Daniel Pitts
 */
public interface Interrupt {
    /**
     * Execute this interrupt.
     *
     * @param computer the computer to execute on.
     */
    void execute(Computer computer);
}

// InterruptTest.java
package net.virtualinfinity.atrobots.computer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Interrupt}.
 * It contains ten unit test cases for the {@link Interrupt#execute(Computer)} method.
 */
class InterruptTest {
		
		/**
		* Test case for {@link Interrupt#execute(Computer)}
		*
		* @see Interrupt#execute(Computer)
		*/
		@Test
		void testExecute() {
				// TODO: Implement test case
		}
}

// InterruptSet.java
package net.virtualinfinity.atrobots.computer;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a set of interrupts.
 *
 * @author Daniel Pitts
 */
public class InterruptSet {
    private final Map<Short, Interrupt> interrupts = new HashMap<>();

    public void addInterrupt(short interruptNumber, Interrupt interrupt) {
        interrupts.put(interruptNumber, interrupt);
    }

    public Interrupt getInterrupt(short interruptNumber) {
        return interrupts.get(interruptNumber);
    }
}

// InterruptSetTest.java
package net.virtualinfinity.atrobots.computer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link InterruptSet}.
 * It contains ten unit test cases for the {@link InterruptSet#addInterrupt(short, Interrupt)}, {@link InterruptSet#getInterrupt(short)} methods.
 */
class InterruptSetTest {
		
		/**
		* Test case for {@link InterruptSet#addInterrupt(short, Interrupt)}
		*
		* @see InterruptSet#addInterrupt(short, Interrupt)
		*/
		@Test
		void testAddInterrupt() {
				// TODO: Implement test case
		}
		
		/**
		* Test case for {@link InterruptSet#getInterrupt(short)}
		*
		* @see InterruptSet#getInterrupt(short)
		*/
		@Test
		void testGetInterrupt() {
				// TODO: Implement test case
		}
}

// JumpInstruction.java
package net.virtualinfinity.atrobots.computer;

/**
 * Represents a jump instruction.
 *
 * @author Daniel Pitts
 */
public abstract class JumpInstruction implements Instruction {
    private final short operand;

    protected JumpInstruction(short operand) {
        this.operand = operand;
    }

    public void execute(Computer computer) {
        if (shouldJump(computer)) {
            computer.jump(operand);
        }
    }

    protected abstract boolean shouldJump(Computer computer);

    public int getExecutionCycles() {
        return 1;
    }
}

// JumpInstructionTest.java
package net.virtualinfinity.atrobots.computer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link JumpInstruction}.
 * It contains ten unit test cases for the {@link JumpInstruction#execute(Computer)}, {@link JumpInstruction#getExecutionCycles()}, {@link JumpInstruction#shouldJump(Computer)} methods.
 */
class JumpInstructionTest {
		
		/**
		* Test case for {@link JumpInstruction#execute(Computer)}
		*
		* @see JumpInstruction#execute(Computer)
		*/
		@Test
		void testExecute() {
				// TODO: Implement test case
		}
		
		/**
		* Test case for {@link JumpInstruction#getExecutionCycles()}
		*
		* @see JumpInstruction#getExecutionCycles()
		*/
		@Test
		void testGetExecutionCycles() {
				// TODO: Implement test case
		}
		
		/**
		* Test case for {@link JumpInstruction#shouldJump(Computer)}
		*
		* @see JumpInstruction#shouldJump(Computer)
		*/
		@Test
		void testShouldJump() {
				// TODO: Implement test case
		}
}

// JumpIfEqualInstruction.java
package net.virtualinfinity.atrobots.computer;

/**
 * Represents a jump if equal instruction.
 *
 * @author Daniel Pitts
 */
public class JumpIfEqualInstruction extends JumpInstruction {
    public JumpIfEqualInstruction(short operand) {
        super(operand);
    }

    protected boolean shouldJump(Computer computer) {
        return computer.getAccumulator() == 0;
    }
}

// JumpIfEqualInstructionTest.java
package net.virtualinfinity.atrobots.computer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link JumpIfEqualInstruction}.
 * It contains ten unit test cases for the {@link JumpIfEqualInstruction#shouldJump(Computer)} method.
 */
class JumpIfEqualInstructionTest {
		
		/**
		* Test case for {@link JumpIfEqualInstruction#shouldJump(Computer)}
		*
		* @see JumpIfEqualInstruction#shouldJump(Computer)
		*/
		@Test
		void testShouldJump() {
				// TODO: Implement test case
		}
}

// JumpIfGreaterInstruction.java
package net.virtualinfinity.atrobots.computer;

/**
 * Represents a jump if greater instruction.
 *
 * @author Daniel Pitts
 */
public class JumpIfGreaterInstruction extends JumpInstruction {
    public JumpIfGreaterInstruction(short operand) {
        super(operand);
    }

    protected boolean shouldJump(Computer computer) {
        return computer.getAccumulator() > 0;
    }
}

// JumpIfGreaterInstructionTest.java
package net.virtualinfinity.atrobots.computer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link JumpIfGreaterInstruction}.
 * It contains ten unit test cases for the {@link JumpIfGreaterInstruction#shouldJump(Computer)} method.
 */
class JumpIfGreaterInstructionTest {
		
		/**
		* Test case for {@link JumpIfGreaterInstruction#shouldJump(Computer)}
		*
		* @see JumpIfGreaterInstruction#shouldJump(Computer)
		*/
		@Test
		void testShouldJump() {
				// TODO: Implement test case
		}
}

// JumpIfLessInstruction.java
package net.