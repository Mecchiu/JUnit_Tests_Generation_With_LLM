// JTextComponentDestinationTest.java
package ghm.follow.io;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JTextComponentDestination}.
* It contains one unit test case for the {@link JTextComponentDestination#autoPositionCaret()} method.
*/
class JTextComponentDestinationTest {
		
   @Test
	   public void autoPositionCaret() {
	      JTextComponentDestination destination = new JTextComponentDestination
	      (new JTextComponent(), true);
	      destination.autoPositionCaret();
	      assertFalse(destination.autoPositionCaret() == false);
	      assertTrue(destination.autoPositionCaret() == true);
	      
       }
    
    @Test
	   public void getJTextComponent() {
	      JTextComponentDestination destination = new JTextComponentDestination
	      (new JTextComponent(), true);
	      assertNotNull(destination.getJTextComponent());
           
	      try {
	         destination = new JTextComponentDestination
	         (new JTextComponent(), false);
	         assertNull(destination.getJTextComponent());
	      } catch (IllegalArgumentException e) {
	         fail("IllegalArgumentException shouldn't be thrown.");
	      }
	      
	      assertNotNull(destination.getFilter(), "Unexpected null filter.");
	      assertNotNull(destination.getFilter());
	      
	      try {
	         destination = new JTextComponentDestination
	         (new JTextComponent(), null);
	         assertNull(destination.getJTextComponent());
	      } catch (IllegalArgumentException e) {
	         fail("IllegalArgumentException shouldn't be thrown.");
	      }
	      
	      try {
	         destination = new JTextComponentDestination(new JTextComponent(), null);
	         assertNull(destination.getFilter());
	      } catch (IllegalArgumentException e) {
	         fail("IllegalArgumentException shouldn't be thrown.");
	      }
   	      
   	      // null argument is not allowed, but it will not throw.
   	      destination.append(null);
   	      fail("BadArgumentException should be thrown.");
	      
	    }
   	    
	   
//   @Test
   	   public void createOutput() {
		    // create filter
    	    JTextComponentDestination destination = new JTextComponentDestination
    	        (new JTextComponent(), true);
	       javax.swing.text.Filter filter = JTextComponentDestination
	       	.createOutput();
	       
	       assertNotNull(filter);
       
	       // create destination and append
	       JTextComponentDestination destination2 = new JTextComponentDestination
	       (new JTextComponent(), true);
	    destination2.append(destination.getFilter().createFilterText(new String[]{"this is a test"}));
       
	        assertNotNull(destination2.getJTextComponent());
       
	        assertEquals("this is a test",
	                    destination.getJTextComponent().getText());
//	        assertEquals("this is a test",
//	                destination.getJTextComponent().getText());
	       
	        assertTrue(destination2.setJTextComponent(destination.getJTextComponent()));
	       
	        assertTrue(destination.getJTextComponent() == destination2.getFilter().getText());
	    
//	       assertEquals("this is a test",
//	                    destination.getJTextComponent().getText());
//	       assertEquals("this is a test",
//	                destination.getJTextComponent().getText());
	       
	       assertTrue(destination.getJTextComponent() == destination.getFilter().getText());
	      
	      
	       assertFalse(destination.getFilter().matches(destination.getJTextComponent().getText()));
   	       
   	       try {
	        destination.getFilter().createFilterText(new String[]{"this is a test"});
	        fail("Duplicate filter text");
       
       		 } catch (final BadLocationException e) {
       		    // good
       		 }
       		 
	      
	      
	    }

//   @Test
   	   public void getFilter() {
	        JTextComponent dest2 = new JTextComponent() {
	                   @Override
	                   public Object getEditorValue() {
	                       return null;
	                   }
	           };
	        
	        JTextComponentDestination destination = new JTextComponentDestination
	             (new JTextComponent(), true);
	        destination.getFilter();
	         assertNull(destination.getFilter());
	        dest2.setText("Hello World");
	        dest2.selectAll();
	        assertEquals("Hello World", dest2.getDocument().get());
	    }
   }