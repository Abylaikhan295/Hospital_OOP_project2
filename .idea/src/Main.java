package hospital;

public class Main {

    public static void main(String[] args) {

        // Create 2 patients
        Patient p1 = new Patient("P01", "Alice", 20, "Flu", true);
        Patient p2 = new Patient("P02", "Bob", 16, "Cold", false);

        // Create 1 doctor
        Doctor d1 = new Doctor("D01", "Dr. Smith", "Cardiology", 10, 5000);

        // Create 1 appointment
        Appointment a1 = new Appointment("A01", p1, d1, "2025-01-10");

        // Output
        System.out.println("=== Patients ===");
        System.out.println(p1);
        System.out.println(p2);

        System.out.println("\n=== Doctor ===");
        System.out.println(d1);

        System.out.println("\n=== Appointment Before Completion ===");
        System.out.println(a1);

        // Doctor diagnoses patient
        d1.diagnose(p1);

        // Complete appointment
        a1.completeAppointment();

        System.out.println("\n=== Appointment After Completion ===");
        System.out.println(a1);
    }
}
