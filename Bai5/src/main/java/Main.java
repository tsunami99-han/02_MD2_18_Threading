public class Main {
    public static void main(String[] args) {
        OddThread odd = new OddThread("Số lẻ là");
        EvenThread even = new EvenThread("Số chẵn là");
        odd.start();
        try {
            odd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        even.start();
    }
}