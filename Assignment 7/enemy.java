public class enemy {
    int health;
    int damage;

    //assigning health and damnge as after they are given by the user
    public enemy(int h, int d){
        health = h;
        damage = d;
    }


    //printing generic attack message 
    void attack(){
        System.out.println("The enemy attacks");
    }
}
