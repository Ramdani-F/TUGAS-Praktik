
import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, angka, jumlah = 0;

        System.out.print("Masukkan banyak bilangan: ");
        n = input.nextInt();

        if (n <= 0) {
            System.out.println("Banyak bilangan harus lebih dari 0.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            angka = input.nextInt();
            jumlah += angka;
        }

        double rataRata = (double) jumlah / n;
        System.out.println("Total jumlah bilangan: " + jumlah);
        System.out.println("Rata-rata: " + rataRata);
    }
}

