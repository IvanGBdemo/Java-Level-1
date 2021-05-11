public class EmployeeActivity {

    public static void main(String[] args) {
        /*Решение задания 5*/
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Греков Пётр Фёдорович", "программист", 895036600, 100000, 40);
        emplArray[1] = new Employee("Синицын Леонид Сергеевич", "менеджер проекта", 895027600, 150000, 46);
        emplArray[2] = new Employee("Гаранин Александр Иванович", "программист", 895036380, 80000, 32);
        emplArray[3] = new Employee("Арефьев Андрей Андреевич", "тимлид", 895031400, 120000, 38);
        emplArray[4] = new Employee("Цыганков Алексей Захарович", "тестировщик", 895036220, 50000, 43);

        System.out.println("Решение задания 4:");
        System.out.println(emplArray[0].getFullName() + " " + emplArray[0].getPosition());

        System.out.println("******************");
        System.out.println("Решение задания 5:");
        for(int i = 0; i < 5; i++) {
            if (emplArray[i].age > 40) {
                System.out.println(emplArray[i].getFullName() + " " + emplArray[i].getPosition() + " " + emplArray[i].getPhoneNumber() + " " + emplArray[i].getWages() + " " + emplArray[i].getAge());
            }
        }
        System.out.println("******************");
        System.out.println("Решение задания 6:");
        for(int i = 0; i < 5; i++) {
            if (emplArray[i].age > 35) {
                emplArray[i].setWages(emplArray[i].wages + 10000);
                System.out.println(emplArray[i].getFullName() + " " + emplArray[i].getPosition() + " " + emplArray[i].getPhoneNumber() + " " + emplArray[i].getWages() + " " + emplArray[i].getAge());
            }
        }
    }
}
