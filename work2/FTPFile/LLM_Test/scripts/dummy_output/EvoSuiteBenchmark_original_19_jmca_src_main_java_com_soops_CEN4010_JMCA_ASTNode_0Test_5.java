// ASTNode_0Test.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ASTNode}.
* It contains one unit test case for the {@link ASTNode#compareTo(Object)} method.
*/
class ASTNode_0Test {
		ArrayList<Object[]>  tree;
        String                filename="";
    private void readTree(File file) throws Exception {
      BufferedReader in = new BufferedReader(new FileReader(file));
      tree = new ArrayList<Object[]>();
      String line;
      while((line=in.readLine())!=null){
        String values[] = line.split(";");
        Object[] oar = new Object[values.length];
        for(int i=0;i<values.length;i++) {
                            oar[i] = Integer.valueOf(values[i]);
                        }
                            tree.add(oar);
      }
      in.close();
    }
    class Test {
        int x;
        String y;
        int value;
        Test(int x1, int y1, int value1, int x2, int y2) {
            this.x = x1;
            this.y = y1;
            this.value = value1;
        }
        public static int sum(int... numbers) {

        }
    }
    private void createTree() throws Exception {
                        readTree(new File("/Users/cena/workspace/JMCA/build.xml"));
    }
    @Test
    public void test2() {
     assertEquals("/users/cena/workspace/JMCA/build.xml", readTree(new File("/Users/cena/workspace/JMCA/build.xml")).toString());
    }
  @Test
    public void test3() throws IOException {
        System.out.println("start");
        try {
            createTree();

            byte[] array = new byte[500];
            InputStream in = new ByteArrayInputStream(array);
            Scanner sc = new Scanner(in);
            sc.useDelimiter(";");
            String line = sc.next();
            while (sc.hasNextLine()) {
                line = sc.next();
                line = line.trim();
            }
            System.out.println(line);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("end...");
    }
    @Test
    public void test4() throws IOException {
        try {
            createTree();

            FileOutputStream fout = new FileOutputStream("build");
            new Scanner(new FileInputStream("build"), "UTF-8").useDelimiter(";").next();
            fout.close();
            System.out.println("end...");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }



 }