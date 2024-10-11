// JobTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Job}.
* It contains one unit test case for the {@link Job#getTypeDesc()} method.
*/
class JobTest {
		
    // Test constructor.
    public JobTest() {
    }

    /**
     * Test constructor, with string values for the ID and name properties.
     *
     * @param id ID
     * @param name Name
     */
    public JobTest(java.lang.String id, java.lang.String name) {
                this.id = id;
                this.name = name;
    }



}