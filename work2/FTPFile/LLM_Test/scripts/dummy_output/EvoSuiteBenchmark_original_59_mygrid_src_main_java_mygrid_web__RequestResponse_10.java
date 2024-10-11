// _RequestResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains one unit test case for the {@link _RequestResponse#getTypeDesc()} method.
*/
class _RequestResponseTest {
		/**
        * Test method for {@link mygrid.web.Response#getTypeDesc()}.
        */
    @Test
    public void testGetTypeDesc() {
        String var1 = Response.getTypeDesc();
    }

        /**
        * Test method for {@link mygrid.web.Response#getString()}.
        */
    @Test
    public void testGetString() {
        String var1 = Response.getString();
    }

        /**
        * Test method for {@link mygrid.web.Response#getClass()}.
        */
    @Test
    public void testGetClass() {
        String var1 = Response.getClass();
    }

        /**
        * Test method for {@link mygrid.web.Response#getInt()}.
        */
    @Test
    public void testGetInt() {
        int var1 = Response.getInt();
    }

        /**
        * Test method for {@link mygrid.web.Response#getFloat()}.
        */
    @Test
    public void testGetFloat() {
        float var1 = Response.getFloat();
    }

        /**
        * Test method for {@link mygrid.web.Response#getByte()}.
        */
    @Test
    public void testGetByte() {
        byte var1 = Response.getByte();
    }

        /**
        * Test method for {@link mygrid.web.Response#getShort()}.
        */
    @Test
    public void testGetShort() {
        short var1 = Response.getShort();
    }

        /**
        * Test method for {@link mygrid.web.Response#getLong()}.
        */
    @Test
    public void testGetLong() {
        long var1 = Response.getLong();
    }

        /**
        * Test method for {@link mygrid.web.Response#getDouble()}.
        */
    @Test
    public void testGetDouble() {
        double var1 = Response.getDouble();
    }
}