// LoaderTest.java
package com.hf.sfm.util;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Test class of {@link Loader}.
 * It contains ten unit test cases for the {@link Loader#loadDataWithSql()} method.
 */
class LoaderTest {

    private Loader loader;
    private Session session;
    private Query query;

    @BeforeEach
    void setUp() {
        loader = new Loader();
        session = mock(Session.class);
        query = mock(Query.class);
        HibernateSessionFactory.setSession(session);
    }

    @Test
    void testLoadDataWithSql_noParams_noSorting_noPaging() {
        String sql = "SELECT * FROM table";
        loader.setSql(sql);
        when(session.createSQLQuery(sql)).thenReturn(query);
        List<Object> rows = mock(List.class);
        when(query.list()).thenReturn(rows);
        assertEquals(rows, loader.loadDataWithSql());
        verify(session).createSQLQuery(sql);
        verify(query).list();
    }

    @Test
    void testLoadDataWithSql_withParams_noSorting_noPaging() {
        String sql = "SELECT * FROM table WHERE column = :param";
        loader.setSql(sql);
        HashMap<String, Object> params = new HashMap<>();
        params.put("param", "value");
        loader.setPas(params);
        when(session.createSQLQuery(sql)).thenReturn(query);
        when(query.setParameter("param", "value")).thenReturn(query);
        List<Object> rows = mock(List.class);
        when(query.list()).thenReturn(rows);
        assertEquals(rows, loader.loadDataWithSql());
        verify(session).createSQLQuery(sql);
        verify(query).setParameter("param", "value");
        verify(query).list();
    }

    @Test
    void testLoadDataWithSql_noParams_withSorting_noPaging() {
        String sql = "SELECT * FROM table";
        loader.setSql(sql);
        loader.setSort("column");
        loader.setDir("ASC");
        String sortedSql = "SELECT * FROM table ORDER BY column ASC";
        when(session.createSQLQuery(sortedSql)).thenReturn(query);
        List<Object> rows = mock(List.class);
        when(query.list()).thenReturn(rows);
        assertEquals(rows, loader.loadDataWithSql());
        verify(session).createSQLQuery(sortedSql);
        verify(query).list();
    }

    @Test
    void testLoadDataWithSql_noParams_withSortingDesc_noPaging() {
        String sql = "SELECT * FROM table";
        loader.setSql(sql);
        loader.setSort("column");
        loader.setDir("DESC");
        String sortedSql = "SELECT * FROM table ORDER BY column DESC";
        when(session.createSQLQuery(sortedSql)).thenReturn(query);
        List<Object> rows = mock(List.class);
        when(query.list()).thenReturn(rows);
        assertEquals(rows, loader.loadDataWithSql());
        verify(session).createSQLQuery(sortedSql);
        verify(query).list();
    }

    @Test
    void testLoadDataWithSql_withParams_withSorting_noPaging() {
        String sql = "SELECT * FROM table WHERE column = :param";
        loader.setSql(sql);
        HashMap<String, Object> params = new HashMap<>();
        params.put("param", "value");
        loader.setPas(params);
        loader.setSort("column");
        loader.setDir("ASC");
        String sortedSql = "SELECT * FROM table WHERE column = :param ORDER BY column ASC";
        when(session.createSQLQuery(sortedSql)).thenReturn(query);
        when(query.setParameter("param", "value")).thenReturn(query);
        List<Object> rows = mock(List.class);
        when(query.list()).thenReturn(rows);
        assertEquals(rows, loader.loadDataWithSql());
        verify(session).createSQLQuery(sortedSql);
        verify(query).setParameter("param", "value");
        verify(query).list();
    }

    @Test
    void testLoadDataWithSql_noParams_noSorting_withPaging() {
        String sql = "SELECT * FROM table";
        loader.setSql(sql);
        loader.setPaging(true);
        loader.setStart(0);
        loader.setLimit(10);
        when(session.createSQLQuery(sql)).thenReturn(query);
        when(query.setFirstResult(0)).thenReturn(query);
        when(query.setMaxResults(10)).thenReturn(query);
        List<Object> rows = mock(List.class);
        when(query.list()).thenReturn(rows);
        assertEquals(rows, loader.loadDataWithSql());
        verify(session).createSQLQuery(sql);
        verify(query).setFirstResult(0);
        verify(query).setMaxResults(10);
        verify(query).list();
    }

    @Test
    void testLoadDataWithSql_withParams_noSorting_withPaging() {
        String sql = "SELECT * FROM table WHERE column = :param";
        loader.setSql(sql);
        HashMap<String, Object> params = new HashMap<>();
        params.put("param", "value");
        loader.setPas(params);
        loader.setPaging(true);
        loader.setStart(0);
        loader.setLimit(10);
        when(session.createSQLQuery(sql)).thenReturn(query);
        when(query.setParameter("param", "value")).thenReturn(query);
        when(query.setFirstResult(0)).thenReturn(query);
        when(query.setMaxResults(10)).thenReturn(query);
        List<Object> rows = mock(List.class);
        when(query.list()).thenReturn(rows);
        assertEquals(rows, loader.loadDataWithSql());
        verify(session).createSQLQuery(sql);
        verify(query).setParameter("param", "value");
        verify(query).setFirstResult(0);
        verify(query).setMaxResults(10);
        verify(query).list();
    }

    @Test
    void testLoadDataWithSql_noParams_withSorting_withPaging() {
        String sql = "SELECT * FROM table";
        loader.setSql(sql);
        loader.setSort("column");
        loader.setDir("ASC");
        loader.setPaging(true);
        loader.setStart(0);
        loader.setLimit(10);
        String sortedSql = "SELECT * FROM table ORDER BY column ASC";
        when(session.createSQLQuery(sortedSql)).thenReturn(query);
        when(query.setFirstResult(0)).thenReturn(query);
        when(query.setMaxResults(10)).thenReturn(query);
        List<Object> rows = mock(List.class);
        when(query.list()).thenReturn(rows);
        assertEquals(rows, loader.loadDataWithSql());
        verify(session).createSQLQuery(sortedSql);
        verify(query).setFirstResult(0);
        verify(query).setMaxResults(10);
        verify(query).list();
    }

    @Test
    void testLoadDataWithSql_noParams_withSortingDesc_withPaging() {
        String sql = "SELECT * FROM table";
        loader.setSql(sql);
        loader.setSort("column");
        loader.setDir("DESC");
        loader.setPaging(true);
        loader.setStart(0);
        loader.setLimit(10);
        String sortedSql = "SELECT * FROM table ORDER BY column DESC";
        when(session.createSQLQuery(sortedSql)).thenReturn(query);
        when(query.setFirstResult(0)).thenReturn(query);
        when(query.setMaxResults(10)).thenReturn(query);
        List<Object> rows = mock(List.class);
        when(query.list()).thenReturn(rows);
        assertEquals(rows, loader.loadDataWithSql());
        verify(session).createSQLQuery(sortedSql);
        verify(query).setFirstResult(0);
        verify(query).setMaxResults(10);
        verify(query).list();
    }

    @Test
    void testLoadDataWithSql_withParams_withSorting_withPaging() {
        String sql = "SELECT * FROM table WHERE column = :param";
        loader.setSql(sql);
        HashMap<String, Object> params = new HashMap<>();
        params.put("param", "value");
        loader.setPas(params);
        loader.setSort("column");
        loader.setDir("ASC");
        loader.setPaging(true);
        loader.setStart(0);
        loader.setLimit(10);
        String sortedSql = "SELECT * FROM table WHERE column = :param ORDER BY column ASC";
        when(session.createSQLQuery(sortedSql)).thenReturn(query);
        when(query.setParameter("param", "value")).thenReturn(query);
        when(query.setFirstResult(0)).thenReturn(query);
        when(query.setMaxResults(10)).thenReturn(query);
        List<Object> rows = mock(List.class);
        when(query.list()).thenReturn(rows);
        assertEquals(rows, loader.loadDataWithSql());
        verify(session).createSQLQuery(sortedSql);
        verify(query).setParameter("param", "value");
        verify(query).setFirstResult(0);
        verify(query).setMaxResults(10);
        verify(query).list();
    }
}