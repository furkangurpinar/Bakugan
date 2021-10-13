public class Bakugan {
    private String bakuganSahip;
    private int saldiriGucu;
    private String element;
    private String bakuganınTuru;
    private String ulti;


    public Bakugan(String bakuganSahip, int saldiriGucu, String element,String bakuganınTuru,String ulti) {
        this.bakuganSahip = bakuganSahip;
        this.saldiriGucu = saldiriGucu;
        this.element = element;
        this.bakuganınTuru=bakuganınTuru;
        this.ulti=ulti;
    }

    public String getBakuganSahip() {
        return bakuganSahip;
    }

    public void setBakuganSahip(String bakuganSahip) {
        this.bakuganSahip = bakuganSahip;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getBakuganınTuru() {
        return bakuganınTuru;
    }

    public void setBakuganınTuru(String bakuganınTuru) {
        this.bakuganınTuru = bakuganınTuru;
    }

    public String getUlti() {
        return ulti;
    }

    public void setUlti(String ulti) {
        this.ulti = ulti;
    }

    public void firlat() {
        System.out.println(getBakuganSahip() + "bakuganı oyuna sürüyor,bu bakuganın saldırı gücü " + saldiriGucu);

    }

    public void bilgileriGoster() {
        System.out.println("Bakuganın sahibinin adı : " + bakuganSahip);
        System.out.println("Bakuganın saldırı gücü : " + saldiriGucu);
        System.out.println("Bakuganın elementi : " + element);
        System.out.println("Bakuganın türü : " +bakuganınTuru);
        System.out.println("Bakuganın özel saldırısı : "+ulti);
    }
}
