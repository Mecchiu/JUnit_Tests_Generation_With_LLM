// _SetEngineInfoResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfoResponse}.
* It contains one unit test case for the {@link _SetEngineInfoResponse#getTypeDesc()} method.
*/
class _SetEngineInfoResponseTest {

	private static final byte[] testOID = new byte[] {
            (byte) 0x00, (byte) 0x00, (byte) 0x0C, (byte) 0x00, (byte) 0x0A, (byte) 0x00, (byte) 0x15, (byte) 0x00, (byte) 0x9E,
            (byte) 0x9C, (byte) 0x9E, (byte) 0xAC, (byte) 0x00, (byte) 0x00, (byte) 0x08, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x6A, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x08, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x6A, (byte) 0x00, (byte) 0x7F, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x78, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x18, (byte) 0x00, (byte) 0x01, (byte) 0x80, (byte) 0x01
	};

	static org.junit.Assert.assertEquals(org.apache.axis.encoding.EElementImpl.class, engineInfoResponse.getSchemaElementImplClass());
	static org.junit.Assert.assertEquals(org.javamoney.util.concur.common.Money.class, money.getSchemaElementImplClass());
	static {
		org.javamoney.util.concur.common.Money moneyImpl = null;
		try {
			moneyImpl = (org.javamoney.util.concur.common.Money) org.apache.axis.soap.SOAPEnvelope.getInvokingInstance().getSchemaElementByName("money").getContents().get(0);
			org.apache.axis.types.URI testOIDImpl = new org.apache.axis.types.URIImpl(org.zstack.sdk.v1.String.class, engineInfoResponse.getOID());
			org.junit.Assert.assertEquals(testOID, testOIDImpl.getValue());
		} catch (java.lang.Exception ex) {
			org.junit.Assert.assertTrue(ex instanceof org.javamoney.util.concur.common.MoneyException);
		}
	}
}
