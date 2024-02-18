import java.util.Scanner;
public class Pemilihan16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double NilaiTugas, NilaiKuis, NilaiUTS, NilaiUAS;
        double NilaiAkhir;
        String NilaiHuruf;

        System.out.println("---------------------------------------------");
        System.out.println("====== PROGRAM MENGHITUNG NILAI AKHIR ======");
        System.out.println("---------------------------------------------");

        System.out.print("Masukkan Nilai Tugas: ");
        NilaiTugas = sc.nextDouble();
        if (NilaiTugas < 0 || NilaiTugas > 100) {
            System.out.println("Nilai Tidak Valid");
            return;
        }

        System.out.print("Masukkan Nilai Kuis: ");
        NilaiKuis = sc.nextDouble();
        if (NilaiKuis < 0 || NilaiKuis > 100) {
            System.out.println("Nilai Tidak Valid");
            return;
        }

        System.out.print("Masukkan Nilai UTS: ");
        NilaiUTS = sc.nextDouble();
        if (NilaiUTS < 0 || NilaiUTS > 100) {
            System.out.println("Nilai Tidak Valid");
            return;
        }

        System.out.print("Masukkan Nilai UAS: ");
        NilaiUAS = sc.nextDouble();
        if (NilaiUAS < 0 || NilaiUAS > 100) {
            System.out.println("Nilai Tidak Valid");
            return;
        }

        NilaiAkhir = (0.2 * NilaiTugas) + (0.2 * NilaiKuis) + (0.3 * NilaiUTS) + (0.3 * NilaiUAS);
        System.out.println("=============================================");

        if (NilaiAkhir >= 80) {
            NilaiHuruf = "A";
        } else if (NilaiAkhir >= 73) {
            NilaiHuruf = "B+";
        } else if (NilaiAkhir >= 65) {
            NilaiHuruf = "B";
        } else if (NilaiAkhir >= 60) {
            NilaiHuruf = "C+";
        } else if (NilaiAkhir >= 50) {
            NilaiHuruf = "C";
        } else if (NilaiAkhir >= 39) {
            NilaiHuruf = "D";
        } else {
            NilaiHuruf = "E";
        }

        System.out.println("Nilai akhir: " + NilaiAkhir);
        System.out.println("Nilai huruf: " + NilaiHuruf);
        System.out.println("=============================================");
        System.out.println(NilaiAkhir >= 39 ? "SELAMAT ANDA LULUS" : "MOHON MAAF ANDA TIDAK LULUS");
        System.out.println("=============================================");
    }
}
