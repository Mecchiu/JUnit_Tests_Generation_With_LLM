// PersistentTableColumnModel_1Test.java
package de.huxhorn.lilith.swing.table.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PersistentTableColumnModel}.
* It contains one unit test case for the {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
*/
class PersistentTableColumnModel_1Test {
		
    /**
     * This test case tests the first and last column getColumnCounts.
     */
    @Test
    public void testFirstColumn(){
        final PersistentTableColumnModel pcm = new PersistentTableColumnModel();
        final int numCols = 8;

        // first column
        {
            pcm.addColumn(NumberTableColumnModel.class);
            String[] nums = new String[numCols];
            nums[0] = "123"; // the first value
            pcm.addColumn(nums);

            String[] origNums = new String[] { "1", "2", "3", "4", "5", "6", "7", "8" };
            List<String> listNums = new ArrayList<>(origNums);
            Collections.sort(listNums);
            assertEquals(listNums.get(0), origNums[0]);
            assertEquals(listNums.get(1), origNums[1]);
            assertEquals(listNums.get(2), origNums[2]);
            assertEquals(listNums.get(3), origNums[3]);
            assertEquals(listNums.get(4), origNums[4]);
            assertEquals(listNums.get(5), origNums[5]);
            assertEquals(listNums.get(6), origNums[6]);
            assertEquals(listNums.get(7), origNums[7]);
            assertEquals(listNums.get(8), origNums[8]);
        }

        // last column
        String[] dummyOrigFinals = new String[numCols - 1];
        dummyOrigFinals[0] = "123"; // the last value
        pcm.addColumn(dummyOrigFinals);

        String[] origFinals = new String[] { "1", "2", "3", "4", "5", "6", "7", "8" };
        List<String> listFinals = new ArrayList<>(origFinals);
        Collections.sort(listFinals);
        assertEquals(listFinals.get(0), origFinals[0]);
        assertEquals(listFinals.get(1), origFinals[1]);
        assertEquals(listFinals.get(2), origFinals[2]);
        assertEquals(listFinals.get(3), origFinals[3]);
        assertEquals(listFinals.get(4), origFinals[4]);
        assertEquals(listFinals.get(5), origFinals[5]);
        assertEquals(listFinals.get(6), origFinals[6]);
        assertEquals(listFinals.get(7), origFinals[7]);
        assertEquals(listFinals.get(8), origFinals[8]);
    }


    /**
     * This test case tests the last column getColumnCounts.
     */
    @Test
    public void testLastColumn(){
        final PersistentTableColumnModel pcm = new PersistentTableColumnModel();
        final int numCols = 8;

        // total column count
        {
            pcm.addColumn(NumberTableColumnModel.class);
            String[] nums = new String[numCols];
            nums[0] = "123"; // the last value
            pcm.addColumn(nums);

            String[] origNums = new String[] { "1", "2", "3", "4", "5", "6", "7", "8" };
            List<String> listNums = new ArrayList<>(origNums);
            Collections.sort(listNums);
            assertEquals(listNums.get(0), origNums[6]);
            assertEquals(listNums.get(1), origNums[7]);
            assertEquals(listNums.get(4), origNums[8]);
        }

        // first column
        String[] dummyOrigFinals = new String[numCols - 1];
        dummyOrigFinals[0] = "123"; // the first value
        pcm.addColumn(dummyOrigFinals);

        String[] origFinals = new String[] { "1", "2", "3", "4", "5", "6", "7", "8" };
        List<String> listFinals = new ArrayList<>(origFinals);
        Collections.sort(listFinals);
        assertEquals(listFinals.get(0), origFinals[4]);
        assertEquals(listFinals.get(1), origFinals[5]);
        assertEquals(listFinals.get(4), origFinals[8]);
    }


    // Helper functions
    private int getIntForColumn(TableColumn tableColumn){
        Iterator<TableColumn> cIterator = tableColumn.getColumnIterator();
        int value = 0;
        while(cIterator.hasNext()){
            value = cIterator.next().getValue();
        }
        return value;
    }

    private List<Integer> getListForColumn(int columnNum, int numNums){
        List<Integer> allTables = new ArrayList<>();
        if(numNums > 0)
            allTables.add(tableNumForColumn(columnNum));
        for(int rowNum = 0; rowNum < numNums; rowNum++){
            allTables.add(tableNumForColumn(columnNum + 1));
        }
        return allTables;
    }

    private int tableNumForColumn(int columnNum){
        List<Integer> temp = new ArrayList<>();
        for(TableColumn tableColumn : this){
            temp.add(getIntForColumn(tableColumn));
        }
        int value = temp.get(columnNum);
        return value;
    }

    private static final class NumberTableColumnModel implements TableColumnModel, Serializable {
        /**
         * This is a serial version UID.
         */
        private static final long serialVersionUID = 1L;

        private int numberOfColumns;
        Iterator<TableColumn> getColumnIterator() {
            return this; // iterator is not supported
        }

        public TableColumn getColumn(int columnIndex) {
            throw new UnsupportedOperationException("This method should not be called");
        }
        public int getColumnCount() {
            return numberOfColumns;
        }

        public void addColumn(TableColumn tableColumn) {
            throw new UnsupportedOperationException("This method should not be called");
        }
        public TableColumn getColumnByIndex(int columnIndex) {
            throw new UnsupportedOperationException("This method should not be called");
        }
        public int getColumnIndex(TableColumn tableColumn) {
            throw new UnsupportedOperationException("This method should not be called");
        }

    }

    // Helper classes for tests

}