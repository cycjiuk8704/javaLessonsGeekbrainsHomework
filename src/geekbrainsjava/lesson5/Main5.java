package geekbrainsjava.lesson5;

public class Main5 {
    public static void main(String[] args) {

        Worker[] workersArray = new Worker[]{
        new Worker("Ivanov Ivan Ivanovich", "Engineer", "ivanov@empmail.com", "8(932)752-12-32", 60000, 62),
        new Worker("Petrov Petr Petrovich", "Senior engineer", "Petrov@empmail.com", "8(946)912-21-52", 60000, 46),
        new Worker("Sicorov Sidor Sidorovich", "Technicist", "Sidorov@empmail.com", "8(951)739-45-81", 60000, 28),
        new Worker("Semenov Semen Semenovich", "Support engineer", "Semenov@empmail.com", "8(998)612-30-03", 60000, 33),
        new Worker("Gurgenov Gurgen Gurgenovich", "Foreman", "Gurgenov@empmail.com", "8(967)128-32-64", 160000, 54),
        };
        collectWorkersByAge(workersArray);
    }
    private static void collectWorkersByAge(Worker[] workersArray){
        int workersCollected = 0;
        for (Worker worker : workersArray) {
            if (worker.getAge() >= 40) {
                System.out.println(worker);
                workersCollected++;
            }
        }
        if (workersCollected == 0) {
            System.out.println("Сотрудников старше 40 лет не найдено");
        }
    }
}
