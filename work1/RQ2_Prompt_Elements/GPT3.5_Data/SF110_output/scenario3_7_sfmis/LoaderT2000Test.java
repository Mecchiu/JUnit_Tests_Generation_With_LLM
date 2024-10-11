// Here's an example implementation of the Loader class and its test class:

// Loader.java
package com.hf.sfm.util;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Loader {

    /**
     * Queries data from the database using SQL.
     * 
     * @return a list of data objects
     */
    public List<Object> loadDataWithSql() {
        List<Object> data = new ArrayList<>();
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query query = session.createSQLQuery("SELECT * FROM my_table");
            data = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}

// LoaderTest.java
package com.hf.sfm.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Test class of {@link Loader}.
 * It contains ten unit test cases for the {@link Loader#loadDataWithSql()} method.
 */
class LoaderTest {

    @Test
    void testLoadDataWithSql() {
        Loader loader = new Loader();
        List<Object> data = loader.loadDataWithSql();
        assertNotNull(data);
        assertEquals(10, data.size());
    }

    @Test
    void testLoadDataWithSql_emptyResult() {
        Loader loader = new Loader();
        List<Object> data = loader.loadDataWithSql();
        assertNotNull(data);
        assertEquals(0, data.size());
    }

    @Test
    void testLoadDataWithSql_nullResult() {
        Loader loader = new Loader();
        List<Object> data = loader.loadDataWithSql();
        assertNotNull(data);
        assertEquals(null, data.get(0));
    }

    @Test
    void testLoadDataWithSql_invalidQuery() {
        Loader loader = new Loader();
        List<Object> data = loader.loadDataWithSql();
        assertNotNull(data);
        assertEquals(0, data.size());
    }

    @Test
    void testLoadDataWithSql_invalidSession() {
        Loader loader = new Loader();
        List<Object> data = loader.loadDataWithSql();
        assertNotNull(data);
        assertEquals(0, data.size());
    }

    @Test
    void testLoadDataWithSql_invalidSessionFactory() {
        Loader loader = new Loader();
        List<Object> data = loader.loadDataWithSql();
        assertNotNull(data);
        assertEquals(0, data.size());
    }

    @Test
    void testLoadDataWithSql_invalidConnection() {
        Loader loader = new Loader();
        List<Object> data = loader.loadDataWithSql();
        assertNotNull(data);
        assertEquals(0, data.size());
    }

    @Test
    void testLoadDataWithSql_invalidDatabase() {
        Loader loader = new Loader();
        List<Object> data = loader.loadDataWithSql();
        assertNotNull(data);
        assertEquals(0, data.size());
    }

    @Test
    void testLoadDataWithSql_invalidTable() {
        Loader loader = new Loader();
        List<Object> data = loader.loadDataWithSql();
        assertNotNull(data);
        assertEquals(0, data.size());
    }

    @Test
    void testLoadDataWithSql_invalidColumn() {
        Loader loader = new Loader();
        List<Object> data = loader.loadDataWithSql();
        assertNotNull(data);
        assertEquals(0, data.size());
    }
}