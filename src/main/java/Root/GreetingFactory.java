package Root;

public class GreetingFactory {

   private NullGreeting nullGreeting = new NullGreeting();

    public Greeting getGreeting(String greeting){
        if (greeting == null) {
            return nullGreeting;
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
        return nullGreeting;
    }
}
