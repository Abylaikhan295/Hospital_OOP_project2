package hospital;
import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String id;
    private String name;
    private int age;
    private String disease;
    private boolean admitted;
    private List<String> medicalHistory; // store all past diseases

    public Patient(String id, String name, int age, String disease, boolean admitted) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.admitted = admitted;
        this.medicalHistory = new ArrayList<>();
        if(disease != null && !disease.isEmpty()) {
            medicalHistory.add(disease);
        }
    }

    public String getName() {
        return name;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        if(this.disease != null && !this.disease.isEmpty()) {
            medicalHistory.add(this.disease);
        }
        this.disease = disease;
    }

    public void admit() {
        admitted = true;
        System.out.println(name + " has been admitted.");
    }

    public void discharge() {
        admitted = false;
        System.out.println(name + " has been discharged.");
    }

    @Override
    public String toString() {
        return "Patient ID: " + id +
                ", Name: " + name +
                ", Age: " + age +
                ", Disease: " + disease +
                ", Admitted: " + admitted +
                ", History: " + medicalHistory;
    }
}
