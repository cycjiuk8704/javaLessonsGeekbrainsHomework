package geekbrainsjava.lesson13;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class MainClass {

    public static final int CARS_COUNT = 4;

    public static final CountDownLatch waitForAllParticipantsPrepare = new CountDownLatch(CARS_COUNT);
    public static final CountDownLatch endRaceLatch = new CountDownLatch(CARS_COUNT);
    public static final CountDownLatch startLatch = new CountDownLatch(1);
    public static final Semaphore tunnelSemaphore = new Semaphore(CARS_COUNT / 2);
    public static final CountDownLatch winLatch = new CountDownLatch(1);


    public static void main(String[] args) {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
        }
        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }
        try {
            waitForAllParticipantsPrepare.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        startLatch.countDown();

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
        try {

            endRaceLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
    }
}

