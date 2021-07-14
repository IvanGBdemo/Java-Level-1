import java.util.Random;

public class Soldier {

    protected String name;
    protected int attack;
    protected float defense;
    protected float hp;
    protected float healing;
    private Random random = new Random();

    public Soldier (String name, int attack, float defense, float hp, float healing) {
    this.attack = attack;
    this.name = name;
    this.defense = defense;
    if (hp < 0) {
        this.hp = -hp;
    } else {
        this.hp = hp;
    }
    this.healing = healing;
}
    public Soldier (String name, int attack, float defense, float hp) {
        this.attack = attack;
        this.name = name;
        this.defense = defense;
        if (hp < 0) {
            this.hp = -hp;
        } else {
            this.hp = hp;
        }
    }
public float attack(Soldier enemy) {
    if (enemy != this) {
    float dealDamage = (this.attack - (this.attack / enemy.defense)) * random.nextFloat();
        enemy.hp -= dealDamage;
    System.out.println(this.name + " deal damage > " + enemy.name + " >> " + dealDamage + " dmg.");
    return dealDamage;
    } else {
        System.out.println("It's me");
        return 0;
    }
    }
float dealDamage;
    public void healing(Soldier enemy) {
        if (enemy.hp < hp) {
            float toHeal = this.healing;
            enemy.hp += toHeal;
            System.out.println(this.name + " to heal > " + enemy.name + " >> " + toHeal + " HP");
        }
    }
    /*Здесь не получилось вытащить переменную float dealDamage из метода attack, поэтому пришлось пойти по не совсем правильному пути*/
public void healSelf(Soldier enemy) {
    float summaryHeal = 0.1f * this.defense + 1;
    if (summaryHeal < dealDamage) {
        this.hp += summaryHeal;
        System.out.println(this.name + " defense " + summaryHeal + ". My hp = " + this.hp);
    } else {
        this.hp += dealDamage;
    System.out.println(this.name + " defense " + dealDamage + ". My hp = " + this.hp);
}
}
    public String getMeInfo() {
        return "My name is " + this.name + ". My attack " + this.attack + ". My health is " + this.hp;
    }
    public boolean isDeadHero() {
        return this.hp <= 0;
    }

    public String getName() {
        return name;
    }

    public float getAttack() {
        return attack;
    }

    public float getDefense() {
        return defense;
    }

    public float getHp() {
        return hp;
    }
    public float getHealing() {
        return healing;
    }
}
