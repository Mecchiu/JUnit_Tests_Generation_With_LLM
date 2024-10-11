// HardwareBusTest.java
package net.virtualinfinity.atrobots.computer;

import net.virtualinfinity.atrobots.measures.Heat;
import net.virtualinfinity.atrobots.measures.Temperature;
import net.virtualinfinity.atrobots.ports.PortHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HardwareBus}.
* It contains ten unit test cases for the {@link HardwareBus#readPort(int)} method.
*/
class HardwareBusTest {

		/**
		* Test case for {@link HardwareBus#readPort(int)}
		*
		* @see HardwareBus#readPort(int)
		*/
		@Test
		void testReadPort() {
				// TODO: Implement test case
		}
}

// HeatSink.java
package net.virtualinfinity.atrobots.hardware;

import net.virtualinfinity.atrobots.measures.Heat;
import net.virtualinfinity.atrobots.measures.Temperature;
import net.virtualinfinity.atrobots.ports.PortHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/**
 * @author Daniel Pitts
 */
public class HeatSink extends AbstractHardware {
    private final Heat heat;
    private final Temperature temperature;

    public HeatSink(Heat heat, Temperature temperature) {
        this.heat = heat;
        this.temperature = temperature;
    }

    public void cycle() {
        heat.add(temperature.getTemperature());
    }
}

// HeatSinkTest.java
package net.virtualinfinity.atrobots.hardware;

import net.virtualinfinity.atrobots.measures.Heat;
import net.virtualinfinity.atrobots.measures.Temperature;
import net.virtualinfinity.atrobots.ports.PortHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HeatSink}.
* It contains ten unit test cases for the {@link HeatSink#cycle()} method.
*/
class HeatSinkTest {
		
		/**
		* Test case for {@link HeatSink#cycle()}
		*
		* @see HeatSink#cycle()
		*/
		@Test
		void testCycle() {
				// TODO: Implement test case
		}
}

// HeatTest.java
package net.virtualinfinity.atrobots.measures;

import net.virtualinfinity.atrobots.measures.Heat;
import net.virtualinfinity.atrobots.measures.Temperature;
import net.virtualinfinity.atrobots.ports.PortHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Heat}.
* It contains ten unit test cases for the {@link Heat#add(double)} method.
*/
class HeatTest {
		
		/**
		* Test case for {@link Heat#add(double)}
		*
		* @see Heat#add(double)
		*/
		@Test
		void testAdd() {
				// TODO: Implement test case
		}
}

// HeatTransfer.java
package net.virtualinfinity.atrobots.measures;

import net.virtualinfinity.atrobots.measures.Heat;
import net.virtualinfinity.atrobots.measures.Temperature;
import net.virtualinfinity.atrobots.ports.PortHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/**
 * @author Daniel Pitts
 */
public class HeatTransfer {
    private final Heat source;
    private final Heat sink;
    private final double transferRate;

    public HeatTransfer(Heat source, Heat sink, double transferRate) {
        this.source = source;
        this.sink = sink;
        this.transferRate = transferRate;
    }

    public void cycle() {
        final double heat = source.getHeat();
        if (heat > 0) {
            final double transfer = Math.min(heat, transferRate);
            source.add(-transfer);
            sink.add(transfer);
        }
    }
}

// HeatTransferTest.java
package net.virtualinfinity.atrobots.measures;

import net.virtualinfinity.atrobots.measures.Heat;
import net.virtualinfinity.atrobots.measures.Temperature;
import net.virtualinfinity.atrobots.ports.PortHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HeatTransfer}.
* It contains ten unit test cases for the {@link HeatTransfer#cycle()} method.
*/
class HeatTransferTest {
		
		/**
		* Test case for {@link HeatTransfer#cycle()}
		*
		* @see HeatTransfer#cycle()
		*/
		@Test
		void testCycle() {
				// TODO: Implement test case
		}
}

// HeatTransferTest.java
package net.virtualinfinity.atrobots.measures;

import net.virtualinfinity.atrobots.measures.Heat;
import net.virtualinfinity.atrobots.measures.Temperature;
import net.virtualinfinity.atrobots.ports.PortHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HeatTransfer}.
* It contains ten unit test cases for the {@link HeatTransfer#cycle()} method.
*/
class HeatTransferTest {
		
		/**
		* Test case for {@link HeatTransfer#cycle()}
		*
		* @see HeatTransfer#cycle()
		*/
		@Test
		void testCycle() {
				// TODO: Implement test case
		}
}

// HeatTransferTest.java
package net.virtualinfinity.atrobots.measures;

import net.virtualinfinity.atrobots.measures.Heat;
import net.virtualinfinity.atrobots.measures.Temperature;
import net.virtualinfinity.atrobots.ports.PortHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HeatTransfer}.
* It contains ten unit test cases for the {@link HeatTransfer#cycle()} method.
*/
class HeatTransferTest {
		
		/**
		* Test case for {@link HeatTransfer#cycle()}
		*
		* @see HeatTransfer#cycle()
		*/
		@Test
		void testCycle() {
				// TODO: Implement test case
		}
}

// HeatTransferTest.java
package net.virtualinfinity.atrobots.measures;

import net.virtualinfinity.atrobots.measures.Heat;
import net.virtualinfinity.atrobots.measures.Temperature;
import net.virtualinfinity.atrobots.ports.PortHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HeatTransfer}.
* It contains ten unit test cases for the {@link HeatTransfer#cycle()} method.
*/
class HeatTransferTest {
		
		/**
		* Test case for {@link HeatTransfer#cycle()}
		*
		* @see HeatTransfer#cycle()
		*/
		@Test
		void testCycle() {
				// TODO: Implement test case
		}
}

// HeatTransferTest.java
package net.virtualinfinity.atrobots.measures;

import net.virtualinfinity.atrobots.measures.Heat;
import net.virtualinfinity.atrobots.measures.Temperature;
import net.virtualinfinity.atrobots.ports.PortHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HeatTransfer}.
* It contains ten unit test cases for the {@link HeatTransfer#cycle()} method.
*/
class HeatTransferTest {
		
		/**
		* Test case for {@link HeatTransfer#cycle()}
		*
		* @see HeatTransfer#cycle()
		*/
		@Test
		void testCycle() {
				// TODO: Implement test case
		}
}

// HeatTransferTest.java
package net.virtualinfinity.atrobots.measures;

import net.virtualinfinity.atrobots.measures.Heat;
import net.virtualinfinity.atrobots.measures.Temperature;
import net.virtualinfinity.atrobots.ports.PortHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HeatTransfer}.
* It contains ten unit test cases for the {@link HeatTransfer#cycle()} method.
*/
class HeatTransferTest {
		
		/**
		* Test case for {@link HeatTransfer#cycle()}
		*
		* @see HeatTransfer#cycle()
		*/
		@Test
		void testCycle() {
				// TODO: Implement test case
		}
}

// HeatTransferTest.java
package net.virtualinfinity.atrobots.measures;

import net.virtualinfinity.atrobots.measures.Heat;
import net.virtualinfinity.atrobots.measures.Temperature;
import net.virtualinfinity.atrobots.ports.PortHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HeatTransfer}.
* It contains ten unit test cases for the {@link HeatTransfer#cycle()} method.
*/
class HeatTransferTest {
		
		/**
		* Test case for {@link HeatTransfer#cycle()}
		*
		* @see HeatTransfer#cycle()
		*/
		@Test
		void testCycle() {
				// TODO: Implement test case
		}
}

// HeatTransferTest.java
package net.virtualinfinity.atrobots.measures;

import net.virtualinfinity.atrobots.measures.Heat;
import net.virtualinfinity.atrobots.measures.Temperature;
import net.virtualinfinity.atrobots.ports.PortHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HeatTransfer}.
* It contains ten unit test cases for the {@link HeatTransfer#cycle()} method.
*/
class HeatTransferTest {
		
		/**
		* Test case for {@link HeatTransfer#cycle()}
		*
		* @see HeatTransfer#cycle()
		*/
		@Test
		void testCycle() {
				// TODO: Implement test case
		}
}

// HeatTransferTest.java
package net.virtualinfinity.atrobots.measures;

import net.virtualinfinity.atrobots.measures.Heat;
import net.virtualinfinity.atrobots.measures.Temperature;
import net.virtualinfinity.atrobots.ports.PortHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HeatTransfer}.
* It contains ten unit test cases for the {@link HeatTransfer#cycle()} method.
*/
class HeatTransferTest {
		
		/**
		* Test case for {@link HeatTransfer#cycle()}
		*
		* @see HeatTransfer#cycle()
		*/
		@Test
		void testCycle() {
				// TODO: Implement test case
		}
}

// HeatTransferTest.java
package net.virtualinfinity.atrobots.measures;

import net.virtualinfinity.atrobots.measures.Heat;
import net.virtualinfinity.atrobots.measures.Temperature;
import net.virtualinfinity.atrobots.ports.PortHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HeatTransfer}.
* It contains ten unit test cases for the {@link HeatTransfer#cycle()} method.
*/
class HeatTransferTest {
		
		/**
		* Test case for {@link HeatTransfer#cycle()}
		*
		* @see HeatTransfer#cycle()
		*/
		@Test
		void testCycle() {
				// TODO: Implement test case
		}
}

// HeatTransferTest.java
package net.virtualinfinity.atrobots.measures;

import net.virtualinfinity.atrobots.measures.Heat;
import net.virtualinfinity.atrobots.measures.Temperature;
import net.virtualinfinity.atrobots.ports.PortHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HeatTransfer}.
* It contains ten unit test cases for the {@link HeatTransfer#cycle()} method.
*/
class HeatTransferTest {
		
		/**
		* Test case for {@link HeatTransfer#cycle()}
		*
		* @see HeatTransfer#cycle()
		*/
		@Test
		void testCycle() {
				// TODO: Implement test case
		}
}

// HeatTransferTest.java
package net.virtualinfinity.atrobots.measures;

import net.virtualinfinity.atrobots.measures.Heat;
import net.virtualinfinity.atrobots.measures.Temperature;
import net.virtualinfinity.atrobots.ports.PortHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HeatTransfer}.
* It contains ten unit test cases for the {@link HeatTransfer#cycle()} method.
*/
class HeatTransferTest {
		
		/**
		* Test case for {@link HeatTransfer#cycle()}
		*
		* @see HeatTransfer#cycle()
		*/
		@Test
		void testCycle() {
				// TODO: Implement test case
		}
}

// HeatTransferTest.java
package net.virtualinfinity.atrobots.measures;

import net.virtualinfinity.atrobots.