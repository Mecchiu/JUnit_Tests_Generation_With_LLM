/*
 Copyright 2007 DB-Everywhere
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at
 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package com.gbshape.dbe.xml;

import java.io.File;

import org.apache.commons.digester.Digester;

public final class DBEDigester {

	public static DBEXmlBean parseXML(String xml) {

		DBEXmlBean dXmlBean = null;

		try {
			Digester digester = new Digester();
			digester.setValidating(false);

			digester.addObjectCreate("dbe", DBEXmlBean.class);

			digester.addObjectCreate("dbe/createTable", CreateTableXmlBean.class);
			digester.addBeanPropertySetter("dbe/createTable/name", "name");
			digester.addSetNext("dbe/createTable", "addCreateTable");

			File input = new File("test.xml");
			dXmlBean = (DBEXmlBean) digester.parse(input);

		} catch (Exception exc) {
			exc.printStackTrace();
		}

		return dXmlBean;
	}

}
