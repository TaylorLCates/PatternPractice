package Root;

public class GreetingFactory {

    public Greeting getGreeting(String greeting){
        if (greeting == null) {
            return null;
        }
        if (greeting.equalsIgnoreCase("Hi")) {
            return new Hi();
        }
        if (greeting.equalsIgnoreCase("Hello")) {
            return new Hello();
        }
        if (greeting.equalsIgnoreCase("Whatsup")) {
            return new WhatsUp();
        }
        return null;
    }
}
