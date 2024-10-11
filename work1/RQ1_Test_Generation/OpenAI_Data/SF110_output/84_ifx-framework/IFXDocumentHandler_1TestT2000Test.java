// IFXDocumentHandler_1Test.java
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
class IFXDocumentHandler_1Test {

	/**
	* Test case for {@link IFXDocumentHandler#parse(Document)} method.
	* @throws IFXException if any problems were encountered in parsing.
	*/
	@Test
	void testParse() throws IFXException {
		IFXDocumentHandler ifxDocumentHandler = new IFXDocumentHandler();
		IFXObject ifxObject = ifxDocumentHandler.parse(new Document());
		assertNotNull(ifxObject);
	}
}

// IFXDocumentHandler_2Test.java
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
* It contains ten unit test cases for the {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
*/
class IFXDocumentHandler_2Test {
		
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* @throws IFXExveption if there was a problem reading the document.
	*/
	@Test
	void testRead() throws IFXExveption {
		IFXDocumentHandler ifxDocumentHandler = new IFXDocumentHandler();
		Document doc = ifxDocumentHandler.read(new InputStream(), true, new Map());
		assertNotNull(doc);
	}
}

// IFXDocumentHandler_3Test.java
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
* It contains ten unit test cases for the {@link IFXDocumentHandler#write(Document, int, String, OutputStream)} method.
*/
class IFXDocumentHandler_3Test {
		
	/**
	* Test case for {@link IFXDocumentHandler#write(Document, int, String, OutputStream)} method.
	* @throws IFXException if there was a problem writing the Document.
	*/
	@Test
	void testWrite() throws IFXException {
		IFXDocumentHandler ifxDocumentHandler = new IFXDocumentHandler();
		ifxDocumentHandler.write(new Document(), 0, "", new OutputStream());
	}
}

// IFXDocumentHandler_4Test.java
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
* It contains ten unit test cases for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
*/
class IFXDocumentHandler_4Test {
		
	/**
	* Test case for {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* @throws IFXException if there was a problem building the document.
	*/
	@Test
	void testBuild() throws IFXException {
		IFXDocumentHandler ifxDocumentHandler = new IFXDocumentHandler();
		Document doc = ifxDocumentHandler.build(new IFXObject(), "", "");
		assertNotNull(doc);
	}
}

// IFXDecoder.java
/*
 * $Id: IFXDecoder.java,v 1.2 2004/02/26 17:50:30 spal Exp $
 * $Source: /cvsroot/ifx-framework/code/src/org/sourceforge/ifx/utils/IFXDecoder.java,v $
 * IFX-Framework - IFX XML to JavaBean application framework.
 * Copyright (C) 2003  The IFX-Framework Team
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package org.sourceforge.ifx.utils;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.Attribute;
import org.jdom.Text;
import org.jdom.Comment;
import org.jdom.CDATA;
import org.jdom.ProcessingInstruction;
import org.jdom.EntityRef;
import org.jdom.output.XMLOutputter;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.sourceforge.ifx.basetypes.IFXString;
import org.sourceforge.ifx.basetypes.IFXDate;
import org.sourceforge.ifx.basetypes.IFXDateTime;
import org.sourceforge.ifx.basetypes.IFXTime;
import org.sourceforge.ifx.basetypes.IFXBoolean;
import org.sourceforge.ifx.basetypes.IFXDecimal;
import org.sourceforge.ifx.basetypes.IFXInteger;
import org.sourceforge.ifx.basetypes.IFXLong;
import org.sourceforge.ifx.basetypes.IFXShort;
import org.sourceforge.ifx.basetypes.IFXByte;
import org.sourceforge.ifx.basetypes.IFXFloat;
import org.sourceforge.ifx.basetypes.IFXDouble;
import org.sourceforge.ifx.basetypes.IFXObjectList;
import org.sourceforge.ifx.basetypes.IFXObjectMap;
import org.sourceforge.ifx.basetypes.IFXObjectArray;
import org.sourceforge.ifx.basetypes.IFXAny;
import org.sourceforge.ifx.basetypes.IFXAnySimpleType;
import org.sourceforge.ifx.basetypes.IF