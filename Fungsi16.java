import java.util.HashMap;
public class Fungsi16 {

        private static int[][] stockBunga = {
                {1, 10, 5, 15, 7},
                {2, 6, 11, 9, 12},
                {3, 2, 10, 10, 5},
                {4, 5, 7, 12, 9}};

        private static int[] hargaBunga = {75000, 50000, 60000, 10000};
        public static void main(String[] args) {

            System.out.println("Pendapatan Setiap Cabang Jika Semua Bunga Terjual Dengan Habis: ");
            System.out.println("====================================================================");
            System.out.println("| Cabang | Aglonema | Keladi | Alocasia | Mawar | Total Pendapatan |");
            System.out.println("|========|==========|========|==========|=======|==================|");
            
            for (int i = 0; i < stockBunga.length; i++) {
                int totalPendapatan = 0;
                for (int j = 1; j < stockBunga[i].length; j++) {
                    totalPendapatan += stockBunga[i][j] * hargaBunga[j - 1];
                }
                System.out.printf("|   %d    |   %2d     |   %2d   |    %2d    |   %2d  |     %7d      |\n",
                        stockBunga[i][0], stockBunga[i][1], stockBunga[i][2], stockBunga[i][3], stockBunga[i][4], totalPendapatan);
                        System.out.println("--------------------------------------------------------------------");
            }
            System.out.println();
            System.out.println("Jumlah Stock Setiap Jenis Bunga Pada Cabang RoyalGarden 4: ");
            System.out.println("==========================================");
            System.out.println("|    Bunga    | Stock Awal | Stock Akhir |");
            System.out.println("|=============|============|=============|");
            System.out.printf("|  Aglonema   |     %2d     |      %2d     |\n", stockBunga[3][1], (stockBunga[3][1] - 1));
            System.out.printf("|   Keladi    |     %2d     |      %2d     |\n", stockBunga[3][2], (stockBunga[3][2] - 2));
            System.out.printf("|  Alocasia   |     %2d     |      %2d     |\n", stockBunga[3][3], (stockBunga[3][3] - 0));
            System.out.printf("|    Mawar    |     %2d     |      %2d     |\n", stockBunga[3][4], (stockBunga[3][4] - 5));
            System.out.println("==========================================");
        }
    }
    