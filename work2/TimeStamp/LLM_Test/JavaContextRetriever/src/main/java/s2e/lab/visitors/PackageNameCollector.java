package s2e.lab.visitors;

import com.github.javaparser.ast.PackageDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.util.List;

public class PackageNameCollector extends VoidVisitorAdapter<List<String>> {

    @Override
    public void visit(PackageDeclaration n, List<String> collector) {
        super.visit(n, collector);
        collector.add(n.getNameAsString());
    }
}
