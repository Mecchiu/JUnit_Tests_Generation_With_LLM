package net.kencochrane.a4j;

import org.junit.Test;
import static org.junit.Assert.*;
import net.kencochrane.a4j.beans.*;

class A4j_2Test {

    @Test
    void testKeywordSearch() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("java", "books", "heavy", "1");
        assertNotNull(productInfo);
    }

    @Test
    void testKeywordSearchWithEmptySearchTerm() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("", "books", "heavy", "1");
        assertNull(productInfo);
    }

    @Test
    void testKeywordSearchWithEmptyProductLine() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("java", "", "heavy", "1");
        assertNull(productInfo);
    }

    @Test
    void testKeywordSearchWithEmptyType() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("java", "books", "", "1");
        assertNull(productInfo);
    }

    @Test
    void testKeywordSearchWithEmptyPage() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("java", "books", "heavy", "");
        assertNull(productInfo);
    }

    @Test
    void testKeywordSearchWithNullParameters() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch(null, null, null, null);
        assertNull(productInfo);
    }

    @Test
    void testKeywordSearchWithInvalidProductLine() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("java", "invalid", "heavy", "1");
        assertNull(productInfo);
    }

    @Test
    void testKeywordSearchWithInvalidType() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("java", "books", "invalid", "1");
        assertNull(productInfo);
    }

    @Test
    void testKeywordSearchWithInvalidPage() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("java", "books", "heavy", "invalid");
        assertNull(productInfo);
    }

    @Test
    void testKeywordSearchWithInvalidSearchTerm() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("invalid", "books", "heavy", "1");
        assertNull(productInfo);
    }
}
