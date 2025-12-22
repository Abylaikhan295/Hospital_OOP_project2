package hospital;

public class Doctor {

    private String id;
    private String name;
    private String specialization;
    private int experienceYears;
    private double salary;

    public Doctor(String id, String name, String specialization, int experienceYears, double salary) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.experienceYears = experienceYears;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void diagnose(Patient patient) {
        System.out.println(name + " is diagnosing " + patient.getName());
        patient.setDisease("Diagnosed by " + name);
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
