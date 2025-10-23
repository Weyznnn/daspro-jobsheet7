import java.util.Scanner;

public class PenjualanTiketBioskop24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hargaTiket = 50000, totalPenjualan = 0, tiketPembeli;
        int tiket;
        String namaPembeli;

        do {
            System.out.print("Masukkan nama pembeli (ketik 'batal' untuk keluar): ");
            namaPembeli = sc.nextLine();
            if (namaPembeli.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi tiket dibatalkan!");
                break;
            }
            
            System.out.print("Jumlah tiket dibeli: ");
            tiket = sc.nextInt();
            sc.nextLine();
            if (tiket < 0) {
                System.out.println("Jumlah tiket tidak valid, masukkan jumlah tiket yang valid!");
                continue;
            }

            if (tiket>10) {
                tiketPembeli = tiket*hargaTiket*0.85;
            } else if (tiket>5) {
                tiketPembeli = tiket*hargaTiket*0.9;
            } else {
                tiketPembeli = tiket*hargaTiket;
            }
            System.out.println("Tiket yang perlu dibayar: Rp. "+tiketPembeli);
            totalPenjualan += tiketPembeli;
        } while (true);
        sc.close();

        System.out.println("Total penjualan tiket hari ini: Rp. "+totalPenjualan);
    }
}
