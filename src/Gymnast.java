public class Gymnast extends Competitor{

    private String country;
    private float finalScore;

    public Gymnast(String country, float finalScore){
        super();
        this.country = country;
        this.finalScore = finalScore;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Country: " + country);
        System.out.println("Final Score: " + finalScore);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public float getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(float finalScore) {
        this.finalScore = finalScore;
    }
}
