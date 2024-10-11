// ArrayOfDependencyTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains one unit test case for the {@link ArrayOfDependency#getTypeDesc()} method.
*/
class ArrayOfDependencyTest {

    /**
     * New array of deps.
     */
    ArrayOfDependency dep;
    

    @Test
    public void testGetTypeDesc() {
        assertEquals(typeDesc, dep.getTypeDesc());
    }

    public void setDep(ArrayOfDependency dep) {
        this.dep = dep;
    }

    public ArrayOfDependency getDep() {
        return dep;
    }
}

