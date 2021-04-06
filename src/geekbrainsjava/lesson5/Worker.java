package geekbrainsjava.lesson5;

public class Worker {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Worker(String name, String position, String email, String phoneNumber, int salary, int age) {
        setName(name);
        setPosition(position);
        setEmail(email);
        setPhoneNumber(phoneNumber);
        setSalary(salary);
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSalary(int salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.err.println("Ошибка! Некорректно указана зарплата.");
        }
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 75) {
            this.age = age;
        } else {
            System.err.println("Ошибка! Некорректно указан возраст.");
        }
    }

    public int getAge() {
        return age;
    }

    @Override

    public String toString() {
        return "Сотрудник: " + name + ". Должность: " + position + ". Email: " + email + ". Номер телефона : " + phoneNumber + ". Зарплата: " + salary + ". Возраст: " + age + '.';
    }

}
