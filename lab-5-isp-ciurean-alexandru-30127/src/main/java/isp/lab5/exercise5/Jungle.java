package isp.lab5.exercise5;

public class Jungle {
    private Herbivorous[] herbivorous;
    private Carnivorous[] carnivorous;

    public Jungle() {
    }

    public Herbivorous[] getHerbivorous() {
        return herbivorous;
    }

    public void setHerbivorous(Herbivorous[] herbivorous) {
        this.herbivorous = herbivorous;
    }

    public Carnivorous[] getCarnivorous() {
        return carnivorous;
    }

    public void setCarnivorous(Carnivorous[] carnivorous) {
        this.carnivorous = carnivorous;
    }

    public Jungle(Herbivorous[] herbivorous, Carnivorous[] carnivorous) {
        this.herbivorous = herbivorous;
        this.carnivorous = carnivorous;
    }

    public void removeAnimalFromHerbivorous(int index) {

        int length = this.herbivorous.length;
        this.herbivorous[index] = null;
        if (length - 1 - index >= 0)
            System.arraycopy(this.herbivorous, index + 1, this.herbivorous, index, length - 1 - index);
        this.herbivorous[length - 1] = null;
    }

    public void removeAnimalFromCarnivorous(int index) {

        int length = this.carnivorous.length;
        this.carnivorous[index] = null;
        if (length - 1 - index >= 0)
            System.arraycopy(this.carnivorous, index + 1, this.carnivorous, index, length - 1 - index);
        this.carnivorous[length - 1] = null;
    }
}
