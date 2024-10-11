// EngineTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Engine}.
* It contains one unit test case for the {@link Engine#getTypeDesc()} method.
*/
class EngineTest {
/**
		 * Test method to test {@link Engine#getTypeDesc()}.
		*/
    @Test
    public void testGetTypeDesc() {
     if (getTypeDesc().equals(Foo.class)) {
      return;
     }
     fail();
   }
}

/**
 * A sample Java class for a Java instance of the java.lang.Object type.
 */
public class Foo extends mygrid.web.MarshalByRefObject {

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }
	
}

// EngineListTest.java
public class EngineListTest extends Engine {

    /**
     * Test method for {@link java.lang.Object#hashCode()}.
     */
    @Test
    public void testHashCode() {
      super.hashCode();
    }

    /**
     * Test method for {@link java.lang.Object#toString()}.
     */
    @Test
    public void testToString() {
      super.toString();
    }
}

/*
 *  Copyright (C) 2004  Nicolas de Ferreira <nicolades@users.sourceforge.net>
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/