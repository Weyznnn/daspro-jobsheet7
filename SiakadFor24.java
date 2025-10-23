import java.util.Scanner;

public class SiakadFor24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int mahasiswa = 10, mahasiswaTidakLulus = 0, mahasiswaLulus;

        for (int i = 1; i <= mahasiswa; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai < 60) {
                mahasiswaTidakLulus++;
            }
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }
        mahasiswaLulus = mahasiswa - mahasiswaTidakLulus;
        sc.close();

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa yang lulus: " + mahasiswaLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + mahasiswaTidakLulus);
    }
}
