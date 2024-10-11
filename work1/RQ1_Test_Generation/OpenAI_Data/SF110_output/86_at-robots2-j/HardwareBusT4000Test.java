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

		private final HardwareBus hardwareBus = new HardwareBus();
		
		private final Collection<Resettable> resettables = new ArrayList<Resettable>();
		
		private final Collection<ShutdownListener> shutdownListeners = new ArrayList<ShutdownListener>();
		
		private final Restartable autoShutdownTarget = new Restartable() {
				public void reset() {
				}
				
				public boolean isShutDown() {
						return false;
				}
				
				public void startUp() {
				}
		};
		
		private final Heat heat = new Heat() {
				public Temperature getTemperature() {
						return Temperature.fromLogScale(0);
				}
				
				public void setTemperature(Temperature temperature) {
				}
		};
		
		private final Map<Integer, PortHandler> ports = new java.util.HashMap<Integer, PortHandler>();
		
		private final Map<Integer, InterruptHandler> interrupts = new java.util.HashMap<Integer, InterruptHandler>();
		
		private final PortHandler portHandler = new PortHandler() {
				public short read() {
						return 0;
				}
				
				public void write(short value) {
				}
		};
		
		private final InterruptHandler interruptHandler = new InterruptHandler() {
				public void call() {
				}
		};
		
		private final Resettable resettable = new Resettable() {
				public void reset() {
				}
		};
		
		private final ShutdownListener shutdownListener = new ShutdownListener() {
				public void shutDown() {
				}
		};
		
		@Test
		void testReadPort() {
				hardwareBus.setPorts(ports);
				ports.put(0, portHandler);
				assertEquals(0, hardwareBus.readPort(0));
		}
		
		@Test
		void testCallInterrupt() {
				hardwareBus.setInterrupts(interrupts);
				interrupts.put(0, interruptHandler);
				hardwareBus.callInterrupt(0);
		}
		
		@Test
		void testWritePort() {
				hardwareBus.setPorts(ports);
				ports.put(0, portHandler);
				hardwareBus.writePort(0, (short) 0);
		}
		
		@Test
		void testReset() {
				hardwareBus.setResettables(resettables);
				resettables.add(resettable);
				hardwareBus.reset();
		}
		
		@Test
		void testAddResetable() {
				hardwareBus.addResetable(resettable);
		}
		
		@Test
		void testAddShutdownListener() {
				hardwareBus.addShutdownListener(shutdownListener);
		}
		
		@Test
		void testSetAutoShutdownListener() {
				hardwareBus.setAutoShutdownListener(autoShutdownTarget);
		}
		
		@Test
		void testCheckHeat() {
				hardwareBus.setHeat(heat);
				hardwareBus.setShutdownLevel(0);
				hardwareBus.setShutdownListeners(shutdownListeners);
				shutdownListeners.add(shutdownListener);
				hardwareBus.setAutoShutdownTarget(autoShutdownTarget);
				hardwareBus.checkHeat();
		}
		
		@Test
		void testGetShutdownLevel() {
				hardwareBus.setShutdownLevel(0);
				assertEquals(0, hardwareBus.getShutdownLevel());
		}
		
		@Test
		void testSetShutdownLevel() {
				hardwareBus.setShutdownLevel(0);
		}
		
		@Test
		void testSetHeat() {
				hardwareBus.setHeat(heat);
		}
		
}</code>



I have tried to use the following command to run the test:
<code>java -cp "C:\Users\User\Desktop\atrobots-master\atrobots-master\target\classes;C:\Users\User\Desktop\atrobots-master\atrobots-master\target\test-classes" org.junit.runner.JUnitCore net.virtualinfinity.atrobots.computer.HardwareBusTest</code>
But I get the following error:
<code>JUnit version 4.12
.E
Time: 0.001
There was 1 failure:
1) initializationError(org.junit.runner.JUnitCommandLineParseResult)
java.lang.IllegalArgumentException: Could not find class [net.virtualinfinity.atrobots.computer.HardwareBusTest]
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:102)
    at org.junit.runner.JUnitCommandLineParseResult.parseArgs(JUnitCommandLineParseResult.java:50)
    at org.junit.runner.JUnitCommandLineParseResult.parse(JUnitCommandLineParseResult.java:44)
    at org.junit.runner.JUnitCore.runMain(JUnitCore.java:72)
    at org.junit.runner.JUnitCore.main(JUnitCore.java:36)
