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
private static Logger logger = Logger.getLogger(ParameterAttributes_0Test.class);
		/**
* Creates a new instance of ParameterAttributes_0Test Class.
*/
	@Test
	public void testParameterAttributes_0() {
//		logger.info(this.getClass().getName() + "Started");
//		logger.info("valueFor("+((int) (2*(float) 4) )+")");
                assertEquals((int) ( (float) 4 ),ParameterAttributesImpl.valueFor((float) 2 ));
//		assertEquals((int) (2*(float) 4 ),ParameterAttributesImpl.valueFor((float) 2 ));
                assertEquals((int) (2*(int) 2 ),ParameterAttributesImpl.valueFor((int) 2 ));
                assertEquals((int) (2*(int) 2 ),ParameterAttributesImpl.valueFor((int) 2 ));
                assertEquals((int) (2*(int) 2 ),ParameterAttributesImpl.valueFor((int) 2 ));
                logger.info("\n\n valueFor("+(float) 2  +(int) 2) "+ (int)2);
        }
       /**
* Creates a new instance of ParameterAttributes_0Test Class.
*/
    @Test
    public void testParameterAttributes_1() {
//		logger.info(this.getClass().getName() + "Started");
//		logger.info("valueFor("+((int) ( 2*(float) 4) )+")");
                assertEquals((int) ( 2*(float) 4 ),ParameterAttributesImpl.valueFor((float) 2 ));
//		assertEquals((int) (2*(int) 2 ),ParameterAttributesImpl.valueFor((int) 2 ));
                assertEquals((int) (2 * (int) 2 ),ParameterAttributesImpl.valueFor((int) 2 ));
                logger.info("\n\n valueFor("+(float) 2  +(int) 2) "+ (int)2);
        }
}
