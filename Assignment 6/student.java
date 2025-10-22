public class student {
    String name;
    String year;
    double gpa;
    int id;

    //assigning the random id that will get free lunch
    int FreeLunch = 2345;

    public student(String n, String y, double g, int i){
        name = n;
        year = y;
        gpa = g;
        id = i;
    }

        //creating an if else check to see if the student is on the honor roll based on the gpa provided
        void isHonorRoll(){
        if (this.gpa > 3.6){
            System.out.println(this.name + " is a on honor roll");
        } else{
            System.out.println(this.name + " is not on honor roll");
        }
        
    }


        //checking if the student id matches the free lunch id and prints results, later to be called in main
        void isFreeLunch(){
        if(this.id == FreeLunch){
            System.out.println("Congrats " + this.name + " you get free lunch today, it is your lucky day!");
        }else{
            System.out.println(this.name + ", lunch will be $5 please.");
        }

    }
}
