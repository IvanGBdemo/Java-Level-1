public class Animal {
    //1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//4. * Добавить подсчет созданных котов, собак и животных.

    protected String name;
    private int numberOfAnimals;

    private static int number = 0;

    public Animal(String name) {
        this.name = name;
        this.numberOfAnimals = ++number;

    }
    public void run(int length) {
        System.out.println(name + " пробежал " + length + " м");
    }
    public void swim(int length2) {
        System.out.println(name + " проплыл " + length2 + " м");
    }
    String getNumberOfAnimals() {
        return "Животных создано: " + this.numberOfAnimals;
    }
}
