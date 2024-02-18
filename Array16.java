import java.util.Scanner;
public class Array16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] mataKuliah = {"Critical Thinking & Problem Solving", "Bahasa Indonesia", "Pengantar Akuntansi, Manajemen & Bisnis",
                "Praktikum Dasar Pemgrograman", "Bahasa Inggris", "Konsep Teknologi Informasi", "Dasar Pemgrograman", "Matematika Dasar", "Agama"};

        double[] bobotSKS = {2, 2, 2, 3, 2, 2, 2, 2, 2};
        double[] nilaiAngka = new double[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];
        double[] bobotNilai = new double[mataKuliah.length];

        double totalBobotSKS = 0;
        double totalNilaiSetara = 0;

        System.out.println("==================================================");
        System.out.println("-------- Program Menghitung IP Semester ----------");
        System.out.println("==================================================");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            if (nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.00;
                totalNilaiSetara += bobotNilai[i] * bobotSKS[i];
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.50;
                totalNilaiSetara += bobotNilai[i] * bobotSKS[i];
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.00;
                totalNilaiSetara += bobotNilai[i] * bobotSKS[i];
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.50;
                totalNilaiSetara += bobotNilai[i] * bobotSKS[i];
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.00;
                totalNilaiSetara += bobotNilai[i] * bobotSKS[i];
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.00;
                totalNilaiSetara += bobotNilai[i] * bobotSKS[i];
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.00;
                totalNilaiSetara += bobotNilai[i] * bobotSKS[i];
            }
            totalBobotSKS += bobotSKS[i];
        }
        System.out.println("================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("================================");
        System.out.printf("%-40s%-15s%-15s%-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-40s%-15.2f%-15s%-15.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }
        double ipSemester = totalNilaiSetara / totalBobotSKS;
        System.out.println("================================");
        System.out.printf("IP: %.2f\n", ipSemester);
        System.out.println("================================");
    }
}
