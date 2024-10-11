// ParameterAttributes_1Test.java
package simulator.util;

import java.io.Serializable;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterAttributes}.
* It contains one unit test case for the {@link ParameterAttributes#valueFor(float)} method.
*/
class ParameterAttributes_1Test {
		
	static final Logger logger = Logger.getLogger(ParameterAttributes_1Test.class);
	static final int TESTDATA = 5;

	@Test
	void valueFor_withFloat_for_oneStep_shouldReturnTheParametric value() {
			
		float testdata = ParameterAttributes_1Test.TESTDATA;
		for(int i = 0; i < TESTDATA; i++){
			ParameterAttributes.valueFor(i);
		}
	}
	
	@Test
	void valueFor_withFloatAndLn_for_oneStep_shouldReturnTheParametric value() {
		logger.info("Start Testing for this Input Value\n" + valueFor(0));
		float testdata = ParameterAttributes_1Test.TESTDATA;
		for(int i = 0; i < TESTDATA; i++) {
			logger.info(testdata++);
		}
		logger.info("End Testing for this Input Value\n" + valueFor(0));
	}
	
	@Test
	void valueFor_noArg_withFloatAndLn_shouldReturnTheParametric value() {
		logger.info("Start Testing for this Input Value\n" + valueFor(0));
		float testdata = ParameterAttributes_1Test.TESTDATA;
		for(int i = 0; i < TESTDATA; i++) {
			logger.info(testdata++);
		}
		logger.info("End Testing for this Input Value\n" + valueFor(0));
	}
		
	@Test
	void valueFor_getInt() {
		
		float testdata = ParameterAttributes_1Test.TESTDATA;
		for(-1 <= testdata && testdata <= 10; ++testdata) {
			int v = ParameterAttributes_1Test.valueFor(testdata);
			logger.info(" valueFor_getInt returns " + v);
		}
		
		for(int i = -10; i < 10; ++i) {
			logger.info(" valueFor_getInt returns " + i);
		}
	}
	
	@Test
	void valueFor_fromList_withFloatAndLn_shouldReturnTheParametric value() {
		
		float testdata = ParameterAttributes_1Test.TESTDATA;
		int max = 10, size = 5;
		for(int i = 0; i < size; i++) {
			int v = ParameterAttributes_1Test.valueFor(max);
			logger.info(" valueFor_fromList returns " + i + ", " + v);
			assertEquals(i+1, v);
		}
		
		for(int i = max-1; i < max; i++) {
			logger.info(" valueFor_fromList returns " + i);
		}
	}
	
	@Test
	void valueFor_fromList_withFloatAndLn_withoutElements_shouldReturnTheParametric value() {
		int max = 10, size = 5;
		for(int i = 1; i < size; i++) {
			int v = ParameterAttributes_1Test.valueFor(max);
			logger.info(" valueFor_fromList returns " + i + ", " + v);
			assertEquals(i+1, v);
		}
		
		for(int i = max+1; i < max; i++) {
			logger.info(" valueFor_fromList returns " + i);
		}
	}

}