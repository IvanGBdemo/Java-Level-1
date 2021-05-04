import java.util.Random;
/*Решение задания 1*/
public class Employee {

    String fullName;
    String position;
    int phoneNumber;
    int wages;
    int age;
//    int number;

    /*Решение задания 2*/
    public Employee(String valueFullName, String valuePosition, int valuePhoneNumber, int valueWages, int valueAge) {
        fullName = valueFullName;
        position = valuePosition;
        phoneNumber = valuePhoneNumber;
        wages = valueWages;
        age = valueAge;
//        number = valueNumber;
    }
    /*Решение задания 3*/
    //Getter
    public String getFullName() { return fullName; }
    public String getPosition() { return position; }
    public int getPhoneNumber() { return phoneNumber; }
    public int getWages() { return wages; }
    public int getAge() { return age; }
//    public int getNumber() { return number; }

    /*Решение задания 6*/
    //Setter
    public void setWages(int wages) {
        this.wages = wages;
    }
}

