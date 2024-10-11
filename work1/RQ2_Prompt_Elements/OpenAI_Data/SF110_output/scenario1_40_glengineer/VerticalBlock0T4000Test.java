// VerticalBlockTest.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VerticalBlock}.
* It contains ten unit test cases for the {@link VerticalBlock#extractSequentialSubblocks()} method.
*/
class VerticalBlockTest {

	@Test
	void testExtractSequentialSubblocks1() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 5));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(1, result.size());
		assertEquals(block, result.get(0));
	}
	
	@Test
	void testExtractSequentialSubblocks2() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 3));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(2, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 2)), result.get(0));
		assertEquals(new VerticalBlock(new CharPosition1(1, 4), new CharPosition1(1, 5)), result.get(1));
	}
	
	@Test
	void testExtractSequentialSubblocks3() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 3));
		block.add(new CharPosition1(1, 4));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(3, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 2)), result.get(0));
		assertEquals(new VerticalBlock(new CharPosition1(1, 4), new CharPosition1(1, 4)), result.get(1));
		assertEquals(new VerticalBlock(new CharPosition1(1, 5), new CharPosition1(1, 5)), result.get(2));
	}
	
	@Test
	void testExtractSequentialSubblocks4() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 3));
		block.add(new CharPosition1(1, 4));
		block.add(new CharPosition1(1, 5));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(3, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 2)), result.get(0));
		assertEquals(new VerticalBlock(new CharPosition1(1, 4), new CharPosition1(1, 5)), result.get(1));
		assertEquals(new VerticalBlock(new CharPosition1(1, 5), new CharPosition1(1, 5)), result.get(2));
	}
	
	@Test
	void testExtractSequentialSubblocks5() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 3));
		block.add(new CharPosition1(1, 4));
		block.add(new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 6));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(4, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 2)), result.get(0));
		assertEquals(new VerticalBlock(new CharPosition1(1, 4), new CharPosition1(1, 5)), result.get(1));
		assertEquals(new VerticalBlock(new CharPosition1(1, 5), new CharPosition1(1, 5)), result.get(2));
		assertEquals(new VerticalBlock(new CharPosition1(1, 6), new CharPosition1(1, 6)), result.get(3));
	}
	
	@Test
	void testExtractSequentialSubblocks6() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 3));
		block.add(new CharPosition1(1, 4));
		block.add(new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 6));
		block.add(new CharPosition1(1, 7));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(4, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 2)), result.get(0));
		assertEquals(new VerticalBlock(new CharPosition1(1, 4), new CharPosition1(1, 7)), result.get(1));
		assertEquals(new VerticalBlock(new CharPosition1(1, 7), new CharPosition1(1, 7)), result.get(2));
		assertEquals(new VerticalBlock(new CharPosition1(1, 7), new CharPosition1(1, 7)), result.get(3));
	}
	
	@Test
	void testExtractSequentialSubblocks7() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 3));
		block.add(new CharPosition1(1, 4));
		block.add(new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 6));
		block.add(new CharPosition1(1, 7));
		block.add(new CharPosition1(1, 8));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(5, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 2)), result.get(0));
		assertEquals(new VerticalBlock(new CharPosition1(1, 4), new CharPosition1(1, 7)), result.get(1));
		assertEquals(new VerticalBlock(new CharPosition1(1, 7), new CharPosition1(1, 7)), result.get(2));
		assertEquals(new VerticalBlock(new CharPosition1(1, 7), new CharPosition1(1, 7)), result.get(3));
		assertEquals(new VerticalBlock(new CharPosition1(1, 8), new CharPosition1(1, 8)), result.get(4));
	}
	
	@Test
	void testExtractSequentialSubblocks8() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 3));
		block.add(new CharPosition1(1, 4));
		block.add(new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 6));
		block.add(new CharPosition1(1, 7));
		block.add(new CharPosition1(1, 8));
		block.add(new CharPosition1(1, 9));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(5, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 2)), result.get(0));
		assertEquals(new VerticalBlock(new CharPosition1(1, 4), new CharPosition1(1, 7)), result.get(1));
		assertEquals(new VerticalBlock(new CharPosition1(1, 7), new CharPosition1(1, 7)), result.get(2));
		assertEquals(new VerticalBlock(new CharPosition1(1, 7), new CharPosition1(1, 7)), result.get(3));
		assertEquals(new VerticalBlock(new CharPosition1(1, 9), new CharPosition1(1, 9)), result.get(4));
	}
	
	@Test
	void testExtractSequentialSubblocks9() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 3));
		block.add(new CharPosition1(1, 4));
		block.add(new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 6));
		block.add(new CharPosition1(1, 7));
		block.add(new CharPosition1(1, 8));
		block.add(new CharPosition1(1, 9));
		block.add(new CharPosition1(1, 10));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(6, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 2)), result.get(0));
		assertEquals(new VerticalBlock(new CharPosition1(1, 4), new CharPosition1(1, 7)), result.get(1));
		assertEquals(new VerticalBlock(new CharPosition1(1, 7), new CharPosition1(1, 7)), result.get(2));
		assertEquals(new VerticalBlock(new CharPosition1(1, 7), new CharPosition1(1, 7)), result.get(3));
		assertEquals(new VerticalBlock(new CharPosition1(1, 9), new CharPosition1(1, 9)), result.get(4));
		assertEquals(new VerticalBlock(new CharPosition1(1, 10), new CharPosition1(1, 10)), result.get(5));
	}
	
	@Test
	void testExtractSequentialSubblocks10() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 3));
		block.add(new CharPosition1(1, 4));
		block.add(new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 6));
		block.add(new CharPosition1(1, 7));
		block.add(new CharPosition1(1, 8));
		block.add(new CharPosition1(1, 9));
		block.add(new CharPosition1(1, 10));
		block.add(new CharPosition1(1, 11));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(6, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 2)), result.get(0));
		assertEquals(new VerticalBlock(new CharPosition1(1, 4), new CharPosition1(1, 7)), result.get(1));
		assertEquals(new VerticalBlock(new CharPosition1(1, 7), new CharPosition1(1, 7)), result.get(2));
		assertEquals(new VerticalBlock(new CharPosition1(1, 7), new CharPosition1(1, 7)), result.get(3));
		assertEquals(new VerticalBlock(new CharPosition1(1, 9), new CharPosition1(1, 11)), result.get(4));
		assertEquals(new VerticalBlock(new CharPosition1(1, 11), new CharPosition1(1, 11)), result.get(5));
	}
}

