package isp.lab5.exercise5;

import java.util.Random;

public class Lion extends Animal implements Carnivorous {

    private int chanceToHuntSuccessfully;
    private String name;

    public Lion(int chanceToHuntSuccessfully) {
        this.chanceToHuntSuccessfully = chanceToHuntSuccessfully;
        this.eat();
        Random random = new Random();
        super.age = random.nextInt(20);
        this.name = "" + random.nextInt(20);
    }

    public Lion() {
        this.eat();
        Random random = new Random();
        this.chanceToHuntSuccessfully = random.nextInt(101);
        super.age = random.nextInt(20);
        this.name = "" + random.nextInt(20);
    }

    @Override
    public String toString() {
        return "Lion{" +
                "chanceToHuntSuccessfully=" + chanceToHuntSuccessfully +
                ", name='" + name + '\'' +
                ", age=" + age +
                "} ";
    }

    @Override
    void eat() {
        System.out.println("I am eating deer and elk meal because i'm a lion");
    }

    @Override
    public void huntSuccessfully() {
        System.out.println("Lion '" + this.name + "' hunt successfully at age " + this.age + " with a chance of " + this.chanceToHuntSuccessfully + "%");
    }

    @Override
    public void huntFailed() {
        System.out.println("Lion '" + this.name + "' hunt failed at age " + this.age + "with a chance of " + this.chanceToHuntSuccessfully + "%");

    }

    @Override
    public int getChancesToHuntSuccessfully() {
        return this.chanceToHuntSuccessfully;
    }
}