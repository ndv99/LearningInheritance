/**
 * Testing class.
 */
public class Test {

    /**
     * Main method
     * @param args args
     */
    public static void main(String[] args){
        Competitor Nick = new Competitor("Nick De Villiers", "Flat 57 Belmont Flats, 76 Old Hawkhill," +
                "Dundee DD1 4hE");
        System.out.println(Nick.getName() + ", " + Nick.getAddress());
    }
}
