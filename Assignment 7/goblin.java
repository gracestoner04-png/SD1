public class goblin extends enemy{

    public goblin(int h, int d){
        super(h,d); //using super from emeny to ask for health and damage
    }

    @Override // overriding attack to have the goblin gobble
    void attack(){
        System.out.println("The goblin gobbles");
    }

}
