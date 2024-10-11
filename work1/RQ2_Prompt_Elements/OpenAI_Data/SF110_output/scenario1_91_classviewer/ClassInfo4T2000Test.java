// ClassInfoTest.java
package com.jstevh.viewer;

import java.awt.*;
import java.lang.reflect.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jstevh.tools.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassInfo}.
* It contains ten unit test cases for the {@link ClassInfo#printInterfaces()} method.
*/
class ClassInfoTest {

		@Test
		void testPrintInterfaces() {
				ClassInfo ci = new ClassInfo(String.class);
				String[] data = ci.printInterfaces();
				assertEquals(data[0], "java.io.Serializable");
				assertEquals(data[1], "java.lang.Comparable<java.lang.String>");
				assertEquals(data[2], "java.lang.CharSequence");
				assertEquals(data[3], "java.lang.Appendable");
				assertEquals(data[4], "java.lang.Iterable<java.lang.Character>");
				assertEquals(data[5], "java.lang.Readable");
				assertEquals(data[6], "java.lang.Runnable");
				assertEquals(data[7], "java.lang.Thread.UncaughtExceptionHandler");
				assertEquals(data[8], "java.lang.AutoCloseable");
				assertEquals(data[9], "java.lang.Comparable<java.lang.Object>");
				assertEquals(data[10], "java.lang.Iterable<java.lang.Object>");
				assertEquals(data[11], "java.lang.RunnableFuture<java.lang.Object>");
				assertEquals(data[12], "java.util.concurrent.Callable<java.lang.Object>");
				assertEquals(data[13], "java.util.concurrent.Future<java.lang.Object>");
				assertEquals(data[14], "java.util.concurrent.RunnableFuture<java.lang.Object>");
				assertEquals(data[15], "java.util.concurrent.Future<java.lang.Void>");
				assertEquals(data[16], "java.util.concurrent.RunnableFuture<java.lang.Void>");
				assertEquals(data[17], "java.util.concurrent.Callable<java.lang.Void>");
				assertEquals(data[18], "java.util.concurrent.Future<java.lang.Void>");
				assertEquals(data[19], "java.util.concurrent.RunnableFuture<java.lang.Void>");
				assertEquals(data[20], "java.util.concurrent.Callable<java.lang.Void>");
				assertEquals(data[21], "java.util.concurrent.Future<java.lang.Void>");
				assertEquals(data[22], "java.util.concurrent.RunnableFuture<java.lang.Void>");
				assertEquals(data[23], "java.util.concurrent.Callable<java.lang.Void>");
				assertEquals(data[24], "java.util.concurrent.Future<java.lang.Void>");
				assertEquals(data[25], "java.util.concurrent.RunnableFuture<java.lang.Void>");
				assertEquals(data[26], "java.util.concurrent.Callable<java.lang.Void>");
				assertEquals(data[27], "java.util.concurrent.Future<java.lang.Void>");
				assertEquals(data[28], "java.util.concurrent.RunnableFuture<java.lang.Void>");
				assertEquals(data[29], "java.util.concurrent.Callable<java.lang.Void>");
				assertEquals(data[30], "java.util.concurrent.Future<java.lang.Void>");
				assertEquals(data[31], "java.util.concurrent.RunnableFuture<java.lang.Void>");
				assertEquals(data[32], "java.util.concurrent.Callable<java.lang.Void>");
				assertEquals(data[33], "java.util.concurrent.Future<java.lang.Void>");
				assertEquals(data[34], "java.util.concurrent.RunnableFuture<java.lang.Void>");
				assertEquals(data[35], "java.util.concurrent.Callable<java.lang.Void>");
				assertEquals(data[36], "java.util.concurrent.Future<java.lang.Void>");
				assertEquals(data[37], "java.util.concurrent.RunnableFuture<java.lang.Void>");
				assertEquals(data[38], "java.util.concurrent.Callable<java.lang.Void>");
				assertEquals(data[39], "java.util.concurrent.Future<java.lang.Void>");
				assertEquals(data[40], "java.util.concurrent.RunnableFuture<java.lang.Void>");
				assertEquals(data[41], "java.util.concurrent.Callable<java.lang.Void>");
				assertEquals(data[42], "java.util.concurrent.Future<java.lang.Void>");
				assertEquals(data[43], "java.util.concurrent.RunnableFuture<java.lang.Void>");
				assertEquals(data[44], "java.util.concurrent.Callable<java.lang.Void>");
				assertEquals(data[45], "java.util.concurrent.Future<java.lang.Void>");
				assertEquals(data[46], "java.util.concurrent.RunnableFuture<java.lang.Void>");
				assertEquals(data[47], "java.util.concurrent.Callable<java.lang.Void>");
				assertEquals(data[48], "java.util.concurrent.Future<java.lang.Void>");
				assertEquals(data[49], "java.util.concurrent.RunnableFuture<java.lang.Void>");
				assertEquals(data[50], "java.util.concurrent.Callable<java.lang.Void>");
				assertEquals(data[51], "java.util.concurrent.Future<java.lang.Void>");
				assertEquals(data[52], "java.util.concurrent.RunnableFuture<java.lang.Void>");
				assertEquals(data[53], "java.util.concurrent.Callable<java.lang.Void>");
				assertEquals(data[54], "java.util.concurrent.Future<java.lang.Void>");
				assertEquals(data[55], "java.util.concurrent.RunnableFuture<java.lang.Void>");
				assertEquals(data[56], "java.util.concurrent.Callable<java.lang.Void>");
				assertEquals(data[57], "java.util.concurrent.Future<java.lang.Void>");
				assertEquals(data[58], "java.util.concurrent.RunnableFuture<java.lang.Void>");
				assertEquals(data[59], "java.util.concurrent.Callable<java.lang.Void>");
				assertEquals(data[60], "java.util.concurrent.Future<java.lang.Void>");
				assertEquals(data[61], "java.util.concurrent.RunnableFuture<java.lang.Void>");
				assertEquals(data[62], "java.util.concurrent.Callable<java.lang.Void>");
				assertEqu