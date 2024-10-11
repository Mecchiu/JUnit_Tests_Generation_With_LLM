// TriangleArea1Test.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea1}.
* It contains one unit test case for the {@link TriangleArea1#triangleArea(int, int, int)} method.
*/
class TriangleArea1Test {

  @Test
  public void testAllMethods() {
    System.out.println("TriangleArea1Test");
    // test the following method:
    assertEquals("TriangleArea1Test.triangleArea(a,b,c)",
            expectedMethod(),
     TriangleArea1.triangleArea(2, 3, 5));
    
    //Test the following method:
    assertNotEquals("TriangleArea1Test.testAllMethods",
                   expectedMethod(),
                   testMethod());
		System.out.println("Test " + expectedMethod() + " failed");
  }
  
  //Test method of triangleArea()
  private String expectedMethod() {
    return "testAllMethods";
  }
  
  //Test method of triangleArea(int a,int b,int c)
  private String testMethod() {
    int a = 0;
    int b = 1;
    int c = 2;
    return new TriangleArea1().triangleArea(a, b, c);
  }
}
//class which extends class 'Number'
// class which extends class 'Triangle'
// class which extends class 'TriangleArea1Test'
