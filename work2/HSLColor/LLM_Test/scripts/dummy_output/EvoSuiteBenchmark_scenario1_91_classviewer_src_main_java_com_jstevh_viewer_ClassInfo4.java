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
				assertEquals(data[4], "java.lang.Readable");
				assertEquals(data[5], "java.lang.Runnable");
				assertEquals(data[6], "java.lang.Thread.UncaughtExceptionHandler");
				assertEquals(data[7], "java.lang.Iterable<java.lang.String>");
				assertEquals(data[8], "java.util.Comparator<java.lang.String>");
				assertEquals(data[9], "java.util.Formattable");
				assertEquals(data[10], "java.util.RandomAccess");
				assertEquals(data[11], "java.util.concurrent.Callable<java.lang.String>");
				assertEquals(data[12], "java.util.function.Supplier<java.lang.String>");
				assertEquals(data[13], "java.util.function.Consumer<java.lang.String>");
				assertEquals(data[14], "java.util.function.Predicate<java.lang.String>");
				assertEquals(data[15], "java.util.function.Function<java.lang.String,java.lang.String>");
				assertEquals(data[16], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.String>");
				assertEquals(data[17], "java.util.function.UnaryOperator<java.lang.String>");
				assertEquals(data[18], "java.util.function.BinaryOperator<java.lang.String>");
				assertEquals(data[19], "java.util.function.BiConsumer<java.lang.String,java.lang.String>");
				assertEquals(data[20], "java.util.function.BiPredicate<java.lang.String,java.lang.String>");
				assertEquals(data[21], "java.util.function.ToIntFunction<java.lang.String>");
				assertEquals(data[22], "java.util.function.ToLongFunction<java.lang.String>");
				assertEquals(data[23], "java.util.function.ToDoubleFunction<java.lang.String>");
				assertEquals(data[24], "java.util.function.IntFunction<java.lang.String>");
				assertEquals(data[25], "java.util.function.LongFunction<java.lang.String>");
				assertEquals(data[26], "java.util.function.DoubleFunction<java.lang.String>");
				assertEquals(data[27], "java.util.function.IntToLongFunction");
				assertEquals(data[28], "java.util.function.IntToDoubleFunction");
				assertEquals(data[29], "java.util.function.LongToIntFunction");
				assertEquals(data[30], "java.util.function.LongToDoubleFunction");
				assertEquals(data[31], "java.util.function.DoubleToIntFunction");
				assertEquals(data[32], "java.util.function.DoubleToLongFunction");
				assertEquals(data[33], "java.util.function.IntUnaryOperator");
				assertEquals(data[34], "java.util.function.LongUnaryOperator");
				assertEquals(data[35], "java.util.function.DoubleUnaryOperator");
				assertEquals(data[36], "java.util.function.IntBinaryOperator");
				assertEquals(data[37], "java.util.function.LongBinaryOperator");
				assertEquals(data[38], "java.util.function.DoubleBinaryOperator");
				assertEquals(data[39], "java.util.function.ObjIntConsumer<java.lang.String>");
				assertEquals(data[40], "java.util.function.ObjLongConsumer<java.lang.String>");
				assertEquals(data[41], "java.util.function.ObjDoubleConsumer<java.lang.String>");
				assertEquals(data[42], "java.util.function.ToIntBiFunction<java.lang.String,java.lang.String>");
				assertEquals(data[43], "java.util.function.ToLongBiFunction<java.lang.String,java.lang.String>");
				assertEquals(data[44], "java.util.function.ToDoubleBiFunction<java.lang.String,java.lang.String>");
				assertEquals(data[45], "java.util.function.IntBiFunction<java.lang.String,java.lang.String>");
				assertEquals(data[46], "java.util.function.LongBiFunction<java.lang.String,java.lang.String>");
				assertEquals(data[47], "java.util.function.DoubleBiFunction<java.lang.String,java.lang.String>");
				assertEquals(data[48], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Integer>");
				assertEquals(data[49], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Long>");
				assertEquals(data[50], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Double>");
				assertEquals(data[51], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Boolean>");
				assertEquals(data[52], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Character>");
				assertEquals(data[53], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Byte>");
				assertEquals(data[54], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Short>");
				assertEquals(data[55], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Float>");
				assertEquals(data[56], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Object>");
				assertEquals(data[57], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Void>");
				assertEquals(data[58], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Number>");
				assertEquals(data[59], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Integer>");
				assertEquals(data[60], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Long>");
				assertEquals(data[61], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Double>");
				assertEquals(data[62], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Boolean>");
				assertEquals(data[63], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Character>");
				assertEquals(data[64], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Byte>");
				assertEquals(data[65], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Short>");
				assertEquals(data[66], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Float>");
				assertEquals(data[67], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Object>");
				assertEquals(data[68], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Void>");
				assertEquals(data[69], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Number>");
				assertEquals(data[70], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Integer>");
				assertEquals(data[71], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Long>");
				assertEquals(data[72], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Double>");
				assertEquals(data[73], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Boolean>");
				assertEquals(data[74], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Character>");
				assertEquals(data[75], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Byte>");
				assertEquals(data[76], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Short>");
				assertEquals(data[77], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Float>");
				assertEquals(data[78], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Object>");
				assertEquals(data[79], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Void>");
				assertEquals(data[80], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Number>");
				assertEquals(data[81], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Integer>");
				assertEquals(data[82], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Long>");
				assertEquals(data[83], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Double>");
				assertEquals(data[84], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Boolean>");
				assertEquals(data[85], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Character>");
				assertEquals(data[86], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Byte>");
				assertEquals(data[87], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Short>");
				assertEquals(data[88], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Float>");
				assertEquals(data[89], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Object>");
				assertEquals(data[90], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Void>");
				assertEquals(data[91], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Number>");
				assertEquals(data[92], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Integer>");
				assertEquals(data[93], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Long>");
				assertEquals(data[94], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Double>");
				assertEquals(data[95], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Boolean>");
				assertEquals(data[96], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Character>");
				assertEquals(data[97], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Byte>");
				assertEquals(data[98], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Short>");
				assertEquals(data[99], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Float>");
				assertEquals(data[100], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Object>");
				assertEquals(data[101], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Void>");
				assertEquals(data[102], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Number>");
				assertEquals(data[103], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Integer>");
				assertEquals(data[104], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Long>");
				assertEquals(data[105], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Double>");
				assertEquals(data[106], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Boolean>");
				assertEquals(data[107], "java.util.function.BiFunction<java.lang.String,java.lang.String,java.lang.Character>");
}
}