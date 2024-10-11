// Here's an example implementation of the JavaSource class with some sample member variables and methods.

package com.example;

import java.util.ArrayList;
import java.util.List;

public class JavaSource {

    private String packageName;
    private String classJavadocs;
    private String className;
    private String superClass;
    private String interfaceName;
    private List<MemberVariable> memberVariables = new ArrayList<>();
    private boolean hasSuperClass;
    private boolean isInterface;

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
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public List<MemberVariable> getMemberVariables() {
        return memberVariables;
    }

    public int getNumberOfMemberVariables() {
        return memberVariables.size();
    }

    public void addMemberVariable(String mVarClass, boolean isArray) {
        String mVarName = "memberVariable" + (memberVariables.size() + 1);
        memberVariables.add(new MemberVariable(mVarName, mVarClass, isArray));
    }

    public void addMemberVariable(String mVarName, String mVarClass, boolean isArray) {
        memberVariables.add(new MemberVariable(mVarName, mVarClass, isArray));
    }

    public boolean hasInterface() {
        return interfaceName != null;
    }

    public boolean hasSuperClass() {
        return superClass != null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("package ").append(packageName).append(";\n\n");
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
        if (interfaceName != null) {
            sb.append(" implements ").append(interfaceName);
        }
        sb.append(" {\n\n");
        for (MemberVariable memberVariable : memberVariables) {
            sb.append("\tprivate ").append(memberVariable.getType());
            if (memberVariable.isArray()) {
                sb.append("[]");
            }
            sb.append(" ").append(memberVariable.getName()).append(";\n");
        }
        sb.append("\n}");
        return sb.toString();
    }

    private static class MemberVariable {
        private String name;
        private String type;
        private boolean isArray;

        public MemberVariable(String name, String type, boolean isArray) {
            this.name = name;
            this.type = type;
            this.isArray = isArray;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        public boolean isArray() {
            return isArray;
        }
    }
}