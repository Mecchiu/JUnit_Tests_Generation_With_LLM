// _GetEngineTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngine}.
* It contains one unit test case for the {@link _GetEngine#getTypeDesc()} method.
*/
class _GetEngineTest {

  /**
* @jti  
* testGetTypeDesc:8a
* test1:1
* test2:1
* test3:1
* test4:1
* test5:1
* test6:1
* test7:1
* test8:1
* test9:1
*
* @jtt
* testGetTypeDesc:3
* test1:0
*
* @test
*/  
  @Test
  public void testGetTypeDesc() {
    
    // _GetEngineTest.java
    
    _GetEngine obj = new _GetEngine();
    assertNull(obj.getTypeDesc());
    
  }
	}

