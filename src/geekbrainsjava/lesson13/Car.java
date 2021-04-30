package geekbrainsjava.lesson13;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private final Race race;
    private final int speed;
    private final String name;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(this.name + " готов");
            MainClass.waitForAllParticipantsPrepare.countDown();
            MainClass.startLatch.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            for (int i = 0; i < race.getStages().size(); i++) {
                race.getStages().get(i).go(this);
                if (MainClass.winLatch.getCount() != 0 && i == race.getStages().size() - 1) {
                    MainClass.winLatch.countDown();
                    System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Участник #" + name + " победил в гонке");
                }
            }

            MainClass.winLatch.countDown();
            MainClass.endRaceLatch.countDown();
            MainClass.endRaceLatch.await();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
