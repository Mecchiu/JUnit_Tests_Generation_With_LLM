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
		
    private class LoadParseFom1 extends LoaderParse {

        public final static boolean LOAD_SQL = true;
        public final static boolean LOAD_DATA = false;
        public final static int MAX_PARAM = 2;

        public LoadParse1 build(File directory, String ssql) {
        	return null;
        }

        public void parse(File directory, String sql) throws ParseException {
        	super.parse(directory, sql);
        	this.getSql().add(sql);
        }
    }

    private class LoadParseFom2 extends LoaderParse {

        public final static boolean LOAD_SQL = false;
        public final static boolean LOAD_DATA = true;
        public final static int MAX_PARAM = 2;

        public LoadParse2 build(File directory, String ssql) {
            return null;
        }

        public void parse(File directory, String sql) throws ParseException {
            super.parse(directory, sql);
        }
    }

    /**
     *
     * 一个测试以可考虑地纬度记录的问题:
     * - 实现默认渲染函数
     * - 实现可被帮助函数渲染函数
     * - 创建SQL 插件
     *
     * @throws ParseException 
     */
    @Test
    public void testParse() throws ParseException {
        String sql = "select x from customer where  \n"
                + "p.from = 'a.idx_list' \n"
                + "and  \n"
                + "     p.from = 2";
        String[][] params = new String[0][0];
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        querySql = sql;
        query.setInt(0, 1);
        rs = session.createQuery(querySql)
               .addEntity(Customer.class)
               .setString(0, "a.idx_list")
               .setInt(1, 2);
        sql = sql.replace("from = ", "");

        loadParse1 = new LoadParseFom1();
        loadParse1.parse(SAXReader.use(new SAXReader(sa)).parseURI(XMLPATH+"1.xml"));

        loadParse2 = new LoadParseFom2();
        loadParse2.parse(SAXReader.use(new SAXReader(sa)).parseURI(XMLPATH+"2.xml"));
        
    }

    public void setQuery(String s) {
        querySql = s;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public void setDirpath(String dirpath) {
        this.dirpath = dirpath;
    }

    public String getQuerySql() {
        return querySql;
    }

    public void setQuerySql(String querySql) {
        this.querySql = querySql;
    }

    public String getQueryValue() {
        return queryValue;
    }

    public void setQueryValue(String queryValue) {
        this.queryValue = queryValue;
    }

    public void setQuery(String[] params) {
        for (String param : params) {
            this.setQuerySql(this.querySql + String.format(param, "%d"));
        }
    }

    public void setParams(String[][] params) {
        this.pas = new String[params.length][colNames.length];
        for (int i = 0; i < params.length; i++) {
            paras = params[i];
            for (int j = 0; j < colNames.length; j++) {
                this.pas[i][j] = paras[j];
            }
        }
    }

    public void setColNames(String[] colNames) {
        this.colNames = colNames;
    }

    public List[] getRowset() {
        List[] list = new ArrayList[2];
        list[0] = rs;
        list[1] = new ArrayList();
        return list;
    }
}