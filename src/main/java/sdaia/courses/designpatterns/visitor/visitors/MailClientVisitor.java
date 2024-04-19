package sdaia.courses.designpatterns.visitor.visitors;

import sdaia.courses.designpatterns.visitor.structure.OperaMailClient;
import sdaia.courses.designpatterns.visitor.structure.SquirrelMailClient;
import sdaia.courses.designpatterns.visitor.structure.ZimbraMailClient;

public interface MailClientVisitor {
    void visit(OperaMailClient mailClient);
    void visit(SquirrelMailClient mailClient);
    void visit(ZimbraMailClient mailClient);
}
