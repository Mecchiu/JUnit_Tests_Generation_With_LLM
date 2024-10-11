// JavaSource_0Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains one unit test case for the {@link JavaSource#hasInterface()} method.
*/
class JavaSource_0Test {
		
  @Test
  public void testJavaSource() throws Exception {
    System.out.println("\n==[TestJavaSource]==");

    assertNotNull("Null value returned after instantiation", JavaSource.this);
    
    assertNotNull("Null value returned by addMemberVariable()", JavaSource.this.memberVariables);
    assertNotNull("Null value returned by addMemberVariable()", JavaSource.this.packageName);
    
    assertNotNull("Null value returned by getClass()", JavaSource.this.className);
    
    assertTrue("Null value returned by hasInterface()", JavaSource.this.hasInterface());
    assertTrue("Null value returned by hasSuperClass()", JavaSource.this.hasSuperClass());
    
    assertNotNull("Null value returned by getMemberVariables()", JavaSource.this.memberVariables);
    assertNotNull("Null value returned by getMemberVariables() - class name", JavaSource.this.memberVariables.get(0).getName());
    assertNotNull("Null value returned by getMemberVariables() - isArray", JavaSource.this.memberVariables.get(0).isArray());
    assertNotNull("Null value returned by getClass() - name", JavaSource.this.memberVariables.get(0).getClassName());
    assertNotNull("Null value returned by getClass() - isArray", JavaSource.this.memberVariables.get(0).isArray());
    
    System.out.println("----------------------------------------------------------------------");
    
    StringTokenizer tokens = new StringTokenizer("Package", " ");
    assertNotNull("Null value returned (Package) after instantiation.", JavaSource.this.packageName);
    assertNotNull("Null value returned (Package - namespace) after instantiation.", JavaSource.this.packageName);
    System.out.println(tokens.nextToken());
    String tokens2 = tokens.nextToken();
    System.out.println("");
    System.out.println("----------------------------------------------------------------------");
    tokens.nextToken();
    tokens.nextToken();
    StringTokenizer token = new StringTokenizer(tokens.nextToken());
    assertNotNull("Null value returned (Element - class) after instantiation.", JavaSource.this.className);
    assertNotNull("Null value returned (Element - class) after instantiation.", JavaSource.this.className);
    tokens.nextToken();
    tokens2 = token.nextToken();
    System.out.println("");
    System.out.println("----------------------------------------------------------------------");
    token.nextToken();
    tokens.nextToken();
    String tokens3 = token.nextToken();
    System.out.println("");
    System.out.println("----------------------------------------------------------------------");
    token.nextToken();
    tokens3 = token.nextToken();
    assertNotNull("Null value returned", JavaSource.this.memberVariables);
    assertNotNull("Null value returned", JavaSource.this.memberVariables.get(0).getClassName());
    assertNotNull("Null value returned", JavaSource.this.memberVariables.get(0).getName());
    assertNotNull("Null value returned", JavaSource.this.memberVariables.get(0).isArray());
    assertNotNull("Null value returned", JavaSource.this.memberVariables.get(0).getClass());
    assertSame("Not the same token returned", JavaSource.this.memberVariables.get(0).getClass().getName(), tokens3.toString());
    assertTrue("Null value returned", JavaSource.this.memberVariables.get(0).isArray());
    assertTrue("Null value returned", JavaSource.this.memberVariables.get(0).getClass().isArray());
    
}
}