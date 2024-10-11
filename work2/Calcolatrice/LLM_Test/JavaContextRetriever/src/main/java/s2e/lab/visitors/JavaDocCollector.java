package s2e.lab.visitors;

import com.github.javaparser.ast.comments.JavadocComment;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.util.List;

public class JavaDocCollector extends VoidVisitorAdapter<List<String>> {
    @Override
    public void visit(JavadocComment n, List<String> collector) {
        super.visit(n, collector);
        collector.add(n.getContent());
    }
}
