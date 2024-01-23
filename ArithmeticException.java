package Exception;

public class ArithmeticException {
        public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("Hasil pembagian: " + result);
        } catch (java.lang.ArithmeticException e) {
            System.out.println("Kesalahan: Pembagian dengan nol tidak diizinkan.");
        }
    }
}
