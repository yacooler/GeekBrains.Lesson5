public class MainClass {

    public static void main(String[] args) {
        testPerson();
    }

    private static void testPerson() {
        Person[] personArray = new Person[5];
        personArray[0] = new Person("Иванов Антон Анатольевич", "Директор", "ivanovaa@myorg.ru", "8(926) 731-31-31", 370000.0F, 47);
        personArray[1] = new Person("Иванов Сергей Антонович", "Заместитель директора", "ivanovsa@myorg.ru", "8(965) 331-31-31", 240000.0F, 24);
        personArray[2] = new Person("Иванова Татьяна Владимировна", "Главный бухгалтер", "ivanovatv@myorg.ru", "8(965) 331-32-32", 190000.0F, 23);
        personArray[3] = new Person("Капица Владимир Федорович", "Бухгалтер", "kapitcsavf@myorg.ru", "8(901) 241-11-56", 70000.0F, 43);
        personArray[4] = new Person("Капица Елена Андреевна", "Менеджер", "kapitcsaea@myorg.ru", "8(925) 137-71-27", 54000.0F, 41);

        for (Person p:personArray) {
            if (p.getAge() > 40) p.printPerson();
        }
    }


}
