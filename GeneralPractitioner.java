/**
 * Represents a General Practitioner, a type of HealthProfessional with a clinic location.
 * Extends the base HealthProfessional class with additional specialization details.
 */
public class GeneralPractitioner extends HealthProfessional {
    // Physical location of the clinic where the GP practices
    private String clinicLocation;

    /**
     * Default constructor creates a GP with default values.
     */
    public GeneralPractitioner() {
        super();
        this.clinicLocation = "Not specified";
    }

    /**
     * Parameterized constructor creates a GP with specified details.
     * 
     * @param id Unique identifier
     * @param name Full name
     * @param qualification Professional qualification
     * @param clinicLocation Location of the clinic
     */
    public GeneralPractitioner(int id, String name, String qualification, String clinicLocation) {
        super(id, name, qualification);
        this.clinicLocation = clinicLocation;
    }

    /**
     * Prints comprehensive details of the General Practitioner including type and clinic location.
     */
    public void printHealthProfessionalDetails() {
        System.out.println("The health professional details are:");
        System.out.println("Type: General Practitioner");
        super.printDetails();
        System.out.println("Clinic Location: " + clinicLocation);
        System.out.println("----------------------------");
    }

    // Getter method
    public String getClinicLocation() { return clinicLocation; }
}