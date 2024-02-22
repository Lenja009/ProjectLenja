package lesson4;

public class Main {
    public static void main(String[] agrs) {

        Employee employee = new Employee("boris", "мастер прораб", "boris@mail.ru",
                "101", 2330, 33);
        System.out.println(employee);

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "iv@mailbox.com", "892312312", 3000, 30);
        persArray[1] = new Employee("leanid khlan", "Cook", "Kh@mailbox.com", "375295462", 4000, 25);
        persArray[2] = new Employee("Olga Sheva", "Postman", "Sh@mailbox.com", "375334546", 5000, 33);
        persArray[3] = new Employee("Artem Ivanov", "Housewife", "iv@mailbox.com", "375696434", 7000, 17);
        persArray[4] = new Employee("Valentin Dydykin", "Doctor", "Dy@mailbox.com", "375292102", 8000, 68);

        Park park = new Park();
        Park.Attractions attraction = new Park.Attractions("аттракцион", "9:00-18:00", 1000);
        System.out.println(attraction.getName());
        System.out.println(attraction);
    }


}
