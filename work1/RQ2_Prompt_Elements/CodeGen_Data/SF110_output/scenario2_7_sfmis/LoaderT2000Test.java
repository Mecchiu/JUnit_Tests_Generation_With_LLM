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

    /**
     * 查询数据
     */
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
		/**
		 * 
		 * 
		 * @param pFile
		 * @param pParams
		 * @return
		 */
        public String getParams(String pFile, List<String> pParams){
            String pQuery = null;
            pQuery = pFile + pFile;
            pQuery += "?param1 in (?,?)";
            pQuery += " or ".concat(pFile.charAt(0), pFile.charAt(1));
            pQuery += " order by? order by param1";
            pQuery += ", par1 asc";
            pQuery += "";
            pQuery += "";
            pFile += pFile.charAt(0);
            String[] pAryArray = pFile.split(",");
            List pList = new ArrayList();
            for (int i = 0; i < pAryArray.length; i++) {
                pAryArray[i] = pList.size() + "/?";
                pList.add(pAryArray[i]);
            }
            pQuery = pQuery.concat("," + pFile.charAt(0));
            pParams = pList;
            return pQuery;
        }

    @Test
    public void testDataWithSql() {
        assertTrue("数据没有统计，追加数据", true);
        String pfile = "Data.xml";
//        HibernateUtils.addFile(myUtil, pfile);
        String file = LoaderUtil.FileUtil.getFileByName(pfile);
//        File file = LoaderUtil.FileUtil.getFileByName("Data.xml");
        assertTrue(file, file.exists());
        System.out.println(pfile);
        Element root = null;
        HibernateUtils.init();
        root = new SAXReader().read(file);
        List sql = new ArrayList();
        sql.add("name");
        sql.add("price");
        sql.add("start_time");
        sql.add("end_time");
        Query q = new Query();
        q.setResult(root);
        for (Iterator i = q.iterate(); i.hasNext(); ) {
            Element el = (Element) i.next();
            String param = null;
            List params1 = null;
            params1 = LoaderUtil.setParams(el, sql);
            if (params1!= null) {
                Iterator iter = params1.iterator();
                while (iter.hasNext()) {
                    param = (String) iter.next();
                }
            }
            Element el2 = new Element(el.getName(), LoaderUtil.getType());
            el.add(el2);
            param = param == null? "" : param;
            el2.add(new Element("par1", param));
            param = null;
        }
        String pfile2 = "Tmp2.xml";
        File file2 = LoaderUtil.FileUtil.getFileByName(pfile2);
        assertTrue(file2, file2.exists());
        String xml = LoaderdUtil.toXml(file);
        xml = xml.replaceAll("<", "&lt;");
        xml = xml.replaceAll(">", "&gt;");
        assertTrue(xml, xml.equals(pfile));
        System.out.println("**********" + pfile2 + "************");
        HibernateUtils.dropAll(this.session);
        HibernateUtils.commitTransaction(this.session);
        HibernateUtils.clearCache();
        System.out.println("清除");
        HibernateTemplate template = new HibernateTemplate(this.session);
        template.setMapKeyColumn(3);
        String pFile = "Data.xml";
        System.out.println("**********" + pfile + "************");
        File tempFile = new File("E:/Data");
        String[] sArray2 = tempFile.list();
        for (int i = 0; i < sArray2.length; i++) {
            if (sArray2[i].startsWith("Data")) {
                File path2=new File(this.session.getType(sArray2[i]));
                File path = null;
                try {
                    path = new File(path2,pFile);
                    File file = new File(path,"tmp2");
                    if (path!= null) {
                        template = new DaoTemplate(this.session,this.session.getType("Data2"));
                    } else {
                        template = new DaoTemplate(this.session,this.session.getType("tmp2"));
                    }
                    List<Object> result2 = template.executeFindByExample("Example2.xml",new Object[]{"E_1",2.0+0.0,0.0+1.0,10.0-2.0,5.0+0.0,1.0+0.0=0.0,5.0+0.0=0.0,1.0+1.0=0.0,5.0+1.0=0.0,.0+0.0=0.0,10.0-2.0=1.0,4.0+0.0=11.0"},sArray2[i]);
                    this.setRs(result2);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        HibernateUtils.clearCache();
    }
    
}
