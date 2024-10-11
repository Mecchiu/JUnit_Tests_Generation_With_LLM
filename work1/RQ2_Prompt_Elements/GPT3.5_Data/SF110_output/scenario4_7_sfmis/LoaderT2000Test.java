// LoaderTest.java
package com.hf.sfm.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Loader}.
 * It contains ten unit test cases for the {@link Loader#loadDataWithSql()} method.
 */
class LoaderTest {

    @Test
    void testLoadDataWithSql() {
        // Test case 1: Test with valid SQL query and no parameters
        Loader loader = new Loader();
        loader.setSql("SELECT * FROM users");
        List result = loader.loadDataWithSql();
        assertNotNull(result);
        assertEquals(10, result.size());

        // Test case 2: Test with valid SQL query and parameters
        loader = new Loader();
        loader.setSql("SELECT * FROM users WHERE age > :age AND gender = :gender");
        String[][] params = {{"age", "25"}, {"gender", "M"}};
        loader.setPas(params);
        result = loader.loadDataWithSql();
        assertNotNull(result);
        assertEquals(5, result.size());

        // Test case 3: Test with invalid SQL query
        loader = new Loader();
        loader.setSql("SELECT * FROM non_existing_table");
        result = loader.loadDataWithSql();
        assertNull(result);

        // Test case 4: Test with valid SQL query and invalid parameters
        loader = new Loader();
        loader.setSql("SELECT * FROM users WHERE age > :age AND gender = :gender");
        params = new String[][]{{"age", "invalid_age"}, {"gender", "M"}};
        loader.setPas(params);
        result = loader.loadDataWithSql();
        assertNull(result);

        // Test case 5: Test with valid SQL query and empty parameters
        loader = new Loader();
        loader.setSql("SELECT * FROM users WHERE age > :age AND gender = :gender");
        params = new String[][]{};
        loader.setPas(params);
        result = loader.loadDataWithSql();
        assertNull(result);

        // Test case 6: Test with valid SQL query and null parameters
        loader = new Loader();
        loader.setSql("SELECT * FROM users WHERE age > :age AND gender = :gender");
        loader.setPas(null);
        result = loader.loadDataWithSql();
        assertNull(result);

        // Test case 7: Test with valid SQL query and invalid session
        loader = new Loader();
        loader.setSql("SELECT * FROM users");
        loader.setSession(null);
        result = loader.loadDataWithSql();
        assertNull(result);

        // Test case 8: Test with valid SQL query and valid session but invalid transaction
        loader = new Loader();
        loader.setSql("SELECT * FROM users");
        loader.setSession(HibernateUtil.getSessionFactory().openSession());
        result = loader.loadDataWithSql();
        assertNull(result);

        // Test case 9: Test with valid SQL query and valid session and transaction
        loader = new Loader();
        loader.setSql("SELECT * FROM users");
        loader.setSession(HibernateUtil.getSessionFactory().openSession());
        loader.getSession().beginTransaction();
        result = loader.loadDataWithSql();
        assertNotNull(result);
        assertEquals(10, result.size());
        loader.getSession().getTransaction().commit();

        // Test case 10: Test with valid SQL query and valid session, transaction and pagination
        loader = new Loader();
        loader.setSql("SELECT * FROM users");
        loader.setSession(HibernateUtil.getSessionFactory().openSession());
        loader.getSession().beginTransaction();
        loader.setPaging(true);
        loader.setStart(0);
        loader.setLimit(5);
        result = loader.loadDataWithSql();
        assertNotNull(result);
        assertEquals(5, result.size());
        loader.getSession().getTransaction().commit();
    }
}