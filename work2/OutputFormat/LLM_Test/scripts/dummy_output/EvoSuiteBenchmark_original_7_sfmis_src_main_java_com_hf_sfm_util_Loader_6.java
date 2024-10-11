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
		
    Object[] table1Args = new Object[] {"dummy1", "dummy2", "dummy3"};

    Object[] table2Args = new Object[] {"dummy1", "dummy2", "dummy3"};

    Object[] table3Args = new Object[] {"dummy1", "dummy2", "dummy3"};

    @Test
    public void test() throws ParseException, DocumentException, HibernateException {
        System.out.println("loading..");
        session = HibernateUtil.getSessionFactory().openSession();
        System.out.println("ok!");

        loadDataWithSql();
        System.out.println("ok!");
        loadDataWithSql();
        System.out.println("ok!");


        System.out.println("1st query: ");
        Query testQuery = session.createQuery("select * from user_tab where (type >= :type order by user_tab.desc is null) limit :limit");

        testQuery.setParameter("type", "1_B");
        testQuery.setParameter("limit", 1);

        System.out.println("2nd query: ");
        testQuery = session.createQuery(testQuery);

        testQuery.setDate("date", new SimpleDateFormat("yyyy-MM-dd").parse("20120612"));
        testQuery.setParameter("date", new SimpleDateFormat("yyyy-MM-dd").parse("20120612"));

        System.out.println("3rd query: ");
        testQuery = session.createQuery("select * from user_tab where (code >= :code and type >= :type order by type, code limit :limit)");

        testQuery.setParameter("type", "1_A");
        testQuery.setDate("date", new SimpleDateFormat("yyyy-MM-dd").parse("20120612"));
        testQuery.setParameter("code", new SimpleDateFormat("yyyy-MM-dd").parse("201206"));
        testQuery.setFirstResult(0);
        testQuery.setMaxResults(2);

        System.out.println("all query: ");
        testQuery = session.createQuery("select * from user_tab where (type >= :type order by type, code limit :limit, date is null)");

        testQuery.setDate("date", new SimpleDateFormat("yyyy-MM-dd").parse("201206"));
        testQuery.setParameter("type", "1_B");
        testQuery.setDate("date", new SimpleDateFormat("yyyy-MM-dd").parse("20120612"));
        testQuery.setDate("date", new SimpleDateFormat("yyyy-MM-dd").parse("20120612"));
        testQuery.setFirstResult(0);
        testQuery.setMaxResults(2);

    }

}