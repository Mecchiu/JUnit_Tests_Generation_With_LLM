// JMCAAnalyzerTest.java
package com.soops.CEN4010.JMCA;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMCAAnalyzer}.
* It contains one unit test case for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
*/
class JMCAAnalyzerTest {
		private Set<String> classList;

		private HashSet<String> classNames;

		private String fileName;

		private ArrayList<StatementDS> statementList;

		private String statement;

        public void setClassList(Set<String> classList) {
                this.classList = classList;
        }

        public void setFileName(String fileName) {
                this.fileName = fileName;
        }

        public Set<String> getClassList() {
                return classList;
        }

        public ArrayList<StatementDS> getStatementList() {
                return statementList;
        }

        public String getFileName() {
                return fileName;
        }


		/**
		 * Test method for {@link com.soops.CEN4010.JMCA.JMCAAnalyzer#analyze(ASTNode)}.
		 *
		 <!-- Test not applicable yet -->
		public void testAnalyze() {
		}
		public void testGetRVals() {
		}
		public void testStatement() {
                     try {
                         StatementDS stE = new StatementDS();
                         StatementDS statementE = new StatementDS();
                         StatementDS stE1 = new StatementDS();
                         StatementDS statementE1 = new StatementDS();
                         StatementDS stE2 = new StatementDS();
                         StatementDS statementE2 = new StatementDS();
                         StatementDS stE3 = new StatementDS();
                         StatementDS stE4 = new StatementDS();

//                         StatementDS stE5 = new StatementDS();

//                         StatementDS stE6 = new StatementDS();

//                         StatementDS stE7 = new StatementDS();

//                         StatementDS stE8 = new StatementDS();

                    } catch (Exception e) {
/*
                         e.printStackTrace();
/*
                         e.printStackTrace();
                         e.printStackTrace();
                         e.printStackTrace();
                             */
                         fail(e.getMessage());
                     }
		}

		@Test
		public void testSetStatements() {

				try {

					for (Map.Entry<String, String> entry : classList) {
                        if(!classNames.contains(entry.getKey())){
                            classNames.add(entry.getKey());
                            StatementDS stE = new StatementDS();
                            StatementDS stE1 = new StatementDS();
                            StatementDS stE2 = new StatementDS();
                            StatementDS stE3 = new StatementDS();
                            StatementDS stE4 = new StatementDS();
                            StatementDS stE5 = new StatementDS();
                            StatementDS stE6 = new StatementDS();
                            StatementDS stE7 = new StatementDS();
                            StatementDS stE8 = new StatementDS();

                        }
                    }

				} catch (Exception e) {
					e.printStackTrace();
				}
		}
}