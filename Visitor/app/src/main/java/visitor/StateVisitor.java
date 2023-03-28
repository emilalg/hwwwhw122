package visitor;

public interface StateVisitor {
    void visit(State1 stateA, Context context);
    void visit(State2 stateB, Context context);
    void visit(State3 stateC, Context context);
}