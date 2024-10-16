package com.soops.CEN4010.JMCA;

import java.util.*;

/**
 * <p>Title: JMCAAnalyzer </p>
 *
 * <p>Description: implements Analyzer</p>
 *
 * Group2 for CEN4010 at FSU - Fall 2005
 */
public class JMCAAnalyzer implements Analyzer {

    public String analyze(ASTNode root) {
        if (root == null) {
            output.append("File did not parse correctly");
            return output.toString();
        }
        setHeader();
        //  for each class
        for (ASTNode node : root.list) {
            analyzeClass(node);
        }
        return output.toString();
    }
}
