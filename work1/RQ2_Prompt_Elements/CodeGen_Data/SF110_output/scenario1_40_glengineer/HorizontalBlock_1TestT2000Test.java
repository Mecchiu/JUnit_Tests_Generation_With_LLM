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

    /**
     * Create a unit test for the {@link HorizontalBlock#extractParallelSubblocks()} method.
     */
    @Test
    void extractParallelSubblocksWithoutLines() {
        Block block = new Block() {
            
            @Override
            public List<Block> extractParallelSubblocks() {
                this.optimize();
                if (this.getPositions().size() > 0) {
                    this.getPositions().get(0).remove();
                    return new LinkedList<Block>();
                } else {
                    List<Block> ret = new LinkedList<Block>();
                    ret.add(this);
                    if (this.getPositions().size() > 0) {
                        ret.set(1, this);
                    }
                    return ret;
                }
            }
        };
        assertSame(block, block.extractParallelSubblocks());
    }
    
    /**
     * Create a unit test for the {@link HorizontalBlock#extractParallelSubblocks()} method.
     */
    @Test
    void extractParallelSubblocksWithLines() {
        Block block = new Block() {
            
            @Override
            public List<Block> extractParallelSubblocks() {
                this.optimize();
                List<Block> ret = new LinkedList<Block>();
                Block b1 = new Block() {
                    
                    @Override
                    public List<Block> extractParallelSubblocks() {
                        this.optimize();
                        return this;
                    }
                };
                b1.setPos(1);
                b1.setParallelPosition(Line.top1);
                b1.setParallelSiblings(Line.top1);
                b1.setPositions(new LinkedList<Double>());
                b1.setParallelSiblingsPosition(Line.top1);
                b1.setParallelSiblingsLines(Line.top1);
                b1.setParallelPosition(Line.top1);
                b1.setSiblings(Line.top100);
                b1.setPositions(new LinkedList<Double>());
                b1.setSiblingsPosition(Line.top100);
                b1.setSiblingsLines(Line.top100);
                b1.setPositions(new LinkedList<List<Double>>());
                b1.setSiblingsPosition(Line.top100);
                b1.setSiblingsLines(Line.top100);
                
                ret.add(b1);
                
                this.getPositions().add(1);
                ret.add(this);
                
                if (this.getPositions().size() > 0) {
                    Block b2 = new Block() {
                        
                        @Override
                        public List<Block> extractParallelSubblocks() {
                            this.getPositions().set(this.getPositions().size()-1, b1);
                            this.optimize();
                            list<Block> ret = this;
                            return ret;
                        }
                    };
                    ret.add(b.extractParallelSubblocks());
                    if (this.getPositions().size() > 0) {
                        ret.set(this.getPositions().size() - 2,b2);
                    }
                    return ret;
                } else {
                    Block b3 = new Block() {
                    
                        @Override
                        public List<Block> extractParallelSubblocks() {
                            this.optimize();
                            return Collections.singletonList(this);
                        }
                    };
                    b3.setPositions(new LinkedList<Double>());
                    return Arrays.asList(b3);
                }
            }
        };
        assertSame(b, block.extractParallelSubblocks());
    }
}