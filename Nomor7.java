
public class Nomor7 {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Menggunakan i++:");
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        i = 1;
        System.out.println("Menggunakan ++i:");
        while (i <= 5) {
            System.out.println(i);
            ++i;
        }

        System.out.println("Keduanya menghasilkan urutan yang sama jika berdiri sendiri.");
    }
}
