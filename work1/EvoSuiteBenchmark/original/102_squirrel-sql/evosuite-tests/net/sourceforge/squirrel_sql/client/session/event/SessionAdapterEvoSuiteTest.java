/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.squirrel_sql.client.session.event;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sourceforge.squirrel_sql.client.session.event.SessionAdapter;
import net.sourceforge.squirrel_sql.client.session.event.SessionEvent;
import net.sourceforge.squirrel_sql.fw.id.IIdentifier;
import net.sourceforge.squirrel_sql.fw.id.IntegerIdentifier;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SessionAdapterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SessionAdapter sessionAdapter0 = new SessionAdapter();
      sessionAdapter0.sessionClosing((SessionEvent) null);
  }

  @Test
  public void test1()  throws Throwable  {
      SessionAdapter sessionAdapter0 = new SessionAdapter();
      sessionAdapter0.allSessionsClosed();
  }

  @Test
  public void test2()  throws Throwable  {
      SessionAdapter sessionAdapter0 = new SessionAdapter();
      sessionAdapter0.reconnectFailed((SessionEvent) null);
  }

  @Test
  public void test3()  throws Throwable  {
      SessionAdapter sessionAdapter0 = new SessionAdapter();
      sessionAdapter0.sessionActivated((SessionEvent) null);
  }

  @Test
  public void test4()  throws Throwable  {
      SessionAdapter sessionAdapter0 = new SessionAdapter();
      sessionAdapter0.sessionConnected((SessionEvent) null);
  }

  @Test
  public void test5()  throws Throwable  {
      SessionAdapter sessionAdapter0 = new SessionAdapter();
      sessionAdapter0.reconnected((SessionEvent) null);
  }

  @Test
  public void test6()  throws Throwable  {
      SessionAdapter sessionAdapter0 = new SessionAdapter();
      IntegerIdentifier integerIdentifier0 = new IntegerIdentifier(0);
      sessionAdapter0.sessionFinalized((IIdentifier) integerIdentifier0);
  }

  @Test
  public void test7()  throws Throwable  {
      SessionAdapter sessionAdapter0 = new SessionAdapter();
      sessionAdapter0.sessionClosed((SessionEvent) null);
  }

  @Test
  public void test8()  throws Throwable  {
      SessionAdapter sessionAdapter0 = new SessionAdapter();
      sessionAdapter0.connectionClosedForReconnect((SessionEvent) null);
  }
}
