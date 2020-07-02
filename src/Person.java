public class Person {
    //ФИО, должность, email, телефон, зарплата, возраст
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private float salary;
    private int age;

    public Person(String fullName, String position, String email, String phone, float salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printPerson(){
        System.out.println(toString() + '\n');
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person:" +
                "ФИО: " + fullName +
                "\nДолжность: " + position +
                "\nПочта: " + email +
                "\nТелефон: " + phone +
                "\nЗарплата: " + salary +
                "\nВозраст:" + age;
    }
}
