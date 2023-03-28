package visitor;

public class StateTransitionVisitor implements StateVisitor {

    @Override
    public void visit(State1 stateA, Context context) {
        context.setState(new State2());
    }

    @Override
    public void visit(State2 stateB, Context context) {
        context.setState(new State3());
    }

    @Override
    public void visit(State3 stateC, Context context) {
        context.setState(new State1());
    }
}