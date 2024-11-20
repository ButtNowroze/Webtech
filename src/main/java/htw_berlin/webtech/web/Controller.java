package htw_berlin.webtech.web;

public class Controller {
    private String name;
    private String affiliation;
    private double heightInCm;
    public Controller(String name, String affiliation, double heightInCm) {
        this.name = name;
        this.affiliation = affiliation;
        this.heightInCm = heightInCm;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAffiliation() {
        return affiliation;
    }
    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }
    public double getHeightInCm() {
        return heightInCm;
    }
    public void setHeightInCm(double heightInCm) {
        this.heightInCm = heightInCm;
    }


}
