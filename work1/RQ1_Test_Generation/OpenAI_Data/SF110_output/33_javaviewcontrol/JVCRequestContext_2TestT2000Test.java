// JVCRequestContext_2Test.java
package com.pmdesigns.jvc;

import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JVCRequestContext}.
* It contains ten unit test cases for the {@link JVCRequestContext#getParamValues(String)} method.
*/
class JVCRequestContext_2Test {

		@Test
		void testGetParamValues_1() {
				// test case 1
				// input:
				//   name = "foo"
				//   params = { "foo" => "bar" }
				// expected output:
				//   values = { "bar" }
				String name = "foo";
				String[] params = { "foo" };
				String[] values = { "bar" };
				assertArrayEquals(values, JVCRequestContext.getParamValues(name, params));
		}
		
		@Test
		void testGetParamValues_2() {
				// test case 2
				// input:
				//   name = "foo"
				//   params = { "foo" => "bar", "foo" => "baz" }
				// expected output:
				//   values = { "bar", "baz" }
				String name = "foo";
				String[] params = { "foo", "foo" };
				String[] values = { "bar", "baz" };
				assertArrayEquals(values, JVCRequestContext.getParamValues(name, params));
		}
		
		@Test
		void testGetParamValues_3() {
				// test case 3
				// input:
				//   name = "foo"
				//   params = { "foo" => "bar", "foo" => "baz", "foo" => "qux" }
				// expected output:
				//   values = { "bar", "baz", "qux" }
				String name = "foo";
				String[] params = { "foo", "foo", "foo" };
				String[] values = { "bar", "baz", "qux" };
				assertArrayEquals(values, JVCRequestContext.getParamValues(name, params));
		}
		
		@Test
		void testGetParamValues_4() {
				// test case 4
				// input:
				//   name = "foo"
				//   params = { "foo" => "bar", "foo" => "baz", "foo" => "qux", "foo" => "quux" }
				// expected output:
				//   values = { "bar", "baz", "qux", "quux" }
				String name = "foo";
				String[] params = { "foo", "foo", "foo", "foo" };
				String[] values = { "bar", "baz", "qux", "quux" };
				assertArrayEquals(values, JVCRequestContext.getParamValues(name, params));
		}
		
		@Test
		void testGetParamValues_5() {
				// test case 5
				// input:
				//   name = "foo"
				//   params = { "foo" => "bar", "foo" => "baz", "foo" => "qux", "foo" => "quux", "foo" => "corge" }
				// expected output:
				//   values = { "bar", "baz", "qux", "quux", "corge" }
				String name = "foo";
				String[] params = { "foo", "foo", "foo", "foo", "foo" };
				String[] values = { "bar", "baz", "qux", "quux", "corge" };
				assertArrayEquals(values, JVCRequestContext.getParamValues(name, params));
		}
		
		@Test
		void testGetParamValues_6() {
				// test case 6
				// input:
				//   name = "foo"
				//   params = { "foo" => "bar", "foo" => "baz", "foo" => "qux", "foo" => "quux", "foo" => "corge", "foo" => "grault" }
				// expected output:
				//   values = { "bar", "baz", "qux", "quux", "corge", "grault" }
				String name = "foo";
				String[] params = { "foo", "foo", "foo", "foo", "foo", "foo" };
				String[] values = { "bar", "baz", "qux", "quux", "corge", "grault" };
				assertArrayEquals(values, JVCRequestContext.getParamValues(name, params));
		}
		
		@Test
		void testGetParamValues_7() {
				// test case 7
				// input:
				//   name = "foo"
				//   params = { "foo" => "bar", "foo" => "baz", "foo" => "qux", "foo" => "quux", "foo" => "corge", "foo" => "grault", "foo" => "garply" }
				// expected output:
				//   values = { "bar", "baz", "qux", "quux", "corge", "grault", "garply" }
				String name = "foo";
				String[] params = { "foo", "foo", "foo", "foo", "foo", "foo", "foo" };
				String[] values = { "bar", "baz", "qux", "quux", "corge", "grault", "garply" };
				assertArrayEquals(values, JVCRequestContext.getParamValues(name, params));
		}
		
		@Test
		void testGetParamValues_8() {
				// test case 8
				// input:
				//   name = "foo"
				//   params = { "foo" => "bar", "foo" => "baz", "foo" => "qux", "foo" => "quux", "foo" => "corge", "foo" => "grault", "foo" => "garply", "foo" => "waldo" }
				// expected output:
				//   values = { "bar", "baz", "qux", "quux", "corge", "grault", "garply", "waldo" }
				String name = "foo";
				String[] params = { "foo", "foo", "foo", "foo", "foo", "foo", "foo", "foo" };
				String[] values = { "bar", "baz", "qux", "quux", "corge", "grault", "garply", "waldo" };
				assertArrayEquals(values, JVCRequestContext.getParamValues(name, params));
		}
		
		@Test
		void testGetParamValues_9() {
				// test case 9
				// input:
				//   name = "foo"
				//   params = { "foo" => "bar", "foo" => "baz", "foo" => "qux", "foo" => "quux", "foo" => "corge", "foo" => "grault", "foo" => "garply", "foo" => "waldo", "foo" => "fred" }
				// expected output:
				//   values = { "bar", "baz", "qux", "quux", "corge", "grault", "garply", "waldo", "fred" }
				String name = "foo";
				String[] params = { "foo