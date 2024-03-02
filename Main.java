import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String  pilihan =null;
        double diskon=0, harga =0;
        int menu, porsi;
        System.out.println("\t\t\t\t\t\tBakso Family");
        System.out.println("====================================================================");
        System.out.println("Dapatkan diskon 10%. Dengan minimal pembelian 10 Porsi Bakso Jumbo!!");
        System.out.println("====================================================================");
        System.out.println("Daftar menu");
        System.out.println("1. Bakso Jumbo");
        System.out.println("2. Bakso tanggung");

        System.out.print("Pilih menu : ");
        menu=input.nextInt();
        System.out.print("Berapa porsi bakso = ");
        porsi=input.nextInt();


        if (menu==1){
            pilihan = "Bakso Jumbo";
            harga = 10000;
            if (porsi>=10){
                diskon= 10* (harga*porsi)/ 100;

                System.out.print("anda mendapat diskon 10%. Jadi yang dibayar = "+diskon);
            }
            else {
                System.out.println("* Anda tidak mendapat diskon karena tidak memenuhi min pembelian 10 ");
            }
        }
        else if (menu==2) {
            pilihan = "Bakso tanggung";
            harga = 6000;
            if (porsi >= 5) {
                diskon = 10 * (harga * porsi) / 100;

                System.out.print("anda mendapat diskon 10%. Jadi yang dibayar = " + diskon);
            }
        }
        else {
            System.out.println("pilihan tidak valid");
        }
        System.out.println("* Yang di beli = "+pilihan+" dengan porsi = "+ "bakso "+porsi);
        harga = (harga*porsi)- diskon ;
        System.out.println("* total bayar = Rp "+harga);
        System.out.println("Terima kasih \uD83E\uDEF6");


    }

}