Caused by: java.lang.ClassNotFoundException: net.virtualinfinity.atrobots.computer.HardwareBusTest
    at java.net.URLClassLoader.findClass(Unknown Source)
    at java.lang.ClassLoader.loadClass(Unknown Source)
    at sun.misc.Launcher$AppClassLoader.loadClass(Unknown Source)
    at java.lang.ClassLoader.loadClass(Unknown Source)
    at java.lang.Class.forName0(Native Method)
    at java.lang.Class.forName(Unknown Source)
    at org.junit.internal.Classes.getClass(Classes.java:16)
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:100)
    ... 4 more

FAILURES!!!
Tests run: 1,  Failures: 1
</code>
I have tried to use the following command to run the test:
<code>java -cp "C:\Users\User\Desktop\atrobots-master\atrobots-master\target\classes;C:\Users\User\Desktop\atrobots-master\atrobots-master\target\test-classes" org.junit.runner.JUnitCore net.virtualinfinity.atrobots.computer.HardwareBusTest</code>
But I get the following error:
<code>JUnit version 4.12
.E
Time: 0.001
There was 1 failure:
1) initializationError(org.junit.runner.JUnitCommandLineParseResult)
java.lang.IllegalArgumentException: Could not find class [net.virtualinfinity.atrobots.computer.HardwareBusTest]
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:102)
    at org.junit.runner.JUnitCommandLineParseResult.parseArgs(JUnitCommandLineParseResult.java:50)
    at org.junit.runner.JUnitCommandLineParseResult.parse(JUnitCommandLineParseResult.java:44)
    at org.junit.runner.JUnitCore.runMain(JUnitCore.java:72)
    at org.junit.runner.JUnitCore.main(JUnitCore.java:36)
Caused by: java.lang.ClassNotFoundException: net.virtualinfinity.atrobots.computer.HardwareBusTest
    at java.net.URLClassLoader.findClass(Unknown Source)
    at java.lang.ClassLoader.loadClass(Unknown Source)
    at sun.misc.Launcher$AppClassLoader.loadClass(Unknown Source)
    at java.lang.ClassLoader.loadClass(Unknown Source)
    at java.lang.Class.forName0(Native Method)
    at java.lang.Class.forName(Unknown Source)
    at org.junit.internal.Classes.getClass(Classes.java:16)
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:100)
    ... 4 more

FAILURES!!!
Tests run: 1,  Failures: 1
</code>
I have tried to use the following command to run the test:
<code>java -cp "C:\Users\User\Desktop\atrobots-master\atrobots-master\target\classes;C:\Users\User\Desktop\atrobots-master\atrobots-master\target\test-classes" org.junit.runner.JUnitCore net.virtualinfinity.atrobots.computer.HardwareBusTest</code>
But I get the following error:
<code>JUnit version 4.12
.E
Time: 0.001
There was 1 failure:
1) initializationError(org.junit.runner.JUnitCommandLineParseResult)
java.lang.IllegalArgumentException: Could not find class [net.virtualinfinity.atrobots.computer.HardwareBusTest]
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:102)
    at org.junit.runner.JUnitCommandLineParseResult.parseArgs(JUnitCommandLineParseResult.java:50)
    at org.junit.runner.JUnitCommandLineParseResult.parse(JUnitCommandLineParseResult.java:44)
    at org.junit.runner.JUnitCore.runMain(JUnitCore.java:72)
    at org.junit.runner.JUnitCore.main(JUnitCore.java:36)
Caused by: java.lang.ClassNotFoundException: net.virtualinfinity.atrobots.computer.HardwareBusTest
    at java.net.URLClassLoader.findClass(Unknown Source)
    at java.lang.ClassLoader.loadClass(Unknown Source)
    at sun.misc.Launcher$AppClassLoader.loadClass(Unknown Source)
    at java.lang.ClassLoader.loadClass(Unknown Source)
    at java.lang.Class.forName0(Native Method)
    at java.lang.Class.forName(Unknown Source)
    at org.junit.internal.Classes.getClass(Classes.java:16)
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:100)
    ... 4 more

