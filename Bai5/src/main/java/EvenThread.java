public class EvenThread extends Thread{
    private String name;

    public EvenThread(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(name + ": " + i);
            }
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}