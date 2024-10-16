/*
 * This file was automatically generated by EvoSuite
 */

package org.quickserver.net.server.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.Iterator;
import org.apache.commons.pool.PoolableObjectFactory;
import org.junit.BeforeClass;
import org.quickserver.net.server.ClientHandler;
import org.quickserver.net.server.impl.NonBlockingClientHandler;
import org.quickserver.net.server.impl.OptimisticClientIdentifier;
import org.quickserver.util.pool.BasicObjectPool;
import org.quickserver.util.pool.ClientHandlerObjectFactory;
import org.quickserver.util.pool.QSObjectPool;

@RunWith(EvoSuiteRunner.class)
public class OptimisticClientIdentifierEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      OptimisticClientIdentifier optimisticClientIdentifier0 = new OptimisticClientIdentifier();
      BasicObjectPool basicObjectPool0 = new BasicObjectPool();
      ClientHandlerObjectFactory clientHandlerObjectFactory0 = new ClientHandlerObjectFactory(false);
      optimisticClientIdentifier0.setClientHandlerPool((QSObjectPool) basicObjectPool0);
      basicObjectPool0.setFactory((PoolableObjectFactory) clientHandlerObjectFactory0);
      basicObjectPool0.borrowObject();
      ClientHandler clientHandler0 = optimisticClientIdentifier0.findFirstClientById("");
      assertNull(clientHandler0);
  }

  @Test
  public void test1()  throws Throwable  {
      OptimisticClientIdentifier optimisticClientIdentifier0 = new OptimisticClientIdentifier();
      BasicObjectPool basicObjectPool0 = new BasicObjectPool();
      ClientHandlerObjectFactory clientHandlerObjectFactory0 = new ClientHandlerObjectFactory(false);
      optimisticClientIdentifier0.setClientHandlerPool((QSObjectPool) basicObjectPool0);
      basicObjectPool0.setFactory((PoolableObjectFactory) clientHandlerObjectFactory0);
      NonBlockingClientHandler nonBlockingClientHandler0 = (NonBlockingClientHandler)basicObjectPool0.borrowObject();
      assertEquals("{<ClientHandler-Pool#9-ID:1> - [non-connected]}", nonBlockingClientHandler0.info());
      
      Iterator<Object> iterator0 = optimisticClientIdentifier0.findAllClientById("");
      assertEquals(false, iterator0.hasNext());
  }

  @Test
  public void test2()  throws Throwable  {
      OptimisticClientIdentifier optimisticClientIdentifier0 = new OptimisticClientIdentifier();
      BasicObjectPool basicObjectPool0 = new BasicObjectPool();
      ClientHandlerObjectFactory clientHandlerObjectFactory0 = new ClientHandlerObjectFactory(false);
      optimisticClientIdentifier0.setClientHandlerPool((QSObjectPool) basicObjectPool0);
      basicObjectPool0.setFactory((PoolableObjectFactory) clientHandlerObjectFactory0);
      basicObjectPool0.borrowObject();
      ClientHandler clientHandler0 = optimisticClientIdentifier0.findClientByKey("");
      assertNull(clientHandler0);
  }

  @Test
  public void test3()  throws Throwable  {
      OptimisticClientIdentifier optimisticClientIdentifier0 = new OptimisticClientIdentifier();
      BasicObjectPool basicObjectPool0 = new BasicObjectPool();
      ClientHandlerObjectFactory clientHandlerObjectFactory0 = new ClientHandlerObjectFactory(false);
      optimisticClientIdentifier0.setClientHandlerPool((QSObjectPool) basicObjectPool0);
      basicObjectPool0.setFactory((PoolableObjectFactory) clientHandlerObjectFactory0);
      NonBlockingClientHandler nonBlockingClientHandler0 = (NonBlockingClientHandler)basicObjectPool0.borrowObject();
      assertEquals(27, nonBlockingClientHandler0.getInstanceCount());
      
      Iterator<Object> iterator0 = optimisticClientIdentifier0.findAllClientByKey("");
      assertEquals(false, iterator0.hasNext());
  }
}
