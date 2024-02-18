import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilihan;
        double hasil;

        while (true) {
            System.out.println("==================== Menu ===================");
            System.out.println("1. Kecepatan");
            System.out.println("2. Jarak");
            System.out.println("3. Waktu");
            System.out.println("4. Keluar");

            System.out.print("Pilih rumus yang ingin dihitung (1, 2, 3, 4): ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kecepatan (m/s): ");
                    double kecepatan = sc.nextDouble();
                    System.out.print("Masukkan waktu (s): ");
                    double waktu = sc.nextDouble();
                    hasil = hitungKecepatan(kecepatan, waktu);
                    System.out.println("Hasil perhitungan kecepatan: " + hasil + " m/s");
                    break;

                case 2:
                    System.out.print("Masukkan kecepatan (m/s): ");
                    kecepatan = sc.nextDouble();
                    System.out.print("Masukkan jarak (m): ");
                    double jarak = sc.nextDouble();
                    hasil = hitungJarak(kecepatan, jarak);
                    System.out.println("Hasil perhitungan jarak: " + hasil + " m");
                    break;

                case 3:
                    System.out.print("Masukkan kecepatan (m/s): ");
                    kecepatan = sc.nextDouble();
                    System.out.print("Masukkan jarak (m): ");
                    jarak = sc.nextDouble();
                    hasil = hitungWaktu(kecepatan, jarak);
                    System.out.println("Hasil perhitungan waktu: " + hasil + " s");
                    break;

                case 4:
                    System.out.println("Terima Kasih Telah Menggunakan Program Ini.");
                    System.out.println("==============================================");
                    sc.close();
                    System.exit(0);
                   break;

                default:
                    System.out.println("Pilihan Anda Salah. Silakan Coba Lagi.");
                    break;
            }
        }
    }

    public static double hitungKecepatan(double kecepatan, double waktu) {
        return kecepatan * waktu;
    }

    public static double hitungJarak(double kecepatan, double waktu) {
        return kecepatan * waktu;
    }

    public static double hitungWaktu(double kecepatan, double jarak) {
        return jarak / kecepatan;
    }
}
