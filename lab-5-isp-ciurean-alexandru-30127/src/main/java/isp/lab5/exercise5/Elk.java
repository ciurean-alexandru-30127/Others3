package isp.lab5.exercise5;

import java.util.Random;

public class Elk extends Animal implements Herbivorous {
    private int chanceToRunSuccessfully;
    private String name;

    public Elk() {
        this.eat();
        Random random = new Random();
        this.chanceToRunSuccessfully = random.nextInt(101);
        super.age = random.nextInt(20);
        this.name = "" + random.nextInt(20);
    }

    public Elk(int chanceToRunSuccessfully) {
        this.chanceToRunSuccessfully = chanceToRunSuccessfully;
        this.eat();
        Random random = new Random();
        super.age = random.nextInt(20);
        this.name = "" + random.nextInt(20);
    }

    @Override
    public String toString() {
        return "Elk{" +
                "chanceToRunSuccessfully=" + chanceToRunSuccessfully +
                ", name='" + name + '\'' +
                ", age=" + age +
                "} ";
    }

    @Override
    void eat() {
        System.out.println("I am eating herb because i'm an elk");
    }

    @Override
    public void runSuccessfully() {
        System.out.println("Elk '" + this.name + "' run successfully at age " + this.age + " with a chance of " + this.chanceToRunSuccessfully + "%");
    }

    @Override
    public void runFailed() {
        System.out.println("Elk '" + this.name + "' run failed at age" + this.age + "with a chance of " + this.chanceToRunSuccessfully + "%");
    }

    @Override
    public int getChancesToRunSuccessfully() {
        return this.chanceToRunSuccessfully;
    }


}
