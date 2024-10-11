// _GetEngineTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngine}.
* It contains one unit test case for the {@link _GetEngine#getTypeDesc()} method.
*/
class _GetEngineTest {
		
	private String test = "test";
	
    doTest_String_0();
    
    doTest_Int_0();
    
    doTest_Float_0();
   
    doTest_Double_0();
    
    doTest_Array_0();
    
    private void doTest_String_0() {}
    
    private void doTest_Int_0() {}
    
    private void doTest_Float_0() {}
    
    private void doTest_Double_0() {}

    // No additional tests required for getTypeDesc
	
	@Test
    public void getTypeDesc(){
        assertNull(test);
    }
    
    char chA ='A';
    void doTest_Char_1(){
        chA = test.charAt(1);
	assertNotNull(chA);
	assertEquals(chA,test.charAt(0),0.01f);
    }
    
    String slA = s.substring(1,10);
    void doTest_String_2(){
        slA = test.substring(1,10);
	assertNotNull(slA);
	assertEquals(slA,test.substring(0,1));
    }
    
    int ilA = 0;
    void doTest_Int_3(){
        ilA = test.intValue();
	assertNotNull(ilA);
	assertEquals(ilA,test.intValue());
    }
    
    float flA = 0;
    void doTest_Float_4(){
        flA = test.floatValue();
	assertNotNull(flA);
	assertEquals(flA,test.floatValue());
    }
    
    double droA;
    void doTest_Double_5(){
        droA = test.doubleValue();
	assertNotNull(droA);
	assertEquals(droA,test.doubleValue());
    }
    
    ArrayList<?> arrA = new ArrayList();
    void doTest_Array_6(){
        arrA = test.toArrayList();
        assertNotNull(arrA);
    }
}