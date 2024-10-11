// Test case for RIFManagerFactory.getInstance() method
public class RIFManagerFactoryTest {

    @Test
    public void testGetInstance() throws RemoteException {
        RIFManagerFactory factory = RIFManagerFactory.getInstance();
        assertNotNull(factory);
    }

    @Test
    public void testGetInstanceReturnsSameInstance() throws RemoteException {
        RIFManagerFactory factory1 = RIFManagerFactory.getInstance();
        RIFManagerFactory factory2 = RIFManagerFactory.getInstance();
        assertSame(factory1, factory2);
    }

    @Test
    public void testGetInstanceIsSingleton() throws RemoteException {
        RIFManagerFactory factory1 = RIFManagerFactory.getInstance();
        RIFManagerFactory factory2 = RIFManagerFactory.getInstance();
        assertEquals(factory1.hashCode(), factory2.hashCode());
    }

    @Test
    public void testGetInstanceIsThreadSafe() throws RemoteException {
        RIFManagerFactoryRunnable runnable = new RIFManagerFactoryRunnable();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(runnable.factory1.hashCode(), runnable.factory2.hashCode());
    }

    private static class RIFManagerFactoryRunnable implements Runnable {
        public RIFManagerFactory factory1;
        public RIFManagerFactory factory2;

        @Override
        public void run() {
            try {
                factory1 = RIFManagerFactory.getInstance();
                factory2 = RIFManagerFactory.getInstance();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }
}