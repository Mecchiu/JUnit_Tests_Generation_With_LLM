// ContextElementTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextElement}.
* It contains one unit test case for the {@link ContextElement#getTypeDesc()} method.
*/
class ContextElementTest {
/**
		* Simple constructor
		*/
	public ContextElementTest() { 
	} 

	/**
	* Test method for
	* {@link ContextElement#getTypeDesc()}
	*/
	@Test
    public void testGetTypeDesc() {
        {
            ContextElement obj = new ContextElement();
            assertEquals(typeDesc, obj.getTypeDesc().getType());
        }
        {
            String aName = "aName";
            ContextElement context = new ContextElement(context(aName));
            assertEquals(aName, context.getTypeDesc().getName());
        }
        {
            String contextType = "myId.s1.";
            ContextElement context = new ContextElement(contextType);
            assertEquals(contextType, context.getTypeDesc().getName());
        }
	}

    /** 
     * Constructor for unit test cases
     *
     * @param aName name of the object
     */
    private ContextElement(String aName) {
        this.aName = aName;
            
    }

    private String aName;

}