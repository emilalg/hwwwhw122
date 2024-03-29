package visitor;

public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request(StateVisitor visitor) {
        state.handle(this, visitor);
    }
}