
import java.util.Scanner;

public class Nomor4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak angka: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Banyak angka tidak boleh negatif.");
            return;
        }

        int jumlah = 0;
        for (int i = 1; i <= n; i++) {
            int ganjil = (2 * i) - 1;
            System.out.print(ganjil + " ");
            jumlah += ganjil;
        }

        System.out.println();
        System.out.println("Total penjumlahan: " + jumlah);
    }
}
