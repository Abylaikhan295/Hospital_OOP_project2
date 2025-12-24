package hospital;

public class Appointment {
    private String date;
    private String patientName;
    private String doctorName;
    private double fee;

    public Appointment(String date, String patientName, String doctorName, double fee) {
        this.date = date;
        this.patientName = patientName;
        this.doctorName = doctorName;
        setFee(fee);
    }

    public Appointment() {
        this.date = "TBD";
        this.patientName = "Unknown";
        this.doctorName = "Unknown";
        this.fee = 0.0;
    }

    public String getDate() { return date; }
    public String getPatientName() { return patientName; }
    public String getDoctorName() { return doctorName; }
    public double getFee() { return fee; }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void setFee(double fee) {
        if (fee >= 0) {
            this.fee = fee;
        } else {
            this.fee = 0;
        }
    }

    public void reschedule(String newDate) {
        this.date = newDate;
    }

    public boolean isPremium() {
        return this.fee > 300;
    }

    public String toString() {
        return "Appointment{date='" + date + "', patient='" + patientName + "', doctor='" + doctorName + "', fee=" + fee + "}";
    }
}
