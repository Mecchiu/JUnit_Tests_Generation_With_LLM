// ArrayOfContextElementTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfContextElement}.
* It contains one unit test case for the {@link ArrayOfContextElement#getTypeDesc()} method.
*/
class ArrayOfContextElementTest {
		
	byte b1 = 1;
	byte[] bc1 = new byte[4];
	Double a = 2.0;
	double[] arrayOfDouble = new  double[1];
	Float [] fArrayOfFloat = new Float[1];
	int [] anArrayOfInt = new  int[1];
	java.util.Date[] arrayOfDate = new  java.util.Date[1];
	java.util.Calendar[] arrayOfCalendar = new  java.util.Calendar[1];

	public ArrayOfContextElementTest() {
	}

    /**
     * Test for the getTypeDesc() method.
     */
    @Test
    public void testGetTypeDesc() {
        assertEquals(ArrayOfContextElement.class, ArrayOfContextElement.getTypeDesc().getClass());
    }

    /**
     * Test for the getContextElement() method.
     */
    @Test
    public void testGetContextElement() throws Exception {
        ArrayOfContextElement obj = new ArrayOfContextElement();
        assertNotNull(obj.getContextElement());
    }

    /**
     * Test for the getContextElement(int) method.
     */
    @Test
    public void testGetContextElementInt() throws Exception {
        ArrayOfContextElement obj = new ArrayOfContextElement();
        assertNotNull(obj.getContextElement(0));
    }

    /**
     * Test for the getContextElement(java.lang.Integer) method.
     */
    @Test
    public void testGetContextElementIntBoolean() throws Exception {
        ArrayOfContextElement obj = new ArrayOfContextElement();
        assertEquals(obj.getContextElement(1).getClass(), mygrid.web.ContextElement.java.lang.Integer.class);
    }

    /**
     * Test for the getContextElement(java.lang.Integer) method taking a long.
     */
    @Test
    public void testGetContextElementIntLong() throws Exception {
        ArrayOfContextElement obj = new ArrayOfContextElement();
        obj.setValue(new java.lang.Integer(1));
        assertEquals(obj.getContextElement(1).getClass(), mygrid.web.ContextElement.java.lang.Long.class);
    }

    /**
     * Test for the getContextElement(double) method.
     */
    @Test
    public void testGetContextElementDouble() throws Exception {
        ArrayOfContextElement obj = new ArrayOfContextElement();
        assertEquals(obj.getContextElement(1).getClass(), mygrid.web.ContextElement.javax.xml.bind.annotation.XmlElement.class);
    }

    /**
     * Test for the getContextElement(java.lang.Double) method.
     */
    @Test
    public void testGetContextElementDouble() throws Exception {
        ArrayOfContextElement obj = new ArrayOfContextElement();
        assertEquals(obj.getContextElement(1).getClass(), mygrid.web.ContextElement.java.lang.Double.class);
    }
    
    
    /**
     * Test for the getContextElement(float) method.
     */
    @Test
    public void testGetContextElementFloat() throws Exception {
        ArrayOfContextElement obj = new ArrayOfContextElement();
        obj.setValue(new java.lang.Float(1));
        assertEquals(obj.getContextElement(1).getClass(), mygrid.web.ContextElement.java.lang.Float.class);
    }

    /**
     * Test for the getContextElement() method taking a java.util.Date.
     */
    @Test
    public void testGetContextElementDate() throws Exception {
        ArrayOfContextElement obj = new ArrayOfContextElement();
        obj.setValue(new java.util.Date() );

        assertEquals(obj.getContextElement().getClass(), mygrid.web.ContextElement.java.util.Date.class);
    }
}