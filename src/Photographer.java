public class Photographer extends Competitor{

    private String entryCategory;
    private String comment;

    public Photographer(String name, String address, String entryCategory, String comment){
        super(name, address);
        this.entryCategory = entryCategory;
        this.comment = comment;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Category: " + entryCategory);
        System.out.println("Comment: " + comment);
    }

    public String getEntryCategory() {
        return entryCategory;
    }

    public void setEntryCategory(String entryCategory) {
        this.entryCategory = entryCategory;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
