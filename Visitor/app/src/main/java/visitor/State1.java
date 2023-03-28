package visitor;

public class State1 implements State {
    @Override
    public void handle(Context context, StateVisitor visitor) {
        System.out.println("State A handling.");
        visitor.visit(this, context);
    }
}