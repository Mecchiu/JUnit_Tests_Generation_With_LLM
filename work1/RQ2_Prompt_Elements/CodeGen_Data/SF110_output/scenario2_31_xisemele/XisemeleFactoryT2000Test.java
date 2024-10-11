// XisemeleFactoryTest.java
package net.sf.xisemele.impl;

import net.sf.xisemele.api.Xisemele;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XisemeleFactory}.
* It contains one unit test case for the {@link XisemeleFactory#newXisemele()} method.
*/
class XisemeleFactoryTest {

	@Test
	void newInstanceOneClassMethodReturnsInstanceOfConstructor() {
        FormatterProviderImpl formatterProvider = new FormatterProviderImpl();
        final XisemeleImpl instance = new XisemeleImpl(formatterProvider);
		// test de newInstance
		assertNotNull("Instance of Class XisemeleImpl must not be null.", instance);
	}
	
	@Test
	void newInstanceNoClassMustReturnNull() {
		assertNull("Instance of XisemeleImpl must return null.",
				new XisemeleFactory().newXisemele());
	}
	
	@Test
	void newInstanceEmptyInstanceMustReturnNull() {
		assertNull("Empty instance of XisemeleImpl must return null.",
				new XisemeleFactory().newXisemele());
	}
	
	@Test
	void newInstanceInstanceOfFactory() {
		FormatterProviderImpl formatterProvider = new FormatterProviderImpl();
            FormatterProviderImpl formatterProvider2 = new FormatterProviderImpl();
            XisemeleFactory factory = new XisemeleFactoryImpl(formatterProvider, formatterProvider2);
            Xisemele instance1 = factory.newXisemele();
            Xisemele instance2 = factory.newXisemele();
            // test de newInstance
            assertNotNull("Instance of Factory must return instance of Factory.",
                    factory);
            assertTrue("Instance of Factory must return an instance of Factory.",
                    instance1 instanceof XisemeleFactory);
            assertTrue("Instance of Factory must return an instance of Factory.",
                    instance2 instanceof XisemeleFactory);
		// test de newInstance
        assertNotNull("Instance of factory must return a new instance of Factory.",
                    factory.newXisemele());
	}
	
	@Test
	void emptyFactoryInstantiationReturnsObject() {
		FormatterProviderImpl formatterProvider = new FormatterProviderImpl();
        FormatterProviderImpl formatterProvider2 = new FormatterProviderImpl();
            XisemeleFactory factory = new XisemeleFactoryImpl(formatterProvider, formatterProvider2);
            Xisemele instance1 = factory.newXisemele();
            Xisemele instance2 = factory.newXisemele();
            // test de newInstance
            assertNotNull("Empty factory must return a new instance of Factory.",
                    factory.newXisemele());
            assertFalse("Empty factory must not return an instance of Factory.",
                    instance1 instanceof XisemeleFactory);
            assertTrue("Empty factory must return an instance of Factory.",
                    instance2 instanceof XisemeleFactory);
	}
	
	@Test
	void multipleInstantiationReturnsMultipleFactory() {
		FormatterProviderImpl formatterProvider = new FormatterProviderImpl();
        FormatterProviderImpl formatterProvider2 = new FormatterProviderImpl();
            XisemeleFactory factory = new XisemeleFactoryImpl(formatterProvider, formatterProvider2);
            Xisemele instance1 = factory.newXisemele();
            Xisemele instance2 = factory.newXisemele();
            // test de newInstance
            assertNotNull("Multiple factory must return multiple instances of Factory.",
                    factory);
            assertNotNull("Non null factory must return a new instance of Factory.",
                    instance1);
            assertTrue("Non null factory must return a new instance of Factory.",
                    instance2 instanceof XisemeleFactory);
	}
}
