package Root;

public class Main {

    public static void main(String[] args) {
        //Builder
        Car car = new Car.CarBuilder("Honda", "Fit", 2020)
                .allWheelDrive(true)
                .milesPerGallon(30)
                .build();

        System.out.println(car.toString());

        //Singleton
        SingleObject object = SingleObject.getInstance();

        object.showMessage();

        //Factory
        GreetingFactory greetingFactory = new GreetingFactory();

        Greeting hi = greetingFactory.getGreeting("Hi");
        Greeting hello = greetingFactory.getGreeting("Hello");
        Greeting whatsUp = greetingFactory.getGreeting("Whatsup");

        hi.greet();
        hello.greet();
        whatsUp.greet();
    }


}
