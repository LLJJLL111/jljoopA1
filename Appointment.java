/**
 * Represents a medical appointment with a patient and health professional.
 * Stores details such as patient information, appointment time, and attending doctor.
 */
public class Appointment {
    // Patient's full name
    private String patientName;
    // Patient's contact mobile phone number
    private String mobilePhone;
    // Scheduled time slot for the appointment
    private String timeSlot;
    // Health professional assigned to the appointment
    private HealthProfessional doctor;

    /**
     * Default constructor creates an appointment with default values.
     */
    public Appointment() {
        this.patientName = "Unknown";
        this.mobilePhone = "Not provided";
        this.timeSlot = "Not scheduled";
        this.doctor = null;
    }

    /**
     * Parameterized constructor creates an appointment with specified details.
     * 
     * @param patientName Name of the patient
     * @param mobilePhone Contact phone number
     * @param timeSlot Scheduled time for the appointment
     * @param doctor Health professional assigned
     */
    public Appointment(String patientName, String mobilePhone, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    /**
     * Prints all details of the appointment to the console.
     */
    public void printAppointmentDetails() {
        System.out.println("Appointment Details:");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile Phone: " + mobilePhone);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Doctor: " + doctor.getName() + " (ID: " + doctor.getId() + ")");
        System.out.println("----------------------------");
    }

    // Getter methods
    public String getPatientName() { return patientName; }
    public String getMobilePhone() { return mobilePhone; }
    public String getTimeSlot() { return timeSlot; }
    public HealthProfessional getDoctor() { return doctor; }
}