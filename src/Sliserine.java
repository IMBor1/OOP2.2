public class Sliserine extends Hogwarts {
    protected int cunning;
    protected int determination;
    protected int ambition;
    protected int resourcefulness;
    protected int thirstForPower;

    public Sliserine(String name, int power, int transegress, int cunning, int determination, int ambition,
                     int resourcefulness, int thirstForPower) {
        super(name, power, transegress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return "Sliserine{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
                ", power=" + power +
                ", transegress=" + transegress +
                ", name='" + name + '\'' +
                '}';
    }

    public static void compariserSliserine(Sliserine sliserine, Sliserine sliserine1) {
        if ((sliserine.getCunning() + sliserine.getDetermination() + sliserine.getAmbition() +
                sliserine.getResourcefulness() + sliserine.getThirstForPower()) >
                (sliserine1.getCunning() + sliserine1.getDetermination() + sliserine1.getAmbition() +
                        sliserine.getResourcefulness() + sliserine.getThirstForPower())) {
            System.out.println(sliserine.getName() + " лучший Слизиринец, чем " + sliserine1.getName());
        } else {
            System.out.println(sliserine1.getName() + " лучший Слизиринец, чем " + sliserine.getName());
        }
    }
}
