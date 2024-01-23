package Exception;

public class NullPointerException {
        public static void main(String[] args) {
        String text = null;

        try {
            int length = text.length();
            System.out.println("Panjang string: " + length);
        } catch (java.lang.NullPointerException e) {
            System.out.println("Kesalahan: String memiliki nilai null.");
        }
    }
}