// HorizontalBlock.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;

/**
 * An implementation of the abstract class {@code Block}
 * used for horizontal layouting.
 */
public class HorizontalBlock extends Block {

    public List<Block> extractSequentialSubblocks() {
        this.optimize();
        if (isTrivial())
            return new LinkedList<Block>();
        List<Block> result = new LinkedList<Block>();
        HorizontalBlock firstBlock;
        HorizontalBlock theRest = this;
        do {
            firstBlock = theRest.extractFirstSequentialSubblock();
            theRest = theRest.cloneWith(new CharPosition1(firstBlock.x2, this.y1));
            firstBlock.optimize();
            if (!firstBlock.isTrivial())
                result.add(firstBlock);
            theRest.optimize();
        } while (!theRest.isTrivial());
        return result;
    }
}

// HorizontalBlockTest.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HorizontalBlock}.
* It contains ten unit test cases for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
*/
class HorizontalBlockTest {
		
	@Test
	void testExtractSequentialSubblocks1() {
		HorizontalBlock block = new HorizontalBlock(new CharPosition1(1, 1), new CharPosition1(5, 1));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(1, result.size());
		assertEquals(block, result.get(0));
	}
	
	@Test
	void testExtractSequentialSubblocks2() {
		HorizontalBlock block = new HorizontalBlock(new CharPosition1(1, 1), new CharPosition1(5, 1));
		block.add(new CharPosition1(3, 1));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(2, result.size());
		assertEquals(new HorizontalBlock(new CharPosition1(1, 1), new CharPosition1(2, 1)), result.get(0));
		assertEquals(new HorizontalBlock(new CharPosition1(4, 1), new CharPosition1(5, 1)), result.get(1));
	}
	
	@Test
	void testExtractSequentialSubblocks3() {
		HorizontalBlock block = new HorizontalBlock(new CharPosition1(1, 1), new CharPosition1(5, 1));
		block.add(new CharPosition1(3, 1));
		block.add(new CharPosition1(4, 1));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(3, result.size());
		assertEquals(new HorizontalBlock(new CharPosition1(1, 1), new CharPosition1(2, 1)), result.get(0));
		assertEquals(new HorizontalBlock(new CharPosition1(4, 1), new CharPosition1(4, 1)), result.get(1));
		assertEquals(new HorizontalBlock(new CharPosition1(5, 1), new CharPosition1(5, 1)), result.get(2));
	}
	
	@Test
	void testExtractSequentialSubblocks4() {
		HorizontalBlock block = new HorizontalBlock(new CharPosition1(1, 1), new CharPosition1(5, 1));
		block.add(new CharPosition1(3, 1));
		block.add(new CharPosition1(4, 1));
		block.add(new CharPosition1(5, 1));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(3, result.size());
		assertEquals(new HorizontalBlock(new CharPosition1(1, 1), new CharPosition1(2, 1)), result.get(0));
		assertEquals(new HorizontalBlock(new CharPosition1(4, 1), new CharPosition1(5, 1)), result.get(1));
		assertEquals(new HorizontalBlock(new CharPosition1(5, 1), new CharPosition1(5, 1)), result.get(2));
	}