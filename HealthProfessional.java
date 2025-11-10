/**
 * Base class representing a health professional.
 * Provides common properties and methods for all types of health professionals.
 */
public class HealthProfessional {
    // Unique identifier for the health professional
    protected int id;
    // Full name of the health professional
    protected String name;
    // Professional qualification/certification
    protected String qualification;

    /**
     * Default constructor creates a health professional with default values.
     */
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.qualification = "Not specified";
    }

    /**
     * Parameterized constructor creates a health professional with specified details.
     * 
     * @param id Unique identifier
     * @param name Full name
     * @param qualification Professional qualification
     */
    public HealthProfessional(int id, String name, String qualification) {
        this.id = id;
        this.name = name;
        this.qualification = qualification;
    }

    /**
     * Prints basic details of the health professional.
     */
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Qualification: " + qualification);
    }

    // Getter methods
    public int getId() { return id; }
    public String getName() { return name; }
    public String getQualification() { return qualification; }
}