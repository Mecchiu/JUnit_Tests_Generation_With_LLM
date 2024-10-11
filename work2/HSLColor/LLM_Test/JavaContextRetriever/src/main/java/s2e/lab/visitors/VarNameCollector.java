package s2e.lab.visitors;

import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.util.List;

public class VarNameCollector extends VoidVisitorAdapter<List<String>> {
    @Override
    public void visit(VariableDeclarationExpr n, List<String> collector) {
        super.visit(n, collector);
        collector.add(n.getVariables().getFirst().get().getNameAsString());
    }
}
