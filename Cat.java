public class Cat extends Animal {

    public Cat(String name) {
        super(name);

    }

    @Override
    public void run(int length) {
        if (length <= 200) {
            System.out.println(name + " пробежал " + length + " м");
        }
    }
}
