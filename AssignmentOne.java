import java.util.ArrayList;

/**
 * Main class for Assignment One, demonstrating object-oriented programming concepts
 * with health professionals and appointment management.
 */
public class AssignmentOne {
    // Collection to store all appointments
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    /**
     * Main method that demonstrates the functionality of the application.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        System.out.println("// Part 3 – Using classes and objects");

        // Create three General Practitioner objects
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Smith", "MBBS", "City Clinic");
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Johnson", "MD", "Northside Medical");
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Brown", "MBBS", "West End Health");

        // Create two Specialist objects
        Specialist spec1 = new Specialist(201, "Dr. Wilson", "MD Cardiology", "Cardiology", 15);
        Specialist spec2 = new Specialist(202, "Dr. Davis", "MD Neurology", "Neurology", 10);

        // Print details of all health professionals
        gp1.printHealthProfessionalDetails();
        gp2.printHealthProfessionalDetails();
        gp3.printHealthProfessionalDetails();
        spec1.printHealthProfessionalDetails();
        spec2.printHealthProfessionalDetails();

        System.out.println("---");

        // Part 5 – Collection of appointments
        System.out.println("// Part 5 – Collection of appointments");

        // Create appointments
        createAppointment("John Doe", "0412345678", "09:00", gp1);
        createAppointment("Jane Smith", "0498765432", "10:30", gp2);
        createAppointment("Bob Wilson", "0432145698", "14:00", spec1);
        createAppointment("Alice Brown", "0456789123", "15:30", spec2);

        // Print all existing appointments
        System.out.println("All appointments:");
        printExistingAppointments();

        // Cancel an appointment
        System.out.println("Cancelling appointment for mobile: 0498765432");
        cancelBooking("0498765432");

        // Print updated list of appointments
        System.out.println("Updated appointments:");
        printExistingAppointments();

        System.out.println("---");
    }

    /**
     * Creates a new appointment with the provided details and adds it to the collection.
     * Validates that all required information is provided.
     * 
     * @param patientName Name of the patient
     * @param mobilePhone Contact phone number
     * @param timeSlot Scheduled time for the appointment
     * @param doctor Health professional assigned
     */
    public static void createAppointment(String patientName, String mobilePhone,
                                         String timeSlot, HealthProfessional doctor) {
        if (patientName == null || patientName.trim().isEmpty() ||
                mobilePhone == null || mobilePhone.trim().isEmpty() ||
                timeSlot == null || timeSlot.trim().isEmpty() ||
                doctor == null) {
            System.out.println("Error: All appointment details must be provided.");
            return;
        }

        Appointment newAppointment = new Appointment(patientName, mobilePhone, timeSlot, doctor);
        appointments.add(newAppointment);
        System.out.println("Appointment created successfully for " + patientName + " at " + timeSlot);
    }

    /**
     * Prints details of all existing appointments to the console.
     * If no appointments exist, displays a message indicating that.
     */
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
            return;
        }

        for (Appointment appointment : appointments) {
            appointment.printAppointmentDetails();
        }
    }

    /**
     * Cancels an appointment based on the patient's mobile phone number.
     * 
     * @param mobilePhone Mobile phone number used to identify the appointment to cancel
     */
    public static void cancelBooking(String mobilePhone) {
        if (mobilePhone == null || mobilePhone.trim().isEmpty()) {
            System.out.println("Error: Mobile phone number must be provided.");
            return;
        }

        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getMobilePhone().equals(mobilePhone)) {
                appointments.remove(i);
                System.out.println("Appointment for mobile " + mobilePhone + " has been cancelled.");
                return;
            }
        }

        System.out.println("Error: No appointment found for mobile " + mobilePhone);
    }
}