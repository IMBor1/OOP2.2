public class Hogwarts {
    private int power;
    private int transegress;
    private String name;

    public Hogwarts(String name, int power, int transegress) {
        this.name = name;
        this.power = power;
        this.transegress = transegress;
    }

    public int getPower() {
        return power;
    }

    public int getTransegress() {
        return transegress;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setTransegress(int transegress) {
        this.transegress = transegress;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Hogwarts{" +
                "power=" + power +
                ", transegress=" + transegress +
                ", name='" + name + '\'' +
                '}';
    }


    public void printPerson() {
        System.out.println(toString());
    }

    public static void compariserHogwards(Hogwarts hogwarts, Hogwarts hogwarts1) {
        if ((hogwarts.getPower() + hogwarts.getTransegress()) >
                (hogwarts1.getPower() + hogwarts1.getTransegress())) {
            System.out.println(hogwarts.getName() + " лучший Хогвардец, чем " + hogwarts1.getName());
        } else {
            System.out.println(hogwarts1.getName() + " лучший Хогвардец, чем " + hogwarts.getName());
        }

    }
}
