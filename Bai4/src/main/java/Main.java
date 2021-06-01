public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator("Kawashaki");
        Thread thread1 = new Thread(numberGenerator1);
        thread1.setPriority(Thread.MIN_PRIORITY);
        NumberGenerator numberGenerator2 = new NumberGenerator("Hayubasha");
        Thread thread2 = new Thread(numberGenerator2);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();
    }
}