package isp.lab5.exercise5;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestSimulator {
    @Test
    public void TestSimulate() {

        Herbivorous[] herbivorous = new Herbivorous[5];
        Carnivorous[] carnivorous = new Carnivorous[5];

        carnivorous[0] = (Carnivorous) new Lion(50);
        carnivorous[1] = (Carnivorous) new Tiger(22);
        carnivorous[2] = (Carnivorous) new Tiger(33);
        carnivorous[3] = (Carnivorous) new Lion(17);
        carnivorous[4] = (Carnivorous) new Tiger(93);

        herbivorous[0] = (Herbivorous) new Deer(20);
        herbivorous[1] = (Herbivorous) new Elk(66);
        herbivorous[2] = (Herbivorous) new Deer(88);
        herbivorous[3] = (Herbivorous) new Elk(10);
        herbivorous[4] = (Herbivorous) new Deer(25);

        Jungle jungle = new Jungle(herbivorous, carnivorous);
        Simulator simulator = new Simulator(jungle);
        simulator.simulate();

        assertNull("There are no herbivorous in the jungle", jungle.getHerbivorous()[0]);
        assertNotNull("There are carnivorous in the jungle", jungle.getCarnivorous()[0]);
    }

    @Test
    public void TestSimulateOnDraw() {
        Simulator simulator = new Simulator();
        Herbivorous herbivorous = (Herbivorous) new Deer(100);
        Carnivorous carnivorous = (Carnivorous) new Lion(100);
        simulator.replaceFirstCarnivorousAnimal(carnivorous);
        simulator.replaceFirstHerbivorousAnimal(herbivorous);
        simulator.simulate();
        assertTrue("It's a draw!", simulator.getJungle().getCarnivorous()[0].getChancesToHuntSuccessfully() == simulator.getJungle().getHerbivorous()[0].getChancesToRunSuccessfully());
    }
}