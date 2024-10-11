// XmlElement_3Test.java
package com.allenstudio.ir.util;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlElement}.
* It contains one unit test case for the {@link XmlElement#addSubElement(String, String)} method.
*/
class XmlElement_3Test {
		
	private class Foo {
		
			public String s;
			public int b;
			
			public void test() {
				Enumeration<?> enumeration = this.getClass().getField("s").getAnnotations();
				while (enumeration.hasMoreElements()) {
					assertTrue((Boolean) enumeration.nextElement() instanceof AnnotationElement);
				}
			}
		}
		
		@Test
		public void test() {
			
		}
		
	}
	
	public static final class AnnotationElement {
		
		private String c;
		private Boolean d;
		
		private String e;

		private List<BarElement> f;
		
		public void test() {
			
		}
	}
	
	public static class BarElement {
		
		private List<ElementChild> e;
		
		public void test() {
			
		}
}