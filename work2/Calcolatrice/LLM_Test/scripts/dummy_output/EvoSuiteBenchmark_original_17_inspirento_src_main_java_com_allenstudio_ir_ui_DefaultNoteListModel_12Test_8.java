// DefaultNoteListModel_12Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#toArray()} method.
*/
class DefaultNoteListModel_12Test {
		
    /**
     * Test of {@link DefaultNoteListModel#toArray()} method, of class com.allenstudio.ir.ui.NoteListModel.
     */
    @Test
    void test_toArray() {
        
    }
    
    /**
     * Test of {@link DefaultNoteListModel#add(int, AbstractNoteElement)}.
     */
    @Test
    void test_add() {
        int i = 0, j = 0;
        AbstractNote resulte = null;
        Collection c = null;

        for (i = 0; i < 5; i++ ){
            //System.out.println(i);
            resulte = new DefaultNote(i, "");
            //System.out.println( "i: " + i + "  resulte: "+resulte);

            c = new CopyOnWriteArrayList<AbstractNote>();
            try{
                c.add(resulte);
            }
            catch ( Exception e){
                e.printStackTrace();
            }

        }
        assertEquals(5, c.size());
        //System.out.println(c);
        
        for (i = 3; i >= 0; i--){
            //System.out.println(i);
            resulte = (AbstractNote)c.toArray()[i];
            //System.out.println("Resulte " + resulte.getId() + "  " + resulte.getName());
            // System.out.println(c);

            //assertTrue(c.contains(resulte));
            //assertNotNull(resulte);
            
            assertEquals(i, resulte.getId());
        }
        
        

    }
    
    /**
    * Test of the {@link DefaultNoteListModel#indexOf(AbstractNoteEntity)}.
    */
    @Test
    void test_indexOf() {
        
        int i = 0;
        AbstractNote resulte = null;
        Collection c = null;

        //System.out.println("testing " + getClass().getName() + " with data at index:" + i);
        for (i = 0; i < 5; i ++ ){
            //System.out.println(i);
            resulte = new DefaultNote(i, "");
            //System.out.println("i: " + i + " " + "resulte: "+resulte);

            c = new CopyOnWriteArrayList<AbstractNote>();
            c.add(resulte);

            int index = c.indexOf(resulte);
            //System.out.println("resulte id: "+resulte.getId()+" "+ index);

            if ( index >= -1 ){
                assertEquals(i, index);
            }

        }
    }
    
    /**
    * Test of {@link DefaultNoteListModel#forEach(NoteListModelVisitor)}.
    */
    @Test
    public void test_forEach() {
        int i = 0, j = 0;
        Collection<AbstractNote> resulte = null;

        //System.out.println("forEach(" + this + ")");

        for (i = 0; i <= 3; i ++) {
            //System.out.println(i);
            
            for (j = 0; j < 5; j ++) {
                resulte = new CopyOnWriteArrayList<AbstractNote>();
                AbstractNote ne = new DefaultNote(j, "");
                //System.out.println( "j: " + j + "  ne: " + ne);
                resulte.add(ne);
                //System.out.println( resulte);

                AbstractNote p = (AbstractNote)c.toArray()[i];
                //System.out.println(p);
                AbstractNote se = (AbstractNote)resulte.toArray()[0];
                //System.out.println(se);
                AbstractNote e = (AbstractNote)resulte.toArray()[1];
                //System.out.println(e);
                AbstractNote n = new DefaultNote(0, "");
                //System.out.println("p: " + p);

                //n.getName();  // To change body of implemented methods use File | Settings | File Templates.
                
                //ne.getName();
                
                
                //p.getName();
                
                
                resulte.add(p);

                
                assertTrue(r
                        //"element " + j + "<- id: " + (j) + "  resulte[i]: " + (i)
                        );

                
                AbstractNote a = (AbstractNote)resulte.toArray()[1];
                String s = a.getName();
                //System.out.println(s);

                
                StringBuffer sb = new StringBuffer(resulte.toString());

                sb.insert(i, s);
                //System.out.println(sb.toString());
            }
        }
        
    }
    
    /**
    * Test of {@link DefaultNoteListModel#size()}.
    */
    @Test
    public void test_size() {
        
        int size = 20;
        int expected = 30;
        Collection<AbstractNote> resulte = null;

        
        int actual = 0;

        for (actual = 0; actual < size; actual ++) {
            //System.out.println(actual + " : "+c);

            resulte = new CopyOnWriteArrayList<AbstractNote>(c);

            expected = 3 * actual + 3;
            //System.out.println(expected + " : " + resulte.size());
            
            assertEquals(expected, resulte.size());

            
        }

    }
}