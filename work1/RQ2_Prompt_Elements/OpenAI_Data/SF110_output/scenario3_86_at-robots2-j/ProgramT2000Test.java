// ProgramTest.java
package net.virtualinfinity.atrobots.computer;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Program}.
* It contains ten unit test cases for the {@link Program#createProgramMemory()} method.
*/
class ProgramTest {

	/**
	* Test case for {@link Program#createProgramMemory()}.
	* It tests the method with a program that has no instructions.
	*/
	@Test
	void testCreateProgramMemory_noInstructions() {
		Program program = new Program();
		MemoryArray memory = program.createProgramMemory();
		assertEquals(0, memory.get(0));
	}
	
	/**
	* Test case for {@link Program#createProgramMemory()}.
	* It tests the method with a program that has one instruction.
	*/
	@Test
	void testCreateProgramMemory_oneInstruction() {
		Program program = new Program();
		program.addInstruction(0, new Instruction(0, 0, 0, 0));
		MemoryArray memory = program.createProgramMemory();
		assertEquals(0, memory.get(0));
	}
	
	/**
	* Test case for {@link Program#createProgramMemory()}.
	* It tests the method with a program that has two instructions.
	*/
	@Test
	void testCreateProgramMemory_twoInstructions() {
		Program program = new Program();
		program.addInstruction(0, new Instruction(0, 0, 0, 0));
		program.addInstruction(1, new Instruction(0, 0, 0, 0));
		MemoryArray memory = program.createProgramMemory();
		assertEquals(0, memory.get(0));
		assertEquals(0, memory.get(1));
	}
	
	/**
	* Test case for {@link Program#createProgramMemory()}.
	* It tests the method with a program that has three instructions.
	*/
	@Test
	void testCreateProgramMemory_threeInstructions() {
		Program program = new Program();
		program.addInstruction(0, new Instruction(0, 0, 0, 0));
		program.addInstruction(1, new Instruction(0, 0, 0, 0));
		program.addInstruction(2, new Instruction(0, 0, 0, 0));
		MemoryArray memory = program.createProgramMemory();
		assertEquals(0, memory.get(0));
		assertEquals(0, memory.get(1));
		assertEquals(0, memory.get(2));
	}
	
	/**
	* Test case for {@link Program#createProgramMemory()}.
	* It tests the method with a program that has four instructions.
	*/
	@Test
	void testCreateProgramMemory_fourInstructions() {
		Program program = new Program();
		program.addInstruction(0, new Instruction(0, 0, 0, 0));
		program.addInstruction(1, new Instruction(0, 0, 0, 0));
		program.addInstruction(2, new Instruction(0, 0, 0, 0));
		program.addInstruction(3, new Instruction(0, 0, 0, 0));
		MemoryArray memory = program.createProgramMemory();
		assertEquals(0, memory.get(0));
		assertEquals(0, memory.get(1));
		assertEquals(0, memory.get(2));
		assertEquals(0, memory.get(3));
	}
	
	/**
	* Test case for {@link Program#createProgramMemory()}.
	* It tests the method with a program that has five instructions.
	*/
	@Test
	void testCreateProgramMemory_fiveInstructions() {
		Program program = new Program();
		program.addInstruction(0, new Instruction(0, 0, 0, 0));
		program.addInstruction(1, new Instruction(0, 0, 0, 0));
		program.addInstruction(2, new Instruction(0, 0, 0, 0));
		program.addInstruction(3, new Instruction(0, 0, 0, 0));
		program.addInstruction(4, new Instruction(0, 0, 0, 0));
		MemoryArray memory = program.createProgramMemory();
		assertEquals(0, memory.get(0));
		assertEquals(0, memory.get(1));
		assertEquals(0, memory.get(2));
		assertEquals(0, memory.get(3));
		assertEquals(0, memory.get(4));
	}
	
	/**
	* Test case for {@link Program#createProgramMemory()}.
	* It tests the method with a program that has six instructions.
	*/
	@Test
	void testCreateProgramMemory_sixInstructions() {
		Program program = new Program();
		program.addInstruction(0, new Instruction(0, 0, 0, 0));
		program.addInstruction(1, new Instruction(0, 0, 0, 0));
		program.addInstruction(2, new Instruction(0, 0, 0, 0));
		program.addInstruction(3, new Instruction(0, 0, 0, 0));
		program.addInstruction(4, new Instruction(0, 0, 0, 0));
		program.addInstruction(5, new Instruction(0, 0, 0, 0));
		MemoryArray memory = program.createProgramMemory();
		assertEquals(0, memory.get(0));
		assertEquals(0, memory.get(1));
		assertEquals(0, memory.get(2));
		assertEquals(0, memory.get(3));
		assertEquals(0, memory.get(4));
		assertEquals(0, memory.get(5));
	}
	
	/**
	* Test case for {@link Program#createProgramMemory()}.
	* It tests the method with a program that has seven instructions.
	*/
	@Test
	void testCreateProgramMemory_sevenInstructions() {
		Program program = new Program();
		program.addInstruction(0, new Instruction(0, 0, 0, 0));
		program.addInstruction(1, new Instruction(0, 0, 0, 0));
		program.addInstruction(2, new Instruction(0, 0, 0, 0));
		program.addInstruction(3, new Instruction(0, 0, 0, 0));
		program.addInstruction(4, new Instruction(0, 0, 0, 0));
		program.addInstruction(5, new Instruction(0, 0, 0, 0));
		program.addInstruction(6, new Instruction(0, 0, 0, 0));
		MemoryArray memory = program.createProgramMemory();
		assertEquals(0, memory.get(0));
		assertEquals(0, memory.get(1));
		assertEquals(0, memory.get(2));
		assertEquals(0, memory.get(3));
		assertEquals(0, memory.get(4));
		assertEquals(0, memory.get(5));
		assertEquals(0, memory.get(6));
	}
	
	/**
	* Test case for {@link Program#createProgramMemory()}.
	* It tests the method with a program that has eight instructions.
	*/
	@Test
	void testCreateProgramMemory_eightInstructions() {
		Program program = new Program();
		program.addInstruction(0, new Instruction(0, 0, 0, 0));
		program.addInstruction(1, new Instruction(0, 0, 0, 0));
		program.addInstruction(2, new Instruction(0, 0, 0, 0));
		program.addInstruction(3, new Instruction(0, 0, 0, 0));
		program.addInstruction(4, new Instruction(0, 0, 0, 0));
		program.addInstruction(5, new Instruction(0, 0, 0, 0));
		program.addInstruction(6, new Instruction(0, 0, 0, 0));
		program.addInstruction(7, new Instruction(0, 0, 0, 0));
		MemoryArray memory = program.createProgramMemory();
		assertEquals(0, memory.get(0));
		assertEquals(0, memory.get(1));
		assertEquals(0, memory.get(2));
		assert