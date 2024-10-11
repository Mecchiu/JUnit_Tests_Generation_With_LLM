// ParameterAttributes_0Test.java
package simulator.util;

import java.io.Serializable;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterAttributes}.
* It contains one unit test case for the {@link ParameterAttributes#valueFor(int)} method.
*/
class ParameterAttributes_0Test {
		
	//Constructor
	public void setUp(String name) throws Exception {

		this.name=name;

		System.setProperty("log4j.configuration", "org/apache/log4j/BaseLogger.properties");

		log.debug("Testing " + name);


	}

	@Test
	public void valueFor_0() {
		
		ParameterAttributes_0 instance = new ParameterAttributes();

		float expected = (float)10.0;
		
		System.out.println(instance.valueFor(0));

		assertEquals(expected, instance.valueFor(0), 0.01);

		float result = instance.valueFor(101);

		assertEquals(expected, result, 0.01);


	}

	/**
	* Unit test of valueFor function of parameter with social function set as Social
	* @throws Exception
	*/
	@Test
	public void valueForSocial_0socialFunction()throws Exception{
		
		ParameterAttributes_0 instance = new ParameterAttributes();
	
		float expected = (float)10.0;
		
		System.out.println(instance.valueForSocial(socialFunction));

		assertEquals(expected, instance.valueForSocial(socialFunction), 0.01);

	}

	/**
	* Unit test of valueFor function of parameter with social function set as social
	* @throws Exception
	*/
	@Test
	public void valueForSocial_1() throws Exception{

		ParameterAttributes_0 instance = new ParameterAttributes();

		float expected = (float)10.0;

		System.out.println(instance.valueForSocial(socialFunction));

		assertEquals(expected, instance.valueForSocial(socialFunction ), 0.01);

	}

}