package com.improving.Main.FactoryAndNull;

public class NullGreeting implements Greeting {
    @Override
    public void greet() {
        System.out.println("This is not a valid greeting");
    }
}
