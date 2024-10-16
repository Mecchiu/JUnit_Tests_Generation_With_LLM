/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.squirrel_sql.plugins.dbcopy.commands;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sourceforge.squirrel_sql.client.gui.IProgressCallBackFactory;
import net.sourceforge.squirrel_sql.client.gui.ProgressCallBackFactory;
import net.sourceforge.squirrel_sql.client.session.ISession;
import net.sourceforge.squirrel_sql.plugins.dbcopy.DBCopyPlugin;
import net.sourceforge.squirrel_sql.plugins.dbcopy.commands.CopyTableCommand;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class CopyTableCommandEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DBCopyPlugin dBCopyPlugin0 = new DBCopyPlugin();
      CopyTableCommand copyTableCommand0 = new CopyTableCommand((ISession) null, dBCopyPlugin0);
      ProgressCallBackFactory progressCallBackFactory0 = new ProgressCallBackFactory();
      copyTableCommand0.setProgressCallBackFactory((IProgressCallBackFactory) progressCallBackFactory0);
  }
}
