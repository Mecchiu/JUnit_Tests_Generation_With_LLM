// _CompleteTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Complete}.
* It contains one unit test case for the {@link _Complete#getTypeDesc()} method.
*/
class _CompleteTest {
		private static final java.lang.Class<?> testClass = _Complete.class;
		
	
	
	/**
	 * Test default constructor.
	*/
	@Test
	public void testDefaultConstructor(){
		_Complete test = new _Complete();
		assertEquals(test.getTypeDesc(), test);
	}
	
	/**
	 * Constructor under test.
	 * The constructor is not protected by default.
	 * @param mock a mock {@link javax.xml.bind.Mock}
	 * @throws Exception if an error happens
	 */
	protected _Complete(javax.xml.bind.Mock mock) throws Exception {
		super();
		// TODO add your own test code.
	}

	/**
	 * Test serialization.
	 */
	@Test
	public void testSerialization() throws javax.xml.bind.BinderException {
		try {
			javax.xml.bind.Marshaller marshaller = javax.xml.bind.Marshaller.newInstance(new javax.xml.bind.Unmarshaller(), null);
			io.aos._ObjectInput in = javax.xml.bind.Bind._createObjectInputStream(marshaller.getJAXBContext(), new java.io.ByteArrayInputStream(new byte[] { 12, 34, 56 }));
			in.setProperty(org.apache.axis.encoding.SerializationInfo.ALWAYS_USE_PROPERTY, Boolean.TRUE);
			//_Complete deserialized = (org.apache.axis.encoding.Serializable)
			assertEquals(new org.apache.axis.encoding.SerializableImpl(), marshaller.unmarshall(in));
		} catch (java.text.ParseException e) {
			throw new javax.xml.bind.BinderException(e);
		}	
	}
}