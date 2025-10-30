public class Main {
    public static void main(String[] args) {

        //create a generic enemy and call its functions
        enemy e1 = new enemy(80, 35);

        e1.attack();

        //create a fire and an ice wizard and call all functions
        wizard w1 = new wizard(65,40,"Ice");
        wizard w2 = new wizard(90,70,"Fire");

        w1.damageType();
        w2.damageType();

        //create a goblin and call its functions
        goblin g1 = new goblin(30,100);

        g1.attack();

    }
}
