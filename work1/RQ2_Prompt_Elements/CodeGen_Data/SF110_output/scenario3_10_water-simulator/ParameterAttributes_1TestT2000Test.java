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
private static final short LOGICAL_NUMBER_OF_HOPPER = Logger.getLogger(LogicalNumberOfHop.class).getLogLevel();
        private static final Logger LOG = Logger.getLogger(ParameterAttributes_1Test.class);

    public static final int HOPPER_NUMBER_OF_HOPERS = 2;
    public static final int LOW_SPRITTEN_PRICE = 8;
                    @org.junit.jupiter.api.Test
        void calculateParameter() {

            ParameterAttributes pa = new ParameterAttributes();
            pa.setLogicalNumberOfHopers(HOPPER_NUMBER_OF_HOPERS);
            pa.setTotalConsumer()
                   .valueFor(100)
                   .and()
                   .valueFor(1 / (2 * HOPPER_NUMBER_OF_HOPERS))
                   .or()
                   .valueFor(2 / (2 * HOPPER_NUMBER_OF_HOPERS))
                   .or()
                   .valueFor(10 / (2 * HOPPER_NUMBER_OF_HOPERS))
                   .or()
                   .valueFor(15 / (2 * HOPPER_NUMBER_OF_HOPERS))
                   .and()
                   .valueFor(1000 / (2 * HOPPER_NUMBER_OF_HOPERS))
                   .and()
                   .valueFor(10000 / (2 * HOPPER_NUMBER_OF_HOPERS))
                   .or()
                   .valueFor((20 * (100 / (2 * HOPPER_NUMBER_OF_HOPERS))))
                   .or()
                   .valueFor(20000 / (2 * HOPPER_NUMBER_OF_HOPERS))
                   .or()
                   .valueFor(50000 / (2 * HOPPER_NUMBER_OF_HOPERS))
                   .or()
                   .valueFor(100000 / (2 * HOPPER_NUMBER_OF_HOPERS))
                   .or()
                   .valueFor(1e5 / (2 * HOPPER_NUMBER_OF_HOPERS))
                   .or()
                   .valueFor(2e5 / (2 * HOPPER_NUMBER_OF_HOPERS))
                   .or()
                   .valueFor(5.0e5 / (2 * HOPPER_NUMBER_OF_HOPERS))
                   .or()
                   .valueFor(100.0e5 / (2 * HOPPER_NUMBER_OF_HOPERS))
                   .or()
                   .valueFor((50.0e5 / (5 * (HOPPER_NUMBER_OF_HOPERS * HOPPER_NUMBER_OF_HOPERS))) + 1))
                   .or()
                   .valueFor(100.0e5 / (2 * HOPPER_NUMBER_OF_HOPERS))
                   .or()
                   .valueFor((50.0e5 / (50 * (HOPPER_NUMBER_OF_HOPERS * HOPPER_NUMBER_OF_HOPERS))) + 1))
                   .or()
                   .valueFor(0.0e5 / (2 * HOPPER_NUMBER_OF_HOPERS))
                   .or()
                   .valueFor(100.0e5 / (2 * HOPPER_NUMBER_OF_HOPERS))
                   .or()
                   .valueFor((50.0e5 / (50 * (HOPPER_NUMBER_OF_HOPERS * HOPPER_NUMBER_OF_HOPERS))))
                   .or()
                   .valueFor(0.0e5 / (HOPPER_NUMBER_OF_HOPERS))
                   .or()
                    ;
            LOG.debug("calculate parameter value");
            assertEquals(500L, pa.valueFor(LOGICAL_NUMBER_OF_HOPERS));
            }

    }