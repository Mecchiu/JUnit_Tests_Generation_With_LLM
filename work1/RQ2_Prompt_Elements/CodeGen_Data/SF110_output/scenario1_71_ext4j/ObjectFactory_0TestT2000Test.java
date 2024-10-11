// ObjectFactory_0Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains one unit test case for the {@link ObjectFactory#createPage()} method.
*/
class ObjectFactory_0Test {

	private final static String ELEMENT = "page";
	private final static String ATTRIBUTE = "_page";
	private final static String VALUE = "pagina";

	/**
	 * This is the table of test cases.
	 */
	static final String SCHEMA1 = "urn:com:tripfilms:os:pagination:2009-09-02T13:06:00.020Z";
	static final String SCHEMA2 = SchemaFactory.ANNOTATION_SCHEMA$;
	static final String SCHEMA3 = "urn:com:tripfilms:os:pagination:2009-09-02T13:06:00.020Z";
	static final String SCHEMA4 = "urn:exttaglib:pagination-2";
	
	private Class<?> classe;
	private String name;
	@Test
	public void test() {
		classe = ObjectFactory.createPage().getClass();
		name = classe.getSimpleName();
		assertEquals("com.tripfilms.os.exttaglib.pagination.datatype.ObjectFactory_0Test", name);
		assertSame(ObjectFactory.createPage().getClass(), classe);
	}
	
	/**
	 * This is the {@link ObjectFactory#createPage()} method.
	 */
	@Test
	public void testPage() {
		classe = ObjectFactory.createPage().getClass();
		name = classe.getSimpleName();
		assertEquals("com.tripfilms.os.exttaglib.pagination.datatype.ObjectFactory_0Test$1", name);
		assertSame(ObjectFactory.createPage().getClass(), classe);
		try {
			ObjectFactory.createPage();
			fail("ObjectFactory.createPage() cannot create this type of instance.");
		} catch (Exception exception) {
	}
//		assertSame(ObjectFactory.createPage().createPage(), classe.newInstance());

		assertSame(classe, classe.getSuperclass());
	}
	private static class Page extends TypeAdapter<ObjectFactory.Page> {
		public ObjectFactory.Page create(Class<?> type) {
			return type.newInstance();
		}
	}
}