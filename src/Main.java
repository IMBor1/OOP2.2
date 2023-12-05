public class Main {
    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor("Harry Potter", 40, 50, 70, 85, 55);
        Griffindor hermioneGranger = new Griffindor("Hermione Granger", 50, 45, 80, 75, 90);
        Griffindor ronWeasley = new Griffindor("Ron Weasley", 70, 65, 50, 75, 80);

        Sliserine dracoMalfoy = new Sliserine("Draco Malfoy", 60, 45,
                87, 54,
                67, 95, 34);
        Sliserine grahamMontague = new Sliserine("Graham Montague", 35, 89,
                76, 64,
                73, 87, 58);
        Sliserine gregoryGoyle = new Sliserine("Gregory Goyle", 92, 56,
                75, 45,
                53, 78, 87);

        Puffendui zachariahSmith = new Puffendui("Zachariah Smith", 24, 64,
                73, 91, 49);
        Puffendui cedricDiggory = new Puffendui("Cedric Diggory", 85, 71,
                56, 82, 53);
        Puffendui justinFinch_Fletchley = new Puffendui("GustinFinch-Fletchley", 62,
                73,
                56, 86, 64);

        Cogtevran zhouChang = new Cogtevran("Zhou Chang", 54, 62, 85, 92,
                46, 77);
        Cogtevran padmaPatil = new Cogtevran("Padma Patil", 45, 64,
                89, 74, 46, 77);
        Cogtevran marcusBelby = new Cogtevran("Marcus Belby", 90, 53,
                66, 71, 65, 78);

        Griffindor.compariserGriffindor(harryPotter, hermioneGranger);
    }


}