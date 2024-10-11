package br.com.jnfe.base;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.security.KeyStore;
import javax.net.ssl.KeyManagerFactory;
import br.com.jnfe.base.util.*;

class TransportKeyStoreBean_1Test {

    @Test
    void testOpenTransportKeyManagerFactory_Success() throws Exception {
        // Given
        TransportKeyStoreBean transportKeyStoreBean = new TransportKeyStoreBean();
        transportKeyStoreBean.setKeyStoreType("pkcs12");
        transportKeyStoreBean.setKeyStoreUri("file:/path/to/keystore.pfx");
        transportKeyStoreBean.setKeyStorePassword("keystorePassword");

        KeyStore mockedKeyStore = mock(KeyStore.class);
        KeyManagerFactory mockedKeyManagerFactory = mock(KeyManagerFactory.class);

        when(SecurityUtils.openStore(anyString(), anyString(), any(char[].class))).thenReturn(mockedKeyStore);
        when(KeyManagerFactory.getInstance(anyString())).thenReturn(mockedKeyManagerFactory);

        // When
        KeyManagerFactory result = transportKeyStoreBean.openTransportKeyManagerFactory();

        // Then
        assertNotNull(result);
        verify(mockedKeyManagerFactory).init(eq(mockedKeyStore), any(char[].class));
    }

    // Add more test cases here

}
