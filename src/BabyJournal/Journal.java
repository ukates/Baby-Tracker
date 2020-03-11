package BabyJournal;


public class Journal {

    private String date;
    private String mood;
    private String craving;
    private String milestones;
    private double sleep;

    public String getDate() {
        return this.date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getMood() {
        return this.mood;
    }
    public void setMood(String mood) {
        this.mood = mood;
    }
    public String getCraving() {
        return this.craving;
    }
    public void setCraving(String craving) {
        this.craving = craving;
    }
    public String getMilestones() {
        return this.milestones;
    }
    public void setMilestones(String milestones) {
        this.milestones = milestones;
    }
    public double getSleep() {
        return this.sleep;
    }
    public void setSleep (double  sleep) {
        this.sleep = sleep;
    }
    public void display(){
        System.out.println("***Journal Entry***");
        System.out.println("Date       : " + this.date);
        System.out.println("Mood       : " + this.mood);
        System.out.println("Cravings   : " + this.craving);
        System.out.println("Milestones : " + this.milestones);
        System.out.println("Sleep      : " + this.sleep);
    }
}
