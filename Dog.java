public class Dog extends Animal {

    public Dog(String name) {
        super(name);

    }
@Override
public void run(int length) {
    if (length <= 500) {
        System.out.println(name + " пробежал " + length + " м");
    }
}
@Override
public void swim(int length2) {
if (length2 <= 10) {
    System.out.println(name + " проплыл " + length2 + " м");
}
}
}
