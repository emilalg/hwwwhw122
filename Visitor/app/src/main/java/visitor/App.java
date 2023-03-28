package visitor;

public class App {
    
    public static void main(String[] args) {
        StateVisitor visitor = new StateTransitionVisitor();
        Context context = new Context(new State1());

        for (int i = 0; i < 6; i++) {
            context.request(visitor);
        }
    }

}
