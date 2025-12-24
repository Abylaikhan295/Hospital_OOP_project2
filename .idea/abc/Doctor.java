package hospital;

public class Doctor {
    private String name;
    private String specialty;
    private double salary;
    private String degree;

    public Doctor(String name, String specialty, double salary, String degree) {
        this.name = name;
        this.specialty = specialty;
        setSalary(salary); // Validation
        this.degree = degree;
    }

    public Doctor() {
        this.name = "Staff Doctor";
        this.specialty = "General";
        this.salary = 4000D;
        this.degree = "MD";
    }

    public String getName() { return name; }
    public String getSpecialty() { return specialty; }
    public double getSalary() { return salary; }
    public String getDegree() { return degree; }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Warning: Salary cannot be negative!");
            this.salary = 0;
        }
    }

    public void applyRaise(double percentage) {
        if (percentage > 0) {
            this.salary += (this.salary * percentage / 100);
        }
    }

    public boolean isSpecialist() {
        return !specialty.equalsIgnoreCase("General");
    }

    public String toString() {
        return "Doctor{name='" + name + "', specialty='" + specialty + "', salary=" + salary + ", degree='" + degree + "'}";
    }
}
