public class Skyris extends Bakugan{
    private String ozelCanavar;
    public Skyris(String bakuganSahip, int saldiriGucu, String turu, String bakuganınTuru, String ulti,String ozelCanavar) {
        super(bakuganSahip, saldiriGucu, turu, bakuganınTuru, ulti);
        this.ozelCanavar=ozelCanavar;
    }

    @Override
    public void firlat() {
        System.out.println(getBakuganSahip() + " Skyris'i oyuna sürdü, Skyris'in saldırı gücü :  " + getSaldiriGucu());

    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Özel Canavarın Adı : " + ozelCanavar);

    }
}
