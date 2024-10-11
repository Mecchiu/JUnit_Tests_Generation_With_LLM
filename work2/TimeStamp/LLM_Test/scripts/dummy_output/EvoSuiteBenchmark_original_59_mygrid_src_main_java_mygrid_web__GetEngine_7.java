// _GetEngineTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngine}.
* It contains one unit test case for the {@link _GetEngine#getTypeDesc()} method.
*/
class _GetEngineTest {
		
	int __count=0;
        
        final static void reset(org.apache.axis.client.Client service) {
            service.resolveConfigurabilityService("1/getTypeDesc");
        }

        /**
            * Test of Get Type Description method, of class mygrid.web._GetEngine.
            */
        @Test
        public void testGetTypeDesc() {
                      StringBuffer want=new StringBuffer();
                    
                      GetTypeDescResponse got = (GetTypeDescResponse) getTypeDesc().newInstance();
                      // _SetTypeDesc.java
                      
                      got.setTypeDesc(new java.util.ArrayList<java.lang.Object>[][] {
                                                {true, true, true, true},
                           {null, true, null, null} });
                      
                      reset(got);
                      
                          want.append(getTypeDesc());
                          
                  assertEquals(want.toString(), got.toString());
          }
        @Test
     void testGetTypeDesc_null() throws Exception {//1
         
                


          
                        
                        
                        
                      GetTypeDescResponse got = (GetTypeDescResponse) getTypeDesc().newInstance();
                      got.setTypeDesc(new java.util.ArrayList<java.lang.Object>(java.util.Arrays.asList(java.lang.Integer.newInstance(1), java.lang.Byte.newInstance(1), java.lang.Char.newInstance(1),  java.lang.Double.newInstance(1), java.lang.Integer.newInstance(2),  java.lang.Boolean.newInstance(true))) );
                      
                      assertArrayEquals(new java.util.ArrayList(java.lang.Integer.newInstance(1)), got.getTypeDesc());
                          
                  assertEquals(want.toString(), got.toString());
          }
        @Test  public void testSetTypeDesc_null() throws Exception {
      assertEquals(want.toString(), setTypeDesc().toString());
    }
}