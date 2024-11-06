package s2e.lab;

import com.github.javaparser.ast.CompilationUnit;
import s2e.lab.analyzers.CompilationAnalyzer;

public class ProblematicSamplesTest {
    public static final String PROBLEMATIC_CODEGEN_SAMPLE = "// DefaultNoteListModel_4Test.java\n" +
            "package com.allenstudio.ir.ui;\n" +
            "\n" +
            "import com.allenstudio.ir.core.plugins.AbstractNote;\n" +
            "import com.allenstudio.ir.event.NoteListDataEvent;\n" +
            "import com.allenstudio.ir.event.NoteListDataListener;\n" +
            "import java.util.*;\n" +
            "import org.junit.jupiter.api.Test;\n" +
            "import static org.junit.jupiter.api.Assertions.*;\n" +
            "\n" +
            "/**\n" +
            "* Test class of {@link DefaultNoteListModel}.\n" +
            "* It contains one unit test case for the {@link DefaultNoteListModel#indexOf(AbstractNote)} method.\n" +
            "*/\n" +
            "class DefaultNoteListModel_4Test {\n" +
            "\t\t// <editor-fold defaultstate=\"collapsed\" desc=\"Test cases\">\n" +
            "\t\t// <editor-fold defaultstate=\"collapsed\" desc=\"<code>indexOf(AbstractNote)</code>\">\">\n" +
            "\t/**\n" +
            "\t* Tests the indexOf method.\n" +
            "\t*\n" +
            "\t* @throws Exception if an error occurs while comparing the expected and received result\n" +
            "\t*/\n" +
            "\t@Test\n" +
            "    void testIndexOf() throws Exception {\n" +
            "\t\tfinal DefaultNoteListModel model = new DefaultNoteListModel();\n" +
            "\t\tAbstractNote a;\n" +
            "\t\tfinal Set entries = model.getEntries();\n" +
            "\t\tint idx = model.indexOf(a);\n" +
            "\n" +
            "\t\tassertEquals(-1, idx);\n" +
            "\t\ta = new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(new AddNote(";


    public static void main(String[] args) {
        CompilationUnit compilationUnit = CompilationAnalyzer.getCompilationUnit(PROBLEMATIC_CODEGEN_SAMPLE);
        System.out.println(compilationUnit);
    }
}
