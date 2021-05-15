public class Battle {

    private static int round = 1;

    public static void main(String[] args) throws InterruptedException {

        LightSoldier lightSoldier = new LightSoldier("LightSoldier", 20, 25f, 100f);
        DarkSoldier darkSoldier = new DarkSoldier("DarkSoldier", 27, 5f, 150f);
        Medic medic = new Medic("Medic",0,5f,70f,7f);

        while (!lightSoldier.isDeadHero() || !darkSoldier.isDeadHero()) {
            System.out.println("*** Round " + round + " ***");
            System.out.println(lightSoldier.getMeInfo());
            System.out.println(darkSoldier.getMeInfo());
            System.out.println(medic.getMeInfo());

            lightSoldier.attack(darkSoldier);
            if (darkSoldier.isDeadHero()) {
                System.out.println(lightSoldier.getName() + " win!");
                break;
            }

            darkSoldier.attack(lightSoldier);
            if (lightSoldier.isDeadHero()) {
                System.out.println(darkSoldier.getName() + " win!");
                break;
            }

            lightSoldier.healSelf();

            medic.healing(lightSoldier);
            if (lightSoldier.isDeadHero()) {
                System.out.println("Goodbye friend!");
                break;
            }
            if (darkSoldier.isDeadHero()) {
                System.out.println("We won!");
                break;
            }

            round++;
            Thread.sleep(3000);
        }
    }
}
