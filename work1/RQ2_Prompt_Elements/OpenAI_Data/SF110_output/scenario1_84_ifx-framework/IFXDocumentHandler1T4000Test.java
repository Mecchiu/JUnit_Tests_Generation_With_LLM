// IFXDocumentHandlerTest.java
package org.sourceforge.ifx.utils;

import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Iterator;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXDocumentHandler}.
* It contains ten unit test cases for the {@link IFXDocumentHandler#parse(Document)} method.
*/
class IFXDocumentHandlerTest {

	@Test
	void testParse() throws IFXException {
		IFXObject ifxObject = IFXDocumentHandler.parse(getDocument("/ifx/ifx-1.0.xml"));
		assertNotNull(ifxObject);
		assertEquals("1.0", ifxObject.getVersion());
		assertEquals("1.0", ifxObject.getHeader().getVersion());
		assertEquals("1.0", ifxObject.getBody().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getCustId().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getCustLangPref().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecCtrlIn().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNamePrefix().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getGivenName().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getMiddleName().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getFamilyName().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getGeneration().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameSuffix().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameTitle().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine1().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine2().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine3().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine4().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine5().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine6().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine7().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine8().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine9().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine10().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine11().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine12().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine13().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine14().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine15().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine16().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine17().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine18().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine19().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine20().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine21().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine22().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine23().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine24().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine25().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine26().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine27().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine28().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine29().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine30().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine31().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine32().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine33().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine34().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine35().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine36().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine37().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine38().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine39().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine40().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine41().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine42().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine43().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine44().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine45().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine46().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getNameFullLine().getNameFullLine47().getVersion());
		assertEquals("1.0", ifxObject.getBody().getRequest().getCustomerInqRq().getRecSelect().getCustRec().getCustInfo().getPersonName().getNameFull().getName