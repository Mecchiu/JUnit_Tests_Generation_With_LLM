// HorizontalBlock_1Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HorizontalBlock}.
* It contains one unit test case for the {@link HorizontalBlock#extractParallelSubblocks()} method.
*/
class HorizontalBlock_1Test {

	private final LineParallelBlock parallelBlock = new LineParallelBlock(1, 1);
		
    /** test constructor method of HorizontalBlock_1() */
    @Test
    public void testConstructor() {
        LineParallelBlock testBlock = new LineParallelBlock();
        assertFalse(testBlock.isTrivial());
        assertTrue(testBlock.extractParallelSubblocks().isEmpty());
    }
    
    /** test method of Block with a minimum number of lines */
    @Test
    public void testMinNumberSubblocks() {
        // the number of parallel subblocks is smaller than the current one
        assertTrue(parallelBlock.extractParallelSubblocks().size() > parallelBlock.getNumOfLines());
        LineParallelBlock testBlock = new LineParallelBlock(10);
        assertTrue(testBlock.extractParallelSubblocks().size() > parallelBlock.getNumOfLines());
    }
    
    /** the number of parallel subblocks is 0 but its a valid block and it's non-empty */
    @Test
    public void testNumberOfParallelSubblocks() {
        assertTrue((new NumberOfParallelSubblocks()).getNumOfParallelSubblocks() == 0);
        assertTrue(parallelBlock.extractParallelSubblocks().isEmpty());
    }
					
    /* ********************************************************************************* */
    /* 					   THE PARALLEL SUBLOCKS WITH THE LINE PARALLEL BLOCKS				      */
    /* ********************************************************************************* */
    /** find the position of the position of a parallel line */
    public List<Position> getIntersectingHLines() {
        List<Position> hLines = new ArrayList<Position>(20);
        LineParallelBlock hBlock = new LineParallelBlock();
        for (Position p : parallelBlock) {
            hBlock.add(p);
            // find the horizontal lines
            if (lineIsIncluded(hBlock, p, 1))
                hLines.add(p);
        }
        return hLines;						
    }
    
    /**
     * returns true if the line at the position of the given position exists
     * in the parallel sub block with a minimum width of 1 or less and 
     * false if any of the horizontal lines does not end in line with an
     * equal width
     */
    boolean lineIsIncluded(LineParallelBlock hBlock, Position position, int width) {
		
        Block fromLine = hBlock.getLine(position.getLineNumber());
        Block toLine = hBlock.getLine(position.getLineNumber()+1);
		
        assertTrue(fromLine!= null);
        assertTrue(fromLine instanceof Block);
        
        if ((fromLine instanceof Block) && (toLine instanceof Block))
        {
		    // if the first line of the block is a block of the same size,
		    // we need to exclude some lines
			if (!(fromLine instanceof Block) && 
			    (fromLine.getMinWidth() < fromLine.getWidth()) &&
			    (toLine.getMinWidth() < toLine.getWidth()))
				return true;
		}
		
        width -= position.getWidth(); // because toLine may be null, it may be changed
        // if current width is equal to or greater than height of the current line:
        final Position fromLineToLineEndPosition = fromLine.getEndofLine(true).getPosition();
        final Position toLineToLineEndPosition = toLine.getEndofLine(true).getPosition();
        final boolean heightEqualsWidth = (fromLineToLineEndPosition == null)?
            (toLineToLineEndPosition == null) :
            (fromLineToLineEndPosition.getHeight() == toLineToLineEndPosition.getHeight())
        ;
        
        if (heightEqualsWidth || lineIsSuspended(position))
            return false; // just for the test
        
        return true; // the end of the line of the current line
    }
	
    /** @since 2.6 */
    private boolean lineIsSuspended(Position position) {
        return ((position.getRow()+position.getCol())%2!= 0)? (true) : (false);
    }
    
}
