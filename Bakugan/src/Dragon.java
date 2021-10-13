public class Dragon extends Bakugan {
    private String ozelCanavar;


    public Dragon(String bakuganSahip, int saldiriGucu, String turu, String bakuganınTuru, String ulti,String ozelCanavar) {
        super(bakuganSahip, saldiriGucu, turu, bakuganınTuru, ulti);
        this.ozelCanavar=ozelCanavar;


    }




    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Özel Canavarın Adı : "+ozelCanavar);

    }

    @Override
    public void firlat() {
        System.out.println(getBakuganSahip() + " Dragon'u oyuna sürdü, Dragon'un saldırı gücü :  "+getSaldiriGucu());


    }
}
