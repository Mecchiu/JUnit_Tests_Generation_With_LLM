// Source code for HorizontalBlock.java

package glengineer.blocks;

import glengineer.positions.CharPosition;
import glengineer.positions.HWordPosition;
import glengineer.positions.Scheme;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * An implementation of the abstract class {@code Block}
 * used for horizontal layouting.
 */
public class HorizontalBlock extends Block {

    public HorizontalBlock(Scheme scheme, int x1, int y1, int x2, int y2) {
        super(scheme, x1, y1, x2, y2);
    }

    public HorizontalBlock(Scheme scheme, CharPosition p1, CharPosition p2) {
        super(scheme, p1, p2);
    }

    public HorizontalBlock(Scheme scheme) {
        super(scheme);
    }

    public HorizontalBlock(Block b) {
        super(b);
    }

    public HorizontalBlock(Block block, int x1, int y1, int x2, int y2) {
        super(block, x1, y1, x2, y2);
    }

    @Override
    public Block subblock(int x1, int y1, int x2, int y2) {
        return new HorizontalBlock(this, x1, y1, x2, y2);
    }

    @Override
    public HorizontalBlock cloneWith(CharPosition p1) {
        return new HorizontalBlock(getScheme(), p1, getCharPosition2());
    }

    /**
     * Divides the current block into a set of sequential subblocks,
     * optimizes these subblocks and returns them as a linked list.
     *
     * @return a list of optimized sequential subblocks.
     */
    @Override
    public List<Block> extractSequentialSubblocks() {
        List<Block> subblocks = new ArrayList<>();
        Block currentBlock = this;
        while (currentBlock.getWidth() > 0) {
            Block subblock = ((HorizontalBlock) currentBlock).extractFirstSequentialSubblock();
            subblocks.add(subblock);
            currentBlock = currentBlock.subblock(subblock.getCharPosition2().getX() + 1, currentBlock.getCharPosition1().getY(),
                    currentBlock.getCharPosition2().getX(), currentBlock.getCharPosition2().getY());
        }
        return optimizeSequentialSubblocks(subblocks);
    }

    /**
     * Extracts the left subblock of this block.
     * <p>
     * The required block is chosen so that its last exclusive vertical line
     * does not contain elements of components, gaps , or horizontal lines
     * starting on the left from the line.
     * <p>
     * The algorithm just finds the most left entity
     * (an element of a component, gap, or horizontal line)
     * using simple search along the scheme,
     * identifies the horizontal element containing the entity found,
     * checks whether the last exclusive vertical line of the element
     * matches the requirement for the boundary of the required block,
     * and, if does not, takes the detaining horizontal element
     * and continues the cycle.
     */
    private Block extractFirstSequentialSubblock() {
        CharPosition firstEntity = firstEntity();
        HWordPosition currentWord = getScheme().getHWordAt(firstEntity);
        HWordPosition lastWord = findAWordExtendingSubblockToTheRightFrom(currentWord);
        int x2 = lastWord == null ? getCharPosition2().getX() : lastWord.getX2();
        return subblock(getCharPosition1().getX(), getCharPosition1().getY(), x2, getCharPosition2().getY());
    }

    /**
     * Searches down and to the right from the beginning of this block
     * for the first occurrence of an entity.
     *
     * @return the position of the entity found.
     * @throws IllegalArgumentException if this block
     *                                  does not contain entities.
     */
    private CharPosition firstEntity() {
        for (int y = getCharPosition1().getY(); y <= getCharPosition2().getY(); y++) {
            for (int x = getCharPosition1().getX(); x <= getCharPosition2().getX(); x++) {
                if (entityAt(x, y)) {
                    return new CharPosition(x, y);
                }
            }
        }
        throw new IllegalArgumentException("Block does not contain entities");
    }

    /**
     * Finds the first entity below the specified position.
     *
     * @return the y-coordinate of the entity found or y2 if not found.
     */
    private int firstEntityBelow(int x, int y) {
        for (int i = y + 1; i <= getCharPosition2().getY(); i++) {
            if (entityAt(x, i)) {
                return i;
            }
        }
        return getCharPosition2().getY() + 1;
    }

