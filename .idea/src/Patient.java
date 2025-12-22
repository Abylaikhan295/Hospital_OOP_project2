package hospital;

public class Patient {

    private String id;
    private String name;
    private int age;
    private String disease;
    private boolean admitted;

    public Patient(String id, String name, int age, String disease, boolean admitted) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.admitted = admitted;
    }

    public String getName() {
        return name;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "Patient ID: " + id +
                ", Name: " + name +
                ", Age: " + age +
                ", Disease: " + disease +
                ", Admitted: " + admitted;
    }
}
