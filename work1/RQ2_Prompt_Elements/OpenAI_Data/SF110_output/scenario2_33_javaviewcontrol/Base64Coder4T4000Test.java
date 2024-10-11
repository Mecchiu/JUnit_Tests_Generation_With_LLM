// Base64CoderTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decode(String)} method.
*/
class Base64CoderTest {

	@Test
	void testDecode() {
		String s = "";
		byte[] b = Base64Coder.decode(s);
		assertEquals(0, b.length);
		
		s = "YQ==";
		b = Base64Coder.decode(s);
		assertEquals(1, b.length);
		assertEquals(0, b[0]);
		
		s = "YWI=";
		b = Base64Coder.decode(s);
		assertEquals(2, b.length);
		assertEquals(0, b[0]);
		assertEquals(1, b[1]);
		
		s = "YWJj";
		b = Base64Coder.decode(s);
		assertEquals(3, b.length);
		assertEquals(0, b[0]);
		assertEquals(1, b[1]);
		assertEquals(2, b[2]);
		
		s = "YWJjZA==";
		b = Base64Coder.decode(s);
		assertEquals(4, b.length);
		assertEquals(0, b[0]);
		assertEquals(1, b[1]);
		assertEquals(2, b[2]);
		assertEquals(3, b[3]);
		
		s = "YWJjZGU=";
		b = Base64Coder.decode(s);
		assertEquals(5, b.length);
		assertEquals(0, b[0]);
		assertEquals(1, b[1]);
		assertEquals(2, b[2]);
		assertEquals(3, b[3]);
		assertEquals(4, b[4]);
		
		s = "YWJjZGVm";
		b = Base64Coder.decode(s);
		assertEquals(6, b.length);
		assertEquals(0, b[0]);
		assertEquals(1, b[1]);
		assertEquals(2, b[2]);
		assertEquals(3, b[3]);
		assertEquals(4, b[4]);
		assertEquals(5, b[5]);
		
		s = "YWJjZGVmZw==";
		b = Base64Coder.decode(s);
		assertEquals(7, b.length);
		assertEquals(0, b[0]);
		assertEquals(1, b[1]);
		assertEquals(2, b[2]);
		assertEquals(3, b[3]);
		assertEquals(4, b[4]);
		assertEquals(5, b[5]);
		assertEquals(6, b[6]);
		
		s = "YWJjZGVmZ2g=";
		b = Base64Coder.decode(s);
		assertEquals(8, b.length);
		assertEquals(0, b[0]);
		assertEquals(1, b[1]);
		assertEquals(2, b[2]);
		assertEquals(3, b[3]);
		assertEquals(4, b[4]);
		assertEquals(5, b[5]);
		assertEquals(6, b[6]);
		assertEquals(7, b[7]);
		
		s = "YWJjZGVmZ2hp";
		b = Base64Coder.decode(s);
		assertEquals(9, b.length);
		assertEquals(0, b[0]);
		assertEquals(1, b[1]);
		assertEquals(2, b[2]);
		assertEquals(3, b[3]);
		assertEquals(4, b[4]);
		assertEquals(5, b[5]);
		assertEquals(6, b[6]);
		assertEquals(7, b[7]);
		assertEquals(8, b[8]);
		
		s = "YWJjZGVmZ2hpag==";
		b = Base64Coder.decode(s);
		assertEquals(10, b.length);
		assertEquals(0, b[0]);
		assertEquals(1, b[1]);
		assertEquals(2, b[2]);
		assertEquals(3, b[3]);
		assertEquals(4, b[4]);
		assertEquals(5, b[5]);
		assertEquals(6, b[6]);
		assertEquals(7, b[7]);
		assertEquals(8, b[8]);
		assertEquals(9, b[9]);
	}
}

// Base64CoderTest.java
package com.pmdesigns.jvc.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decode(String)} method.
*/
class Base64CoderTest {
		
