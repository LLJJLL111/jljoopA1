/**
 * Represents a Specialist doctor, a type of HealthProfessional with a specific medical specialty.
 * Extends the base HealthProfessional class with specialty and experience details.
 */
public class Specialist extends HealthProfessional {
    // Area of medical specialization
    private String specialty;
    // Number of years of professional experience
    private int yearsOfExperience;

    /**
     * Default constructor creates a Specialist with default values.
     */
    public Specialist() {
        super();
        this.specialty = "Not specified";
        this.yearsOfExperience = 0;
    }

    /**
     * Parameterized constructor creates a Specialist with specified details.
     * 
     * @param id Unique identifier
     * @param name Full name
     * @param qualification Professional qualification
     * @param specialty Area of medical specialization
     * @param yearsOfExperience Number of years of experience
     */
    public Specialist(int id, String name, String qualification, String specialty, int yearsOfExperience) {
        super(id, name, qualification);
        this.specialty = specialty;
        this.yearsOfExperience = yearsOfExperience;
    }

    /**
     * Prints comprehensive details of the Specialist including specialty and experience.
     */
    public void printHealthProfessionalDetails() {
        System.out.println("The health professional details are:");
        System.out.println("Type: Specialist");
        super.printDetails();
        System.out.println("Specialty: " + specialty);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("----------------------------");
    }

    // Getter methods
    public String getSpecialty() { return specialty; }
    public int getYearsOfExperience() { return yearsOfExperience; }
}