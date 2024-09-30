
/**
 * This class defines how power pills behave in
 * a game.  The purpose of a power pill is to simply
 * provide a character with power.
 *
 * @author (You)
 * @version (0.1)
 */
public class PowerPill
{
    static int DEFAULT_POWER = 10;
    // instance variables
    private int power;
    private String name;

    // constructors
    // public <ClassName> (<parameters>){
    //      code
    // }
    public PowerPill(String name){
        this.power = DEFAULT_POWER;
        this.name = name;
    }

    public PowerPill(String name, int power){
        this.power = power;
        this.name = name;
    }

    // accessor methods

    // TODO - replace this line with instruction from step 6

    public int getPower() {
        return power;
    }
    public String getName() {
        return name;
    }


    // mutator methods

    // TODO - replace this line with instruction from step 7

    public void setPower(int newPower) {
        this.power = newPower;
    }
    public void setName(String newName) {
        this.name = newName;
    }

    // toString method

    // TODO - replace this line with instruction from step 8
    public String toString(){
        return "PowerPill " + name + " = " + power;
    }
}