package lesson4;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public Employee() {
        this.name = "boris";
        this.position = "мастер прораб";
        this.email = "boris@mail.ru";
        this.phone = "101";
        this.salary = 2330;
        this.age = 33;
    }

    public void info() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return
                "name = " + name + "\n" +
                        " position = " + position + "\n" +
                        " email = " + email + "\n" +
                        " phone = " + phone + "\n" +
                        " salary = " + salary + "\n" +
                        " age = " + age;
    }
}
