package headfirst.strategy;

public abstract class Duck {
    FlyBehavior flyBehavior;
/**
 * bevat een referentie naar een interface die het gedrag  apart behandeld */
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    abstract void display();

    public void performFly() {
        flyBehavior.fly();
        /**
         * gedrag wordt hier gedelegeerd door interface, klasse behandeld gedrag niet maar aangemaakt object
         * van de interface wel*/
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
