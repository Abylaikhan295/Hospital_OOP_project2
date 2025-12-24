package hospital;

public class Patient {
    private String name;
    private int age;
    private String disease;
    private boolean isAdmitted;

    public Patient(String name, int age, String disease, boolean isAdmitted) {
        this.name = name;
        setAge(age);
        this.disease = disease;
        this.isAdmitted = isAdmitted;
    }

    public Patient() {
        this.name = "New Patient";
        this.age = 0;
        this.disease = "Unknown";
        this.isAdmitted = false;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDisease() { return disease; }
    public boolean isAdmitted() { return isAdmitted; }


    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Warning: Invalid age! Setting to 0.");
            this.age = 0;
        }
    }

    public void setName(String name) { this.name = name; }
    public void setDisease(String disease) { this.disease = disease; }
    public void setAdmitted(boolean admitted) { isAdmitted = admitted; }

    public boolean isSenior() {
        return this.age >= 65;
    }
    public void updateStatus(boolean status) {
        this.isAdmitted = status;
    }
    public String toString() {
        return "Patient{name='" + name + "', age=" + age + ", disease='" + disease + "', admitted=" + isAdmitted + "}";
    }
}
