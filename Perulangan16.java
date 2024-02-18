import java.util.Scanner;
public class Perulangan16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM : ");
        String nim = sc.nextLine();
        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        if (n < 10) {
            n += 10;
        }
        
        System.out.println("Jumlah n: " + n); 
        
        System.out.print("Output: ");
        for (int i = 1; i <= n; i++) {
            if (i != 6 && i != 10) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(" * ");
                }
            }
        }
        
        sc.close();
    }
}
    
