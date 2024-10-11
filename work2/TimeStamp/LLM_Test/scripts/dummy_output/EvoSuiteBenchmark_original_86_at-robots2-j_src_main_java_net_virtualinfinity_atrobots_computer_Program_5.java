// ProgramTest.java
package net.virtualinfinity.atrobots.computer;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Program}.
* It contains one unit test case for the {@link Program#createProgramMemory()} method.
*/
class ProgramTest {
		
	@Test
	public final void testCreateProgramMemory() {
		assertNotSame(null, Application.createGame("Test"));
		byte[] memory = Program.createProgramMemory();
		Application.resetGame();
		assertNotSame(null, memory);
		assertNotSame(null, memory.get(0));
		assertNotSame(null, memory.get(1));
		assertNotSame(null, memory.get(2));
		assertNotSame(null, memory.get(3));
		assertArrayEquals(new byte[]{0x00, 0x20, 0xff, 0xff, 0x00, 0x00, 0xccc, 0x00}, memory);
	}
}