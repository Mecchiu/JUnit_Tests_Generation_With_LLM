java
package net.sf.sugar.fspath;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DefaultFSPath_0Test {

    @Test
    void testQueryReturnsEmptyResultList() {
        DefaultFSPath fsPath = new DefaultFSPath();
        FSPathResultList resultList = fsPath.query("/nonexistent/path");
        assertTrue(resultList.isEmpty());
    }

    @Test
    void testQueryReturnsNonEmptyResultList() {
        DefaultFSPath fsPath = new DefaultFSPath(new File("."));
        FSPathResultList resultList = fsPath.query("/file");
        assertFalse(resultList.isEmpty());
    }

    @Test
    void testQueryReturnsCorrectNumberOfResults() {
        DefaultFSPath fsPath = new DefaultFSPath(new File("."));
        FSPathResultList resultList = fsPath.query("/file");
        assertEquals(1, resultList.size());
    }

    @Test
    void testQueryReturnsFileObject() {
        DefaultFSPath fsPath = new DefaultFSPath(new File("."));
        FSPathResultList resultList = fsPath.query("/file");
        assertTrue(resultList.get(0).getResult() instanceof File);
    }

    @Test
    void testQueryReturnsStringResult() {
        DefaultFSPath fsPath = new DefaultFSPath(new File("."));
        FSPathResultList resultList = fsPath.query("/file/@name");
        assertTrue(resultList.get(0).getResult() instanceof String);
    }

    @Test
    void testQueryReturnsBooleanResult() {
        DefaultFSPath fsPath = new DefaultFSPath(new File("."));
        FSPathResultList resultList = fsPath.query("/file/@isDirectory");
        assertTrue(resultList.get(0).getResult() instanceof Boolean);
    }

    @Test
    void testQueryReturnsDateResult() {
        DefaultFSPath fsPath = new DefaultFSPath(new File("."));
        FSPathResultList resultList = fsPath.query("/file/@lastModified");
        assertTrue(resultList.get(0).getResult() instanceof Date);
    }

    @Test
    void testQueryReturnsDoubleResult() {
        DefaultFSPath fsPath = new DefaultFSPath(new File("."));
        FSPathResultList resultList = fsPath.query("/file/@length");
        assertTrue(resultList.get(0).getResult() instanceof Double);
    }

    @Test
    void testQueryReturnsEmptyResultListForInvalidExpression() {
        DefaultFSPath fsPath = new DefaultFSPath(new File("."));
        FSPathResultList resultList = fsPath.query("/invalid/expression");
        assertTrue(resultList.isEmpty());
    }

    @Test
    void testQueryReturnsEmptyResultListForNonNodeSetReturnType() {
        DefaultFSPath fsPath = new DefaultFSPath(new File("."));
        FSPathResultList resultList = fsPath.query("/file", XPathConstants.STRING);
        assertTrue(resultList.isEmpty());
    }
}
