package visitor;

public class State3 implements State {
    @Override
    public void handle(Context context, StateVisitor visitor) {
        System.out.println("State C handling.");
        visitor.visit(this, context);
    }
}