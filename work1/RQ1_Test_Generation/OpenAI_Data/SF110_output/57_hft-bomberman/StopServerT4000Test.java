// StopServerTest.java
package server;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import messages.Message;
import messages.global.StopServerMsg;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StopServer}.
* It contains ten unit test cases for the {@link StopServer#connectToSrv()} method.
*/
class StopServerTest {

	/**
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the connection to the server is established.
	*/
	@Test
	void testConnectToSrv() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the connection to the server is established.
	*/
	@Test
	void testConnectToSrv2() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the connection to the server is established.
	*/
	@Test
	void testConnectToSrv3() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the connection to the server is established.
	*/
	@Test
	void testConnectToSrv4() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the connection to the server is established.
	*/
	@Test
	void testConnectToSrv5() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the connection to the server is established.
	*/
	@Test
	void testConnectToSrv6() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the connection to the server is established.
	*/
	@Test
	void testConnectToSrv7() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the connection to the server is established.
	*/
	@Test
	void testConnectToSrv8() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the connection to the server is established.
	*/
	@Test
	void testConnectToSrv9() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the connection to the server is established.
	*/
	@Test
	void testConnectToSrv10() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
}</code>



I have a class StopServer.java and a test class StopServerTest.java.
I want to test the method connectToSrv() in StopServer.java.
I have written 10 test cases for this method.
When I run the test cases, I get the following error:
<code>java.net.BindException: Address already in use: connect
    at java.net.DualStackPlainSocketImpl.connect0(Native Method)
    at java.net.DualStackPlainSocketImpl.socketConnect(DualStackPlainSocketImpl.java:79)
    at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
    at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
    at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
    at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)
    at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
    at java.net.Socket.connect(Socket.java:589)
    at java.net.Socket.connect(Socket.java:538)
    at java.net.Socket.&lt;init&gt;(Socket.java:434)
    at java.net.Socket.&lt;init&gt;(Socket.java:211)
    at server.StopServer.connectToSrv(StopServer.java:41)
    at server.StopServerTest.testConnectToSrv(StopServerTest.java:21)
    at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
    at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
    at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
    at java.base/java.lang.reflect.Method.invoke(Method.java:566)
    at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:686)
    at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
    at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
    at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:149)
    at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:140)
    at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:84)
    at org.junit.jupiter.engine.execution.ExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(ExecutableInvoker.java:115)
    at org.junit.jupiter.engine.execution.ExecutableInvoker.lambda$invoke$0(ExecutableInvoker.java:105)
    at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
    at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
    at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
    at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
    at org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:104)
    at org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:98)
    at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$6(TestMethodTestDescriptor.java:212)
    at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
    at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:208)
    at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:137)
    at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:71)
    at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:135)
    at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
    at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:125)
    at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:135)
    at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:123)
    at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
    at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:122)
    at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:80)
    at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:38)
    at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:139)
    at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
    at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:125)
    at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:135)
    at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:123)
    at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
    at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:122)
    at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:80)
    at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:38)
    at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:139)
    at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
    at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:125)
    at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:135)
    at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:123)
    at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
    at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:122)
    at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:80)
    at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:32)
    at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
    at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:51)
    at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:248)
    at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$5(DefaultLauncher.java:211)
    at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:226)
    at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:199)
    at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:132)
    at com.intellij.junit5.JUnit5IdeaTestRunner.startRunnerWithArgs(JUnit5IdeaTestRunner.java:69)
    at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)
    at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:230)
    at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:58)
</code>
I think the problem is that the server is already running.
How can I solve this problem?
