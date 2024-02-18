import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[][] KOTA = {
            {"BANTEN"}, {"JAKARTA"}, {"BANDUNG"}, {"CIREBON"}, {"BOGOR"}, {"PEKALONGAN"},
            {"SEMARANG"}, {"SURABAYA"}, {"MALANG"}, {"TEGAL"} };

        System.out.println("===========================================================");
        System.out.print("Masukan Kode Plate Motor (A, B, D, E, F, G, H, L, N, T): ");
        String input = sc.nextLine();

        boolean kodeValid = false;
        int indexKode = -1;

        for (int i = 0; i < KODE.length; i++) {
            if (input.equalsIgnoreCase(String.valueOf(KODE[i]))) {
                kodeValid = true;
                indexKode = i;
                break;
            }
        }
        if (kodeValid) {
            System.out.println("Nama Kota: " + KOTA[indexKode][0]);
            for (int i = 1; i < KOTA[indexKode].length; i++) {
                System.out.print( "" + KOTA[indexKode][i]);
            }
            System.out.println("===========================================================");
        } else {
            System.out.println("Kode Plat yang Anda Masukan Salah. Silakan Coba Lagi.");
            System.out.println("===========================================================");
        }
    }
}
