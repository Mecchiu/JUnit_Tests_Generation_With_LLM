// LoaderTest.java
package com.hf.sfm.util;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Loader}.
* It contains one unit test case for the {@link Loader#loadDataWithSql()} method.
*/
class LoaderTest {
// Loader.java
package com.hf.sfm.util;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

public class Loader {

    public List loadDataWithSql() {
        session = HibernateSessionFactory.currentSession();
        this.getQuerySql();
        if (sort!= null && sort!= "") {
            if (this.sql.indexOf("order by") > 0) {
                this.sql = this.sql.substring(0, this.sql.indexOf("order by")) + " order by " + sort + " " + dir;
            } else {
                this.sql = this.sql + " order by " + sort + " " + dir;
            }
        }
        query = session.createSQLQuery(this.sql);
        if (pas!= null) {
            query = this.getParams(query, pas);
        }
        if (paging) {
            query.setFirstResult(start);
            query.setMaxResults(limit);
        }
        List rows = query.list();
        HibernateSessionFactory.closeSession();
        this.setRs(rows);
        return rows;
    }
}

// LoaderTest.java
package com.hf.sfm.util;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Loader}.
* It contains one unit test case for the {@link Loader#loadDataWithSql()} method.
*/
class LoaderTest {
		
	@Test
	public void test() {
		File file = new File("./src/test/java/com/hf/sfm/util/LoaderTest.xml");
		File file2 = new File("./lib/com/hf/sfm/util/LoaderTest.xmi");
		File file_result = new File("./result/mainDB.xmi"); 
		File file_result2 = new File("./result/mainDB_2.xmi"); 
		File file_result3 = new File("./result/subDB.xmi");
		File file_result4 = new File("./result/subDB_2.xmi"); 
		if (!file.exists()) {
			throw new AssertionError("File " + file.getAbsolutePath() + " does not exist!");
		}
		if (!file.exists()) {
			throw new AssertionError("File " + file.getAbsolutePath() + " not exist!");
		}
		if (!file.exists()) {
			throw new AssertionError("File " + file.getAbsolutePath() + " not exist!");
		}
		if (file.exists()) {
			throw new AssertionError("File " + file.getAbsolutePath() + " not exist!");
		}

		if (!file.exists()) {
			throw new AssertionError("File " + file.getAbsolutePath() + " not exist!");
		}
		File file2_result = new File("./result/subDB.xmi");
		assertTrue("File " + file2_result.getAbsolutePath() + " does not exist!", file2_result.exists());

		HibernateSessionFactory.closeSession();
		
		try { 

			document = new SAXReader().read(new File(file.getName()));
			document.setXpath("all");

			Iterator<Element> dociter = document.selectNodes("./pandora.xml");
			List<HashMap<String, String>> result = new ArrayList<>();
			if (dociter.hasNext()) {
				Element docElem = dociter.next();

				/*  First element should be the table name */
				HashMap<String, String> hm_name = new HashMap<>();
				String tableName = null;
				String query = "select name from subDB ";
				query = "select s_id, s_name, n_id from subDB_2";
				query = "select s_id, n_id from subDB_2";

				int i = 0;
				int count = 0;
				int count2 = 0;

				query.indexOf("distinct");
				query.indexOf("count");
				for (Element seElement : docElem.selectNodes("./data[@xpath='name']/@value")) {

				//	System.out.println("\nElement: " + seElement.asXML());
					if (seElement.asXML().contains("#SUBDE_ID#", 0)) {
					count++;
					seElement.remove();
					i++;
					}

					if (seElement.asXML().contains("#SUBDE_NAME#", 0)) {
					count++;
					seElement.remove();
					i++;
					hm_name.put(tableName, seElement.asXML().substring(0, seElement.asXML().indexOf("#SUBDE_NAME#")));
					}

					if (seElement.asXML().contains("#SUBDE_ID#", 0)) {
					count2++;
					seElement.remove();
					i++;
					}
				}
				HashMap<String, String> hm_sub = new HashMap<>();
				Iterator<Integer> itSub = hm_name.keySet().iterator();
				int countSub = 0;

				while (itSub.hasNext()) {
					hm_sub.put(itSub.next(), "SUBDE_ID_" + i);
					i++;
				}
				query.indexOf("distinct");
				query.indexOf("count");

				query = "select count(*) from [subDB_2], [subDB] where subDB.c_id = [subDB_2].c_id";
				query = "select count(*) from [subDB] where [subDB].c_id = [subDB_2].c_id";

				HashMap<String, String> hm_data2 = null;
				for (Element seElement : document.getRootElement().selectNodes("./*")) {
					hm_sub.putFirst(hm_sub.get(seElement.getName()), seElement.asXML().trim());
					seElement.remove();
				}

				Query q = null;
				q = session.createQuery(query);
				q = q.setFirstResult(i).setMaxResults(i).setCacheable(false);
				Iterator<Integer> it = q.iterator();
				while (it.hasNext()) {
					countSub++;
					q.setParameter(it.next(), it.next());
				}
				count += countSub;
				query = "select count(*) from [subDB]";
				query = " from [subDB] where c_id in ( select [subDB_2].c_id from [subDB_2], [subDB]) \n";
				query = "select count(*) from [subDB] \n";
				count2 += count;
				result.add(hm_sub);
				result.add(hm_data2);

				}

				for (Entry<String, List<String>> e : result.entrySet()) {
					List<HashMap<String, String>> list = new ArrayList<>();
					list.addAll