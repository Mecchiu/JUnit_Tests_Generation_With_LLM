// IFXDecoderTest.java
package org.sourceforge.ifx.utils;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.sourceforge.ifx.basetypes.IFXString;
import org.sourceforge.ifx.basetypes.IBaseType;
import org.jdom.Element;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXDecoder}.
* It contains one unit test case for the {@link IFXDecoder#decode(Element)} method.
*/
class IFXDecoderTest {
		private IFXDecoder decoder = new IFXDecoder();

		/**
		 * Gets an instance of {@link IFXDecoder} created in accordance to
		 * the {@link IFXDecoderFactory} provided in {@link #setFactory(IFXDecoderFactory)}.
		 * @return an instance of {@link IFXDecoder} created in accordance to {@link
		 * IFXDecoderFactory}.
		*/
		public static IFXDecoder getIFXDecoder(){
			IFXDecoder decoder = getDecoder();
	        return decoder;
		}
		/**
		  * Gets an instance of {@link IFXDecoder} created by {@link #getFactory()}
		  * after {@link #setFactory(IFXDecoderFactory)}.
		  * @return an instance of {@link IFXDecoder} created by {@link #getFactory()}
		  */
		public static IFXDecoder getDecoder(){
			IFXDecoder decoder = getDecoder(IFXDecoderFactory.getInstance());
			return decoder;
		}

		/**
		 * Gets an instance of {@link IFXDecoder} created by {@link #getFactory()}.
		 * @param factory factory instance.
		 * @return an instance of {@link IFXDecoder} created by {@link #getFactory()}
		 */
		public static IFXDecoder getDecoder(IFXDecoderFactory factory) {
			return factory.getDecoder();
		}

		@Test
	  public void testNull() throws Exception {
	    assertNull(getIFXDecoder().decode(null));
	    assertNull(getIFXDecoder().decode(new Element()));
	  }

	  @Test
	  public void testLoad() throws Exception {
		  IFXDecoder decoder = getIFXDecoder();
	        IFXString name = IFXString.create("NAME");
	        IFXObject obj = decoder.load("name", name);
	        assertEquals(IFXObject.TYPE, obj.getClass());
	        assertEquals("name", string("name"));
	        assertEquals("type", string(obj.getClass().getSimpleName()));
	        assertSame(name, obj.decode(new Element()));
	  }

		@Test
		public void testLoadNull() throws Exception {
			IFXDecoder decoder = getIFXDecoder();
			assertNull(decoder.load("NAME", null));
		}

		@Test
		public void testLoadInDefault() throws Exception {
			IFXDecoder decoder = getIFXDecoder();
			assertSame(decoder, decoder.load("name", "default"));
		}

		@Test
		public void testLoadAccessor() throws Exception {
			IFXDecoder decoder = getIFXDecoder();
			Accessor accessor = decoder.getMutator("name");
			assertSame(accessor, decoder.getAccessor("name"));
			assertSame(accessor, decoder.getMutator("type"));
			assertSame(accessor, decoder.getAccessor("type"));
			assertSame(accessor, decoder.getMutator("type"));
			assertSame(accessor, decoder.getMutator("type"));
			assertSame(accessor, decoder.getAccessor("type"));
			assertNull(decoder.getMutator("wrongName"));
		}


		@Test
		public void testLoadAccessorNull() throws Exception {
			IFXDecoder decoder = getIFXDecoder();
			assertSame(decoder.getAccessor("NAME"), decoder.getMutator("NAME"));
			assertSame(decoder.getAccessor("NAMEOVERRIDE"), decoder.getAccessor("name"));
		}

		@Test
		public void testLoadAccessorWithMissing() throws Exception {
			IFXDecoder decoder = getIFXDecoder();
			assertSame(decoder.getAccessor("TYPE"), decoder.getAccessor("type"));
			assertSame(getIFXString("NAME"), decoder.getAccessor("NAME"));
			assertSame(createBean("TYPE", decoder), decoder.getAccessor("type"));
		}


		@Test
		public void testLoadAccessorAccessorName() throws Exception {
			IFXDecoder decoder = getIFXDecoder();
			assertSame(decoder.getAccessor("NAME"), decoder.getAccessor("NAME"));
			assertNull(decoder.getAccessor("NAMEOVERRIDE"));
		}

}