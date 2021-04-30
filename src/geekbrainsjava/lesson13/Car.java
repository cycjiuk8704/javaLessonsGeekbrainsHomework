package geekbrainsjava.lesson13;

import java.util.concurrent.CountDownLatch;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private String name;
    CountDownLatch waitForAllParticipantsPrepare;
    CountDownLatch endRaceLatch;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed, CountDownLatch waitForAllParticipantsPrepare, CountDownLatch endRaceLatch) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
        this.waitForAllParticipantsPrepare = waitForAllParticipantsPrepare;
        this.endRaceLatch = endRaceLatch;

    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(this.name + " готов");
            waitForAllParticipantsPrepare.countDown();
            waitForAllParticipantsPrepare.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            for (int i = 0; i < race.getStages().size(); i++) {
                race.getStages().get(i).go(this);
            }
            endRaceLatch.countDown();
            endRaceLatch.await();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
