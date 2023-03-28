package visitor;

public interface State {
    void handle(Context context, StateVisitor visitor);
}

