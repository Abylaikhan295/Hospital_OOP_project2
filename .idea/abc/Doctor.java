package hospital;
import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String id;
    private String name;
    private String specialization;
    private int experienceYears;
    private double salary;
    private List<Patient> patients; // patients under this doctor

    public Doctor(String id, String name, String specialization, int experienceYears, double salary) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.experienceYears = experienceYears;
        this.salary = salary;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void diagnose(Patient patient) {
        System.out.println(name + " is diagnosing " + patient.getName());
        patient.setDisease("Diagnosed by " + name);
        patients.add(patient);
    }

    public void listPatients() {
        System.out.println("Patients under " + name + ":");
        for(Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }

    @Override
    public String toString() {
        return "Doctor ID: " + id +
                ", Name: " + name +
                ", Specialization: " + specialization +
                ", Experience: " + experienceYears + " years" +
                ", Salary: $" + salary;
    }
}
