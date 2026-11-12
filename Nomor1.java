
import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka, terbesar = 0, terkecil = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            angka = input.nextInt();

            if (i == 1) {
                terbesar = angka;
                terkecil = angka;
            }
            if (angka > terbesar) terbesar = angka;
            if (angka < terkecil) terkecil = angka;
        }

        System.out.println("Bilangan terbesar: " + terbesar);
        System.out.println("Bilangan terkecil: " + terkecil);
    }
}
