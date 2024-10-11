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
private static Logger LOG = Logger.getLogger(ParameterAttributes_0Test.class);
		@Test
		public  void test() {
			LOG.info("ParamterAttributes_0Test");
			float parameter_value = ParameterAttributes.valueFor(0);
		}
}
// End ParameterAttributes_Test.java
