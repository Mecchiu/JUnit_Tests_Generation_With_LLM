// _RequestResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains one unit test case for the {@link _RequestResponse#getTypeDesc()} method.
*/
class _RequestResponse_1Test {
		

/**
* Test case for {@link _RequestResponse#getTypeDesc()}.
* <p>See https://tempuri.org/w/serde4j</p>
* @throws Exception
*/
@Test
public void testGetTypeDesc12() throws Exception {

String _typeDesc1 = new String("http://tempuri.org/w/serde4j");



    assertEquals(_typeDesc1.startsWith("http://www.w3.org/2001/XMLSchema"), true);
}



}