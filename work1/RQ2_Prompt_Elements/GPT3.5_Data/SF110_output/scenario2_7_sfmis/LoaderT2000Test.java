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
        List<Object> expected = List.of(new Object(), new Object(), new Object());
        when(query.list()).thenReturn(expected);

        List<Object> actual = loader.loadDataWithSql();

        assertEquals(expected, actual);
        verify(session).createSQLQuery(sql);
        verify(query).list();
        verifyNoMoreInteractions(session, query);
    }

    @Test
    void testLoadDataWithSql_withParams_withSorting_noPaging() {
        String sql = "SELECT * FROM table WHERE column1 = :param1 AND column2 = :param2";
        loader.setSql(sql);
        loader.setPas(new HashMap<>() {{
            put("param1", "value1");
            put("param2", "value2");
        }});
        loader.setSort("column3");
        loader.setDir("DESC");
        when(session.createSQLQuery("SELECT * FROM table WHERE column1 = :param1 AND column2 = :param2 order by column3 DESC")).thenReturn(query);
        List<Object> expected = List.of(new Object(), new Object());
        when(query.list()).thenReturn(expected);

        List<Object> actual = loader.loadDataWithSql();

        assertEquals(expected, actual);
        verify(session).createSQLQuery("SELECT * FROM table WHERE column1 = :param1 AND column2 = :param2 order by column3 DESC");
        verify(query).setParameter("param1", "value1");
        verify(query).setParameter("param2", "value2");
        verify(query).list();
        verifyNoMoreInteractions(session, query);
    }

    @Test
    void testLoadDataWithSql_noParams_withSorting_withPaging() {
        String sql = "SELECT * FROM table";
        loader.setSql(sql);
        loader.setSort("column1");
        loader.setDir("ASC");
        loader.setPaging(true);
        loader.setStart(10);
        loader.setLimit(20);
        when(session.createSQLQuery("SELECT * FROM table order by column1 ASC")).thenReturn(query);
        List<Object> expected = List.of(new Object(), new Object(), new Object());
        when(query.setFirstResult(10)).thenReturn(query);
        when(query.setMaxResults(20)).thenReturn(query);
        when(query.list()).thenReturn(expected);

        List<Object> actual = loader.loadDataWithSql();

        assertEquals(expected, actual);
        verify(session).createSQLQuery("SELECT * FROM table order by column1 ASC");
        verify(query).setFirstResult(10);
        verify(query).setMaxResults(20);
        verify(query).list();
        verifyNoMoreInteractions(session, query);
    }

    @Test
    void testLoadDataWithSql_withParams_withSorting_withPaging() {
        String sql = "SELECT * FROM table WHERE column1 = :param1 AND column2 = :param2";
        loader.setSql(sql);
        loader.setPas(new HashMap<>() {{
            put("param1", "value1");
            put("param2", "value2");
        }});
        loader.setSort("column3");
        loader.setDir("DESC");
        loader.setPaging(true);
        loader.setStart(5);
        loader.setLimit(10);
        when(session.createSQLQuery("SELECT * FROM table WHERE column1 = :param1 AND column2 = :param2 order by column3 DESC")).thenReturn(query);
        List<Object> expected = List.of(new Object(), new Object());
        when(query.setParameter("param1", "value1")).thenReturn(query);
        when(query.setParameter("param2", "value2")).thenReturn(query);
        when(query.setFirstResult(5)).thenReturn(query);
        when(query.setMaxResults(10)).thenReturn(query);
        when(query.list()).thenReturn(expected);

        List<Object> actual = loader.loadDataWithSql();

        assertEquals(expected, actual);
        verify(session).createSQLQuery("SELECT * FROM table WHERE column1 = :param1 AND column2 = :param2 order by column3 DESC");
        verify(query).setParameter("param1", "value1");
        verify(query).setParameter("param2", "value2");
        verify(query).setFirstResult(5);
        verify(query).setMaxResults(10);
        verify(query).list();
        verifyNoMoreInteractions(session, query);
    }

    @Test
    void testLoadDataWithSql_noResults() {
        String sql = "SELECT * FROM table";
        loader.setSql(sql);
        when(session.createSQLQuery(sql)).thenReturn(query);
        List<Object> expected = List.of();
        when(query.list()).thenReturn(expected);

        List<Object> actual = loader.loadDataWithSql();

        assertEquals(expected, actual);
        verify(session).createSQLQuery(sql);
        verify(query).list();
        verifyNoMoreInteractions(session, query);
    }

    @Test
    void testLoadDataWithSql_exceptionThrown() {
        String sql = "SELECT * FROM table";
        loader.setSql(sql);
        when(session.createSQLQuery(sql)).thenThrow(HibernateException.class);

        List<Object> actual = loader.loadDataWithSql();

        assertEquals(List.of(), actual);
        verify(session).createSQLQuery(sql);
        verifyNoMoreInteractions(session);
        verifyZeroInteractions(query);
    }

    @Test
    void testLoadDataWithSql_nullSession() {
        HibernateSessionFactory.setSession(null);

        List<Object> actual = loader.loadDataWithSql();

        assertEquals(List.of(), actual);
        verifyZeroInteractions(session, query);
    }

    @Test
    void testLoadDataWithSql_nullQuery() {
        String sql = "SELECT * FROM table";
        loader.setSql(sql);
        when(session.createSQLQuery(sql)).thenReturn(null);

        List<Object> actual = loader.loadDataWithSql();

        assertEquals(List.of(), actual);
        verify(session).createSQLQuery(sql);
        verifyNoMoreInteractions(session);
        verifyZeroInteractions(query);
    }

    @Test
    void testLoadDataWithSql_nullSql() {
        loader.setSql(null);

        List<Object> actual = loader.loadDataWithSql();

        assertEquals(List.of(), actual);
        verifyZeroInteractions(session, query);
    }

    @Test
    void testLoadDataWithSql_emptySql() {
        loader.setSql("");

        List<Object> actual = loader.loadDataWithSql();

        assertEquals(List.of(), actual);
        verifyZeroInteractions(session, query);
    }
}