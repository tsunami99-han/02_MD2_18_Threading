public class OddThread extends Thread {
    private String name;

    public OddThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 1) {
                System.out.println(name + ": " + i);
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}