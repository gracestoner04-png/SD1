public class wizard extends enemy{
    String type;
    public wizard(int h, int d, String t) {
        super(h, d); //using super from emeny to ask for health and damage
        type = t; // assigning type to t
    }
    void damageType(){
        if (type == "Fire"){
            System.out.println("This wizard shoots a fireball");
        }
        else if (type == "Ice"){
            System.out.println("This wizard shoots an iceball");
        }
        else {
            System.out.println("This wizard is temperate :)"); //maybe the wizard is not fire OR ice...?
        }


    }
}
