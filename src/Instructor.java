public class Instructor {

    private String firstName;
    private String lastName;
    private int brainWaveFrequency;
    private static int numInstructors = 0;

    public Instructor(String first, String last){
        this.firstName = first;
        this.lastName = last;
        this.brainWaveFrequency = 0;
        numInstructors++;

        System.out.printf("\t%s was just created\n", firstName);
        System.out.printf("\tInstuctor count: %d\n\n",numInstructors );
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String first){
        this.firstName = first;
    }

    public String getLastaName(){
        return lastName;
    }

    public void setLastaName(String last){
        this.lastName = last;
    }

    public int getBrainWaveFrequency(){
        return brainWaveFrequency;
    }

    public void setBrainWaveFrequency(int brainWaveFreq){
        this.brainWaveFrequency = brainWaveFreq;
    }

    public String displayStats(){
        return String.format("\t%s %s, Brainwave Frequency: %d\n", firstName, lastName, brainWaveFrequency);
    }

}
