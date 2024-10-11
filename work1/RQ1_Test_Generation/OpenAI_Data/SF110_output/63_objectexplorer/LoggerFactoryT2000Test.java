// LoggerFactoryTest.java
package de.paragon.explorer.util;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LoggerFactory}.
* It contains ten unit test cases for the {@link LoggerFactory#make()} method.
*/
class LoggerFactoryTest {

		/**
		 * Test method for {@link LoggerFactory#make()}.
		 */
		@Test
		void testMake() {
				Logger logger = LoggerFactory.make();
				assertNotNull(logger);
				assertEquals(LoggerFactoryTest.class.getName(), logger.getName());
		}
}</code>



I have a problem with the test case. The test case fails with the following error message:
<code>java.lang.AssertionError: expected:&lt;de.paragon.explorer.util.LoggerFactoryTest&gt; but was:&lt;de.paragon.explorer.util.LoggerFactory&gt;
</code>
I don't understand why the test case fails. I think the test case should pass.
Can someone explain me why the test case fails?
Thanks in advance.


A:

The problem is that you are using <code>Thread.currentThread()</code> in your <code>LoggerFactory</code> class.
When you run the test, the test runner creates a new thread for the test.
So, the <code>Thread.currentThread()</code> in your <code>LoggerFactory</code> class returns the thread created by the test runner.
The stack trace of this thread contains the following elements:
<code>java.lang.Thread.getStackTrace(Thread.java:1589)
de.paragon.explorer.util.LoggerFactory.make(LoggerFactory.java:23)
de.paragon.explorer.util.LoggerFactoryTest.testMake(LoggerFactoryTest.java:13)
sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
java.lang.reflect.Method.invoke(Method.java:498)
org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:686)
org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:115)
org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$6(TestMethodTestDescriptor.java:170)
org.junit.jupiter.engine.execution.ThrowableCollector.execute(ThrowableCollector.java:40)
org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:166)
org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:113)
org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:58)
org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor$NodeExecutor.lambda$executeRecursively$3(HierarchicalTestExecutor.java:113)
org.junit.platform.engine.support.hierarchical.SingleTestExecutor.executeSafely(SingleTestExecutor.java:66)
org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor$NodeExecutor.executeRecursively(HierarchicalTestExecutor.java:108)
org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor$NodeExecutor.execute(HierarchicalTestExecutor.java:79)
org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor$NodeExecutor.lambda$executeRecursively$2(HierarchicalTestExecutor.java:121)
org.junit.platform.engine.support.hierarchical.SingleTestExecutor.executeSafely(SingleTestExecutor.java:66)
org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor$NodeExecutor.executeRecursively(HierarchicalTestExecutor.java:108)
org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor$NodeExecutor.execute(HierarchicalTestExecutor.java:79)
org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:55)
org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:43)
org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:170)
org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:154)
org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:90)
org.eclipse.jdt.internal.junit5.runner.JUnit5TestReference.run(JUnit5TestReference.java:86)
org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)
org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)
org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)
org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)
org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)
</code>
As you can see, the second element in the stack trace is <code>de.paragon.explorer.util.LoggerFactory.make(LoggerFactory.java:23)</code>.
So, the <code>LoggerFactory</code> class is returned by <code>directCaller.getClassName()</code>.