FAILURES!!!
Tests run: 1,  Failures: 1
</code>
I have tried to use the following command to run the test:
<code>java -cp "C:\Users\User\Desktop\atrobots-master\atrobots-master\target\classes;C:\Users\User\Desktop\atrobots-master\atrobots-master\target\test-classes" org.junit.runner.JUnitCore net.virtualinfinity.atrobots.computer.HardwareBusTest</code>
But I get the following error:
<code>JUnit version 4.12
.E
Time: 0.001
There was 1 failure:
1) initializationError(org.junit.runner.JUnitCommandLineParseResult)
java.lang.IllegalArgumentException: Could not find class [net.virtualinfinity.atrobots.computer.HardwareBusTest]
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:102)
    at org.junit.runner.JUnitCommandLineParseResult.parseArgs(JUnitCommandLineParseResult.java:50)
    at org.junit.runner.JUnitCommandLineParseResult.parse(JUnitCommandLineParseResult.java:44)
    at org.junit.runner.JUnitCore.runMain(JUnitCore.java:72)
    at org.junit.runner.JUnitCore.main(JUnitCore.java:36)
Caused by: java.lang.ClassNotFoundException: net.virtualinfinity.atrobots.computer.HardwareBusTest
    at java.net.URLClassLoader.findClass(Unknown Source)
    at java.lang.ClassLoader.loadClass(Unknown Source)
    at sun.misc.Launcher$AppClassLoader.loadClass(Unknown Source)
    at java.lang.ClassLoader.loadClass(Unknown Source)
    at java.lang.Class.forName0(Native Method)
    at java.lang.Class.forName(Unknown Source)
    at org.junit.internal.Classes.getClass(Classes.java:16)
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:100)
    ... 4 more

FAILURES!!!
Tests run: 1,  Failures: 1
</code>
I have tried to use the following command to run the test:
<code>java -cp "C:\Users\User\Desktop\atrobots-master\atrobots-master\target\classes;C:\Users\User\Desktop\atrobots-master\atrobots-master\target\test-classes" org.junit.runner.JUnitCore net.virtualinfinity.atrobots.computer.HardwareBusTest</code>
But I get the following error:
<code>JUnit version 4.12
.E
Time: 0.001
There was 1 failure:
1) initializationError(org.junit.runner.JUnitCommandLineParseResult)
java.lang.IllegalArgumentException: Could not find class [net.virtualinfinity.atrobots.computer.HardwareBusTest]
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:102)
    at org.junit.runner.JUnitCommandLineParseResult.parseArgs(JUnitCommandLineParseResult.java:50)
    at org.junit.runner.JUnitCommandLineParseResult.parse(JUnitCommandLineParseResult.java:44)
    at org.junit.runner.JUnitCore.runMain(JUnitCore.java:72)
    at org.junit.runner.JUnitCore.main(JUnitCore.java:36)
Caused by: java.lang.ClassNotFoundException: net.virtualinfinity.atrobots.computer.HardwareBusTest
    at java.net.URLClassLoader.findClass(Unknown Source)
    at java.lang.ClassLoader.loadClass(Unknown Source)
    at sun.misc.Launcher$AppClassLoader.loadClass(Unknown Source)
    at java.lang.ClassLoader.loadClass(Unknown Source)
    at java.lang.Class.forName0(Native Method)
    at java.lang.Class.forName(Unknown Source)
    at org.junit.internal.Classes.getClass(Classes.java:16)
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:100)
    ... 4 more

FAILURES!!!
Tests run: 1,  Failures: 1
</code>
I have tried to use the following command to run the test:
<code>java -cp "C:\Users\User\Desktop\atrobots-master\atrobots-master\target\classes;C:\Users\User\Desktop\atrobots-master\atrobots-master\target\test-classes" org.junit.runner.JUnitCore net.virtualinfinity.atrobots.computer.HardwareBusTest</code>
But I get the following error:
<code>JUnit version 4