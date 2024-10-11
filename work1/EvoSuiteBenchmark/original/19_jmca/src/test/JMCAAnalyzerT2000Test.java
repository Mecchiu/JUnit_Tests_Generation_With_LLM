```java
// JMCAAnalyzerTest.java
package com.soops.CEN4010.JMCA;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JMCAAnalyzerTest {

    @Test
    void testAnalyze_NullRoot() {
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        String result = analyzer.analyze(null);
        assertEquals("File did not parse correctly", result);
    }

    // Add more test cases for the analyze method here

}
```
```java
// ASTNode.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;

public class ASTNode {

    private String identity;
    private String type;
    private ArrayList<ASTNode> list;

    public ASTNode(String identity, String type) {
        this.identity = identity;
        this.type = type;
        this.list = new ArrayList<>();
    }

    public String getIdentity() {
        return identity;
    }

    public String getType() {
        return type;
    }

    public ArrayList<ASTNode> getList() {
        return list;
    }

    public void addChild(ASTNode child) {
        list.add(child);
    }
}
```
```java
// Analyzer.java
package com.soops.CEN4010.JMCA;

public interface Analyzer {

    String analyze(ASTNode root);

}
```
```java
// StatementElement.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;

public class StatementElement {

    private boolean hasBeenModified = false;
    private String elementName = null;
    private boolean isInSelection = false;
    private boolean isInIteration = false;
    private ArrayList<StatementElement> modifiers = new ArrayList<>();
    private variableType type = null;

    public enum variableType {
        ClassVariable, LocalVariable, MethodCall, ClassInitiator
    }

    public StatementElement() {
    }

    public StatementElement(String name) {
        this.elementName = name;
    }

    public void addModifier(StatementElement rval) {
        modifiers.add(rval);
    }

    public ArrayList<StatementElement> getModifiers() {
        return modifiers;
    }

    public variableType getType() {
        return type;
    }

    public void setType(variableType t) {
        type = t;
    }

    public void setElementName(String name) {
        elementName = name;
    }

    public boolean hasBeenModified() {
        return hasBeenModified;
    }

    public String getElementName() {
        return elementName;
    }

    public void setModified(boolean val) {
        hasBeenModified = val;
    }

    public String toString() {
        String tmp = elementName;
        if (hasBeenModified) {
            tmp += " (modified) ";
        }
        if (type != null) {
            tmp += " (" + type.toString() + ") ";
        }
        for (StatementElement element : modifiers) {
            tmp += element.toString();
        }
        return tmp;
    }

    public boolean isInSelection() {
        return isInSelection;
    }

    public boolean isInIteration() {
        return isInIteration;
    }

    public void setInSelection(boolean val) {
        isInSelection = val;
    }

    public void setInIteration(boolean val) {
        isInIteration = val;
    }
}
```
```java
// StatementDS.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;

public class StatementDS {

    private StatementElement lVal = null;
    private ArrayList<StatementElement> rValList = new ArrayList<>();
    private statementType type = null;
    private boolean isInSelection = false;
    private boolean isInIteration = false;

    public enum statementType {
        PreInc, PostInc, Assignment, MethodCall
    }

    public statementType getType() {
        return type;
    }

    public void addRVal(StatementElement rv) {
        rValList.add(rv);
    }

    public void setType(statementType t) {
        type = t;
    }

    public ArrayList<StatementElement> getRVals() {
        return rValList;
    }

    public String toString() {
        String tmp = lVal.toString();
        tmp += " : " + type.toString();
        if (isInIteration()) {
            tmp += " (Iteration) ";
        }
        if (isInSelection()) {
            tmp += " (Selection) ";
        }
        for (StatementElement rVal : rValList) {
            tmp += " := " + rVal.toString();
        }
        return tmp;
    }

    public void setLVal(StatementElement rv) {
        lVal = rv;
    }

    public void setLVal(String id) {
        lVal = new StatementElement(id);
    }

    public StatementElement getLVal() {
        return lVal;
    }

    public boolean isInSelection() {
        return isInSelection;
    }

    public boolean isInIteration() {
        return isInIteration;
    }

    public void setInSelection(boolean val) {
        isInSelection = val;
    }

    public void setInIteration(boolean val) {
        isInIteration = val;
    }
}
```
```java
// JMCAAnalyzer.java
package com.soops.CEN4010.JMCA;

import java.util.*;

public class JMCAAnalyzer implements Analyzer {

    private String fileName = "";
    private StringBuilder output = new StringBuilder();
    private java.util.HashSet<String> classList = null;
    private static final boolean DEVELOPMENT = false;

    public String analyze(ASTNode root) {
        if (root == null) {
            output.append("File did not parse correctly");
            return output.toString();
        }
        setHeader();
        for (ASTNode node : root.getList()) {
            analyzeClass(node);
        }
        return output.toString();
    }

    private void analyzeClass(ASTNode node) {
        classList = new HashSet<String>();
        java.util.ArrayList<ASTNode> methodList = new ArrayList<ASTNode>();
        output.append("\nClass: " + node.getIdentity() + "\n\n");
        output.append("Method Name                             Cohesion Level\n");
        output.append("--------------------------------------------------------------\n");
        for (ASTNode childNode : node.getList()) {
            if (childNode.getType().equals("ClassVariableDeclaration")) {
                classList.add(childNode.getIdentity());
            }
        }
        for (ASTNode childNode : node.getList()) {
            if (childNode.getType().equals("MethodDeclaration")) {
                analyzeMethod(childNode);
            }
        }
    }

    private void analyzeMethod(ASTNode node) {
        output.append(node.getIdentity());
        ArrayList<StatementDS> statementList = new ArrayList<StatementDS>();
        statements(node, statementList, false, false);
        HashMap<String, StatementElement> modifiedVariables = new HashMap<String, StatementElement>();
        for (StatementDS tmpDS : statementList) {
            if (classList.contains(tmpDS.getLVal().getElementName())) {
                tmpDS.getLVal().setType(StatementElement.variableType.ClassVariable);
            }
            if (tmpDS.getType() != null) {
                if (tmpDS.getType().equals(StatementDS.statementType.Assignment) || tmpDS.getType().equals(StatementDS.statementType.PostInc) || tmpDS.getType().equals(StatementDS.statementType.PreInc)) {
                    tmpDS.getLVal().setModified(true);
                    modifiedVariables.put(tmpDS.getLVal().getElementName(), tmpDS.getLVal());
                }
            }
            tmpDS.getLVal().setInSelection(tmpDS.isInSelection());
            tmpDS.getLVal().setInIteration(tmpDS.isInIteration());
            ArrayList<StatementElement> rVals = tmpDS.getRVals();
            for (StatementElement rval : rVals) {
                StatementElement tmpEl = modifiedVariables.get(rval.getElementName());
                if (tmpEl != null && !tmpEl.getElementName().equals(tmpDS.getLVal().getElementName())) {
                    tmpDS.getLVal().addModifier(tmpEl);
                } else if (!rval.getElementName().equals(tmpDS.getLVal().getElementName())) {
                    tmpDS.getLVal().addModifier(rval);
                }
                if (rval.hasBeenModified()) {
                    tmpDS.getLVal().addModifier(rval);
                    modifiedVariables.put(rval.getElementName(), rval);
                }
            }
        }
        int modifiedClassVariables = 0;
        int classVariableWithModifiers = 0;
        int modifiedLocVariables = 0;
        boolean iterative = false;
        boolean selective = false;
        String cohesionLevel = "";
        boolean firstModifiedClassVariableWithModifers = true;
        ArrayList<String> classVarModifiers = new ArrayList<String>();
        for (StatementElement el : modifiedVariables.values()) {
            if (el.hasBeenModified()) {
                if (el.getType() != null && el.getType().equals(StatementElement.variableType.ClassVariable)) {
                    if (el.isInSelection()) {
                        selective = true;
                    }
                    if (el.isInIteration()) {
                        iterative = true;
                    }
                    if (el.getModifiers().size() > 0) {
                        ++classVariableWithModifiers;
                        if (firstModifiedClassVariableWithModifers) {
                            createArrayListOfModifiers(el, classVarModifiers);
                            firstModifiedClassVariableWithModifers = false;
                        } else {
                            ArrayList<String> tmpList = new ArrayList<String>();
                            createArrayListOfModifiers(el, tmpList);
                            ArrayList<String> unionSet = new ArrayList<String>();
                            for (String var : classVarModifiers) {
                                for (String tmpEl : tmpList) {
                                    if (var.equals(tmpEl