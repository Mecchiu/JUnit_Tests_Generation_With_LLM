package net.kencochrane.a4j;

import org.junit.Test;
import static org.junit.Assert.*;
import net.kencochrane.a4j.beans.*;

class A4j_3Test {

    @Test
    void testActorSearch() {
        A4j a4j = new A4j();
        ProductInfo result = a4j.ActorSearch("Tom Hanks", "dvd", "1");
        assertNotNull(result);
    }

    @Test
    void testActorSearchWithEmptyActorName() {
        A4j a4j = new A4j();
        ProductInfo result = a4j.ActorSearch("", "dvd", "1");
        assertNull(result);
    }

    @Test
    void testActorSearchWithEmptyMode() {
        A4j a4j = new A4j();
        ProductInfo result = a4j.ActorSearch("Tom Hanks", "", "1");
        assertNull(result);
    }

    @Test
    void testActorSearchWithEmptyPage() {
        A4j a4j = new A4j();
        ProductInfo result = a4j.ActorSearch("Tom Hanks", "dvd", "");
        assertNull(result);
    }

    @Test
    void testActorSearchWithNullActorName() {
        A4j a4j = new A4j();
        ProductInfo result = a4j.ActorSearch(null, "dvd", "1");
        assertNull(result);
    }

    @Test
    void testActorSearchWithNullMode() {
        A4j a4j = new A4j();
        ProductInfo result = a4j.ActorSearch("Tom Hanks", null, "1");
        assertNull(result);
    }

    @Test
    void testActorSearchWithNullPage() {
        A4j a4j = new A4j();
        ProductInfo result = a4j.ActorSearch("Tom Hanks", "dvd", null);
        assertNull(result);
    }

    @Test
    void testActorSearchWithAllNullParameters() {
        A4j a4j = new A4j();
        ProductInfo result = a4j.ActorSearch(null, null, null);
        assertNull(result);
    }

    @Test
    void testActorSearchWithInvalidMode() {
        A4j a4j = new A4j();
        ProductInfo result = a4j.ActorSearch("Tom Hanks", "invalid", "1");
        assertNull(result);
    }

    @Test
    void testActorSearchWithInvalidPage() {
        A4j a4j = new A4j();
        ProductInfo result = a4j.ActorSearch("Tom Hanks", "dvd", "invalid");
        assertNull(result);
    }
}
