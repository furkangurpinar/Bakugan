import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bakugan Programına Hoşgeldiniz");
        System.out.println("Çıkış için q basınız");
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Hangi Bakuganı üretmek istiyorsunuz ? ");
            String islem = input.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }else{
                BakuganFabrikasi fabrikasi = new BakuganFabrikasi();
                Bakugan bakugan = fabrikasi.bakuganUret(islem);
                if(bakugan==null){
                    System.out.println("Lütfen geçerli bir bakugan ismi yazınız");
                }else{
                    bakugan.bilgileriGoster();
                    bakugan.firlat();
                }
            }
        }

        }


    }
