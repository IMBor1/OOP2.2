public class Puffendui extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Puffendui(String name, int power, int transegress, int diligence, int loyalty, int honesty) {
        super(name, power, transegress);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Puffendui{" +
                "diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                ", power=" + power +
                ", transegress=" + transegress +
                ", name='" + name + '\'' +
                '}';
    }

    public static void compariserPuffendui(Puffendui puffendui, Puffendui puffendui1) {
        if ((puffendui.getDiligence() + puffendui.getLoyalty() + puffendui.getHonesty()) >
                (puffendui1.getDiligence() + puffendui1.getLoyalty() + puffendui1.getHonesty())) {
            System.out.println(puffendui.getName() + " лучший Пуффендуец, чем " + puffendui1.getName());
        } else {
            System.out.println(puffendui1.getName() + " лучший Пуффендуец, чем " + puffendui.getName());
        }
    }
}
