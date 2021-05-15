public class Medic extends Soldier {

    public Medic(String name, int attack, float defense, float hp, float healing) {

        super(name, attack, defense, hp, healing);
    }
@Override
public String getMeInfo() {
    return "My name is " + this.name + ". I heal " + this.healing + " HP.";
}
}
