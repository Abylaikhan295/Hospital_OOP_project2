package hospital;

public class Appointment {

    private String appointmentId;
    private Patient patient;
    private Doctor doctor;
    private String date;
    private boolean completed;
    private double fee;

    public Appointment(String appointmentId, Patient patient, Doctor doctor, String date, double fee) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.completed = false;
        this.fee = fee;
    }

    public void completeAppointment() {
        completed = true;
        System.out.println("Appointment " + appointmentId + " completed. Fee: $" + fee);
    }

    @Override
    public String toString() {
        return "Appointment ID: " + appointmentId +
                "\nPatient: " + patient.getName() +
                "\nDoctor: " + doctor.getName() +
                "\nDate: " + date +
                "\nCompleted: " + completed +
                "\nFee: $" + fee;
    }
}
