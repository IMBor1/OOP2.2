public class Cogtevran extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Cogtevran(String name, int power, int transegress, int intelligence, int wisdom, int wit, int creativity) {
        super(name, power, transegress);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Cogtevran{" +
                "intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                ", power=" + power +
                ", transegress=" + transegress +
                ", name='" + name + '\'' +
                '}';
    }

    public static void compariserCogtevran(Cogtevran cogtevran, Cogtevran cogtevran1) {
        if ((cogtevran.getIntelligence() + cogtevran.getWisdom() + cogtevran.getWit()
                + cogtevran.getCreativity()) >
                (cogtevran1.getIntelligence() + cogtevran1.getWisdom() +
                        cogtevran1.getWit() + cogtevran1.getCreativity())) {
            System.out.println(cogtevran.getName() + " лучший Когтевранец, чем " + cogtevran1.getName());
        } else {
            System.out.println(cogtevran1.getName() + " лучший Когтевранец, чем " + cogtevran.getName());
        }
    }
}
