public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, int power, int transegress, int nobility, int honor, int bravery) {
        super(name, power, transegress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Griffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                ", power=" + getPower() +
                ", transegress=" + getTransegress() +
                ", name='" + getName() + '\'' +
                '}';
    }

    public static void compariserGriffindor(Griffindor griffindor, Griffindor griffindor1) {
        if ((griffindor.getBravery() + griffindor.getHonor() + griffindor.getNobility()) >
                (griffindor1.getBravery() + griffindor1.getHonor() + griffindor1.getNobility())) {
            System.out.println(griffindor.getName() + " лучший Гриффиндорец, чем " + griffindor1.getName());
        } else {
            System.out.println(griffindor1.getName() + " лучший Гриффиндорец, чем " + griffindor.getName());
        }

    }
}
