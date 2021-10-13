public class Tigrera extends Bakugan {
    private String ozelCanavar;


    public Tigrera(String bakuganSahip, int saldiriGucu, String turu, String bakuganınTuru, String ulti, String ozelCanavar) {
        super(bakuganSahip, saldiriGucu, turu, bakuganınTuru, ulti);
        this.ozelCanavar = ozelCanavar;
    }

    @Override
    public void firlat() {
        System.out.println(getBakuganSahip() + " Tigrera'yı oyuna sürdü, Tigrera'nın saldırı gücü :  " + getSaldiriGucu());
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Özel Canavarın Adı : " + ozelCanavar);

    }
}
