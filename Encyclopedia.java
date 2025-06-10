//package CS170LAB10;

public class Encyclopedia extends Book {
    // TODO: Declare private fields: edition, numVolumes
    private String edition;
    private int numVolumes;

    // TODO: Define mutator methods -
    //       setEdition(), setNumVolumes()
    public void setEdition(String userE){
        edition=userE;
    }
    public void setNumVolumes(int userNV){
        numVolumes=userNV;
    }
    // TODO: Define accessor methods -
    //       getEdition(), getNumVolumes()
    public String getEdition(){
        return edition;
    }
    public int getNumVolumes(){
        return numVolumes;
    }
    // TODO: Define a printInfo() method that overrides
    //       the printInfo in Book class
    public void printInfo(){
        System.out.println("Book Information: ");
        System.out.println("   Book Title: " + title);
        System.out.println("   Author: " + author);
        System.out.println("   Publisher: " + publisher);
        System.out.println("   Publication Date: " + publicationDate);
        System.out.println("    Edition:   " + edition);
        System.out.println("    Volume No:"+ numVolumes);
    }
}
