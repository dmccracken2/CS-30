
package SwimTeam;


public class Swimmer {
    //instance Variables
    protected String firstName;
    protected String lastName;
    public int userID;
    protected double swimTime;
    
    //constructor methods
    public Swimmer(String fn, String ln, int id, double st){
        firstName = fn;
        lastName = ln;
        userID = id;
        swimTime = st;
    }
}//end Swimmer
