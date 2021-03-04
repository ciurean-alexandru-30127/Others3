package isp.lab5.exercise5;

import java.util.Random;

public class Deer extends Animal implements Herbivorous {

    private int chanceToRunSuccessfully;
    private String name;

    public Deer(int chanceToRunSuccessfully) {
        this.chanceToRunSuccessfully = chanceToRunSuccessfully;
        this.eat();
        Random random = new Random();
        super.age = random.nextInt(20);
        this.name = "" + random.nextInt(20);
    }

    public Deer() {
        this.eat();
        super.species = "herbivorous";
        Random random = new Random();
        this.chanceToRunSuccessfully = random.nextInt(101);
        super.age = random.nextInt(20);
        this.name = "" + random.nextInt(20);
    }

    @Override
    public String toString() {
        return "Deer{" +
                "chanceToRunSuccessfully=" + chanceToRunSuccessfully +
                ", name='" + name + '\'' +
                ", age=" + age +
                "} ";
    }

    @Override
    void eat() {
        System.out.println("I am eating herb because i'm a deer");
    }

    @Override
    public void runSuccessfully() {
        System.out.println("Deer '" + this.name + "' run successfully at age " + this.age + " with a chance of " + this.chanceToRunSuccessfully + "%");
    }

    @Override
    public void runFailed() {
        System.out.println("Deer '" + this.name + "' run failed at age " + this.age + " with a chance of " + this.chanceToRunSuccessfully + "%");
    }

    @Override
    public int getChancesToRunSuccessfully() {
        return this.chanceToRunSuccessfully;
    }
}