	@Test
	void testDecode() {
		String s = "";
		byte[] b = Base64Coder.decode(s);
		assertEquals(0, b.length);
		
		s = "YQ==";
		b = Base64Coder.decode(s);
		assertEquals(1, b.length);
		assertEquals(0, b[0]);
		
		s = "YWI=";
		b = Base64Coder.decode(s);
		assertEquals(2, b.length);
		assertEquals(0, b[0]);
		assertEquals(1, b[1]);
		
		s = "YWJj";
		b = Base64Coder.decode(s);
		assertEquals(3, b.length);
		assertEquals(0, b[0]);
		assertEquals(1, b[1]);
		assertEquals(2, b[2]);
		
		s = "YWJjZA==";
		b = Base64Coder.decode(s);
		assertEquals(4, b.length);
		assertEquals(0, b[0]);
		assertEquals(1, b[1]);
		assertEquals(2, b[2]);
		assertEquals(3, b[3]);
		
		s = "YWJjZGU=";
		b = Base64Coder.decode(s);
		assertEquals(5, b.length);
		assertEquals(0, b[0]);
		assertEquals(1, b[1]);
		assertEquals(2, b[2]);
		assertEquals(3, b[3]);
		assertEquals(4, b[4]);
		
		s = "YWJjZGVm";
		b = Base64Coder.decode(s);
		assertEquals(6, b.length);
		assertEquals(0, b[0]);
		assertEquals(1, b[1]);
		assertEquals(2, b[2]);
		assertEquals(3, b[3]);
		assertEquals(4, b[4]);
		assertEquals(5, b[5]);
		
		s = "YWJjZGVmZw==";
		b = Base64Coder.decode(s);
		assertEquals(7, b.length);
		assertEquals(0, b[0]);
		assertEquals(1, b[1]);
		assertEquals(2, b[2]);
		assertEquals(3, b[3]);
		assertEquals(4, b[4]);
		assertEquals(5, b[5]);
		assertEquals(6, b[6]);
		
		s = "YWJjZGVmZ2g=";
		b = Base64Coder.decode(s);
		assertEquals(8, b.length);
		assertEquals(0, b[0]);
		assertEquals(1, b[1]);
		assertEquals(2, b[2]);
		assertEquals(3, b[3]);
		assertEquals(4, b[4]);
		assertEquals(5, b[5]);
		assertEquals(6, b[6]);
		assertEquals(7, b[7]);
		
		s = "YWJjZGVmZ2hp";
		b = Base64Coder.decode(s);
		assertEquals(9, b.length);
		assertEquals(0, b[0]);
		assertEquals(1, b[1]);
		assertEquals(2, b[2]);
		assertEquals(3, b[3]);
		assertEquals(4, b[4]);
		assertEquals(5, b[5]);
		assertEquals(6, b[6]);
		assertEquals(7, b[7]);
		assertEquals(8, b[8]);
		
		s = "YWJjZGVmZ2hpag==";
		b = Base64Coder.decode(s);
		assertEquals(10, b.length);
		assertEquals(0, b[0]);
		assertEquals(1, b[1]);
		assertEquals(2, b[2]);
		assertEquals(3, b[3]);
		assertEquals(4, b[4]);
		assertEquals(5, b[5]);
		assertEquals(6, b[6]);
		assertEquals(7, b[7]);
		assertEquals(8, b[8]);
		assertEquals(9, b[9]);
	}
}

// Base64CoderTest.java
package com.pmdesigns.jvc.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decode(String)} method.
*/
class Base64CoderTest {
		
	@Test
	void testDecode() {
		String s = "";
		byte[] b = Base64Coder.decode(s);
		assertEquals(0, b.length);
		
		s = "YQ==";
		b = Base64Coder.decode(s);
		assertEquals(1, b.length);
		assertEquals(0, b[0]);
		
		s = "YWI=";
		b = Base64Coder.decode(s);
		assertEquals(2, b.length);
		assertEquals(0, b[0]);
		assertEquals(1, b[1]);
		
		s = "YWJj";
		b = Base64Coder.decode(s);
		assertEquals(3, b.length);
		assertEquals(0, b[0]);
		assertEquals(1, b[1]);
		assertEquals(2, b[2]);
		
		s = "YWJjZA==";
		b = Base64Coder.decode(s);
		assertEquals(4, b.length);
		assertEquals(0, b[0]);
		assertEquals(1, b[1]);
		assertEquals(2, b[2]);
		assertEquals(3, b[3]);
		
		s = "YWJjZGU=";
		b = Base64Coder.decode(s);
		assertEquals(5, b.length);
		assertEquals(0, b[0]);
		assertEquals(1, b[1]);
		assertEquals(2, b[2]);
		assertEquals(3, b[3]);
		assertEquals(4, b[4]);
		
		s = "YWJjZGVm";
		b = Base64Coder.decode(s);
		assertEquals(6, b.length);
		assertEquals(0, b[0]);
		assertEquals(1, b[1]);
		assertEquals(2, b[2]);
		assertEquals(3, b[3]);
		assertEquals(4, b[4]);
		assertEquals(5, b[5]);
		
		s = "YWJjZGVmZw==";
		b = Base64Coder.decode(s);
		assertEquals(7, b.length);
		assertEquals(0, b[0]);
		assertEquals(1, b[1]);
		assertEquals(2, b[2]);
		assertEquals(3, b[3]);
		assertEquals(4, b[4]);
		assertEquals(5, b[5]);
		assertEquals(6, b[6]);
		
		s = "YWJjZGVmZ2g=";
		b = Base64Coder.decode(s);
		assertEquals(8, b.length);
		assertEquals(0, b[0]);
		assertEquals(1, b[1]);
		assertEquals(2, b[2]);
		assertEquals(3, b[3]);
		assertEquals(4, b[4]);
		assertEquals(5, b[5]);
		assertEquals(6, b[6]);
		assertEquals(7, b[7]);
		
		s = "YWJjZGVmZ2hp";
		b = Base64Coder.decode(s);
		assertEquals(9, b.length);
		assertEquals(0, b[0]);
		assertEquals(1, b[1]);
		assertEquals(2, b[2]);
		assertEquals(3, b[3]);
		assertEquals(4, b[4]);
		assertEquals(5, b[5]);
		assertEquals(6, b[6]);
		assertEquals(7, b[7]);
		assertEquals(8, b[8]);
		
		s = "YWJjZGVmZ2hpag==";
		b = Base64Coder.decode(s);
		assertEquals(10, b.length);
		assertEquals(0, b[0]);
		assertEquals(1, b[1]);
		assertEquals(2, b[2]);
		assertEquals(3, b[3]);
		assertEquals(4, b[4]);
		assertEquals(5, b[5]);
		assertEquals(6, b[6]);
		assertEquals(7, b[7]);
		assertEquals(8, b[8]);
		assertEquals(9, b[9]);
	}
}

// Base64CoderTest.java
package com.pmdesigns.jvc.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decode(String)} method.
*/
class Base64CoderTest {
		
