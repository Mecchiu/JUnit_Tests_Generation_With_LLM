// VerticalBlock_1Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VerticalBlock}.
* It contains one unit test case for the {@link VerticalBlock#extractParallelSubblocks()} method.
*/
class VerticalBlock_1Test {
/**
		 * Test with empty constructor and one initial position.
		 */
		@Test
		void emptyCtor() {
			VBlock block = new VerticalBlock_1("");
			Collection<VWordPosition> subblock = block.extractParallelSubblocks();
			assertTrue(subblock.isEmpty());
			assertEquals(2, block.getSubblockPositionCount());
		}

		/**
		 * Test with empty constructor and one initial position and one initial position with empty block.
		 */
		@Test
		void emptyCtor2() {
			VBlock block = new VerticalBlock_1("");
			Collection<VWordPosition> subblock = block.extractParallelSubblocks();
			assertTrue(subblock.isEmpty());
			assertEquals(1, block.getSubblockPositionCount());
		}

		/**
		 * Test with one initial position and several other initial positions.
		 */
		@Test
		void threeInitials() {
			VBlock block = new VerticalBlock_1("");
			Collection<VWordPosition> subblock = block.extractParallelSubblocks();
			Collection<VWordPosition> subblock2 = block.extractParallelSubblocks();
			assertEquals(2, subblock.size());
			assertEquals(2, subblock2.size());
			assertSame(subblock.toArray(), subblock2.toArray());
			assertEquals(2, block.getSubblockPositionCount());
		}

		/**
		 * Test with one initial position and many other initial positions.
		 */
		@Test
		void manyInitials() {
			VBlock block = new VerticalBlock_1("");
			Collection<VWordPosition> subblock = block.extractParallelSubblocks();
			Collection<VWordPosition> subblock2 = block.extractParallelSubblocks();
			assertEquals(1, subblock.size());
			assertTrue(subblock.toArray().length > 1);
			Collection<VWordPosition> subblock3 = block.extractParallelSubblocks();
			assertThat(subblock3.size(), is(3));
			assertEquals(2, subblock3.size());
			assertEquals(2, subblock2.size());
			assertSame(subblock3.toArray(), subblock2.toArray());
			assertEquals(3, block.getSubblockPositionCount());
		}

		/**
		 * Test with many initial positions and many initial positions without overlapping between them.
		 */
		@Test
		void manyInitialsWithoutOverlapping() {
			VBlock block = new VerticalBlock_1("");
			Collection<VWordPosition> subblock = block.extractParallelSubblocks();
			Collection<VWordPosition> subblock2 = block.extractParallelSubblocks();
			assertFalse(subblock.isEmpty());
			assertTrue(subblock2.isEmpty());
		}

		/**
		 * Test with a new empty position and another initial position.
		 */
		@Test
		void newPosition() {
			VBlock block = new VerticalBlock_1("");
			Collection<VWordPosition> subblock = block.extractParallelSubblocks();
			assertTrue(subblock.isEmpty());
			assertEquals(1, block.getSubblockPositionCount());

			VWordPosition newPos = null;
			try {
				newPos = block.newPosition();
				fail("newPosition() expected an exception");
			} catch(Exception e) { }
			assertSame(newVWordPosition("<Nil>"), newPos);
		}

		/**
		 * Test with new position in block with two other positions, one being a new initial position.
		 */
		@Test
		void newPosition2() {
			VBlock block = new VerticalBlock_1("");
			Collection<VWordPosition> subblock = block.extractParallelSubblocks();
			Collection<VWordPosition> subblock2 = block.extractParallelSubblocks();
			assertEquals(2, subblock.size());
			assertEquals(1, subblock2.size());

			VWordPosition newPos = null;
			try {
				newPos = block.newPosition();
				newPos.setWordPosition(2);
				fail("newPosition() expected an exception");

			} catch(Exception e) { }
			assertSame(newVWordPosition("<Nil>"), newPos);
		}

		/**
		 * A test case for the implementation of {@code getVLine()}.
		 */
		@Test
		void getVLine_0() {
			VBlock block = new VerticalBlock_1("");
			Collection<VWordPosition> subblock = block.extractParallelSubblocks();
			Collection<VLinePosition> lines = block.getVLine();
			assertTrue(lines.isEmpty());
			assertSame(new VLinePosition(0, 1), lines.toArray()[0]);
			assertEquals(1, lines.size());
		}

		/**
		 * Test in with initial position 1.
		 */
		@Test
		void getVLine_1() {
			VBlock block1 = new VerticalBlock_1("");
			Collection<VWordPosition> subblock1 = block1.extractParallelSubblocks();
			Collection<VLinePosition> lines1 = block1.getVLine();
			assertEquals(1, lines1.size());
			assertThat(lines1.toArray(), contains(new VLinePosition(1, 1)));

			VBlock block2 = new VerticalBlock_1("");
			Collection<VWordPosition> subblock2 = block2.extractParallelSubblocks();
			Collection<VLinePosition> lines2 = block2.getVLine();
			assertEquals(0, lines2.size());
			assertSame(new VLinePosition(1, 1), lines2.toArray()[0]);

			assertTrue(lines1.toArray().length > 0);
		}

		/**
		 * Test in with multiple initial positions with non overlapping subblocks.
		 */
		@Test
		void getVLine_2() {
			VBlock block1 = new VerticalBlock_1("");
			Collection<VWordPosition> subblock1 = block1.extractParallelSubblocks();
			Collection<VLinePosition> lines1 = block1.getVLine();
			assertEquals(1, lines1.size());

			VBlock block2 = new VerticalBlock_2("");
			Collection<VWordPosition> subblock2 = block2.extractParallelSubblocks();
			Collection<VLinePosition> lines2 = block2.getVLine();
			assertEquals(1, lines2.size());

			Collection<BinaryLinePosition> lines3 = block1.getVLine();
			assertEquals(0, lines3.size());
			assertEquals(0, lines2.size());
		}

		@Test
		void getVLine_NonOverlap() {
			VBlock block1 = new VerticalBlock_1("");
			Collection<VWordPosition> subblock1 = block1.extractParallelSubblocks();
			Collection<VLinePosition> lines1 = block1.getVLine();

			VSpacePosition prev2 = null;
			for(int i = 0; i < 10; i ++) {    
				VLinePosition line = lines1.toArray()[i];
				VSpacePosition next2 = getVLinePosition(prev2, (i + 1));
				if (line.