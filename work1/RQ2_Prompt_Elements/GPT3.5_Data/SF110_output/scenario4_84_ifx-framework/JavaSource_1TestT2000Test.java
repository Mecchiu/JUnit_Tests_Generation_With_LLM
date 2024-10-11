// Here's an example implementation of the JavaSource class

package org.sourceforge.ifx.tools;

import java.util.ArrayList;
import java.util.List;

public class JavaSource {

    private String packageName;
    private String classJavadocs;
    private String className;
    private String superClass;
    private String interfaceName;
    private List<MemberVariable> memberVariables;
    private boolean hasSuperClass;
    private boolean isInterface;

    public JavaSource() {
        memberVariables = new ArrayList<>();
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getClassJavadocs() {
        return classJavadocs;
    }

    public void setClassJavadocs(String classJavadocs) {
        this.classJavadocs = classJavadocs;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSuperClass() {
        return superClass;
    }

    public void setSuperClass(String superClass) {
        this.superClass = superClass;
        hasSuperClass = true;
    }

    public String getInterface() {
        return interfaceName;
    }

    public void setInterface(String interfaceName) {
        this.interfaceName = interfaceName;
        isInterface = true;
    }

    public List<MemberVariable> getMemberVariables() {
        return memberVariables;
    }

    public int getNumberOfMemberVariables() {
        return memberVariables.size();
    }

    public void addMemberVariable(String mVarClass, boolean isArray) {
        String mVarName = "m" + className + mVarClass.substring(mVarClass.lastIndexOf('.') + 1);
        memberVariables.add(new MemberVariable(mVarName, mVarClass, isArray));
    }

    public void addMemberVariable(String mVarName, String mVarClass, boolean isArray) {
        memberVariables.add(new MemberVariable(mVarName, mVarClass, isArray));
    }

    public boolean hasInterface() {
        return isInterface;
    }

    public boolean hasSuperClass() {
        return hasSuperClass;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (packageName != null) {
            sb.append("package ").append(packageName).append(";\n\n");
        }
        if (classJavadocs != null) {
            sb.append(classJavadocs).append("\n");
        }
        sb.append("public ");
        if (isInterface) {
            sb.append("interface ");
        } else {
            sb.append("class ");
        }
        sb.append(className);
        if (hasSuperClass) {
            sb.append(" extends ").append(superClass);
        }
        if (isInterface && interfaceName != null) {
            sb.append(" implements ").append(interfaceName);
        }
        sb.append(" {\n\n");
        for (MemberVariable memberVariable : memberVariables) {
            sb.append(memberVariable.toString()).append("\n");
        }
        sb.append("}\n");
        return sb.toString();
    }

    private class MemberVariable {
        private String name;
        private String type;
        private boolean isArray;

        public MemberVariable(String name, String type, boolean isArray) {
            this.name = name;
            this.type = type;
            this.isArray = isArray;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("\tprivate ");
            if (isArray) {
                sb.append(type).append("[] ");
            } else {
                sb.append(type).append(" ");
            }
            sb.append(name).append(";\n");
            return sb.toString();
        }
    }
}