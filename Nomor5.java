
public class Nomor5 {
    public static void main(String[] args) {
        System.out.printf("%-22s%s%n", "Half Triangle", "Full Triangle");

        for (int i = 1; i <= 5; i++) {
            StringBuilder half = new StringBuilder();
            for (int j = 1; j <= (2 * i - 1); j++) {
                half.append("*");
            }

            int banyakBintang = (i <= 3) ? (2 * i - 1) : (2 * (5 - i) + 1);
            StringBuilder full = new StringBuilder();
            for (int j = 1; j <= banyakBintang; j++) {
                full.append("*");
            }

            System.out.printf("%-22s%s%n", half, full);
        }
    }
}

