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

// HeatSource.java
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
public class HeatSource extends AbstractHardware {
    private final Heat heat;
    private final Temperature temperature;

    public HeatSource(Heat heat, Temperature temperature) {
        this.heat = heat;
        this.temperature = temperature;
    }

    public void cycle() {
        heat.add(temperature.getTemperature());
    }
}

// HeatSourceTest.java
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
* Test class of {@link HeatSource}.
* It contains ten unit test cases for the {@link HeatSource#cycle()} method.
*/
class HeatSourceTest {
		
		/**
		* Test case for {@link HeatSource#cycle()}
		*
		* @see HeatSource#cycle()
		*/
		@Test
		void testCycle() {
				// TODO: Implement test case
		}
}

// Heat.java
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
public class Heat {
    private double heat;

    public void add(double heat) {
        this.heat += heat;
    }

    public double getHeat() {
        return heat;
    }

    public void setHeat(double heat) {
        this.heat = heat;
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

// HeatSource.java
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
public class HeatSource extends AbstractHardware {
    private final Heat heat;
    private final Temperature temperature;

    public HeatSource(Heat heat, Temperature temperature) {
        this.heat = heat;
        this.temperature = temperature;
    }

    public void cycle() {
        heat.