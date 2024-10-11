// Element_1Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#numberOfAttributes()} method.
*/
class Element_1Test {

	// Element_1Test.java
	/**
     * Test constructor with invalid argument.
     */
    @Test(expected = org.xml.sax.SAXException.class)
    public void Element_1Test_1() throws org.xml.sax.SAXException {
        Element elementWithoutAttributes = new Element();
        elementWithoutAttributes.numberOfAttributes();
    }
		
	// Element_1Test.java
	/**
     * Test element attribute add/remove.
     */
    @Test
    public void Element_1Test_2() throws org.xml.sax.SAXException, java.io.IOException {
        // 1. test add attribute
        Vector attributeVector = new Vector();
        attributeVector.add(1, "foo");
        assertFalse(elementWithoutAttributes.equals(new Element_1Test_1()));

        // 2. test remove
        assertFalse(elementWithoutAttributes.equals(new Element_1Test_1()));
        attributeVector.remove(1);
        assertTrue(elementWithoutAttributes.equals(new Element_1Test_1()));
        
        // 3. test add/remove
        assertTrue(elementWithoutAttributes.equals(new Element_1Test_1()));
    }
		
	// Element_1Test.java
	/**
     * Test getNamedAttribute with invalid argument.
     */
    @Test(expected = org.xml.sax.SAXException.class)
    public void Element_1Test_3() throws org.xml.sax.SAXException, java.io.IOException {
        Element elementWithInvalid_Name = new Element_1Test_1();
        elementWithInvalid_Name.getNamedAttribute("foo");
    }
}

// Element_1Test_1.java
/*
 * Copyright (C) 2013
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
*/

 /* ----------------------------------------------------------------------------
 * $RCSfile$   $Revision$   $Date$
 * ----------------------------------------------------------------------------
 * Copyright (c) 2014 Michael Colburn, Delcyon, Inc
 *
 * Based on previous work under this license.
 * https://github.com/DycolaBeach/XTree-Project
 */
/* ----------------------------------------------------------------------------
 * This file is part of Metaphor.
 *
 * Metaphor is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Metaphor is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Metaphor.  If not, see <http://www.gnu.org/licenses/>.
 * -------------------------------------------------------------------------- */

public enum Element_1Test_Name {

	/* ================================== */
	/*  Attributes  */
	/* ================================== */  
    /** This attribute is the value of the element attribute. */
    NAM("") { @Override Element#getNamedAttribute("value")
            @Override void NAM_getNamedAttribute(final NAM_Args args) {
                NAM.value = args.result;
            }
    },

    /** This attribute is not defined. */
    NON("non-defined") { @Override Element#getNamedAttribute("value")
            @Override void NON_NON_DEF_getNamedAttribute(final NON_Args args) {
                NON.value = args.result;
            }
    },

    /** This attribute is defined but not valid. */
    ERROR_NOT_DEFINED("valid") { @Override Element#getNamedAttribute("value")
            @Override void ERROR_NOT_DEFINED("value") { }
    },

    /** This attribute is defined but invalid. */
    ERROR_DEFINED("invalid") { @Override Element#getNamedAttribute("value")
            @Override void ERROR_DEFINED("name"){ }
    },

		/* ================================== */
     /*  Elements  */
			/* ================================== */
    /** A new element. */
    NEW("root", "root") { @Override Element#getNamedAttribute("name")
            @Override void NEW_getNamedAttribute(final NEW_Args args) {  }
    },

    /* ================================== */
     /*  Children  */
			/* ================================== */
    /** A new element. */
    NEW_ROOT("root", "root") { @Override Element#getChildNodes()
            @Override Element getChildNodes() {
                return new Element[] { new NewChild() };
            }
    },

    /** A child of a child. */
    NEW_CHILD("child", "child") { @Override Element#getChildNodes()
            @Override Element getChildNodes() {
                return new Element[] {
                        new NewChild_Child(),
                };
            }
    },
    
    /** A child of a child. */
    NEW_CHILD_CHILD("child", "child") { @Override Element#getChildNodes()
            @Override Element getChildNodes() {
                return new Element[] {
                        new NewChild_Child_Child(),
                };
            }
    }
}

/**
 * Defines a special attribute that is not set
 * to the attribute namespace so that
 * it should be added to the children
 * of the XML element that represents
 * the new attribute.
 */
enum NewChild_Child {
	@Override public void NEW_getNamedAttribute(final NEW_Args args) {}
}
 /**
 * Defines a special attribute that is not set
 * to the attribute namespace so that
 * it should be added to the children
 * of the XML element that represents
 * the new element.
 */
enum NEW_Args {
    @Override
    public void NEW_getNamedAttribute(final NEW_Args args_) {
        args.result = "";
    }
}
/**
 * This class will be used to represent a single child of
 * a tree (either a new or root of a new child.
 */
 class NewChild {
    
     private static final String NEW = "{\"name\":\"New\"}";
     private String name;

     /**
      * Sole constructor.
      */
    public NewChild() {
        super();
        name = new String