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
		public void testProgramMemory() {
			try (Program program = Program.createProgramMemory()) {
					program.start();

					// test reading the byte at a regular time.
					String[] a = program.readUntil("a");
					assertArrayEquals(new String[]{"c"}, a);

					// test not seeing if we've reached program.length
					assertArrayEquals(new String[] {""}, program.readUntil("aaaa"));

					// not seeing if next can be null
					assertNull(program.readUntil(null));

					// not seeing if previous can be null
					assertNull(program.readUntil(new String[] {null}));
			}
		}
}
