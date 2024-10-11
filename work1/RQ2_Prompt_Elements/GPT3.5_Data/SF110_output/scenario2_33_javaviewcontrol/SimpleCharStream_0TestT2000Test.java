// Source code for SimpleCharStream_0Test.java

public class SimpleCharStream_0Test {

    @Test
    public void testBeginToken1() throws Exception {
        SimpleCharStream stream = new SimpleCharStream();
        char c = stream.BeginToken();
        assertEquals(-1, stream.tokenBegin);
    }

    @Test
    public void testBeginToken2() throws Exception {
        SimpleCharStream stream = new SimpleCharStream();
        char c = stream.BeginToken();
        assertEquals(0, stream.bufpos);
    }

    @Test
    public void testBeginToken3() throws Exception {
        SimpleCharStream stream = new SimpleCharStream();
        char c = stream.BeginToken();
        assertEquals(c, stream.readChar());
    }

    @Test
    public void testBeginToken4() throws Exception {
        SimpleCharStream stream = new SimpleCharStream();
        char c = stream.BeginToken();
        assertEquals(c, stream.buffer[stream.tokenBegin]);
    }

    @Test
    public void testBeginToken5() throws Exception {
        SimpleCharStream stream = new SimpleCharStream();
        char c = stream.BeginToken();
        assertEquals(c, stream.buffer[stream.bufpos - 1]);
    }

    @Test
    public void testBeginToken6() throws Exception {
        SimpleCharStream stream = new SimpleCharStream();
        char c = stream.BeginToken();
        assertEquals(c, stream.buffer[stream.bufpos]);
    }

    @Test
    public void testBeginToken7() throws Exception {
        SimpleCharStream stream = new SimpleCharStream();
        char c = stream.BeginToken();
        assertEquals(c, stream.buffer[stream.bufpos + 1]);
    }

    @Test
    public void testBeginToken8() throws Exception {
        SimpleCharStream stream = new SimpleCharStream();
        char c = stream.BeginToken();
        assertEquals(c, stream.buffer[stream.bufsize - 1]);
    }

    @Test
    public void testBeginToken9() throws Exception {
        SimpleCharStream stream = new SimpleCharStream();
        char c = stream.BeginToken();
        assertEquals(c, stream.buffer[0]);
    }

    @Test
    public void testBeginToken10() throws Exception {
        SimpleCharStream stream = new SimpleCharStream();
        char c = stream.BeginToken();
        assertEquals(c, stream.buffer[stream.bufsize]);
    }
}