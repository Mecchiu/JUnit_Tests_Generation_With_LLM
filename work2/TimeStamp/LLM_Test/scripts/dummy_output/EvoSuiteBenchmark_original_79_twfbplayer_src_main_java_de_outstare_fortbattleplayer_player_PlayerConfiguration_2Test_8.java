// PlayerConfiguration_2Test.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerConfiguration}.
* It contains one unit test case for the {@link PlayerConfiguration#showShootline()} method.
*/
class PlayerConfiguration_2Test {
		
  /**
   * This unit test contains one test case for the {@link PlayerConfiguration#showShootline()} method.
   */
  public final TestCase testShootline_2 = new TestCase() {
      
    /**
     * @param testMethodToRun
     *            An operation to be executed just after a certain operation is passed.
     *            The test operation should return
     *            <code>true</code> in case of succes.
     */
    private boolean testShootline(int testMethod) {
      return Configuration.SHOOTLINE_ENABLED.get()
        && testMethod!= Configuration.SHOOTLINE_FAIL.get()
            && Configuration.SHOOTLINE_DELAY.get() == testMethod;
    }
    
    @Override
    protected void runTest() {
      
      assertEquals(Configuration.SHOOTLINE, Configuration.SHOOTLINE_ENABLED.get());
      assertEquals(Configuration.SHOOTLINE_DELAY, Configuration.SHOOTLINE_DELAY.get());
      
      assertTrue(testShootline(Configuration.SHOOTLINE_DELAY));
      
      System.out.println("The test "
                        +Configuration.SHOOTLINE_ENABLED.get()
                        +" is now "
                        +Configuration.SHOOTLINE_DELAY.get());
      
    }
  };

  /**
   * This unit test contains one test case for the {@link PlayerConfiguration#showShootline()} method.
   */
  @Test
  public void testShowShootline_2() {
    final TestCase testShootline = this.testShootline_2;
    
    assertTrue("The test of "
               +testShootline 
               +" should be "
               +Configuration.SHOOTLINE.get(),
               testShootline.testShootline());
    
    testShootline = new TestCase() {
      boolean testShootline_1;
      public boolean testShootline() {
        return testShootline_1;
      }
      @Override
      protected void runTest() {
        testShootline_1 = Configuration.SHOOTLINE.get();
      }
      @Override
      protected boolean testShootline_1() {
        return testShootline_1;
      }
    };
    
    final boolean testShootline_1 = Configuration.SHOOTLINE.get();
    assertTrue("The test of "
               +testShootline_1
               +" should be "
               +Configuration.SHOOTLINE_ENABLED.get(), 
               testShootline_1);
    
    check("testShowShootline_2 is not overridden");
  }
  
  private void check(String name) {
    final Set<Object> objects = new HashSet<>();
    final Lock readLocker = new ReentrantLock();
    readLocker.lock();
    try {
      objects.addAll(Configuration.SHOOTLINE_TIMESTAMP.get());
    } finally {
      readLocker.unlock();  
    }
    
    final Set<Object> objects_1 = new HashSet<>(objects);
    final Lock readLocker_1 = new ReentrantLock();
    readLocker_1.lock();
    try {
      objects_1.addAll(Configuration.SHOOTLINE_TRIES.get());
    } finally {
      readLocker_1.unlock();  
    }
    
    final Set<Object> objects_2 = new HashSet<>(objects);
    final Lock readLocker_2 = new ReentrantLock();
    readLocker_2.lock();
    try {
      for (Object o : objects_1) {
        System.out.println(o);
      }
    } finally {
      readLocker_2.unlock();  
    }
    assertEquals(name+" have not the "
                 +Configuration.SHOOTLINE_TIMESTAMP.get()
                 +" and the "
                 +Configuration.SHOOTLINE_TRIES.get()
                 +" objects, the "
                 +Configuration.SHOOTLINE_DELAY.get()
                 +" should be "
                 +Configuration.SHOOTLINE_ENABLED.get(),
                 Configuration.SHOOTLINE.get());
    assertEquals(name+" have not a null "
                 +Configuration.SHOOTLINE_TIMESTAMP.get()
                 +" and a null "
                 +Configuration.SHOOTLINE_TRIES.get()
                 +" for the "
                 +Configuration.SHOOTLINE_DELAY.get()
                 +" tests. The "
                 +Configuration.SHOOTLINE.get()
                 +" configuration does not contain any "
                 +Configuration.SHOOTLINE_ENABLED.get()
                 +" variables.",
                 Configuration.SHOOTLINE_ENABLED.get());
    assertEquals(name
                 +" have not null "
                 +Configuration.SHOOTLINE_TIMESTAMP.get()
                 +" and a null "
                 +Configuration.SHOOTLINE_TRIES.get()
                 +" for a certain operation, the "
                 +Configuration.SHOOTLINE.get()
                 +" configuration contains "
                 +Configuration.SHOOTLINE_TIMESTAMP.get());
    
    readLocker.lock();
    try {
      objects_1.addAll(Configuration.SHOOTLINE_FAIL.get());
    } finally {
      readLocker.unlock();  
    }
    check("new " +name+" has not been assigned to the "
           +Configuration.SHOOTLINE_FAIL.get()
           +" object");
    assertTrue("The test has not been overridden in the "
               +name+" config",
               Configuration.SHOOTLINE_FAIL.get());
    
    check("the value of object"
           +Configuration.SHOOTLINE_ENABLED.get()
           +" has been overwritten by the value of a different object");
    objects.addAll(Configuration.SHOOTLINE_TIMESTAMP.get());
    check("new " +name+" has already initialized");
    assertNotEquals("the value of "
                    +Configuration.SHOOTLINE_TIMESTAMP.get()
                    +" has not been initialized by the other value");
    
    for (Object o : objects_1) {
      System.out.println(o);
    }
    
    for (int i = 0;
         Configuration.SHOOTLINE_TIMESTAMP.get().get(i) > 0;
         i++) {
      System.out.println("i = "
                         +i
                         +"i has been increased by the "
                         +Configuration.SHOOTLINE_DELAY.get()
                         +" times, value "
                         +Configuration.SHOOTLINE_TIMESTAMP.get()
                         +" contains the current timestamp");
     }
    
}
}