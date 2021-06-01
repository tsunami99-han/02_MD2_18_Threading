public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        display(100000);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("Lazy is: " + (stopTime - startTime) + "ms");
    }

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else if (number == 2) {
            return true;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void display(int number) {
        for (int i = 0; i < number; i++) {
            if (isPrime(i)) {
                System.out.println("Lazy is: " + i);
            }
        }
    }
}