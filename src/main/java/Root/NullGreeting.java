package Root;

public class NullGreeting implements Greeting {
    @Override
    public void greet() {
        System.out.println("This is not a valid greeting");
    }
}
