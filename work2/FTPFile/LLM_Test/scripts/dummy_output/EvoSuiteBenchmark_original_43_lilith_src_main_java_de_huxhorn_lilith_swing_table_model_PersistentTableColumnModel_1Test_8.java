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
		protected int rowCount;
		protected int columnCount;
		
		private int minR = 0;
		private int testValue;
		private boolean[] selected;
		private List<TableColumnModel> columnModels;
	
//		public PersistentTableColumnModel_1Test() {
//            this(true);
//        }
	
		public PersistentTableColumnModel_1Test(boolean onlyVisible) {
            this.minR = Integer.MAX_VALUE;
            this.columnModels = new ArrayList<TableColumnModel>();
            this.selected = new boolean[(4+1)*(4+1)*(4+1)];
        }

        public PersistentTableColumnModel_1Test(int minR, int testValue, boolean[] selected) {
            this.minR = minR;
            this.columnModels = new ArrayList<TableColumnModel>();
            this.selected = selected;
            this.testValue = testValue;
        }

		/**
		 * Create only visible columns and return
		 *
		 * @return a new columnModel for a given visibility
		 */
		public PersistentTableColumnModel createVisibilityOnlyColumnModel() {
            return new PersistentTableColumnModel(false);
		}
		
		public void createColumn(TableColumn tblcol)
		{
			tblcol.setMaximumSize(10, 10);
			createColModel(tblcol);
			this.minR = Math.min(this.minR, tblcol.getModelIndex());
		}
	
//		/**
//		 * return a list of columns
//		 */
//		@SuppressWarnings("unchecked")
//		public List<TableColumn<String,String>> getColumns()
//		{
//            List<TableColumn<String,String>> columns = new ArrayList<TableColumn<String, String>>();
//            for( TableColumnModel tcm : this.columnModels )
//            {
//                TableColumn<String,String> tblcol = new TableColumn<>("col"+(tcm.getModelIndex()/4));
//                tblcol.setModel(tcm);
//                TableColumnModel tcm2 = tcol.getModel();
//                tcm2.addTableColumn(tblcol);
//                tblcol2 = new TableColumn<>("col"+(tcm2.getModelIndex()/4));
//                tblcol2.setModel(tcm2);
//                columns.add(tcol2);
//            }
//            TableColumnModel tcm2 = new TableColumnModel();
//            tcm2.addColumn(0);
//            tcm2.addColumn(1);
//            tcm2.addColumn(2);
//            tcm2.addColumn(3);
//            tcm2.addColumn(4);
//            return columns;
//			}
//			
//		public int getColIndex(TableColumn tblcol)
//		{
//		    return tblcol.getModelIndex();
//		}
		
		/**
		 * create only visible columns and return a list of columns
		 */
		public List<TableColumn<String,String>> createColModel(TableColumn tblcol)
		{
			int cidx = tblcol.getModelIndex()/4; 
			String colName = String.valueOf(cidx);
			TableColumnModel tcm = this.columnModels.get(cidx);
            setColumnName(tblcol, colName);
            boolean isSelected = tblcol.isSelected();			
            tblcol.setSelected(isSelected);
            this.selected[cidx] = isSelected;
            tblcol.setModel(tcm);
            return new ArrayList<TableColumn<String,String>>(2);  /* new empty list */
//				return new ArrayList<>();
		}
		
		/**
		 * set an attribute of model to given value
		 */
		public void setAttribute(TableColumn tblcol, Serializable s)
		{
//			if( tblcol instanceof TextField )
//			{
//			    TextField text = (TextField)tblcol;
//			    text.setSwingProperty(s, this.getAttributes(text, tblcol));
//			}
//			else if( tblcol instanceof JScrollPane )
//			{
//			    JScrollPane sp = (JScrollPane)tblcol;
//			    sp.putClientProperty(s);
//			}	
//			else if( tblcol instanceof AbstractTableModel )
//			{
//			    AbstractTableModel<String,String> tmodel = (AbstractTableModel<String,String>)tblcol;
//			    tmodel.addAttribute(s);
//			}
//			else if( tblcol instanceof TableModel )
//			{
//				TableModel<String,String> tmodel = (TableModel<String,String>)tblcol;
//				tmodel.addAttribute(s);
//			}
			for(Iterator<TableColumnModel> it = columnModels.iterator(); it.hasNext();)
			{
            	TableColumnModel tcm = it.next();
            	tcm.setAttribute(s, this);
			}
		}

//		public void addColumns(TableColumnModel tcm) {
//			tcm.addColumn(createVisibilityOnlyColumnModel());
//		}
//		
//		public void setColumnName(TableColumn tblcol, String name) {	
//		    setColumnName(tblcol, String.class, name);
//		}
//		
//		public void setColumnName(TableColumn tblcol, Class<?> cls) {
//		    setColumnName(tblcol, cls, "col"+(tblcol.getModelIndex()));
//		}
//		
//		public void setColumnName(TableColumn tblcol, Class<?> cls, String name) {
//		    if( tblcol instanceof TextField )
//		    {
//			    TextField text = (TextField)tblcol;
//			    text.setName(name);
//		    }
//		    else if( tblcol instanceof JScrollPane )
//		    {
//			    JScrollPane sp = (JScrollPane)tblcol;
//			    sp.setName(name);
//		    }
//		    tblcol.setName(name);
//		}
//		
		@SuppressWarnings("unchecked")
		public List<TableColumnModel> getColumnModels(TableColumn tblcol) {
			if(tblcol.getModelIndex() == minR)
			{
				return this.columnModels;
                }			
}
}