package framework.base;

import junit.framework.TestSuite;


// JUnitDoclet begin import
// JUnitDoclet end import

/**
* Generated by JUnitDoclet, a tool provided by
* ObjectFab GmbH under LGPL.
* Please see www.junitdoclet.org, www.gnu.org
* and www.objectfab.de for informations about
* the tool, the licence and the authors.
*/


public class BaseSuite
// JUnitDoclet begin extends_implements
// JUnitDoclet end extends_implements
{
  // JUnitDoclet begin class
  // JUnitDoclet end class
  
  public static TestSuite suite() {
    
    TestSuite suite;
    
    suite = new TestSuite("framework.base");
    
    suite.addTestSuite(framework.base.ValueListHandlerTest.class);
    suite.addTestSuite(framework.base.BaseRequestProcessorTest.class);
    suite.addTestSuite(framework.base.BaseActionServletTest.class);
    suite.addTestSuite(framework.base.BaseActionMappingTest.class);
    
    
    
    // JUnitDoclet begin method suite
    // JUnitDoclet end method suite
    
    return suite;
  }
  
  public static void main(String[] args) {
    // JUnitDoclet begin method testsuite.main
    junit.textui.TestRunner.run(suite());
    // JUnitDoclet end method testsuite.main
  }
}
