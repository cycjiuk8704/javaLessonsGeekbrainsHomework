package geekbrainsjava.lesson5;

public class Main5 {
    public static void main(String[] args){
        Worker[] workersArray = new Worker[5];
        workersArray[0] = new Worker("Ivanov Ivan Ivanovich", "Engineer", "ivanov@empmail.com", "8(932)752-12-32", 60000, 62);
        workersArray[1] = new Worker("Petrov Petr Petrovich", "Senior engineer", "Petrov@empmail.com", "8(946)912-21-52", 60000, 46);
        workersArray[2] = new Worker("Sicorov Sidor Sidorovich", "Technicist", "Sidorov@empmail.com", "8(951)739-45-81", 60000, 28);
        workersArray[3] = new Worker("Semenov Semen Semenovich", "Support engineer", "Semenov@empmail.com", "8(998)612-30-03", 60000, 33);
        workersArray[4] = new Worker("Gurgenov Gurgen Gurgenovich", "Foreman", "Gurgenov@empmail.com", "8(967)128-32-64", 160000, 54);

        for(int i = 0, checkResult = 0; i < workersArray.length; i++) {
            if (workersArray[i].getAge() >= 40) {
                workersArray[i].printWorkerInfo();
                checkResult++;
            }
            if (checkResult == 0 && i == workersArray.length - 1){
                System.out.println("Сотрудников старше 40 лет не найдено");
            }
        }
    }

}
