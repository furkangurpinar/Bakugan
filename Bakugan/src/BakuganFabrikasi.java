public class BakuganFabrikasi {
    public Bakugan bakuganUret(String bakuganTuru) {
        if (bakuganTuru.equals("Dragon")) {
            return new Dragon("Dan Kuso", 340, "Pyrus", "Ejderha", "Pyrus Canavarı", "Kırmızı Ejderha");

        } else if (bakuganTuru.equals("Tigrera")) {
            return new Tigrera("Runo Misaki", 340, "Helios", "Kaplan", "Kaplan Pençesi", "Dikenli Kaplan");


        } else if (bakuganTuru.equals("Skyris")) {
            return new Skyris("Shun Kazami", 340, "Ventus", "Anka Kuşu", "Rüzgar Saldırısı", "Yeşil Anka Kuşu");
        } else {
            return null;
        }
    }
}
