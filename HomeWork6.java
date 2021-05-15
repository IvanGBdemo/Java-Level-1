public class HomeWork6 {

    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик");
        Dog dog = new Dog("Пушок");

        cat.run(150);
        System.out.println(cat.getNumberOfAnimals());

        dog.run(200);
        dog.swim(30);
        System.out.println(dog.getNumberOfAnimals());
    }
}
