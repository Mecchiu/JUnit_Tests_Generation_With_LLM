package s2e.lab.visitors;

import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.util.List;

public class ExtendedNameCollector extends VoidVisitorAdapter<List<String>> {

    @Override
    public void visit(ClassOrInterfaceDeclaration n, List<String> collector) {
        super.visit(n, collector);

        if (n.getExtendedTypes().equals(null))
            System.out.println("No extended types");
        else
            collector.add(n.getExtendedTypes().toString());
    }

}
