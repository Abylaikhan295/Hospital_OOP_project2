package hospital;

public class Main {
    public static void main(String[] args) {
        Patient p1 = new Patient("P01", "Alice", 20, "Flu", true);
        Patient p2 = new Patient("P02", "Bob", 16, "Cold", false);

        Doctor d1 = new Doctor("D01", "Dr. Smith", "Cardiology", 10, 5000);

        Appointment a1 = new Appointment("A01", p1, d1, "2025-01-10", 200);

        System.out.println("=== Patients ===");
        System.out.println(p1);
        System.out.println(p2);

        System.out.println("\n=== Doctor ===");
        System.out.println(d1);

        System.out.println("\n=== Appointment Before Completion ===");
        System.out.println(a1);

        // Doctor diagnoses patient
        d1.diagnose(p1);
        d1.listPatients();

        // Complete appointment
        a1.completeAppointment();
        p1.discharge();

        System.out.println("\n=== Appointment After Completion ===");
        System.out.println(a1);
        System.out.println("\n=== Patient Updated ===");
        System.out.println(p1);
    }
}

