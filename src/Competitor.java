/**
 * Class to store information about a competitor for any competition.
 */

public class Competitor {

    private String name;
    private String address;

    public Competitor(){

    }

    public Competitor(String name, String address){
        this.name = name;
        this.address = address;
    }

    public void print(){
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }

    /**
     * Accessor for name.
     * @return string - name of competitor.
     */
    public String getName() {
        return name;
    }

    /**
     * Mutator for name.
     * @param name string for name of competitor.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Accessor for address.
     * @return string - address of competitor.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Mutator for address.
     * @param address string for address of competitor.
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
