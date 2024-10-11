// ObjectFactory_2Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains one unit test case for the {@link ObjectFactory#createPagination()} method.
*/
class ObjectFactory_2Test {
		
	public static class Page {

		private String value;
		
		public Page value(String value) {
			this.value = value;
			return this;
		}
		
		public String getValue() {
			return value;
		}
		
		public void setValue(String value) {
			this.value = value;
		}
	}

	public static class StaticPage {

		private String value;
		
		public StaticPage value(String value) {
			this.value = value;
			return this;
		}
		
		public String getValue() {
			return value;
		}
		
		public void setValue(String value) {
			this.value = value;
		}
	}

	public static class Pagination {

		private String value;
		
		public Pagination value(String value) {
			this.value = value;
			return this;
		}
		
		public String getValue() {
			return value;
		}
		
		public void setValue(String value) {
			this.value = value;
		}
	}

	public static class Pages {

		private String value;
		
		public Pages value(String value) {
			this.value = value;
			return this;
		}
		
		public String getValue() {
			return value;
		}
		
		public void setValue(String value) {
			this.value = value;
		}
	}


	public ObjectFactory() {
	}


	private ObjectFactory_2Test ()
	{
	}

	
	@Test
	public void testPage () throws Exception {
		System.out.println("testPage");
	}

	@Test
	public void testStaticPage () throws Exception {
		System.out.println("testStaticPage");
	}

	@Test
	public void testPagination () throws Exception {
		System.out.println("testPagination");
	}

}