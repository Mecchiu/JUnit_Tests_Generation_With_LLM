package s2e.lab.visitors;

import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.util.List;

public class ImplementedNameCollector extends VoidVisitorAdapter<List<String>> {
    @Override
    public void visit(ClassOrInterfaceDeclaration n, List<String> collector) {
        super.visit(n, collector);

        if (n.getImplementedTypes().equals(null))
            System.out.println("No Implements types");
        else
            collector.add(n.getImplementedTypes().toString());
    }
}
