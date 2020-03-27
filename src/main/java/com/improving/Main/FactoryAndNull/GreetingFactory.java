package com.improving.Main.FactoryAndNull;

public class GreetingFactory {

   private final NullGreeting nullGreeting = new NullGreeting();

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
