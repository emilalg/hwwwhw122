package visitor;

public class State2 implements State {
    @Override
    public void handle(Context context, StateVisitor visitor) {
        System.out.println("State B handling.");
        visitor.visit(this, context);
    }
}