    /**
     * Verifies whether the character under the cell
     * determined by the specified coordinates
     * is a word character or a horizontal line character.
     */
    private boolean entityAt(int x, int y) {
        return getScheme().isWordChar(x, y) || getScheme().isHorizontalLine(x, y);
    }

    /**
     * Returns a word which starts not righter than the right end of the
     * {@code currentWord} but ends strictly righter
     * (or null if does not exist).
     */
    private HWordPosition findAWordExtendingSubblockToTheRightFrom(HWordPosition currentWord) {
        HWordPosition lastWord = currentWord;
        while (lastWord != null) {
            HWordPosition nextWord = getScheme().getHWordAt(lastWord.getX2() + 1, lastWord.getY());
            if (nextWord == null || nextWord.getY() != lastWord.getY()) {
                break;
            }
            lastWord = nextWord;
        }
        return lastWord;
    }

    /**
     * Divides the current block into a set of parallel subblocks,
     * optimizes these subblocks and returns them as a linked list.
     * <p>
     * If the block has horizontal lines,
     * this method divides the block by the maximal horizontal lines only.
     * <p>
     * If there are no horizontal lines, the block is divided into
     * usual parallel subblocks.
     */
    @Override
    public List<Block> extractParallelSubblocks() {
        Set<HWordPosition> hLines = getIntersectingHLines();
        if (hLines.isEmpty()) {
            return extractParallelSubblocksWithoutLines();
        } else {
            removeSmallHLinesFrom(hLines);
            List<Integer> ySeparators = sortedYsOf(hLines);
            return extractParallelSubblocksSeparatedBy(ySeparators);
        }
    }

    /**
     * Returns the set of all horizontal lines intersecting this block.
     */
    private Set<HWordPosition> getIntersectingHLines() {
        Set<HWordPosition> hLines = new HashSet<>();
        for (int y = getCharPosition1().getY(); y <= getCharPosition2().getY(); y++) {
            HWordPosition hLine = getScheme().getHLineAt(getCharPosition1().getX(), y);
            if (hLine != null && hLine.intersects(this)) {
                hLines.add(hLine);
            }
        }
        return hLines;
    }

    /**
     * Divides the current block into a set of parallel subblocks
     * by its most long horizontal lines,
     * optimizes these subblocks, and returns them as a linked list.
     */
    protected List<Block> extractParallelSubblocksSeparatedByLines(Set<HWordPosition> hLines) {
        List<Block> subblocks = new ArrayList<>();
        int lastY = getCharPosition1().getY();
        for (HWordPosition hLine : hLines) {
            subblocks.add(subblock(getCharPosition1().getX(), lastY, getCharPosition2().getX(), hLine.getY() - 1));
            lastY = hLine.getY() + 1;
        }
        subblocks.add(subblock(getCharPosition1().getX(), lastY, getCharPosition2().getX(), getCharPosition2().getY()));
        return optimizeParallelSubblocks(subblocks);
    }

    /**
     * Finds the longest lines in the specified set of horizontal lines
     * and then removes from it all other elements.
     * <p>
     * Note that, more formally, this method considers the lengths
     * of <i>intersections</i> of the lines with this block.
     */
    private void removeSmallHLinesFrom(Set<HWordPosition> hLines) {
        int maxLength = 0;
        for (HWordPosition hLine : hLines) {
            int length = hLine.intersectionLength(this);
            if (length > maxLength) {
                maxLength = length;
            }
        }
        hLines.removeIf(hLine -> hLine.intersectionLength(this) < maxLength);
    }

    /**
     * Returns a list of the specified horizontal lines' vertical coordinates.
     */
    private List<Integer> sortedYsOf(Set<HWordPosition> hLines) {
        List<Integer> ys = new ArrayList<>();
        for (HWordPosition hLine : hLines) {
            ys.add(hLine.getY());
        }
        ys.sort(Integer::compareTo);
        return ys;
    }

    private List<Block> extractParallelSubblocksSeparatedBy(List<Integer> ySeparators) {
        List<Block> subblocks = new ArrayList<>();
        int