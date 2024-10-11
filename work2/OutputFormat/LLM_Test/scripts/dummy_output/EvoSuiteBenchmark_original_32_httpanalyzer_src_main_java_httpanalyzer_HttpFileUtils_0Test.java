java
package httpanalyzer;

import org.apache.http.HttpEntity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HttpFileUtils_0Test {

    @Test
    void testSaveEntity_SuccessfulSave() {
        HttpFileUtils httpFileUtils = new HttpFileUtils();
        HttpEntity entity = new HttpEntity() {
            @Override
            public boolean isRepeatable() {
                return false;
            }

            @Override
            public boolean isChunked() {
                return false;
            }

            @Override
            public long getContentLength() {
                return 10;
            }

            @Override
            public String getContentType() {
                return "text/plain";
            }

            @Override
            public String getContentEncoding() {
                return null;
            }

            @Override
            public InputStream getContent() throws IOException, UnsupportedOperationException {
                return new FileInputStream("test.txt");
            }

            @Override
            public void writeTo(OutputStream outstream) throws IOException {
            }

            @Override
            public boolean isStreaming() {
                return false;
            }

            @Override
            public void consumeContent() throws IOException {
            }
        };
        String fileName = "output.txt";
        long size = httpFileUtils.saveEntity(entity, fileName);
        File file = new File(fileName);
        assertTrue(file.exists());
        assertEquals(10, size);
    }

    @Test
    void testSaveEntity_FailedSave() {
        HttpFileUtils httpFileUtils = new HttpFileUtils();
        HttpEntity entity = new HttpEntity() {
            @Override
            public boolean isRepeatable() {
                return false;
            }

            @Override
            public boolean isChunked() {
                return false;
            }

            @Override
            public long getContentLength() {
                return 10;
            }

            @Override
            public String getContentType() {
                return "text/plain";
            }

            @Override
            public String getContentEncoding() {
                return null;
            }

            @Override
            public InputStream getContent() throws IOException, UnsupportedOperationException {
                throw new IOException("Failed to get content");
            }

            @Override
            public void writeTo(OutputStream outstream) throws IOException {
            }

            @Override
            public boolean isStreaming() {
                return false;
            }

            @Override
            public void consumeContent() throws IOException {
            }
        };
        String fileName = "output.txt";
        long size = httpFileUtils.saveEntity(entity, fileName);
        File file = new File(fileName);
        assertFalse(file.exists());
        assertEquals(0, size);
    }
}
